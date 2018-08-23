package com.troychuinard.builditbiggerandroidlibrary;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class AsyncTest extends  AsyncInstrumentedTest {

    @Rule
    public ActivityTestRule<AndroidActivity> mActivity = new ActivityTestRule(AndroidActivity.class);

    @Test
    public void testIfResultIsEmpty() {

        EndpointAsyncTask endpointAsyncTask = new EndpointAsynctask(getCo)
    }

    @Test




}
