package com.example.designui.models;

public class Data {
    public int imageone;
    public String cardname;
    public String carddesc;

    public Data(int imageone, String cardname, String carddesc) {
        this.imageone = imageone;
        this.cardname = cardname;
        this.carddesc = carddesc;
    }

    public int getImageone() {
        return imageone;
    }

    public void setImageone(int imageone) {
        this.imageone = imageone;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public String getCarddesc() {
        return carddesc;
    }

    public void setCarddesc(String carddesc) {
        this.carddesc = carddesc;
    }
}
