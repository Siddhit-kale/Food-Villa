package com.example.onlinemenu.Models;public class Ordermodel {

    int orderimage;
    String solditemname, price, orderno;

    public Ordermodel(int orderimage, String solditemname, String price, String orderno) {
        this.orderimage = orderimage;
        this.solditemname = solditemname;
        this.price = price;
        this.orderno = orderno;
    }

    public int getOrderimage() {
        return orderimage;
    }

    public void setOrderimage(int orderimage) {
        this.orderimage = orderimage;
    }

    public String getSolditemname() {
        return solditemname;
    }

    public void setSolditemname(String solditemname) {
        this.solditemname = solditemname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }
}
