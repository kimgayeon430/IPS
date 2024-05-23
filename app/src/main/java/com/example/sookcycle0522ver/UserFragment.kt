package com.example.sookcycle0522ver

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.sookcycle0522ver.databinding.FragmentUserBinding

class UserFragment : Fragment(){

    lateinit var binding: FragmentUserBinding

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentUserBinding.inflate(inflater,container,false)

        binding.loginbtn.setOnClickListener {
            name = binding.userNameEdit.text.toString()
            (context as MainActivity).supportFragmentManager.beginTransaction()
                ?.remove(this )
                ?.replace(R.id.main_frm, HomeFragment())
                ?.commitAllowingStateLoss()
        }

        return binding.root
    }
}

