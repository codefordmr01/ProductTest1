package com.example.producttest1.activity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.producttest1.ProductService;
import com.example.producttest1.R;
import com.example.producttest1.RetrofitClient;
import com.example.producttest1.response.PostResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

// 특정 상품 표시 Activity
public class ProductActivity extends AppCompatActivity {

    public static Context mContext;

    private TextView tvTitle;
    private TextView tvPrice;
    private TextView tvDetail;
    private ProductService mProductService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        mProductService = RetrofitClient.getRetrofitInstance().create(ProductService.class);

        mContext = this;
    }


    public void checkData() {
        PostResult postResult = new PostResult();
        String productId = postResult.getProduct_Id();
        mProductService.getProduct(productId).enqueue(new Callback<PostResult>() {
            @Override
            public void onResponse(Call<PostResult> call, Response<PostResult> response) {
                if (response.isSuccessful() && response.body() != null) {
                    PostResult product = response.body();

                    tvTitle.setText(product.getPost_Title());
                    tvPrice.setText(product.getPost_Price());
                    tvDetail.setText(product.getPost_Content());
                } else {
                    Toast.makeText(ProductActivity.this, "데이터 가져오기 실패", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<PostResult> call, Throwable t) {
                Toast.makeText(ProductActivity.this, "서버 통신 에러 발생", Toast.LENGTH_SHORT).show();
            }
        });
    }


}