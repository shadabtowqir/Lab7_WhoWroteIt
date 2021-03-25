package com.example.lab7_whowroteit;

/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.os.AsyncTask;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.ref.WeakReference;

/**
 * FetchBook is an AsyncTask implementation that opens a network connection
 * and queryies the Book Service API.
 */
public class FetchBook extends AsyncTask<String, Void, String> {

    // Variables for the results TextViews.
    // These are WeakReferences to prevent "leaky context" -- weak references
    // enable the activity to be garbage collected if it is not needed.
    private WeakReference<TextView> mTitleText;
    private WeakReference<TextView> mAuthorText;

    // Constructor, provides references to the views in MainActivity.
    FetchBook(TextView titleText, TextView authorText) {
        this.mTitleText = new WeakReference<>(titleText);
        this.mAuthorText = new WeakReference<>(authorText);
    }

    /**
     * Use the getBookInfo() method in the NetworkUtils class to make
     * the connection in the background.
     *
     * @param strings String array containing the search data.
     * @return Returns the JSON string from the Books API, or
     * null if the connection failed.
     */
    @Override
    protected String doInBackground(String... strings) {
        return "";
    }

    /**
     * Handles the results on the UI thread. Gets the information from
     * the JSON result and updates the views.
     *
     * @param data Result from the doInBackground() method containing the raw
     *          JSON response, or null if it failed.
     */
    @Override
    protected void onPostExecute(String data) {
        super.onPostExecute(data);

        try {
            // Convert the response into a JSON object.

            // Get the JSONArray of book items.


            // Initialize iterator and results fields.


            // Look for results in the items array, exiting when both the
            // title and author are found or when all items have been checked.

                // Get the current item information.


                // Try to get the author and title from the current item,
                // catch if either field is empty and move on.


                // Move to the next item.


            // If both are found, display the result.

                // If none are found, update the UI to show failed results.


        } catch (Exception e) {
            // If onPostExecute() does not receive a proper JSON string,
            // update the UI to show failed results.

        }

    }
}