package com.example.gittigidiyorappexample.entity;

import java.util.List;

public class ParentItem {
    private String ParentItemTitle;
    private List<ChildItem> ChildItemList;

    public ParentItem(String ParentItemTitle, List<ChildItem> ChildItemList) {
        this.ParentItemTitle = ParentItemTitle;
        this.ChildItemList = ChildItemList;
    }

    public String getParentItemTitle(){
        return ParentItemTitle;
    }

    public void setParentItemTitle(String parentItemTitle){
        ParentItemTitle = parentItemTitle;
    }

    public List<ChildItem> getChildItemList(){
        return ChildItemList;
    }

    public void setChildItemList(List<ChildItem> childItemList){
        ChildItemList = childItemList;
    }
}
