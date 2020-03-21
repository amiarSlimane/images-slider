package icy.inslem.imageslider;

import android.app.Activity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class ImageSlider {
    public static void slideImages(final Activity activity, final ArrayList<String> imagesURLs, final ImageView imageView, int delaySecond) {

        final int width = imageView.getWidth();
        final int height = imageView.getHeight();

        new Timer().scheduleAtFixedRate(new TimerTask() {
            private int i = 0;

            @Override
            public void run() {

                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (width > 0 && height > 0) {
                            Picasso.get().load(imagesURLs.get(i))
                                    .resize(width, height)
                                    .centerCrop()
                                    .into(imageView);
                        } else {
                            Picasso.get().load(imagesURLs.get(i))
                                    .into(imageView);
                        }
                    }
                });
                i++;
                if (i == imagesURLs.size())
                    i = 0;
            }
        }, 0, delaySecond*1000);
    }

}
