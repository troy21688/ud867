package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.troychuinard.builditbiggerandroidlibrary.AndroidActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class AsyncTest {

    private static final String TEST_TEXT = "TEST_TEXT";
    @Rule
    public ActivityTestRule<AndroidActivity> mActivity = new ActivityTestRule(AndroidActivity.class);

    @Test
    public void testIfResultIsEmpty() {

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute();

        //TODO: Why am I receiving this error
        try {
            String testText = endpointsAsyncTask.get();
            Log.v(TEST_TEXT, testText);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
