package com.example.neulbodam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neulbodam.databinding.ActivityGetWeightBinding

class GetWeightActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGetWeightBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetWeightBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnNextWeight.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}