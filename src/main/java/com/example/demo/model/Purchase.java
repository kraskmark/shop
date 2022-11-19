package com.example.demo.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Purchase {
    Date date;
    List<Consumer> consumerList;
    List<Product> productsList;


    public List<Consumer> getConsumerList() {
        return consumerList;
    }

    public void setConsumerList(List<Consumer> consumerList) {
        this.consumerList = consumerList;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "date=" + date +
                ", consumerList=" + consumerList +
                ", productsList=" + productsList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return Objects.equals(date, purchase.date) && Objects.equals(consumerList, purchase.consumerList) && Objects.equals(productsList, purchase.productsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, consumerList, productsList);
    }
}
