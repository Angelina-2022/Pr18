package com.example.practice18

import androidx.fragment.app.Fragment
import android.widget.TextView
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView


class InfoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_info, container, false)
    }
    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val textView = view?.findViewById<TextView>(R.id.textView)
        val image  = view?.findViewById<ImageView>(R.id.imageView)
        image?.visibility = View.VISIBLE

        when(selectedItem){
            getString(R.string.dog1) ->{
                image?.setImageResource(R.drawable.affenpincher)
                textView?.setText(R.string.dog1info)
            }
            getString(R.string.dog2) ->{
                image?.setImageResource(R.drawable.afganskaya)
                textView?.setText(R.string.dog2info)
            }
            getString(R.string.dog3) ->{
                image?.setImageResource(R.drawable.bobteil)
                textView?.setText(R.string.dog3info)
            }
            getString(R.string.dog4) ->{
                image?.setImageResource(R.drawable.kitaiskaya)
                textView?.setText(R.string.dog4info)
            }

        }
    }
}