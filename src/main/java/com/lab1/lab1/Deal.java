package com.lab1.lab1;

public class Deal {
    private String coinName;
    private String coinCode;
    private String date;
    private String type;
    private float price;
    private float volume;

    public Deal(String date, String type, float price, float volume, String coinName, String coinCode) {
        this.date = date;
        this.type = type;
        this.price = price;
        this.volume = volume;
        this.coinName = coinName;
        this.coinCode = coinCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getCoinCode() {
        return coinCode;
    }

    public void setCoinCode(String coinCode) {
        this.coinCode = coinCode;
    }
}
