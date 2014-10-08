package com.epam.kptvlr.myandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;

public class AboutActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }

    public void btnGoToActivity1_Click(View view) {
        EditText myEditText = (EditText) findViewById(R.id.editText);

        Intent intent = new Intent(AboutActivity.this, MyActivity.class);

        intent.putExtra("inputtedText", myEditText.getText().toString());

        startActivity(intent);
    }
}
