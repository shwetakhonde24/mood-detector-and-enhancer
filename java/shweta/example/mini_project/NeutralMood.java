package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import soup.neumorphism.NeumorphCardView;

public class NeutralMood extends AppCompatActivity {
    Button b1;
    NeumorphCardView c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neutral_mood);
        c1 = findViewById(R.id.heading21);
        b1 = findViewById(R.id.next_btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EnhancingScreen.class));
            }
        });
    }
}