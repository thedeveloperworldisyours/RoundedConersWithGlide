package com.thedeveloperworldisyours.roundedconerswithglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    public static int sCorner = 15;
    public static int sMargin = 2;

    @BindView(R.id.imageView)
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        Glide.with(this).load("http://thedeveloperworldisyours.com/wp-content/uploads/scareface.jpeg").apply(RequestOptions.bitmapTransform(new RoundedCornersTransformation( this,sCorner, sMargin))).into(mImageView);
    }
}
