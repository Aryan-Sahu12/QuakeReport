package com.example.quakereport;

import java.util.List;

public class Earthquake {

    private double mMagnitude;

    private String mCity;

    private long mTimeInMillisec;

    private String mUrl;

    public Earthquake(double  Magnitude , String City , long timeInMillisec , String Url){
        mCity = City;
        mTimeInMillisec = timeInMillisec;
        mMagnitude = Magnitude;
        mUrl = Url;
    }

    public long getTimeInMilliseconds(){return mTimeInMillisec;}

    public String getLocation(){return mCity;}

    public double getMagnitude(){return mMagnitude;}

    public String getUrl(){return mUrl;}

}
