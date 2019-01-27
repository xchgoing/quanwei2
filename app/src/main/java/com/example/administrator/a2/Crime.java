package com.example.administrator.a2;

import java.io.File;
import java.util.Date;
import java.util.UUID;


import static java.util.UUID.randomUUID;

public class Crime {//ok
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public String getSuspect() {
        return mSuspect;
    }

    private String mSuspect;

    public Crime(){
        this(UUID.randomUUID());
//        mId = UUID.randomUUID();
//        mDate = new Date();
    }

    public Crime(UUID id)
    {
        mId = id;
        mDate = new Date();
    }


    public String getPhotoFilename(){
        return "IMG_"+getId().toString()+".jpg";
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
