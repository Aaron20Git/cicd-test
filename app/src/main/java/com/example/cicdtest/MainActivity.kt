package com.example.cicdtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var tvTitle:TextView
    lateinit var etName:EditText
    lateinit var etPassword:EditText
    lateinit var etPasswordCheck:EditText
    lateinit var btnCheck:Button
    lateinit var etAPPName:EditText
    lateinit var btnAPPCheck:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getView()
        setListener()
    }

    private fun getView() {
        tvTitle = findViewById<TextView>(R.id.tv_title)
        etName = findViewById<EditText>(R.id.et_name)
        etPassword = findViewById<EditText>(R.id.et_password)
        etPasswordCheck = findViewById<EditText>(R.id.et_password_doublecheck)
        btnCheck = findViewById<Button>(R.id.btn_check)
        etAPPName = findViewById<EditText>(R.id.et_app_name)
        btnAPPCheck = findViewById<Button>(R.id.btn_app_check)
    }

    private fun setListener() {
        btnCheck.setOnClickListener {
            FunctionUtils.validateRegistrationInput(etName.text.toString(),
            etPassword.text.toString(),
            etPasswordCheck.text.toString()).run {
                if (this)
                    Toast.makeText(this@MainActivity,"成功",Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this@MainActivity,"錯誤",Toast.LENGTH_SHORT).show()
            }
        }
        btnAPPCheck.setOnClickListener {
            ResourceComparer().isEqual(this,R.string.app_name,etAPPName.text.toString()).run {
                if (this)
                    Toast.makeText(this@MainActivity,"名稱正確",Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this@MainActivity,"名稱錯誤",Toast.LENGTH_SHORT).show()
            }
        }
    }
}