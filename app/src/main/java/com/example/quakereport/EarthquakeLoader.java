package com.example.quakereport;

import android.content.Context;
import android.util.Log;
import android.content.AsyncTaskLoader;
import java.util.List;


public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private String mUrl;

    /** Tag for log messages */
    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    public EarthquakeLoader(Context context , String Url){
        super(context);
        mUrl = Url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
        Log.i(LOG_TAG , "Test: onStartLoading()");
    }


    /**
     * This is on a background thread.
     */
    @Override
    public List<Earthquake> loadInBackground() {
        // Don't perform the request if there are no URLs, or the first URL is null.
        if (mUrl == null) {
            return null;
        }

        Log.i(LOG_TAG , "Test: LoadInBackground()");
        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Earthquake> result = QueryUtils.fetchEarthquakeData(mUrl);
        return result;
    }
}
