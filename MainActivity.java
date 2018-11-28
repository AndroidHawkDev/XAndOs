package com.stupidgames.xandos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int[][] winningPositions = { {0,1,2},{3,4,5},{6,7,8},{0,4,8},
            {2,4,6},{0,3,6},{1,4,7},{2,5,8}};


    int[] placed = {2, 2, 2, 2, 2, 2, 2, 2, 2};

    int activePlayer = 0; // 0 = android and 1= iphone

    public void boxClicked(View view) {

        ImageView boxClicked = (ImageView) view;

        int tappedBox = Integer.parseInt( boxClicked.getTag().toString() );


        if (placed[tappedBox] == 2) {

            placed[tappedBox] = activePlayer;


            boxClicked.setTranslationY( -1000f );

            if (activePlayer == 0) {
                boxClicked.setImageResource( R.drawable.android_o );
                activePlayer = 1;
            } else {
                boxClicked.setImageResource( R.drawable.iphone_x );
                activePlayer = 0;
            }

            boxClicked.animate()
                    .translationYBy( 1000f )
                    .rotationX( 720 )
                    .setDuration( 500 );


            for (int[] winningPosition:winningPositions){
                if (placed[winningPosition[0]]!= 2
                        && placed[winningPosition[0]]== placed[winningPosition[1]]
                        && placed[winningPosition[1]]== placed[winningPosition[2]]){

                    //someone has won here
                    Toast.makeText( this,"Someone has won",Toast.LENGTH_SHORT ).show();

                    LinearLayout linearLayout = findViewById( R.id.playAgain );

                    linearLayout.setVisibility( View.VISIBLE );



                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_layout );


    }
}






