package com.app.lab1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.app.lab1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(
            this,
            MyViewModelFactory(resources.getString(R.string.my_string))
        )[MyViewModel::class.java]

        binding.textView.text = viewModel.str
        binding.button.setOnClickListener {
            val newStr = resources.getString(R.string.new_string)
            viewModel.changeString(newStr)
            binding.textView.text = viewModel.str
        }
    }

}