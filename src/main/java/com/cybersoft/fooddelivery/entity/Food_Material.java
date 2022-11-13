package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "food_material")
public class Food_Material {

    @Id
    @Column(name = "id_food")
    private int id_food;

    @Id
    @Column(name = "id_material")
    private int id_material;

    @ManyToOne
    @JoinColumn(name = "id_food")
    private Food food;

    @ManyToOne
    @JoinColumn(name = "id_material")
    private Material material;

    public int getId_food() {
        return id_food;
    }

    public void setId_food(int id_food) {
        this.id_food = id_food;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
