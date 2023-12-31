package com.btd.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout myLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_main);

        this.myLayout=(LinearLayout)  findViewById(R.id.myDynamicLayout);

        ImageView image= new ImageView(this);

        ViewGroup.LayoutParams params=new ActionBar.LayoutParams(100,100);
        image.setLayoutParams(params);
        image.setBackgroundResource(R.drawable.logo);
        myLayout.addView(image);

        TextView text= new TextView(this);

        ActionBar.LayoutParams params2=new ActionBar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        text.setLayoutParams(params2);
        text.setText(getResources().getString(R.string.welcome_mag));
        text.setTextColor(getResources().getColor(R.color.red));
        text.setTextSize(25);
        myLayout.addView(text);
        int textsize=10;
        for(int i=0;i<6;i++){
            Button btn= new Button(this);
            btn.setText("Button"+i);
            btn.setTextSize(textsize);
            textsize+=5;
        myLayout.addView(btn);

        }

    }
}