package sg.edu.rp.c346.id22021958.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvM1, tvM2, tvM3, tvM4, tvM5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvM1 = findViewById(R.id.textViewC346);
        tvM2 = findViewById(R.id.textViewC203);
        tvM3 = findViewById(R.id.textViewC206);
        tvM4 = findViewById(R.id.textViewC218);
        tvM5 = findViewById(R.id.textViewC235);

        tvM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 2);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W64N");
                startActivity(intent);
            }
        });

        tvM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C203");
                intent.putExtra("name", "Web AppIn Development in php");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W64N");
                startActivity(intent);
            }
        });

        tvM3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C206");
                intent.putExtra("name", "Software Development Process");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W64N");
                startActivity(intent);
            }
        });

        tvM4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C218");
                intent.putExtra("name", "UI/UX Design for Apps");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W64N");
                startActivity(intent);
            }
        });

        tvM5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C235");
                intent.putExtra("name", "IT Security and Management");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W64N");
                startActivity(intent);
            }
        });
    }
}