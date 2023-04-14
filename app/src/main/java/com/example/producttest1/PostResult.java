package com.example.producttest1;

import com.google.gson.annotations.SerializedName;

// 특정 상품 표시
public class PostResult {

    @SerializedName("product_id")
    private int id;

    private String title;
    private String price;
    private String author;
    private String content;
    private String address;
    private boolean status;
    private boolean favorite;
    private String created_date;
    private String modified_date;

    public int getId() { return id; }

    public String getTitle() { return title; }

    public String getPrice() { return price; }

    public String getAuthor() { return author; }

    public String getContent() { return content; }

    public String getAddress() { return address; }

    public boolean isStatus() { return status; }

    public boolean isFavorite() { return favorite; }

    public String getCreated_date() { return created_date; }

    public String getModified_date() { return modified_date; }
}
