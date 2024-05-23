package com.example.sookcycle0522ver

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sookcycle0522ver.databinding.ActivityCameraBinding

class CameraTF_Activity : AppCompatActivity() {
    lateinit var binding: ActivityCameraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCameraBinding.inflate(layoutInflater) // 뷰바인딩 객체
        val view = binding.root //뷰바인딩을 통해 레이아웃과 뷰가 결합 -> .root 를 통해 View 객체만를 뽑아내는(?)
        setContentView(view)

        // 실행하고자 하는 다른 앱의 액티비티 이름을 설정하고 실행
        binding.btnMv.setOnClickListener {

            val intent = packageManager.getLaunchIntentForPackage("com.anupam.androidcameraxtflite")
            intent!!.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)



        }


    }

}