package shreya.example.mini_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class EnhancerTypes extends AppCompatActivity {
    CardView type_1,type_2,type_3,type_4,type_5,type_6,type_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enhancer_types);
        getSupportActionBar().hide();
        type_1 = (CardView) findViewById(R.id.type_1);
        type_2 = (CardView) findViewById(R.id.type_2);
        type_3 = (CardView) findViewById(R.id.type_3);
        type_4 = (CardView) findViewById(R.id.type_4);
        type_5 = (CardView) findViewById(R.id.type_5);
        type_6 = (CardView) findViewById(R.id.type_6);
        type_7 = (CardView) findViewById(R.id.type_7);
        type_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(EnhancerTypes.this, "clicked type 1", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),Exercises.class));
            }
        });
        type_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(EnhancerTypes.this, "clicked type 1", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),MindMusic.class));
            }
        });
        type_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(EnhancerTypes.this, "clicked type 1", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),MoodPsychology.class));
            }
        });
        type_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(EnhancerTypes.this, "clicked type 1", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),Yoga_Video1.class));
            }
        });
        type_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(EnhancerTypes.this, "clicked type 1", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),FoodMood.class));
            }
        });

        type_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Yoga_Video1.class));
            }
        });
        type_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ReadBooks.class));
            }
        });


    }
}