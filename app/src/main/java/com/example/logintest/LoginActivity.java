package com.example.logintest;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class LoginActivity extends AppCompatActivity {
    private EditText useraccount,userpassword;
    private Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //取得元件的id
        components();
        //設定button的監聽事件
        buttonsetting();
    }
    //取得元件的id
    private void components() {
        useraccount=(EditText)findViewById(R.id.account_edit);
        userpassword=(EditText)findViewById(R.id.password_edit);
        signin=(Button)findViewById(R.id.signup_button);
    }
    //設定button的監聽事件
    private void buttonsetting() {

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userid=useraccount.getText().toString();
                String userpasswd=userpassword.getText().toString();
                //取得sharedpreference
                SharedPreferences preference=getSharedPreferences("data",MODE_PRIVATE);
                //判斷登入畫面輸入的帳號密碼是否跟註冊的帳號密碼一樣
                if (userid.equals(preference.getString("id",""))
                        &&userpasswd.equals(preference.getString("password",""))){
                    SharedPreferences.Editor edit =preference.edit();
                    edit.apply();
                    //是的話顯示成功登入
                    Toast.makeText(LoginActivity.this,"成功登入",Toast.LENGTH_SHORT).show();
                    Bundle bundle = new Bundle();
                    bundle.putString("acc",useraccount.getText().toString());
                    Intent intent =new Intent(LoginActivity.this,write.class);
                    startActivity(intent);
                } else {
                    //不是則顯示登入失敗
                    Toast.makeText(LoginActivity.this,"登入失敗",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}