package com.lab1.lab1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    List<Coin> coins = new ArrayList<>();
    List<Trend> trends = new ArrayList<>();
    List<Exchange> exchanges = new ArrayList<>();
    Portfolio portfolio = new Portfolio();

    public Controller() {
        coins.add(new Coin("Ethereum", "ETH", 3000f, -15f, 35f, 76f, 5406840392843.0, 3827943018.0, new float[]{298f, 413f, 531f, 854f, 617f}));

        portfolio.addCoin("Ethereum", "ETH", 25.087876f, -15f, 35f, 76f, 5406840392843.0, 3827943018.0, new float[]{298f, 413f, 531f, 854f, 617f});

        exchanges.add(new Exchange("Kraken", 8.5f, 256743521478f, 54f, 37f, new Float[]{287f, 395f, 612f, 954f, 731f}));

        trends.add(new Trend("Ethereum", "ETH", 28.0f));
    }

    @GetMapping("/coins")
    public List<Coin> getCoins() {
        return coins;
    }

    @GetMapping("/trends")
    public List<Trend> getTrends() {
        return trends;
    }

    @GetMapping("/exchanges")
    public List<Exchange> getExchanges() {
        return exchanges;
    }

    @GetMapping("/portfolio")
    public Portfolio getPortfolio() {
        return portfolio;
    }

    @PostMapping("/deal")
    public ResponseEntity<Deal> postDeal(@RequestBody Deal deal) {
        portfolio.addDeal(deal.getDate(), deal.getType(), deal.getPrice(), deal.getVolume(), deal.getCoinName(), deal.getCoinCode());
        return ResponseEntity.ok(portfolio.getDeals().get(portfolio.getDeals().size() - 1));
    }

}
