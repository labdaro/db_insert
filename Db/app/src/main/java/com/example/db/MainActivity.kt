package com.example.db

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun insert(v: View) {
        var dto = Staff(name.text.toString(), city.text.toString())
        var helper = MyHelper(this)
        helper.saveData(dto)

        var res = helper.saveData(dto)
        if (res == -1.toLong()){
            Toast.makeText(this,"Failed",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this,"Add:$res",Toast.LENGTH_LONG).show()
        }
    }
}
