package com.example.mayang.classwork;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class resigerActivity extends Activity{
    private Button but_help,but_resiger,but_back;
    private String str_resigerusername,str_resigeruserpassword,str_resigeremail;
    private EditText resiger_username,resiger_userpassword,resiger_useremail;
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resiger_view);
        resiger_username=(EditText)findViewById(R.id.resiger_username);
        resiger_useremail=(EditText)findViewById(R.id.resiger_email);
        resiger_userpassword=(EditText)findViewById(R.id.resiger_password);
        but_help=(Button)findViewById(R.id.help);
        but_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(resigerActivity.this,helpActivity.class);
                startActivity(intent);
            }
        });
        but_back=(Button)findViewById(R.id.back);
        but_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(resigerActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        but_resiger=(Button)findViewById(R.id.but_resiger);
        but_resiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str_resigeremail=resiger_useremail.getText().toString().trim();
                str_resigerusername=resiger_username.getText().toString().trim();
                str_resigeruserpassword=resiger_userpassword.getText().toString().trim();
                //    resiger(str_resigerusername,str_resigeruserpassword,str_resigeremail);    注册函数
            }
        });
    }
}
