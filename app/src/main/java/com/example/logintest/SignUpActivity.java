package com.example.logintest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class SignUpActivity extends AppCompatActivity {
    //宣告物件
    private Button cler,comfirm;
    private EditText userid,userpasswd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        init();//取得元件的id
        buttonlistener();//設定監聽事件
    }
    //取得元件的id
    private void init() {
        userid=(EditText)findViewById(R.id.account_edit);
        userpasswd=(EditText)findViewById(R.id.password_edit);
        comfirm=(Button)findViewById(R.id.signup_button);
        cler=(Button)findViewById(R.id.cler);
    }
    //設定監聽事件
    private void buttonlistener() {
        comfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //新增一個sharedpreference
                SharedPreferences sharedPreferences =getSharedPreferences("data",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                //存入資料
                editor.putString("id",userid.getText().toString());
                editor.putString("password",userpasswd.getText().toString());
                editor.apply();

                String str =userid.getText().toString();
                String str1 =userpasswd.getText().toString();
                //判斷輸入的值是否為空值
                if (TextUtils.isEmpty(str)) {
                    Toast.makeText(SignUpActivity.this, "帳號不能為空",Toast.LENGTH_SHORT).show();
                }else if (TextUtils.isEmpty(str1)) {
                    Toast.makeText(SignUpActivity.this, "密碼不能為空", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(SignUpActivity.this,"註冊成功!",Toast.LENGTH_SHORT).show();
                    Intent intent1=new Intent(SignUpActivity.this,MainActivity.class);
                    startActivity(intent1);
                }
            }
        });
        //按下清除按鈕則清除帳號密碼
        cler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userid.setText("");
                userpasswd.setText("");
            }
        });
    }
}