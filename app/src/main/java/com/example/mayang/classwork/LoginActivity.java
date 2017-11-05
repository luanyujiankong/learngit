package com.example.mayang.classwork;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends Activity{
    private Button but_help,but_resiger,but_login,but_back;
    private EditText login_id,login_password;
    private String str_id,str_password;
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);
        login_id=(EditText)findViewById(R.id.login_id);
        login_password=(EditText) findViewById(R.id.login_pass);
        but_help=(Button)findViewById(R.id.help);
        but_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(LoginActivity.this,helpActivity.class);
                startActivity(intent);
            }
        });
        but_back=(Button)findViewById(R.id.back);
        but_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
         but_login=(Button)findViewById(R.id.but_login);
         but_login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
              str_id=login_id.getText().toString().trim();
              str_password=login_password.getText().toString().trim();
              user userA=new user();
          //    login(login_id,login_password,userA);   登录函数
              if(userA.getState()==true){
                  Toast.makeText(getApplicationContext(),"登陆成功",Toast.LENGTH_SHORT).show();
                  Intent intent=new Intent();
                  intent.putExtra("userA",userA);
                  intent.setClass(LoginActivity.this,MainActivity.class);
                  startActivity(intent);
              }
              else {
                  Toast.makeText(getApplicationContext(),"用户名或密码错误",Toast.LENGTH_SHORT).show();
              }
             }
         });
        but_resiger=(Button)findViewById(R.id.but_resiger);
        but_resiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(LoginActivity.this,resigerActivity.class);
                startActivity(intent);
            }
        });
    }
}
