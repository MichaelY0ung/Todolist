package com.example.michael.todolist2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael on 2016/7/7.
 */
public class FileActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.file_layout);
        Button fileback = (Button)findViewById(R.id.file_back);
        fileback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FileActivity.this.finish();
            }
        });
        Button fileedit = (Button)findViewById(R.id.file_edit);
        fileedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FileActivity.this,EditActivity.class);
                startActivity(intent);
            }
        });
    }
}
