package com.example.cryptoapp.presenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.cryptoapp.R
import com.example.cryptoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        initialView()
    }

    private fun initialView() {
        val navController: NavController = Navigation.findNavController(this, R.id.fragment_container)

        val popupMenu = PopupMenu(this, null).apply {
            inflate(R.menu.bottom_menu_item)
        }

        bind.bottomNavController?.setupWithNavController(popupMenu.menu, navController = navController)
    }
}