package com.sirmothupii.findanurse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Registration extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
    //onClick intent to tke user to the Login screen
    public void onClickSubmit(View view)
    {
        Intent intent1 = new Intent(this, Login.class);
        startActivity(intent1);
    }
}
