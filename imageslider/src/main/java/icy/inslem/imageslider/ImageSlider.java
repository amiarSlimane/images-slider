package icy.inslem.imageslider;

import android.app.Activity;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class ImageSlider {

    public static void slideImages(final Activity activity, final ArrayList<String> imagesURLs, final ImageView imageView, int delaySecond) {
        String TAG = "ImageSlider";

        new Timer().scheduleAtFixedRate(new TimerTask() {
            private int i = 0;

            @Override
            public void run() {

                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        RequestOptions options = new RequestOptions();
                        options.centerCrop();
                        Glide.with(activity)
                                .load(imagesURLs.get(i))
                                .apply(options)
                                .into(imageView);
                    }
                });
                i++;
                if (i == imagesURLs.size())
                    i = 0;
            }
        }, 0, delaySecond*1000);
    }

}
