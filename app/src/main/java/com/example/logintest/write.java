package com.example.logintest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class write extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);
//        Bundle bundle = getIntent().getExtras();
//        String h = bundle.getString("acc" );
//        TextView dia = (TextView)findViewById(R.id.tv4);// 取得 顯示診斷 物件
//        // 診斷結果 顯示
//        dia.setText("hello");
//
//    }
//}
        FloatingActionButton button=findViewById(R.id.floatingActionButton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog();
            }
        });

    }
    private void dialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText editText = new EditText(write.this); //final一個editText
        builder.setView(editText);
        builder.setTitle("請輸入名稱");
        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(write.this, editText.getText().toString()+"您好~", Toast.LENGTH_SHORT).show();
                //將get到的文字轉成字串才可以給Toast顯示哦
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(write.this, "取消", Toast.LENGTH_SHORT).show();
            }
        });
        builder.create().show();
    }

}