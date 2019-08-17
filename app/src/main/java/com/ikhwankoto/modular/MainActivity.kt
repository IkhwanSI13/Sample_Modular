package com.ikhwankoto.modular

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ikhwankoto.feature_a.FeatureAActivity //
import com.ikhwankoto.feature_b.FeatureBActivity
import kotlinx.android.synthetic.main.activity_main.*
//import com.bumptech.glide.Glide
//import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_a.setOnClickListener {
            startActivity(Intent(this, FeatureAActivity::class.java))
        }
        btn_b.setOnClickListener {
            startActivity(Intent(this, FeatureBActivity::class.java))
        }

    }
}
