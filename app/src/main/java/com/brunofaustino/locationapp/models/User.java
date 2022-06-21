package com.brunofaustino.locationapp.models;

import android.location.Location;

public class User {
    String name;
    double currentLong, currentLat;

    public User(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentLocation(double lat, double longi){
        this.currentLat = lat;
        this.currentLong = longi;
    }

    @Override
    public String toString() {
        return "User{" +
                " Name ='" + name + '\'' +
                ", Long = " + currentLong +
                ", Lat = " + currentLat +
                '}';
    }
}
