package com.example.usmanhussain.todofragments;

import java.util.Date;
import java.util.UUID;

public class Todo {

    // initialise the variables

    private UUID mId;
    private String mTitle;
    private String mDetail;
    private Date mDate;
    private boolean mIsComplete;

    public Todo() {
        mId = UUID.randomUUID(); // set randon device id
        mDate = new Date(); // set random date
    }


    // getters to return the variables to the ToDoFragments class
    public boolean isIsComplete() {

        return mIsComplete;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDetail() {
        return mDetail;
    }

    public Date getDate() {
        return mDate;
    }

    // setter to assign the values to the variables

    public void setIsComplete(boolean todoIsComplete) {
        mIsComplete = todoIsComplete;
    }


    public void setId(UUID todoId) {
        mId = todoId;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setDetail(String detail) {
        mDetail = detail;
    }

    public void setDate(Date todoDate) {
        mDate = todoDate;
    }
}