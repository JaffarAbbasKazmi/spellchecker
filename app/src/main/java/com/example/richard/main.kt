package com.example.richard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController


class main : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var goToDetail1 = view.findViewById<Button>(R.id.button1)
        var goToDetail2 = view.findViewById<Button>(R.id.button2)
        var goToDetail3  = view.findViewById<Button>(R.id.button3)
//heelooo
        navController = Navigation.findNavController(view)

        goToDetail1.setOnClickListener{
            val action = mainDirections.actionMainToDetail(R.drawable.egineer , "Image 1")
            navController.navigate(action)
   }

        goToDetail2.setOnClickListener{
            val action = mainDirections.actionMainToDetail(R.drawable.wifi , "Image 2")
            navController.navigate(action)

//            (activity as MainActivity).goToDetailFragment(R.drawable.wifi , "Image 2")
        }

        goToDetail3.setOnClickListener{
            val action = mainDirections.actionMainToDetail(R.drawable.wrench , "Image 3")
            navController.navigate(action)

//            (activity as MainActivity).goToDetailFragment(R.drawable.wrench , "Image 3")
        }

    }
}