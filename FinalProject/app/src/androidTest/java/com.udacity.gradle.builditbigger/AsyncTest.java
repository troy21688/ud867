package com.udacity.gradle.builditbigger;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import android.test.AndroidTestCase;
import android.view.View;


import com.troychuinard.builditbiggerandroidlibrary.AndroidActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class AsyncTest {

    private static final String TEST_TEXT = "TEST_TEXT";
    @Rule
    public ActivityTestRule mActivity = new ActivityTestRule(MainActivity.class);

    @Test
    public void testIfResultIsEmpty() {

        Espresso.onView(ViewMatchers.withId(R.id.first_button)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.random_joke)).check(ViewAssertion(j))


    }



}
