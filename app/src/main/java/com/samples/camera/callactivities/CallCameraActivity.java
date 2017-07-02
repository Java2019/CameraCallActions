package com.samples.camera.callactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CallCameraActivity extends AppCompatActivity
            implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_camera);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bImageCapture:

                break;
            case R.id.bStillImage:

                break;
            case R.id.bVideoCamera:

                break;
            case R.id.bVideoCapture:

                break;
        }
    }
}
