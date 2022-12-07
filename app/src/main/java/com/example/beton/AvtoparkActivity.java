package com.example.beton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.beton.ui.FooterFragment;
import com.example.beton.ui.HeaderFragment;

public class AvtoparkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avtopark);

        HeaderFragment headerFragment = new HeaderFragment();
        FooterFragment footerFragment = new FooterFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.header ,headerFragment);
        ft.replace(R.id.footer,footerFragment);
        ft.commit();
    }
}