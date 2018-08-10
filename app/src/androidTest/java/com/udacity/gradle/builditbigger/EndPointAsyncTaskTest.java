package com.udacity.gradle.builditbigger;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void testDoInBackground() throws Exception {

        //com.udacity.gradle.builditbigger.MainActivityFragment main = new com.udacity.gradle.builditbigger.MainActivityFragment();

        //new EndpointAsyncTask().execute(main);
        //Thread.sleep(5000);
        //assertTrue("Error: Fetched Joke = " + main.receivedJoke, main.receivedJoke != null);
        String result = null;
        Context appContext = InstrumentationRegistry.getTargetContext();
        EndpointAsyncTask asyncTask = new EndpointAsyncTask();
        Log.v("Testing","Starting AsyncTask");

        asyncTask.execute(appContext);


        try{
            result = asyncTask.get();
            Log.v("Testing", result);

        }catch (Exception e){
            Log.v("Testing", "Something Wrong");
            e.printStackTrace();
        }

        assertNotNull(result);
    }


}
