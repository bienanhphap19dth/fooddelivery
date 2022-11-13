package com.cybersoft.fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "order_status")
public class Order_Status {

    @Id
    @Column(name = "id_order")
    private int id_order;

    @Id
    @Column(name = "id_status")
    private int  id_status;

    @ManyToOne
    @JoinColumn(name = "id_order")
    private T_Order t_order;

    @ManyToOne
    @JoinColumn(name = "id_status")
    private Status status;

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public int getId_status() {
        return id_status;
    }

    public void setId_status(int id_status) {
        this.id_status = id_status;
    }

    public T_Order getT_order() {
        return t_order;
    }

    public void setT_order(T_Order t_order) {
        this.t_order = t_order;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

