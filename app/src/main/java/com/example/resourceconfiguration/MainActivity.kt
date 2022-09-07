package com.example.resourceconfiguration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

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