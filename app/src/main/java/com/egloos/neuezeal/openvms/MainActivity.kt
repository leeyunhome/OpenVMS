package com.egloos.neuezeal.openvms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputButton.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                if (inputText.text.isBlank() == true){
                    displayText.text = "표시할 메시지가 없습니다"
                }
                else {
                    displayText.text = "${inputText.text}"
                }
            }

        })
    }
}
