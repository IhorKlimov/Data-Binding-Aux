/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.myhexaville.databindingaux;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;

import static com.bumptech.glide.load.engine.DiskCacheStrategy.RESULT;

/**
 * Data Binding Adapters
 */
public class DataBindingAux {

    private static DiskCacheStrategy sCacheStrategy = RESULT;

    @BindingAdapter("app:imageUrl")
    public static void loadImage(ImageView v, String imgUrl) {

        Glide.with(v.getContext())
                .load(imgUrl)
                .diskCacheStrategy(sCacheStrategy)
                .into(v);
    }

    @BindingAdapter({"app:imageUrl", "app:placeholder"})
    public static void loadImage(ImageView v, String imgUrl, Drawable placeholder) {

        Glide.with(v.getContext())
                .load(imgUrl)
                .diskCacheStrategy(sCacheStrategy)
                .placeholder(placeholder)
                .into(v);
    }

    @BindingAdapter({"app:imageUrl", "app:loadCallbacks"})
    public static void loadImage(
            ImageView view, String imgUrl, RequestListener<? super String,
            GlideDrawable> listener) {

        Glide.with(view.getContext())
                .load(imgUrl)
                .diskCacheStrategy(sCacheStrategy)
                .listener(listener)
                .into(view);
    }

    @BindingAdapter({"app:imageUrl", "app:placeholder", "app:loadCallbacks"})
    public static void loadImage(
            ImageView view, String imgUrl, Drawable placeholder,
            RequestListener<? super String, GlideDrawable> listener) {

        Glide.with(view.getContext())
                .load(imgUrl)
                .diskCacheStrategy(sCacheStrategy)
                .placeholder(placeholder)
                .listener(listener)
                .into(view);
    }

    public static void setGlobalCacheStrategy(DiskCacheStrategy strategy) {
        sCacheStrategy = strategy;
    }
}

