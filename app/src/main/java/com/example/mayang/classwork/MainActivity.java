package com.example.mayang.classwork;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button but_taohuo,but_haitao,but_fabu,but_messgae,but_personal;
    user userA=new user();
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);

        but_taohuo=(Button)findViewById(R.id.taohuo);
        but_taohuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fg_main fg_main=new fg_main();
                getFragmentManager().beginTransaction().replace(R.id.mianview,fg_main).commit();
            }
        });
        but_haitao=(Button)findViewById(R.id.haitao);
        but_haitao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               fg_haitao fg_haitao=new fg_haitao();
                getFragmentManager().beginTransaction().replace(R.id.mianview,fg_haitao).commit();
            }
        });
        but_fabu=(Button)findViewById(R.id.fabu);
        but_fabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,fabu_Activity.class);
                startActivity(intent);
            }
        });
        but_messgae=(Button)findViewById(R.id.message);
        but_messgae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              fg_message fg_message=new fg_message();
              getFragmentManager().beginTransaction().replace(R.id.mianview,fg_message).commit();
            }
        });
        but_personal=(Button)findViewById(R.id.personal);
        but_personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(userA.getState()==false){
                    Intent intent=new Intent();
                    intent.setClass(MainActivity.this,LoginActivity.class);
                    startActivity(intent);
                }
                else {
                    PersonalManagement pm=new PersonalManagement();
                    getFragmentManager().beginTransaction().replace(R.id.mianview,pm).commit();
                }

            }
        });
    }
}
