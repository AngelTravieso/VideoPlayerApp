package com.example.videoplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    // declarando widgets
    VideoView videoView, videoView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inicializando widgets
        videoView = findViewById(R.id.video_view);
        videoView2 = findViewById(R.id.video_view2);

        // obteniendo video del almacenamiento local (dispositivo)

        // Este metodo especifica la carpeta y el nombre del video
        videoView.setVideoPath(
                "android.resource://"+
                getPackageName()+"/"+R.raw.mountains);

        // permite controlar un video, contiene los metodos de los botones (avanzar, pausa, etc)
        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView);
        videoView.setMediaController(mc);


        // Fetch data y mostrar videos de internet (links)
        Uri uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/002/231/original/5226496.mp4");
        videoView2.setVideoURI(uri);

        MediaController mc2 = new MediaController(this);
        mc2.setAnchorView(videoView2);
        videoView2.setMediaController(mc2);

        // reproducir el video cuando se lanza la app
        videoView2.start();

    }
}