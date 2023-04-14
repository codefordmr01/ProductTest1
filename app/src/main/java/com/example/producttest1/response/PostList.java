package com.example.producttest1.response;

import com.google.gson.annotations.SerializedName;

// 페이지 별 상품 정보
public class PostList {

    @SerializedName("product_id")
    private int id;

    private String title;
    //private String price;
    private String author;
    private boolean status;
    private boolean favorite;
    private String modified_date;
    private String img_path;

    public int getProduct_id() { return id; }

    public String getTitle() { return title; }

    //public String getPrice() { return price; }

    public String getAuthor() { return author; }

    public boolean isStatus() { return status; }

    public boolean isFavorite() { return favorite; }

    public String getModified_date() { return modified_date; }

    public String getImg_path() { return img_path; }
}
