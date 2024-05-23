package com.example.sookcycle0522ver

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sookcycle0522ver.databinding.FragmentLookBinding

class LookFragment : Fragment() {

    lateinit var binding : FragmentLookBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLookBinding.inflate(inflater,container,false)

        binding.towriteimageBtn.setOnClickListener {
            // Lookfragment에서 WriteActivity로 전환
            val intent = Intent(activity, WriteActivity::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
            //startActivity(Intent(, ChatbotActivity::class.java))
        }
        return binding.root
    }
}