package com.udacity.gradle.builditbigger;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class AsyncTest {

    private static final String TEST_TEXT = "TEST_TEXT";
    @Rule
    public ActivityTestRule<MainActivity> mActivity = new ActivityTestRule(MainActivity.class);

    //TODO: Is this approach the correct method of testing the AsyncTask? I am testing views right now, I understand I could also create an instance of the EndpointAsyncTask class and run .execute()
    @Test
    public void testIfResultIsEmpty() {
        Espresso.onView(ViewMatchers.withId(R.id.first_button)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.random_joke)).check(matches(isDisplayed()));
    }

}
