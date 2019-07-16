package com.peterkimeli.acl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button AboutButton;
    private Button ProfileButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AboutButton = (Button)findViewById(R.id.about_btn);
        ProfileButton=(Button)findViewById(R.id.profile_btn);

        AboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AboutIntent =new Intent(MainActivity.this, AboutActivity.class);
                startActivity(AboutIntent);
            }
        });

        ProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ProfileIntent= new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(ProfileIntent);

            }
        });
    }
}
