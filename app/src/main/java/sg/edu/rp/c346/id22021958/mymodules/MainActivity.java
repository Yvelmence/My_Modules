package sg.edu.rp.c346.id22021958.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvM1, tvM2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvM1 = findViewById(R.id.textViewAndroid);
        tvM2 = findViewById(R.id.textViewIPad);

        tvM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", 2020);
                intent.putExtra("sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });

        tvM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C349");
                intent.putExtra("name", "iPad Programming");
                intent.putExtra("year", 2020);
                intent.putExtra("sem", 2);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });
    }
}