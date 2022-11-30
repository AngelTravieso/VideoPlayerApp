package com.example.videoplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    // declarando widgets
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inicializando widgets
        videoView = findViewById(R.id.video_view);

        // obteniendo video del almacenamiento local (dispositivo)


        // Este metodo especifica la carpeta y el nombre del video
        videoView.setVideoPath(
                "android.resource://"+
                getPackageName()+"/"+R.raw.mountains);

        // permite controlar un video, contiene los metodos de los botones (avanzar, pausa, etc)
        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView);
        videoView.setMediaController(mc);

    }
}