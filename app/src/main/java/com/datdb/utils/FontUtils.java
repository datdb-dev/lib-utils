package com.datdb.utils;

import android.content.Context;
import android.graphics.Typeface;

public class FontUtils {

    public static Typeface getTypeface(Context context, String path) {
        try {
            return Typeface.createFromAsset(context.getAssets(), path);
        } catch (Exception e) {
            return null;
        }
    }
}
