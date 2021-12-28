package com.example.whny.Count

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.whny.R
import com.example.whny.databinding.ActivityCountBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class CountActivity : AppCompatActivity() {
    lateinit var binding : ActivityCountBinding
    lateinit var viewModel : CountActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_count)
        viewModel = ViewModelProvider(this).get(CountActivityViewModel::class.java)

//        var thread: Thread

        CoroutineScope(Dispatchers.Main).launch {
            while (true){
                val date = Date()
                val df = SimpleDateFormat("yyyy-MM-dd HH:mm:ss (z Z)")

                var time: TimeZone = TimeZone.getTimeZone("Asia/Seoul")
                df.timeZone = time
                binding.text1.text = "${time.displayName}${df.format(date)}"
                delay(1000)
            }
        }
    }
}