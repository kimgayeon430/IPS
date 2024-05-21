package com.example.sookcycle0520ver

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sookcycle0520ver.databinding.FragmentHomeBinding

class HomeFragment : Fragment(){

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.userImageProfile.setOnClickListener{
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm , UserFragment())
                .commitAllowingStateLoss()
        }

        binding.companyImageProfile.setOnClickListener{
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm , CompanyFragment())
                .commitAllowingStateLoss()
        }




        return binding.root
    }


}