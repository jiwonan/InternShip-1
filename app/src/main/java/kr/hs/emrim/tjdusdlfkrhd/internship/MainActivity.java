package kr.hs.emrim.tjdusdlfkrhd.internship;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    SharedPreferences LoginUserInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginUserInfo = getSharedPreferences("userlogininfo", MODE_PRIVATE);
        final SharedPreferences.Editor editor = LoginUserInfo.edit();

        String check = LoginUserInfo.getString("email",null)+","+LoginUserInfo.getString("password",null);

        Toast.makeText(this, check, Toast.LENGTH_SHORT).show();

        Button LoginBtn = (Button)findViewById(R.id.LoginBtn);

        LoginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SignInActivity.class));
            }
        });

        Button WriteBtn = (Button)findViewById(R.id.writeBtn);
        WriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), WriteActivity.class));
            }
        });
    }
}
