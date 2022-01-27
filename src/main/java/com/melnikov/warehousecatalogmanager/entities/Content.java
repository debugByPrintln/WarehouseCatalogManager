package com.melnikov.warehousecatalogmanager.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "content")
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "dateOfAdd")
    private String dateOfAdd;
    @Column(name = "price")
    private int price;
    @Column(name = "seller")
    private  String seller;
    @Column(name = "sellerMail")
    private String sellerMail;

    public Content() {
    }

    public Content(String name, String description, String dateOfAdd, int price, String seller, String sellerMail) {
        this.name = name;
        this.description = description;
        this.dateOfAdd = dateOfAdd;
        this.price = price;
        this.seller = seller;
        this.sellerMail = sellerMail;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dateOfAdd='" + dateOfAdd + '\'' +
                ", price=" + price +
                ", seller='" + seller + '\'' +
                ", sellerMail='" + sellerMail + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateOfAdd() {
        return dateOfAdd;
    }

    public void setDateOfAdd(String dateOfAdd) {
        this.dateOfAdd = dateOfAdd;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getSellerMail() {
        return sellerMail;
    }

    public void setSellerMail(String sellerMail) {
        this.sellerMail = sellerMail;
    }
}
