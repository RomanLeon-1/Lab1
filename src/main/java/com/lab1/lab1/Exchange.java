package com.lab1.lab1;

public class Exchange {
    private String name;
    private Float score;
    private Float volume24h;
    private Float markets;
    private Float coins;
    private Float[] lastVolume;

    public Exchange(String name, Float score, Float volume24h, Float markets, Float coins, Float[] lastVolume) {
        this.name = name;
        this.score = score;
        this.volume24h = volume24h;
        this.markets = markets;
        this.coins = coins;
        this.lastVolume = lastVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Float getVolume24h() {
        return volume24h;
    }

    public void setVolume24h(Float volume24h) {
        this.volume24h = volume24h;
    }

    public Float getMarkets() {
        return markets;
    }

    public void setMarkets(Float markets) {
        this.markets = markets;
    }

    public Float getCoins() {
        return coins;
    }

    public void setCoins(Float coins) {
        this.coins = coins;
    }

    public Float[] getLastVolume() {
        return lastVolume;
    }

    public void setLastVolume(Float[] lastVolume) {
        this.lastVolume = lastVolume;
    }
}
