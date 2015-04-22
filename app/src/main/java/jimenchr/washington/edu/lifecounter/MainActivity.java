package jimenchr.washington.edu.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    static final String STATE_SCORE_P1 = "score_p1";
    static final String STATE_SCORE_P2 = "score_p2";
    static final String STATE_SCORE_P3 = "score_p3";
    static final String STATE_SCORE_P4 = "score_p4";
    static final String STATE_LOSER = "loser";


    private int score_p1 = 20;
    private int score_p2 = 20;
    private int score_p3 = 20;
    private int score_p4 = 20;
    private String theLoser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null) {
            score_p1 = savedInstanceState.getInt(STATE_SCORE_P1);
            score_p2 = savedInstanceState.getInt(STATE_SCORE_P2);
            score_p3 = savedInstanceState.getInt(STATE_SCORE_P3);
            score_p4 = savedInstanceState.getInt(STATE_SCORE_P4);

            theLoser = savedInstanceState.getString(STATE_LOSER);
        }

        final TextView loser = (TextView) findViewById(R.id.loser);

        final TextView p1   = (TextView) findViewById(R.id.score_player1);
        final Button p1Up1  = (Button) findViewById(R.id.btn_up1_p1);
        final Button p1Dn1  = (Button) findViewById(R.id.btn_dn1_p1);
        final Button p1Up5  = (Button) findViewById(R.id.btn_up5_p1);
        final Button p1Dn5  = (Button) findViewById(R.id.btn_dn5_p1);

        final TextView p2   = (TextView) findViewById(R.id.score_player2);
        final Button p2Up1  = (Button) findViewById(R.id.btn_up1_p2);
        final Button p2Dn1  = (Button) findViewById(R.id.btn_dn1_p2);
        final Button p2Up5  = (Button) findViewById(R.id.btn_up5_p2);
        final Button p2Dn5  = (Button) findViewById(R.id.btn_dn5_p2);

        final TextView p3   = (TextView) findViewById(R.id.score_player3);
        final Button p3Up1  = (Button) findViewById(R.id.btn_up1_p3);
        final Button p3Dn1  = (Button) findViewById(R.id.btn_dn1_p3);
        final Button p3Up5  = (Button) findViewById(R.id.btn_up5_p3);
        final Button p3Dn5  = (Button) findViewById(R.id.btn_dn5_p3);

        final TextView p4   = (TextView) findViewById(R.id.score_player4);
        final Button p4Up1  = (Button) findViewById(R.id.btn_up1_p4);
        final Button p4Dn1  = (Button) findViewById(R.id.btn_dn1_p4);
        final Button p4Up5  = (Button) findViewById(R.id.btn_up5_p4);
        final Button p4Dn5  = (Button) findViewById(R.id.btn_dn5_p4);

        p1.setText("Total Lives " + score_p1);
        p2.setText("Total Lives " + score_p2);
        p3.setText("Total Lives " + score_p3);
        p4.setText("Total Lives " + score_p4);
        loser.setText(theLoser);

        View.OnClickListener click = new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                if (v.equals(p1Up1))
                    score_p1 += 1;
                else if (v.equals(p1Dn1))
                    score_p1 -= 1;
                else if (v.equals(p1Up5))
                    score_p1 += 5;
                else if (v.equals(p1Dn5))
                    score_p1 -= 5;
                    //player 2 scores
                else if (v.equals(p2Up1))
                    score_p2 += 1;
                else if (v.equals(p2Dn1))
                    score_p2 -= 1;
                else if (v.equals(p2Up5))
                    score_p2 += 5;
                else if (v.equals(p2Dn5))
                    score_p2 -= 5;
                    //player 3 scores
                else if (v.equals(p3Up1))
                    score_p3 += 1;
                else if (v.equals(p3Dn1))
                    score_p3 -= 1;
                else if (v.equals(p3Up5))
                    score_p3 += 5;
                else if (v.equals(p3Dn5))
                    score_p3 -= 5;
                    //player 4 scores
                else if (v.equals(p4Up1))
                    score_p4 += 1;
                else if (v.equals(p4Dn1))
                    score_p4 -= 1;
                else if (v.equals(p4Up5))
                    score_p4 += 5;
                else if (v.equals(p4Dn5))
                    score_p4 -= 5;

                if (score_p1 > 0) {
                    p1.setText("Total Lives " + score_p1);
                } else {
                    score_p1 = 0;
                    p1.setText("Total Lives: 0");
                    loser.setText("Player 1 LOSES!");
                    theLoser = "Player 1 LOSES!";
                }
                if (score_p2 > 0) {
                    p2.setText("Total Lives " + score_p2);
                }else {
                    score_p2 = 0;
                    p2.setText("Total Lives: 0");
                    loser.setText("Player 2 LOSES!");
                    theLoser = "Player 2 LOSES!";
                }
                if (score_p3 > 0) {
                    p3.setText("Total Lives " + score_p3);
                }else {
                    score_p3 = 0;
                    p3.setText("Total Lives: 0");
                    loser.setText("Player 3 LOSES!");
                    theLoser = "Player 3 LOSES!";
                }
                if (score_p4 > 0) {
                    p4.setText("Total Lives " + score_p4);
                } else {
                    score_p4 = 0;
                    p4.setText("Total Lives: 0");
                    loser.setText("Player 4 LOSES!");
                    theLoser = "Player 4 LOSES!";
                }
            }
        };


        p1Up1.setOnClickListener(click);
        p1Dn1.setOnClickListener(click);
        p1Up5.setOnClickListener(click);
        p1Dn5.setOnClickListener(click);

        p2Up1.setOnClickListener(click);
        p2Dn1.setOnClickListener(click);
        p2Up5.setOnClickListener(click);
        p2Dn5.setOnClickListener(click);

        p3Up1.setOnClickListener(click);
        p3Dn1.setOnClickListener(click);
        p3Up5.setOnClickListener(click);
        p3Dn5.setOnClickListener(click);

        p4Up1.setOnClickListener(click);
        p4Dn1.setOnClickListener(click);
        p4Up5.setOnClickListener(click);
        p4Dn5.setOnClickListener(click);

    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_SCORE_P1, score_p1);
        savedInstanceState.putInt(STATE_SCORE_P2, score_p2);
        savedInstanceState.putInt(STATE_SCORE_P3, score_p3);
        savedInstanceState.putInt(STATE_SCORE_P4, score_p4);
        savedInstanceState.putString(STATE_LOSER, theLoser);
        super.onSaveInstanceState(savedInstanceState);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
