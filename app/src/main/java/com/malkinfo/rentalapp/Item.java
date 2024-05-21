package com.malkinfo.rentalapp;
import java.util.List;

public class Item {

    private String location;
    private String price;
    //private List<Integer> images;
    private String description;
    private String shortescription;
    //private int totalImages;
    private String image;

    public Item(String location, String price, String description, String shortescription, String image) {
        this.location = location;
        this.price = price;
        this.description = description;
        this.shortescription = shortescription;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setShortescription(String shortescription) {
        this.shortescription = shortescription;
    }



    public Item(){

    }
//    public Item(String location, String price, List<Integer> images, String description, String shortescription, int totalImages) {
//        this.location = location;
//        this.price = price;
//        this.images = images;
//        this.description = description;
//        this.shortescription = shortescription;
//        this.totalImages = totalImages;
//    }

    public Item(String location, String price, String shortescription) {
        this.location = location;
        this.price = price;
        this.shortescription = shortescription;
    }

    public String getLocation() {
        return location;
    }

    public String getPrice() {
        return price;
    }


    public String getDescription() {
        return description;
    }

    public String getShortescription() {
        return shortescription;
    }

}

