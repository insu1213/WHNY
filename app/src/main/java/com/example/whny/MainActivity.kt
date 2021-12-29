package com.example.whny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.example.whny.Count.CountActivity
import com.example.whny.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var viewModel : MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel: MainActivityViewModel by lazy {ViewModelProvider(this, MainActivityViewModelFactory(
            MutableLiveData<String>(binding.searchEdit.text.toString())
        )).get(MainActivityViewModel::class.java)}

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

//        binding.searchBtn.isEnabled = false


        binding.searchBtn.setOnClickListener {
            val searchText = binding.searchEdit.text
            val intent = Intent(this, CountActivity::class.java)
            intent.putExtra("searchEdit", "$searchText")
            startActivity(intent)
        }


    }
}