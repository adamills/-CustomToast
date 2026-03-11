package com.ousaf.customtoast;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Sample MainActivity demonstrating CustomToast usage
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Success Toast
        Button btnSuccess = findViewById(R.id.btn_success);
        btnSuccess.setOnClickListener(v -> {
            CustomToast.success(this, "Operation Successful!");
        });

        // Error Toast
        Button btnError = findViewById(R.id.btn_error);
        btnError.setOnClickListener(v -> {
            CustomToast.error(this, "Something went wrong!");
        });

        // Warning Toast
        Button btnWarning = findViewById(R.id.btn_warning);
        btnWarning.setOnClickListener(v -> {
            CustomToast.warning(this, "Please be careful!");
        });

        // Info Toast
        Button btnInfo = findViewById(R.id.btn_info);
        btnInfo.setOnClickListener(v -> {
            CustomToast.info(this, "Here's some information!");
        });

        // Custom Toast
        Button btnCustom = findViewById(R.id.btn_custom);
        btnCustom.setOnClickListener(v -> {
            CustomToast.show(this, "Custom Color!", Color.parseColor("#9C27B0"), 
                android.R.drawable.ic_menu_view);
        });
    }
}