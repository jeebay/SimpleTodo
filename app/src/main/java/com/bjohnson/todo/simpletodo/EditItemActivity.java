package com.bjohnson.todo.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        String itemText = getIntent().getStringExtra("text");
        position = getIntent().getIntExtra("position", 0);

        EditText etEditItem = findViewById(R.id.etEditItem);
        etEditItem.setText(itemText);
    }

    public void onSubmit(View v) {
        EditText etEditItem = findViewById(R.id.etEditItem);
        String text = etEditItem.getText().toString();

        Intent data = new Intent();
        data.putExtra("text", text);
        data.putExtra("position", position);

        setResult(RESULT_OK, data);
        finish();
    }
}
