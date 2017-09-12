# RoundedConersWithGlide
Rounded Coners With Glide

**[You'll find the supporting medium article for this project here!](http://thedeveloperworldisyours.com/android/rounded-corners-with-glide/#sthash.EiFePDrI.dpbs)**

<p align="center">
 <img src="https://github.com/thedeveloperworldisyours/RoundedConersWithGlide/blob/master/RoundedConersWithGlideV4.png" width="600px" />
</p>

# How to use

Now We can specify corner, margin ,border color and border margin:

```java
    public static int sCorner = 15;
    public static int sMargin = 20;

    public static int sBorder = 10;
    public static String sColor = "#7D9067";
```
   Note: sMargin should be more or same than sBorder

   We add the constructor with or without border:
```java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ....

        // Rounded corners
        Glide.with(this).load("http://scareface.jpeg")
        .apply(RequestOptions.bitmapTransform(
        new RoundedCornersTransformation(this, sCorner, sMargin))).into(mImageView);
        
        // Rounded corners with border
        Glide.with(this).load("http://scareface.jpeg")
        .apply(RequestOptions.bitmapTransform(
        new RoundedCornersTransformation(this, sCorner, sColor, sBorder))).into(mImageViewBorder);
        
    }
```
*Rounded corners with border xml

In drawable folder We add this frame.
```
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">

    <solid android:color="@android:color/transparent" />
    <stroke
        android:width="15dp"
        android:color="#7D9067" />

    <corners android:radius="5dp" />
</shape>
```
In your layout, two elements:

```
<RelativeLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="@drawable/circle"
        app:layout_constraintBottom_toTopOf="@+id/guideline"
        app:layout_constraintLeft_toLeftOf="@+id/guideline3"
        app:layout_constraintRight_toLeftOf="@+id/guideline3"
        app:layout_constraintTop_toTopOf="@+id/guideline">

        <ImageView
            android:id="@+id/imageViewBorderResizing"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:srcCompat="@mipmap/ic_launcher" />
</RelativeLayout>
```

In your Activity or fragment you can this parametres

```
public static int sCorner = 15;
public static int sMargin = 0;
```
with this constructor:
```
Glide.with(this).load("http://thedeveloperworldisyours.com/wp-content/uploads/scareface.jpeg").apply(RequestOptions.bitmapTransform(new RoundedCornersTransformation(this, sCorner, sMargin))).into(mImageViewBorderResizing);
```


Also visit my blog: **[The developer world is yours](http://thedeveloperworldisyours.com/)**

<a href="http://thedeveloperworldisyours.com/">
  <img alt="The developer world is yours" src="https://github.com/CabezasGonzalezJavier/AddTextViewButton/blob/master/TheDeveloperWordIsYours.png" />
</a>

# Requirements

    - Android Studio

    - Gradle


# Installation

    - Install Android Studio:

    https://developer.android.com/sdk/installing/index.html

    - Install gradle:

    http://gradle.org/docs/current/userguide/installation.html

# Usage
    Compile with Android Studio and gradle


Feel free to contribute, and contact me for any issues.

Developed By
------------
* Javier González Cabezas - <javiergonzalezcabezas@gmail.com>

<a href="https://es.linkedin.com/in/javier-gonz%C3%A1lez-cabezas-8b4b2231">
  <img alt="Add me to Linkedin" src="https://github.com/JorgeCastilloPrz/EasyMVP/blob/master/art/linkedin.png" />
</a>

License
-------

    Copyright 2017 Javier González Cabezas

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
