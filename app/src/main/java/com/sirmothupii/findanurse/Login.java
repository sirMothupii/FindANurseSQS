package com.sirmothupii.findanurse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
 
    //Link to take user to the navigation screen
    public void onClickSignIn(View view)
    {
        Intent intent1 = new Intent(this, Dashboard.class);
        startActivity(intent1);
    }

    //Link to take user to register screen
    public void onClickRegister(View view)
    {
        Intent intent1 = new Intent(this, Registration.class);
        startActivity(intent1);
    }
}
