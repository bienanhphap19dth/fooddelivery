package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "food_order")
public class Food_Order {

    @Id
    @Column(name = "id_food")
    private int id_food;

    @Id
    @Column(name = "id_order")
    private int id_order;

    @Column(name = "price")
    private float price;

    @Column(name = "quality")
    private int quality;

    @Column(name = "id_promo")
    private int idPromo;

    @ManyToOne
    @JoinColumn(name = "id_food")
    private Food food;

    @ManyToOne
    @JoinColumn(name = "id_order")
    private T_Order t_order;

    public int getId_food() {
        return id_food;
    }

    public void setId_food(int id_food) {
        this.id_food = id_food;
    }

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(int idPromo) {
        this.idPromo = idPromo;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public T_Order getT_order() {
        return t_order;
    }

    public void setT_order(T_Order t_order) {
        this.t_order = t_order;
    }
}
