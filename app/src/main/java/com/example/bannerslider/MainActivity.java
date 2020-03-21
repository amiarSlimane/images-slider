package com.example.bannerslider;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import icy.inslem.imageslider.ImageSlider;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    private ImageView imageViewBanner;
    ArrayList<String> imagesURLs = new ArrayList<>();
    private MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivity = this;
        imageViewBanner = findViewById(R.id.imageViewBanner);

        imagesURLs.add("https://pixabay.com/get/5fe1d3454d51b10ff3d89938b977692b083edbed5756764c7c287e/banner-916673_640.jpg");
        imagesURLs.add("https://pixabay.com/get/54e0dd414951ad14f1dc8460825668204022dfe05b55764e702673d0/banner-2082331_640.png");
        imagesURLs.add("https://pixabay.com/get/54e8d4404e5aab14f1dc8460825668204022dfe05b55764e732f79d0/nature-2813487_640.jpg");
        imagesURLs.add("https://pixabay.com/get/57e6dd454356af14f1dc8460825668204022dfe05b55764e70267dd5/banner-1686943_640.jpg");

    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        ImageSlider.slideImages(mainActivity, imagesURLs, imageViewBanner, 2);
    }

   }
