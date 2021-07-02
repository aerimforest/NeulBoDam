package com.example.neulbodam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neulbodam.databinding.ActivityGetNameBinding

class GetNameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGetNameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetNameBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnNextName.setOnClickListener {
            val intent = Intent(this, GetAgeActivity::class.java)
            startActivity(intent)
        }
    }
}