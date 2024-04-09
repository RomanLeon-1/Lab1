package com.lab1.lab1;

public class Trend {
    private String coinName;
    private String coinCode;
    private float h24;

    public Trend(String coinName, String coinCode, float h24) {
        this.coinName = coinName;
        this.coinCode = coinCode;
        this.h24 = h24;
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

    public float getH24() {
        return h24;
    }

    public void setH24(float h24) {
        this.h24 = h24;
    }
}
