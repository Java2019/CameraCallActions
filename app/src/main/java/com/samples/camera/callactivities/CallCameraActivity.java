package com.samples.camera.callactivities;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CallCameraActivity extends AppCompatActivity
            implements View.OnClickListener{

    private Button bImageCapture;
    private Button bStillImage;
    private Button bVideoCamera;
    private Button bVideoCapture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_camera);

        bImageCapture = (Button)findViewById(R.id.bImageCapture);
        bStillImage = (Button)findViewById(R.id.bStillImage);
        bVideoCamera = (Button)findViewById(R.id.bVideoCamera);
        bVideoCapture = (Button)findViewById(R.id.bVideoCapture);

        bImageCapture.setOnClickListener(this);
        bStillImage.setOnClickListener(this);
        bVideoCamera.setOnClickListener(this);
        bVideoCapture.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bImageCapture:
                startActivity(new Intent(MediaStore.ACTION_IMAGE_CAPTURE));
                break;
            case R.id.bStillImage:
                startActivity(new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA));
                break;
            case R.id.bVideoCamera:
                startActivity(new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA));
                break;
            case R.id.bVideoCapture:
                startActivity(new Intent(MediaStore.ACTION_VIDEO_CAPTURE));
                break;
        }
    }
}
