package com.ricardogwill.imageviewchanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button changeColorButton;
    private ImageView colorImage;
    private Button redButton;
    private Button greenButton;
    private Button blueButton;

    private int currentImageIndex;
    int[] colors = {R.drawable.red, R.drawable.green, R.drawable.blue};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeColorButton = findViewById(R.id.change_color_button);
        colorImage = findViewById(R.id.color_imageView);
        redButton = findViewById(R.id.red_button);
        greenButton = findViewById(R.id.green_button);
        blueButton = findViewById(R.id.blue_button);

        changeColorButtonOnClick();
        redButtonOnClick();
        greenButtonOnClick();
        blueButtonOnClick();
    }

    public void changeColorButtonOnClick() {
        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentImageIndex++;
                currentImageIndex = currentImageIndex % colors.length;
                colorImage.setImageResource(colors[currentImageIndex]);
            }
        });
    }

    public void redButtonOnClick() {
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorImage.setImageResource(colors[0]);
                currentImageIndex = 0;
            }
        });
    }

    public void greenButtonOnClick() {
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorImage.setImageResource(colors[1]);
                currentImageIndex = 1;
            }
        });
    }

    public void blueButtonOnClick() {
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorImage.setImageResource(colors[2]);
                currentImageIndex = 2;
            }
        });
    }

}
