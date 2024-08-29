package src.seminars.first.Shop;

import java.util.Collections;
import java.util.List;

public class Product {
    private int cost; // Стоимость продукта
    private String title; // Название



    public Product(String title, int cost){
        this.title = title;
        this.cost = cost;
    }
    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public  String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                ", title='" + title + '\'' +
                '}';
    }

}
