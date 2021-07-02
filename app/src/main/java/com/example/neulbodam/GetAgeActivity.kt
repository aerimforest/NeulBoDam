package com.example.neulbodam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neulbodam.databinding.ActivityGetAgeBinding

class GetAgeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGetAgeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetAgeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnNextAge.setOnClickListener {
            val intent = Intent(this, GetHeightActivity::class.java)
            startActivity(intent)
        }
    }
}