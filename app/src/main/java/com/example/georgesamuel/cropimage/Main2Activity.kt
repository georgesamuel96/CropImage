package com.example.georgesamuel.cropimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageView
import java.security.AccessController.getContext

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // start picker to get image for cropping and then use the image in cropping activity
        CropImage.activity()
            .setGuidelines(CropImageView.Guidelines.ON)
            .start(this)

// start cropping activity for pre-acquired image saved on the device
//        CropImage.activity(imageUri)
//            .start(this)


    }
}
