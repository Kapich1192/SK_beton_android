package com.example.beton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button menu, about, certificates, price, calc, delivery, blog,contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeButton();


    }

    public void initializeButton() {
        menu = findViewById(R.id.menu);
        about = findViewById(R.id.about);
        certificates = findViewById(R.id.certificates);
        price = findViewById(R.id.price);

    }

    public void goAboutActivity(View v) {
        // Создаем объект класса
        Intent intent = new Intent(this, AboutActivity.class);
        // Выполняем переход
        startActivity(intent);
    }

    public void goAvtoparkActivity(View v) {
        Intent intent = new Intent(this, AvtoparkActivity.class);
        startActivity(intent);
    }

    public void goBlogActivity(View v) {
        Intent intent = new Intent(this,BlogActivity.class);
        startActivity(intent);
    }

    public void goCertificateActivity(View v) {
        Intent intent = new Intent(this, CertificateActivity.class);
        startActivity(intent);
    }

    public void goContactsActivity(View v) {
        Intent intent = new Intent(this,ContactsActivity.class);
        startActivity(intent);
    }

    public void goDeliveryActivity(View v) {
        Intent intent = new Intent(this,DeliveryActivity.class);
        startActivity(intent);
    }

    public void goPriceActivity(View v) {
        Intent intent = new Intent(this, PriceActivity.class);
        startActivity(intent);
    }

    public void goCalcActivity(View v) {
        Intent intent = new Intent(this, CalcActivity.class);
        startActivity(intent);
    }


}