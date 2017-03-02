package com.example.prosoft.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Playvideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playvideo);

        VideoView mVideoView2 = (VideoView)findViewById(R.id.videoView);
        MediaController mc = new MediaController(this);
        mc.setAnchorView(mVideoView2);

        String file=MainActivity.Videoname;
        mVideoView2.setVideoPath(file);
        mVideoView2.setMediaController(mc);
        mVideoView2.requestFocus();
        mVideoView2.start();

    }
}
