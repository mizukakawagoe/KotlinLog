package jp.techacademy.mizuka.kawagoe.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {

    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)")

    }

    //Thinkableインターフェイスのメソッドをオーバーライド
    override fun think() {
        var hobby = 0
        Log.d("kotlintest", Integer.toString(hobby))

        Log.d("kotlintest", "私は" + "(" + hobby + ")" + "について考える。")



    }
}
