package org.explosiveworks.market.domain;

import java.util.List;

public class Person extends Account {

    private List<Product> products;
    private int cash;
    private int rating;

    public Person() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
