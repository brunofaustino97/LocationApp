package com.brunofaustino.locationapp.models;

import android.location.Location;

public class User {

    private String name;
    private Location lastKnowLocation;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentLocation(Location location) {
        this.lastKnowLocation = location;
    }

    public Location getLastKnowLocation() {
        return lastKnowLocation;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userLocation=" + lastKnowLocation +
                '}';
    }
}
