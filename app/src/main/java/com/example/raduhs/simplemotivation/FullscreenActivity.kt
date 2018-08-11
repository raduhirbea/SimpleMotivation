package com.example.raduhs.simplemotivation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fullscreen.*
import java.util.*

class FullscreenActivity : AppCompatActivity() {

    private val list = listOf("If it frightens you, do it",
            "Don't settle. Every time you settle, you get exactly what you settled for",
            "Put yourself first",
            "No matter what happens, you will handle it",
            "Whatever you do, do it 100%",
            "If you do what you have always done, you will get what you always got",
            "You are the only person on this planet responsible for your needs, wants and happiness",
            "Ask for what you want",
            "If what you're doing isn't working, try something different",
            "Be clear and direct",
            "Learn to say NO",
            "Don't make excuses",
            "If you are an adult, you are old enough to make your own rules",
            "Let people help you",
            "Be honest with yourself",
            "Do not let anyone treat you badly. No one. Ever",
            "Remove yourself from a bad situation instead of waiting for the situation to change",
            "Don't tolerate the intolerable. Ever",
            "Stop blaming. Victims never succeed",
            "Live with integrity. Decide what feels right to you, then do it",
            "Accept the consequences of your actions",
            "Be good to yourself",
            "Think ABUNDANCE",
            "Face difficult situations and conflict head on",
            "Don't do anything in secret",
            "Do it NOW",
            "Be willing to let go of what you have so you can get what you want",
            "Have fun. If you are not having fun, something is wrong",
            "Give yourself room to fail. There are no mistakes, only learning experiences",
            "Control is an illusion. Let go, let life happen")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fullscreen)
        setRandomMotivationMessage()

        fullscreen_content.setOnClickListener {
            setRandomMotivationMessage()
        }
    }

    private fun setRandomMotivationMessage() {
        fullscreen_content.setText(list.getRandomElement())
    }

    fun <E> List<E>.getRandomElement() = this[Random().nextInt(this.size)]

}
