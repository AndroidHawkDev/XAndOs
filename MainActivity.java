package com.stupidgames.xandos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_layout );

        ImageView topLeft= findViewById( R.id.ivTopLeft );
        ImageView topMid= findViewById( R.id.ivTopMid);
        ImageView topRight= findViewById( R.id.ivTopRight );
        ImageView midLeft= findViewById( R.id.ivMidLeft);
        ImageView midMid= findViewById( R.id.ivMidMid);
        ImageView midRight= findViewById( R.id.ivMidRight);
        ImageView bottomLeft= findViewById( R.id.ivBottomLeft);
        ImageView bottomMid= findViewById( R.id.ivBottomMid);
        ImageView bottomRight= findViewById( R.id.ivBottomRight );


        View.OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView counter = (ImageView) v;

                counter.setTranslationY( -1000f );
                counter.setImageResource( R.drawable.iphone_x );
                counter.animate()
                        .translationXBy( 1000f )
                        .rotation( 720 )
                        .setDuration( 3000 );

            }
        };
        topLeft.setOnClickListener( listener );
        topMid.setOnClickListener( listener );
        topRight.setOnClickListener( listener );
        midLeft.setOnClickListener( listener );
        midMid.setOnClickListener( listener );
        midRight.setOnClickListener( listener );
        bottomLeft.setOnClickListener( listener );
        bottomMid.setOnClickListener( listener );
        bottomRight.setOnClickListener( listener );








    }
}
