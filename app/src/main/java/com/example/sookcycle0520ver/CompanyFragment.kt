package com.example.sookcycle0520ver

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sookcycle0520ver.databinding.FragmentCompanyBinding
import com.example.sookcycle0520ver.databinding.FragmentUserBinding

class CompanyFragment : Fragment(){

    lateinit var binding: FragmentCompanyBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCompanyBinding.inflate(inflater,container,false)

        binding.loginbtn.setOnClickListener{


            (context as MainActivity).supportFragmentManager.beginTransaction()
                ?.remove(this)
                ?.replace(R.id.main_frm , HomeFragment())
                ?.commitAllowingStateLoss()
        }

        return binding.root
    }
}