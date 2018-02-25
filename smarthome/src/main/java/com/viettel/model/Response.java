package com.viettel.model;

import java.util.ArrayList;

public class Response {
    private int quantity;
    ArrayList<Thing> data;


    public Response(ArrayList<Thing> data, int quantity) {
        this.data = data;
        this.quantity = quantity;
    }

    public Response() {
        data = new ArrayList<>();
    }

    public ArrayList<Thing> getData() {
        return data;
    }

    public void setData(ArrayList<Thing> data) {
        this.data = data;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
