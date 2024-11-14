package com.example.domekwgorach;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView wyswietlaczlajkow;
    private Button lajk;
    private Button unlajk;
    private int liczbajakow = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wyswietlaczlajkow = findViewById(R.id.liczniklajkow);
        lajk = findViewById(R.id.lajk);
        unlajk = findViewById(R.id.unlajk);

        nasluchiwaczezmianylajkow();
    }


    private void nasluchiwaczezmianylajkow() {
        lajk.setOnClickListener(this::zwiekszanielajkow);
        unlajk.setOnClickListener(this::zmniejszanielajkow);
    }

    private void zwiekszanielajkow(View widok) {
        liczbajakow++;
        aktualizacjalajkow();
    }

    private void zmniejszanielajkow(View widok) {
        liczbajakow = Math.max(liczbajakow - 1, 0);
        aktualizacjalajkow();
    }

    private void aktualizacjalajkow() {
        wyswietlaczlajkow.setText(liczbajakow + " polubień");
    }
}
