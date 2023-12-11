package com.example.toolbarpractice

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.toolbarpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolBar.setNavigationOnClickListener {
            Toast.makeText(this, "Clic ic toolBar", Toast.LENGTH_LONG).show()
        }
        binding.toolBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.camera -> {
                    Toast.makeText(this, "Clic ic camera", Toast.LENGTH_LONG).show()
                    true
                }

                R.id.alarm -> {
                    Toast.makeText(this, "Clic ic alarm", Toast.LENGTH_LONG).show()
                    true
                }

                else -> {
                    false
                }
            }
        }

        binding.toolBar.setOnCreateContextMenuListener { menu, v, menuItem ->
            menu.add("Long click").setOnMenuItemClickListener {
                Toast.makeText(this, "Long clicked on menu item", Toast.LENGTH_LONG).show()
                true
            }
        }

    }
}