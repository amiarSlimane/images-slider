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
    private ArrayList<String> imagesURLs = new ArrayList<>();
    private MainActivity mainActivity;
    private int delay = 3; // in seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivity = this;
        imageViewBanner = findViewById(R.id.imageViewBanner);

        imagesURLs.add("https://raw.githubusercontent.com/amiarSlimane/images-slider/master/images/0.jpg");
        imagesURLs.add("https://raw.githubusercontent.com/amiarSlimane/images-slider/master/images/1.jpg");
        imagesURLs.add("https://raw.githubusercontent.com/amiarSlimane/images-slider/master/images/3.png");
        imagesURLs.add("https://raw.githubusercontent.com/amiarSlimane/images-slider/master/images/4.jpg");
        imagesURLs.add("https://raw.githubusercontent.com/amiarSlimane/images-slider/master/images/noblur.gif");

        ImageSlider.slideImages(mainActivity, imagesURLs, imageViewBanner, delay);

    }


   }
