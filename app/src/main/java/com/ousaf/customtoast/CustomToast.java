package com.ousaf.customtoast;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * CustomToast - A lightweight utility for showing colored Toasts with icons
 * 
 * Usage:
 * CustomToast.show(context, "Success!", Color.GREEN, R.drawable.ic_check);
 */
public class CustomToast {

    public static void show(Context context, String message, int backgroundColor, int iconResId) {
        show(context, message, backgroundColor, iconResId, Toast.LENGTH_SHORT);
    }

    public static void show(Context context, String message, int backgroundColor, int iconResId, int duration) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);

        // Create custom layout
        LinearLayout toastLayout = new LinearLayout(context);
        toastLayout.setOrientation(LinearLayout.HORIZONTAL);
        toastLayout.setPadding(16, 12, 16, 12);
        toastLayout.setBackgroundColor(backgroundColor);

        // Add icon
        ImageView icon = new ImageView(context);
        icon.setImageResource(iconResId);
        icon.setLayoutParams(new LinearLayout.LayoutParams(48, 48));
        toastLayout.addView(icon);

        // Add message text
        TextView textView = new TextView(context);
        textView.setText(message);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(14);
        textView.setPadding(12, 0, 0, 0);
        LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        );
        textParams.gravity = android.view.Gravity.CENTER_VERTICAL;
        textView.setLayoutParams(textParams);
        toastLayout.addView(textView);

        toast.setView(toastLayout);
        toast.show();
    }

    // Convenience methods for common use cases
    public static void success(Context context, String message) {
        show(context, message, Color.parseColor("#4CAF50"), android.R.drawable.ic_menu_info_details);
    }

    public static void error(Context context, String message) {
        show(context, message, Color.parseColor("#F44336"), android.R.drawable.ic_dialog_alert);
    }

    public static void warning(Context context, String message) {
        show(context, message, Color.parseColor("#FF9800"), android.R.drawable.ic_dialog_info);
    }

    public static void info(Context context, String message) {
        show(context, message, Color.parseColor("#2196F3"), android.R.drawable.ic_menu_info_details);
    }
}