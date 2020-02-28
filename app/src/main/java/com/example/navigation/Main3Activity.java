package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.navigation.ui.home.HomeFragment;

public class Main3Activity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    String name,reg,ab,bc,cd;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1= (TextView) findViewById(R.id.textView5);
        t2= (TextView) findViewById(R.id.textView6);
        t3= (TextView) findViewById(R.id.textView7);
        t4= (TextView) findViewById(R.id.textView8);
        t5= (TextView) findViewById(R.id.textView9);
        bt=(Button)findViewById(R.id.button3);

        Intent i = getIntent();

        name=i.getStringExtra("name_key");
        reg=i.getStringExtra("reg_key");
        ab=i.getStringExtra("ab_key");
        bc=i.getStringExtra("bc_key");
        cd=i.getStringExtra("cd_key");
        t1.setText(name);
        t2.setText(reg);
        t3.setText(ab);
        t4.setText(bc);
        t5.setText(cd);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Another Booking",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
