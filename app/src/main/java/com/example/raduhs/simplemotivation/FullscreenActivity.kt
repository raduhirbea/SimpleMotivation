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
            "Control is an illusion. Let go, let life happen",
            "A man without a smiling face must not open a shop",
            "Make a new future and the past won't matter",
            "Live your life for yourself",
            "Give yourself permission to do things, u don't need permission from others",
            "Life is either a DARING adventure or nothing",
            "Life is this complicated rich experience that isn't completely figured out",
            "Learning is not accumulation of knowledge but a behaviour change",
            "We are what we're choosing to be",
            "Conversation is an art",
            "The boy must die for it to be reborn as a man",
            "Courage = DO the RIGHT thing; Liquid courage = beer; Do courage to talk to women",
            "It's not the destination that counts, it's the journey",
            "You should take some time and think to where u want your life to go to",
            "A true GENTLEMAN – deferential to great men, modest with his equals and courteous to his inferiors",
            "Pack leaders don't come to followers, followers always come to pack leaders",
            "If you want some respect, you go out there and take it for yourself",
            "We never shall have any more time",
            "Never ever ever give up",
            "Never let them see you sweat",
            "Stop seeking other people approval",
            "Your MIND is like a garden, you need to take out weeds every day",
            "Accept people for what they are – some will lie, be flaky, steal create drama – that has nothing to do with you",
            "Sometimes you need to spend money to make money",
            "I'm what time and circumstances made me",
            "Can you get to a future if your past is present",
            "Give the devil his due",
            "When you have no power, delay",
            "Sometimes you win and sometimes you learn",
            "Life is a game that one plays according to the rules",
            "If you're not in the mood, you can't do stuff right",
            "Truth is born out of argument",
            "If you live each day as if it was your last, someday you'll most certainly be right",
            "A glorious failure leads to nothing; a petty success may lead to a success that is not petty",
            "Be content with quite a little. Allow for accidents.  Allow for human nature, especially your Own",
            "Work hard, party hard",
            "Avoid unlucky people",
            "Learn everything you can about how this world works",
            "Only you and you alone can change your situation. Don't blame it on anything or anyone",
            "All of humanity’s problems stem from man’s inability to sit quietly in a room alone",
            "Be cool like James Bond – nothing that ever happens bothers him",
            "We're flawed because we want so much more.we're ruined because we get those things and wish for what we had",
            "I will speak ill of no man, . . and speak all the good I know of everybody",
            "Don’t criticize, condemn or complain",
            "Give honest and sincere appreciation",
            "Arouse in the other person an eager want",
            "Become genuinely interested in other people",
            "Smile",
            "Remember that a person’s name is to that person the sweetest and most important sound in any language",
            "Be a good listener. Encourage others to talk about themselves",
            "Talk in terms of the other person’s interests.",
            "Make the other person feel important-and do it sincerely",
            "Go anywhere alone and feel good with yourself having a good time with people",
            "A man without a san is a man without a future",
            "Best thing you can do for poor people is not be one of them")


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
