package com.example.jiyun_training_demo.service;

import com.example.jiyun_training_demo.bean.ComonResult;
import com.example.jiyun_training_demo.bean.HomeBean;
import com.example.jiyun_training_demo.bean.LoginBean;
import com.example.jiyun_training_demo.bean.RegisterBean;
import com.example.jiyun_training_demo.bean.TopicBean;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface HomeService {

    public static String baseUrl="https://cdwan.cn/api/";

    @GET("index")
    Flowable<ComonResult<HomeBean>> getHome();

    @GET("topic/list")
    Flowable<ComonResult<TopicBean>> getTopicBean();


    @FormUrlEncoded
    @POST("auth/login")
    Flowable<ComonResult<LoginBean>> login(@Field("nickname") String name, @Field("password") String password);


    @FormUrlEncoded
    @POST("auth/register")
    @Headers({"Client-Type:ANDROID"})
    Flowable<ComonResult<RegisterBean>> registerInfo(@Field("nickname") String name, @Field("password") String password);

}