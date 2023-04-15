package com.example.producttest1.response;

import com.google.gson.annotations.SerializedName;

// 특정 상품 표시 Response
public class PostResult {

    @SerializedName("product_id")
    private String id;

    private String title;
    private String price;
    private String author;
    private String content;
    private String address;
    private boolean status;
    private boolean favorite;
    private String created_date;
    private String modified_date;

    public String getProduct_Id() { return id; }

    public String getPost_Title() { return title; }

    public String getPost_Price() { return price; }

    public String getPost_Author() { return author; }

    public String getPost_Content() { return content; }

    public String getPost_Address() { return address; }

    public boolean isStatus() { return status; }

    public boolean isFavorite() { return favorite; }

    public String getCreated_date() { return created_date; }

    public String getModified_date() { return modified_date; }
}
