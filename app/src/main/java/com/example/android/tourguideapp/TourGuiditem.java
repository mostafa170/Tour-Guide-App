package com.example.android.tourguideapp;

/**
 * Created by mostafa on 14/06/2017.
 */

public class TourGuiditem {

    private String title;
    private String details;
    private String location;
    private int image;

    public TourGuiditem(String title, String details, String location, int image) {
        this.title = title;
        this.details = details;
        this.location = location;
        this.image = image;
    }

    public TourGuiditem(String title, String location, String details) {
        this.title = title;
        this.location = location;
        this.details = details;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {this.details = details;}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
