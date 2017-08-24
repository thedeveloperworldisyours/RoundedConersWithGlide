# RoundedConersWithGlide
Rounded Coners With Glide

**[You'll find the supporting medium article for this project here!](http://thedeveloperworldisyours.com/android/rounded-corners-with-glide/#sthash.EiFePDrI.dpbs)**

<p align="center">
 <img src="https://github.com/thedeveloperworldisyours/RoundedConersWithGlide/blob/master/RoundedConersWithGlideV4.png" width="300px" />
</p>

# How to use

We add corner, margin, border and color:

```java
    public static int sCorner = 15;
    public static int sMargin = 2;

    public static int sBorder = 10;
    public static String sColor = "#7D9067";
```
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
        new RoundedCornersTransformation(this, sCorner, sMargin, sColor, sBorder))).into(mImageViewBorder);
    }
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
