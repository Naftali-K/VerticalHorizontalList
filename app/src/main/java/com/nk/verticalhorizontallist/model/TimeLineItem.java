package com.nk.verticalhorizontallist.model;

import java.util.List;

public class TimeLineItem {
    private String shopName;
    private String urlLogo;
    private List<PictureItem> pictures;

    public TimeLineItem(String shopName, String urlLogo, List<PictureItem> pictures) {
        this.shopName = shopName;
        this.urlLogo = urlLogo;
        this.pictures = pictures;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<PictureItem> getPictures() {
        return pictures;
    }

    public void setPictures(List<PictureItem> pictures) {
        this.pictures = pictures;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    @Override
    public String toString() {
        return "TimeLineItem{" +
                "shopName='" + shopName + '\'' +
                ", pictures=" + pictures +
                '}';
    }
}
