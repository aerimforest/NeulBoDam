package com.example.neulbodam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neulbodam.databinding.ActivityGetHeightBinding

class GetHeightActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGetHeightBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetHeightBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnNextHeight.setOnClickListener {
            val intent = Intent(this, GetWeightActivity::class.java)
            startActivity(intent)
        }
    }
}