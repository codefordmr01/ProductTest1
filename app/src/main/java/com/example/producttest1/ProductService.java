package com.example.producttest1;

import com.example.producttest1.request.ProductRequest;
import com.example.producttest1.request.UpdateRequest;
import com.example.producttest1.response.PostResult;
import com.example.producttest1.response.ProductResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ProductService {
    //@통신 방식("통신 API명")


    // 특정 상품 표시
    @GET("product/{id}")
    Call<PostResult> getProduct(@Path("id") String id);

    // 상품 추가
    @POST("product/post")
    Call<ProductResponse> postProduct(@Body ProductRequest request);

    // 상품 수정
    @POST("/product/modify")
    Call<ResponseBody> updateProduct(@Path("id") int productId, @Body UpdateRequest updateProduct);

    /*
    통신을 정의해주는 interface를 만들어 통신을 위한 함수를 만들어줍니다.
    getLoginResponse 함수로 LoginRequest.java에 정의해준 데이터들을 서버 Body에 보낸 후 LoginResponse로 데이터를 받겠다는 의미를 가집니다.

    출처 - https://code-hyoon.tistory.com/9
     */
}