package jp.techacademy.mizuka.kawagoe.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // クラス
        var human = Human("A", 0,"月")

        human.say()
        Log.d("kotlintest", "私の名前は" + human.name + "です。")
        Log.d("kotlintest", "年は" + human.age + "歳です。")


        human.think()
        Log.d("kotlintest", "私は" + human.hobby + "について考える。")





    }
}
