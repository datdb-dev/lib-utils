package com.js.utils.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.js.utils.R;

public class ProgressDialog extends Dialog {

    private TextView tvMessage;

    public ProgressDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        init();
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    private void init() {
        View rootView = LayoutInflater.from(getContext()).inflate(R.layout.dialog_progress, null, false);
        setContentView(rootView);
        setCancelable(false);
        setCanceledOnTouchOutside(false);

        tvMessage = rootView.findViewById(R.id.tvMessage);
    }

    public void show(String message) {
        super.show();
        tvMessage.setText(message);
    }
}
