package com.khahani.app.quakereport;


public class Earthquake {
    private String mCity;
    private float mMagnit;
    private long mDate;

    public Earthquake(String mCity, float mMagnit) {
        this.mCity = mCity;
        this.mMagnit = mMagnit;
    }

    public Earthquake(String mCity, float mMagnit, long mDate) {
        this.mCity = mCity;
        this.mMagnit = mMagnit;
        this.mDate = mDate;
    }

    public String getCity() {
        return mCity;
    }

    public float getMagnit() {
        return mMagnit;
    }

    public long getDate() {
        return mDate;
    }
}
