package com.example.homwork_3

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var rad1: RadioButton
    private lateinit var rad2: RadioButton
    private lateinit var rad3: RadioButton
    private lateinit var rad4: RadioButton
    private lateinit var btn_next: ImageButton
    private lateinit var javob: TextView
    private lateinit var radg: RadioGroup

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textviw)
        rad1 = findViewById(R.id.rad1)
        rad2 = findViewById(R.id.rad2)
        rad3 = findViewById(R.id.rad3)
        rad4 = findViewById(R.id.rad4)
        btn_next = findViewById(R.id.btn_next)
        javob = findViewById(R.id.javob)
        radg = findViewById(R.id.radg)
        randomMisoloz()
        btn_next.setOnClickListener {
            if (rad1.isChecked) {
                if (rad1.text.toString().toInt() == answer) {
                    val mediaPlayer = MediaPlayer.create(this, R.raw.right)
                    mediaPlayer.start()
                    javob.text = "To'g'ri"
                } else {
                    val mediaPlayer = MediaPlayer.create(this, R.raw.error)
                    mediaPlayer.start()
                    javob.text = "Noto'g'ri"
                }
                radg.clearCheck()
                randomMisoloz()
            }


            //Comment
            if (rad2.isChecked) {
                if (rad2.text.toString().toInt() == answer) {
                    val mediaPlayer = MediaPlayer.create(this, R.raw.right)
                    mediaPlayer.start()
                    javob.text = "To'g'ri"
                } else {
                    val mediaPlayer = MediaPlayer.create(this, R.raw.error)
                    mediaPlayer.start()
                    javob.text = "Noto'g'ri"
                }
                radg.clearCheck()
                randomMisoloz()
            }

            if (rad3.isChecked) {
                if (rad3.text.toString().toInt() == answer) {
                    val mediaPlayer = MediaPlayer.create(this, R.raw.right)
                    mediaPlayer.start()
                    javob.text = "To'g'ri"
                } else {
                    val mediaPlayer = MediaPlayer.create(this, R.raw.error)
                    mediaPlayer.start()
                    javob.text = "Noto'g'ri"
                }
                radg.clearCheck()
                randomMisoloz()
            }

            if (rad4.isChecked) {
                if (rad4.text.toString().toInt() == answer) {
                    val mediaPlayer = MediaPlayer.create(this, R.raw.right)
                    mediaPlayer.start()
                    javob.text = "To'g'ri"
                } else {
                    val mediaPlayer = MediaPlayer.create(this, R.raw.error)
                    mediaPlayer.start()
                    javob.text = "Noto'g'ri"
                }
                radg.clearCheck()
                randomMisoloz()
            }
        }
    }

    var num1 = 0
    var num2 = 0
    var answer = 0
    var ish = 0
    @SuppressLint("SetTextI18n")
    fun randomMisoloz() {
        num1 = Random().nextInt(20)
        num2 = Random().nextInt(20)
        ish = Random().nextInt(5)
        when (ish) {
            0 -> {
                textView.text = "$num1 + $num2"
                answer = num1 + num2
            }
            1 -> {
                textView.text = "$num1 - $num2"
                answer = num1 - num2
            }
            2 -> {
                textView.text = "$num1 * $num2"
                answer = num1 * num2
            }
            3 -> {
                try {
                    if (num1 % num2 != 0) throw Exception()
                    textView.text = "$num1 / $num2"
                    answer = num1 / num2
                } catch (e: Exception) {
                    randomMisoloz()
                }
            }
        }
        ekranga()
    }

    var random1 = 0
    var random2 = 0
    var random3 = 0
    fun RandomSanAniqla() {
        random1 = Random().nextInt(200)
        random2 = Random().nextInt(200)
        random3 = Random().nextInt(200)
        if (random1 == random2 || random2 == random3 || random1 == random3) {
            RandomSanAniqla()
        }
    }
    var togrij = 0
    fun ekranga() {
        RandomSanAniqla()
        togrij = Random().nextInt(4)

        when (togrij) {
            0 -> {
                rad1.text = answer.toString()
                rad2.text = random1.toString()
                rad3.text = random2.toString()
                rad4.text = random3.toString()
            }
            1 -> {
                rad1.text = random1.toString()
                rad2.text = answer.toString()
                rad3.text = random2.toString()
                rad4.text = random3.toString()
            }
            2 -> {
                rad1.text = random1.toString()
                rad2.text = random2.toString()
                rad3.text = answer.toString()
                rad4.text = random3.toString()
            }
            3 -> {
                rad1.text = random1.toString()
                rad2.text = random2.toString()
                rad3.text = random3.toString()
                rad4.text = answer.toString()
            }
        }
    }
}
