package com.nk.verticalhorizontallist.model;

import java.util.List;

public class ParentItem {

    private String parentTitle;
    private List<ChildItem> childItemList;

    public ParentItem(String parentTitle, List<ChildItem> childItemList) {
        this.parentTitle = parentTitle;
        this.childItemList = childItemList;
    }

    public String getParentTitle() {
        return parentTitle;
    }

    public void setParentTitle(String parentTitle) {
        this.parentTitle = parentTitle;
    }

    public List<ChildItem> getChildItemList() {
        return childItemList;
    }

    public void setChildItemList(List<ChildItem> childItemList) {
        this.childItemList = childItemList;
    }
}
