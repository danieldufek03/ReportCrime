package com.example.daniel.reportcrime;

import com.google.android.gms.maps.model.Marker;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Daniel on 10/15/2015.
 */
public class Crime {
    private Marker mCrimeMarker;
    private String mDate;
    private String mInfraction;

    //Default
    public Crime(){
        this.mCrimeMarker = null;
        this.mDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        this.mInfraction = "No Infraction entered";
    }

    //Non-Default
    public Crime(Marker marker,  String infraction){
        this.mCrimeMarker = marker;
        this.mDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        this.mInfraction = infraction;

        mCrimeMarker.setSnippet(infraction);
    }

    public Marker getmCrimeMarker() {
        return mCrimeMarker;
    }

    public void setmCrimeMarker(Marker mCrimeMarker) {
        this.mCrimeMarker = mCrimeMarker;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmInfraction() {
        return mInfraction;
    }

    public void setmInfraction(String mInfraction) {
        this.mInfraction = mInfraction;

        mCrimeMarker.setSnippet(mInfraction);
    }

    public String toString(){
        return "Infraction: " + mInfraction + "\n" +
                "Date: " + mDate;
    }
}
