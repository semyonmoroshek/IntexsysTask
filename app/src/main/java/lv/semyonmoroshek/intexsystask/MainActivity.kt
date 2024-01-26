package lv.semyonmoroshek.intexsystask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import lv.semyonmoroshek.intexsystask.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}