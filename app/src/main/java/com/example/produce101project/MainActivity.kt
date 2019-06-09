package com.example.produce101project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.GestureDetectorCompat
import android.support.v4.view.MotionEventCompat
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import java.io.InputStream

private const val DEBUG_TAG = "Gestures"
class MainActivity : AppCompatActivity() {
    private val x1: Float = 0.toFloat()
    private val x2: Float = 0.toFloat()
    private lateinit var mDetector: GestureDetectorCompat
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mDetector = GestureDetectorCompat(this, MyGestureListener())
        info()
        readRank(1)
    }
    fun info() {
        val information=findViewById<TextView>(R.id.information)
        information.text="Name: Peak \nRank: 51 \nCompany: Chandelier Music"
        findViewById<TextView>(R.id.Name).text= "Peak"
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        mDetector.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    fun changePic(view: View)
    {
        nextTrainee()
    }

    private fun nextTrainee()
    {
        val image=findViewById<ImageView>(R.id.trainee)
        image.setImageResource(R.drawable.pyo)
        val information=findViewById<TextView>(R.id.information)
        information.text="Name: Son Dong Pyo \nRank: 12 \nCompany: DSP Media"
        findViewById<TextView>(R.id.Name).text= "Son Dong Pyo"
    }

    private class MyGestureListener : GestureDetector.SimpleOnGestureListener() {

        override fun onDown(event: MotionEvent): Boolean {
            Log.d(DEBUG_TAG, "onDown: $event")
            return true
        }

        override fun onFling(
            event1: MotionEvent,
            event2: MotionEvent,
            velocityX: Float,
            velocityY: Float
        ): Boolean {
            Log.d(DEBUG_TAG, "onFling: $event1 $event2")
            return true
        }
    }

    fun readRank(x:Int)
    {
        val file_name = "ranking1.txt"
        val reader = application.assets.open(file_name).bufferedReader()
        reader.readLine()
        if(x==1)
        {

        }
    }
}
