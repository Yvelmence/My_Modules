package sg.edu.rp.c346.id22021958.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode, tvName, tvYear, tvSem, tvCredit, tvVenue;
    Button btnRest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);
        btnRest = findViewById(R.id.buttonReset);

        Intent intentReceived = getIntent();
        String moduleSelectedCode = intentReceived.getStringExtra("code");
        String moduleSelectedName = intentReceived.getStringExtra("name");
        int moduleSelectedYear = intentReceived.getIntExtra("year", 0);
        int moduleSelectedSem = intentReceived.getIntExtra("sem", 0);
        int moduleSelectedCredit = intentReceived.getIntExtra("credit", 0);
        String moduleSelectedVenue = intentReceived.getStringExtra("venue");

        if(moduleSelectedCode.equals("C346")){
            tvCode.setText("Module Code: " + moduleSelectedCode);
            tvName.setText("Module Name : " + moduleSelectedName);
            tvYear.setText("Academic Year: " + moduleSelectedYear);
            tvSem.setText("Semester: " + moduleSelectedSem);
            tvCredit.setText("Module Credit: " + moduleSelectedCredit);
            tvVenue.setText("Venue: " + moduleSelectedVenue);
        }
        else if(moduleSelectedCode.equals("C349")){
            tvCode.setText("Module Code: " + moduleSelectedCode);
            tvName.setText("Module Name : " + moduleSelectedName);
            tvYear.setText("Academic Year: " + moduleSelectedYear);
            tvSem.setText("Semester: " + moduleSelectedSem);
            tvCredit.setText("Module Credit: " + moduleSelectedCredit);
            tvVenue.setText("Venue: " + moduleSelectedVenue);
        }

        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}