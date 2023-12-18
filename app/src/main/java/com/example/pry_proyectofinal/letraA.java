package com.example.pry_proyectofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.TextView;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class letraA extends AppCompatActivity {
    ImageCarousel carousel;
    List<CarouselItem> list = new ArrayList<>();


    int currentPage = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.activity_letra);

        DisplayMetrics medidasVentana = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);

        int ancho = medidasVentana.widthPixels;
        int alto = medidasVentana.heightPixels;

        getWindow().setLayout((int) (ancho * 0.5), (int) (alto * 0.85));

        carousel = findViewById(R.id.carousel);

        list.add(new CarouselItem("https://www.nationalgeographic.com.es/medio/2022/12/12/arana-1_1936aa1f_221212154009_1280x720.jpg","Araña"));
        list.add(new CarouselItem("https://media.primicias.ec/2023/06/25131436/delta.jpg","Avión"));
        list.add(new CarouselItem("https://cope-cdnmed.cope.es/resources/jpg/2/9/1686419523992.jpg","Árbol"));
        carousel.addData(list);


    }
}