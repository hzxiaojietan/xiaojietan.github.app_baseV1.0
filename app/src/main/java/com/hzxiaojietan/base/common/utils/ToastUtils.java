package com.hzxiaojietan.base.common.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by xiaojie.tan on 2017/10/26
 */

public class ToastUtils {
    private static String beforeMsg = "";
    private static long beforeTime = 0;

    public static void show(Context context, String message, int duration){
        if (message == null) {
            return;
        }

        if (context == null) {
            return;
        }

        if (message.equals(beforeMsg) && (System.currentTimeMillis() - beforeTime) < 2000){
            return;
        }

        beforeMsg = message;
        beforeTime = System.currentTimeMillis();

        Toast.makeText(context, message, duration).show();
    }

    public static void show(Context context, int resId, int duration) {
        show(context, context.getString(resId), duration);
    }

    public static void show(Context context, String message) {
        show(context, message, Toast.LENGTH_SHORT);
    }

    public static void show(Context context, int resId) {
        if (context == null) {
            return;
        }
        show(context, context.getString(resId));
    }
}
