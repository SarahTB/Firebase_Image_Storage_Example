package com.maida.myapp;

public class uploadInfo {

    public String imageName;
    public String imageURL;
    public uploadInfo(){}

    public uploadInfo(String name, String url) {
        this.imageName = name;
        this.imageURL = url;
    }

    public String getImageName() {
        return imageName;
    }
    public String getImageURL() {
        return imageURL;
    }
}
