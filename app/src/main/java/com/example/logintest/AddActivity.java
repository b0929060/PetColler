package com.example.logintest;

import static com.example.logintest.R.id.tv3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.NumberFormat;

//public class AddActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_add);
//        FloatingActionButton button=findViewById(R.id.floatingActionButton2);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dialog();
//            }
//        });
//
//    }
//    private void dialog() {
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        final EditText editText = new EditText(AddActivity.this); //final一個editText
//        builder.setView(editText);
//        builder.setTitle("請輸入名稱");
//        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(AddActivity.this, editText.getText().toString()+"您好~", Toast.LENGTH_SHORT).show();
//                //將get到的文字轉成字串才可以給Toast顯示哦
//            }
//        });
//        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(AddActivity.this, "取消", Toast.LENGTH_SHORT).show();
//            }
//        });
//        builder.create().show();
//    }
//
//}

////
//public class AddActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_add);
//
//        Bundle bundle = getIntent().getExtras();
//        String h = bundle.getString("height" );
//        String w = bundle.getString("width");
//
//        TextView dia = (TextView)findViewById(R.id.tv4);// 取得 顯示診斷 物件
//        // 診斷結果 顯示
//        if (fw<18.5)
//            dia.setText(h);
//        else if (18.5 <= fw)
//            dia.setText(w);
//
//    }
//}