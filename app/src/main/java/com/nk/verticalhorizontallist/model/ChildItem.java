package com.nk.verticalhorizontallist.model;

public class ChildItem {

    private String childItemTitle;
    private String urlImage;

    public ChildItem(String childItemTitle, String urlImage) {
        this.childItemTitle = childItemTitle;
        this.urlImage = urlImage;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getChildItemTitle() {
        return childItemTitle;
    }

    public void setChildItemTitle(String childItemTitle) {
        this.childItemTitle = childItemTitle;
    }
}
