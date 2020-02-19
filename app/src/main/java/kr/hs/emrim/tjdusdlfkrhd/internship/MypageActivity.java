package kr.hs.emrim.tjdusdlfkrhd.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MypageActivity extends AppCompatActivity {
    Button buttonEvent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEvent = (Button)findViewById(R.id.likebtn);
        buttonEvent.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    buttonEvent.setBackgroundColor(Color.TRANSPARENT);
                } else if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    buttonEvent.setBackgroundColor(Color.LTGRAY);
                }

                return false;
            }
        });
    }
}
