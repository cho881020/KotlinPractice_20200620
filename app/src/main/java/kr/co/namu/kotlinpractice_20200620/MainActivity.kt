package kr.co.namu.kotlinpractice_20200620

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        버튼이 눌리면 => 입력한 내용을 받아서 => 텍스트뷰에 출력

        okBtn.setOnClickListener {

//            입력한 내용을 => String으로 변환 해서 => inputMessage 공간에 기록.
            val inputMessage = messageEdt.text.toString()

//            기록된 내용을 그대로 토스트에 출력
            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()
        }




    }
}