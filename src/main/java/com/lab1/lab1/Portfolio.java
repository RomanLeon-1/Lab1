package com.lab1.lab1;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Coin> coins = new ArrayList<>();
    private List<Deal> deals = new ArrayList<>();
    private float[] profileVolumeUsd;
    private float[] profileVolumeBtc;
    private float currentVolumeUsd;
    private float currentVolumeBtc;

    public void addCoin(String coinName, String coinCode, float price, float h1, float h24, float d7, double marketCap, double volume, float[] lastPrice) {
        Coin newCoin = new Coin(coinName, coinCode, price, h1, h24, d7, marketCap, volume, lastPrice);
        coins.add(newCoin);
    }

    public void addDeal(String date, String type, Float price, Float volume, String coinName, String coinCode) {
        deals.add(new Deal(date, type, price, volume, coinName, coinCode));
    }

    public Portfolio() {
        this.profileVolumeUsd = new float[]{324.0f, 436.0f, 584.0f, 987.0f, 674.0f};
        this.profileVolumeBtc = new float[]{324.0f, 436.0f, 584.0f, 987.0f, 674.0f};
        this.currentVolumeUsd = 345f;
        this.currentVolumeBtc = 345f;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

    public float[] getProfileVolumeUsd() {
        return profileVolumeUsd;
    }

    public void setProfileVolumeUsd(float[] profileVolumeUsd) {
        this.profileVolumeUsd = profileVolumeUsd;
    }

    public float[] getProfileVolumeBtc() {
        return profileVolumeBtc;
    }

    public void setProfileVolumeBtc(float[] profileVolumeBtc) {
        this.profileVolumeBtc = profileVolumeBtc;
    }

    public float getCurrentVolumeUsd() {
        return currentVolumeUsd;
    }

    public void setCurrentVolumeUsd(float currentVolumeUsd) {
        this.currentVolumeUsd = currentVolumeUsd;
    }

    public float getCurrentVolumeBtc() {
        return currentVolumeBtc;
    }

    public void setCurrentVolumeBtc(float currentVolumeBtc) {
        this.currentVolumeBtc = currentVolumeBtc;
    }
}
