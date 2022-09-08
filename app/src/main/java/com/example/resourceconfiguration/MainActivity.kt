package com.example.resourceconfiguration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var scoreTeamOne: TextView
    private lateinit var scoreTeamTwo: TextView

    private lateinit var addThreePointsTeamOne: Button
    private lateinit var addTwoPointsTeamOne: Button
    private lateinit var addOnePointTeamOne: Button
    private lateinit var removeOnePointTeamOne: Button

    private lateinit var addThreePointsTeamTwo: Button
    private lateinit var addTwoPointsTeamTwo: Button
    private lateinit var addOnePointTeamTwo: Button
    private lateinit var removeOnePointTeamTwo: Button

    private lateinit var resetBoth: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scoreTeamOne = findViewById(R.id.scoreTeamOne)
        scoreTeamTwo = findViewById(R.id.scoreTeamTwo)

        scoreTeamOne.setText("0")
        scoreTeamTwo.setText("0")

        addThreePointsTeamOne = findViewById(R.id.addThreePointsTeamOne)
        addThreePointsTeamTwo = findViewById(R.id.addThreePointsTeamTwo)

        addTwoPointsTeamOne = findViewById(R.id.addTwoPointsTeamOne)
        addTwoPointsTeamTwo = findViewById(R.id.addTwoPointsTeamTwo)

        addOnePointTeamOne = findViewById(R.id.addOnePointTeamOne)
        addOnePointTeamTwo = findViewById(R.id.addOnePointTeamTwo)

        removeOnePointTeamOne = findViewById(R.id.removeOnePointTeamOne)
        removeOnePointTeamTwo = findViewById(R.id.removeOnePointTeamTwo)

        resetBoth = findViewById(R.id.resetBoth)

        addThreePointsTeamOne.setOnClickListener {
            addPointsToTeam(scoreTeamOne, 3)
        }

        addTwoPointsTeamOne.setOnClickListener {
            addPointsToTeam(scoreTeamOne, 2)
        }

        addOnePointTeamOne.setOnClickListener {
            addPointsToTeam(scoreTeamOne, 1)
        }

        removeOnePointTeamOne.setOnClickListener {
            addPointsToTeam(scoreTeamOne, -1)
        }

        addThreePointsTeamTwo.setOnClickListener {
            addPointsToTeam(scoreTeamTwo, 3)
        }

        addTwoPointsTeamTwo.setOnClickListener {
            addPointsToTeam(scoreTeamTwo, 2)
        }

        addOnePointTeamTwo.setOnClickListener {
            addPointsToTeam(scoreTeamTwo, 1)
        }

        removeOnePointTeamTwo.setOnClickListener {
            addPointsToTeam(scoreTeamTwo, -1)
        }

        resetBoth.setOnClickListener {
            resetCount(scoreTeamOne, scoreTeamTwo)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("scoreTeamOne", scoreTeamOne.text.toString())
        outState.putString("scoreTeamTwo", scoreTeamTwo.text.toString())
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        scoreTeamOne.setText(savedInstanceState.getString("scoreTeamOne"))
        scoreTeamTwo.setText(savedInstanceState.getString("scoreTeamTwo"))
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }

    private fun addPointsToTeam(textView: TextView, pointsToAdd: Int){
        var newScore: Int
        var currentScore: Int = textView.text.toString().toInt()
        newScore = currentScore + pointsToAdd
        textView.text = newScore.toString()
    }

    private fun resetCount(textView: TextView, textView2: TextView){
        textView.text = "0"
        textView2.text = "0"
    }

}