package com.bellinfo.advanced.hibernate.entity;

import javax.persistence.*;

@Entity
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int item_id;

    @Column
    String itemName;

    @Column
    double cost;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable = false)
    Cart cart1;

    public Items() {
    }

    public Items(String itemName, double cost, Cart cart1) {
        this.itemName = itemName;
        this.cost = cost;
        this.cart1 = cart1;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Cart getCart1() {
        return cart1;
    }

    public void setCart1(Cart cart1) {
        this.cart1 = cart1;
    }

    @Override
    public String toString() {
        return "Items{" +
                "item_id=" + item_id +
                ", itemName='" + itemName + '\'' +
                ", cost=" + cost +
                ", cart1=" + cart1 +
                '}';
    }
}


