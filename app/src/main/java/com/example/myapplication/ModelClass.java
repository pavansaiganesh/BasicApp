package com.example.myapplication;

public class ModelClass {

    private final int imageview1;
    private final String textview1;
    private final String textview2;
    private final int href;
    ModelClass(int imageview1, String textview1, String textview2, int href){
        this.imageview1=imageview1;
        this.textview1=textview1;
        this.textview2=textview2;
    this.href=href;
    }



    public int getImageview1() {
        return imageview1;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getTextview2() {
        return textview2;
    }

    public int getHref(){return href;}
}
