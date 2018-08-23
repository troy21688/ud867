package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class AsyncTest {

    @Rule
    public ActivityTestRule<AndroidActivity> mActivity = new ActivityTestRule(AndroidActivity.class);

    @Test
    public void testIfResultIsEmpty() {

        //TODO: Why is this class not accessible?
        //TODO: Why is the editor not accessible?

        EndpointAsyncTask endpointAsyncTask = new EndpointAsynctask(getContext, null);
        endpointAsyncTask.execute();

    }

}
