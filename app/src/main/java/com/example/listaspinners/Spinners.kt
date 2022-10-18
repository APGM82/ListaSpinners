package com.example.listaspinners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.listaspinners.databinding.ActivitySpinnersBinding

class Spinners : AppCompatActivity() {
    lateinit var binding: ActivitySpinnersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySpinnersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnVolverSpinner.setOnClickListener(){
            finish()
        }
        var vec=ArrayList<Persona>(4)

        vec.add(Persona("Antonio", 39))
        vec.add(Persona("Verónica", 25))
        vec.add(Persona("Marta", 40))
        vec.add(Persona("David", 42))

        val adaptador= ArrayAdapter(this,R.layout.item_lista,R.id.txtItem,vec)
        binding.spSpinner.adapter=adaptador
    }
}