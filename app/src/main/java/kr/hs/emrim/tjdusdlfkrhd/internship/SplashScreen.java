package kr.hs.emrim.tjdusdlfkrhd.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler() {
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                startActivity(new Intent(SplashScreen.this, GuideActivity.class));
                finish();
            }
        };

        handler.sendEmptyMessageDelayed(0, 3000); //3초후 화면전환
    }
}
