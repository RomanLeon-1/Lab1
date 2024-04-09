package com.lab1.lab1;

public class Coin {
    private String coinName;
    private String coinCode;
    private float price;
    private float h1;
    private float h24;
    private float d7;
    private double marketCap;
    private double volume;
    private float[] lastPrice;

    public Coin(String coinName, String coinCode, float price, float h1, float h24, float d7, double marketCap, double volume, float[] lastPrice) {
        this.coinName = coinName;
        this.coinCode = coinCode;
        this.price = price;
        this.h1 = h1;
        this.h24 = h24;
        this.d7 = d7;
        this.marketCap = marketCap;
        this.volume = volume;
        this.lastPrice = lastPrice;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getH1() {
        return h1;
    }

    public void setH1(float h1) {
        this.h1 = h1;
    }

    public float getH24() {
        return h24;
    }

    public void setH24(float h24) {
        this.h24 = h24;
    }

    public float getD7() {
        return d7;
    }

    public void setD7(float d7) {
        this.d7 = d7;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public float[] getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(float[] lastPrice) {
        this.lastPrice = lastPrice;
    }
}
