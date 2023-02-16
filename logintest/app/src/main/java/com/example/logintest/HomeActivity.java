//package com.example.logintest;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;
//import android.content.Intent;
//import android.view.View;
//public class HomeActivity extends AppCompatActivity {
//    private Button login;
//    private Button signUp;
//    private FirebaseAuth mAuth;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        mAuth = FirebaseAuth.getInstance();
//        FirebaseUser user = mAuth.getCurrentUser();
//        if(user == null){
//            setContentView(R.layout.activity_home);
//            login = (Button) findViewById(R.id.login);
//            signUp = (Button) findViewById(R.id.sign_up);
//
//            login.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent();
//                    intent.setClass(HomeActivity.this, LoginActivity.class);
//                    startActivity(intent);
//
//                }
//            });
//            signUp.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent();
//                    intent.setClass(HomeActivity.this, SignUpActivity.class);
//                    startActivity(intent);
//                }
//            });
//        } else{
//            Intent intent = new Intent();
//            intent.setClass(HomeActivity.this, MainActivity.class);
//            startActivity(intent);
//        }
//
//    }
//}