package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;


import com.example.android.scorekeeper.R;

import static android.R.id.edit;
import static android.R.id.input;
import static com.example.android.scorekeeper.R.color.score;
import static com.example.android.scorekeeper.R.id.player_one;
import static com.example.android.scorekeeper.R.id.player_two;

public class MainActivity extends AppCompatActivity {

    EditText edit_player_one;
    EditText edit_player_two;
    EditText edit_player_three;

    int scorePlayerOne = 0;
    int scorePlayerTwo = 0;
    int scorePlayerThree = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_player_one = (EditText) findViewById(R.id.edit_player_one);

        edit_player_two = (EditText) findViewById(R.id.edit_player_two);

        edit_player_three = (EditText) findViewById(R.id.edit_player_three);


        if (savedInstanceState != null) {
            edit_player_one.setText(savedInstanceState.getString("Player 1"));
            edit_player_two.setText(savedInstanceState.getString("Player 2"));
            edit_player_three.setText(savedInstanceState.getString("Player 3"));

        }
    }



    @Override
    public void onRestoreInstanceState(Bundle bundle) {

        super.onRestoreInstanceState(bundle);

        scorePlayerOne = bundle.getInt("scorePlayerOne");
        scorePlayerTwo = bundle.getInt("scorePlayerTwo");
        scorePlayerThree = bundle.getInt("scorePlayerThree");

        display();
    }


    @Override
    public void onSaveInstanceState (Bundle bundle){
        bundle.putInt("scorePlayerOne",scorePlayerOne);
        bundle.putInt("scorePlayerTwo",scorePlayerTwo);
        bundle.putInt("scorePlayerThree",scorePlayerThree);

        super.onSaveInstanceState(bundle);
    }

    /**
     * Displays the given score for Player 1.
     */
    public void displayForPlayerOne(int score) {
        TextView scoreView = (TextView) findViewById(player_one);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Player One by 5 point.
     */
    public void addFiveForPlayerOne(View v) {

        scorePlayerOne = scorePlayerOne + 5;
        displayForPlayerOne(scorePlayerOne);
    }

    /**
     * Increase the score for Player One by 10 points.
     */
    public void addTenForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 10;
        displayForPlayerOne(scorePlayerOne);
    }

    /**
     * Increase the score for Player One by 20 points.
     */
    public void addTwentyForPlayerOne(View v) {
        scorePlayerOne = scorePlayerOne + 20;
        displayForPlayerOne(scorePlayerOne);
    }


    /**
     * Displays the given score for Player Two.
     */
    public void displayForPlayerTwo(int score) {
        TextView scoreView = (TextView) findViewById(player_two);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Player Two by 5 point.
     */
    public void addFiveForPlayerTwo(View v) {

        scorePlayerTwo = scorePlayerTwo + 5;
        displayForPlayerTwo(scorePlayerTwo);
    }

    /**
     * Increase the score for Player Two by 10 points.
     */
    public void addTenForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 10;
        displayForPlayerTwo(scorePlayerTwo);
    }

    /**
     * Increase the score for Player Two by 20 points.
     */
    public void addTwentyForPlayerTwo(View v) {
        scorePlayerTwo = scorePlayerTwo + 20;
        displayForPlayerTwo(scorePlayerTwo);
    }

    /**
     * Displays the given score for Player Three.
     */
    public void displayForPlayerThree(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_three);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Player Three by 5 point.
     */
    public void addFiveForPlayerThree(View v) {

        scorePlayerThree = scorePlayerThree + 5;
        displayForPlayerThree(scorePlayerThree);
    }

    /**
     * Increase the score for Player Three by 10 points.
     */
    public void addTenForPlayerThree(View v) {
        scorePlayerThree = scorePlayerThree + 10;
        displayForPlayerThree(scorePlayerThree);
    }

    /**
     * Increase the score for Player Three by 20 points.
     */
    public void addTwentyForPlayerThree(View v) {
        scorePlayerThree = scorePlayerThree + 20;
        displayForPlayerThree(scorePlayerThree);
    }


    /**
     * Display() onReatoreInstanceState
     * **/

    private void display(){

        TextView PlayerOne = (TextView) findViewById(R.id.player_one);
        PlayerOne.setText(String.valueOf(scorePlayerOne));

        TextView PlayerTwo = (TextView) findViewById(R.id.player_two);
        PlayerTwo.setText(String.valueOf(scorePlayerTwo));

        TextView PlayerThree = (TextView) findViewById(R.id.player_three);
        PlayerThree.setText(String.valueOf(scorePlayerThree));


    }

    /**
     * Reset the score
     */

    public void resetScore(View v) {
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        scorePlayerThree = 0;
        displayForPlayerOne(scorePlayerOne);
        displayForPlayerTwo(scorePlayerTwo);
        displayForPlayerThree(scorePlayerThree);
    }
    }


