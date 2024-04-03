package com.mobile.app.moonplay;

public class shorts {
    private String description;
    private String genre;
    private String image;
    private String Mb;
    private String name;
    private String type;
    private String video;
    private String uploader;
    private String resolution;


    public shorts(){

    }

    public shorts(String description, String genre, String image, String mb, String name, String type, String video, String uploader, String resolution) {
        this.description = description;
        this.genre = genre;
        this.image = image;
        Mb = mb;
        this.name = name;
        this.type = type;
        this.video = video;
        this.uploader = uploader;
        this.resolution = resolution;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMb() {
        return Mb;
    }

    public void setMb(String mb) {
        Mb = mb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
