package com.example.lab5;

public class Donut {
    private String name;
    private String descrip;
    private String price;
    private int picture;

    public Donut(String name, String descrip, String price, int picture) {
        this.name = name;
        this.descrip = descrip;
        this.price = price;
        this.picture = picture;
    }

    public Donut(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
