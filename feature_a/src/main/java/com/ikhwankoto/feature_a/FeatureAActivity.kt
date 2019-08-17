package com.ikhwankoto.feature_a

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_feature_a.*

class FeatureAActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_a)

        button.setOnClickListener {
            var intent: Intent? = null
            try {
                intent = Intent(this,
                        Class.forName("com.ikhwankoto.feature_b.FeatureBActivity"))
                startActivity(intent)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
        }

    }
}
