package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EnhancingScreen extends AppCompatActivity {
    CardView cardHome;
    CardView cardMusic;
    CardView cardExercise;
    CardView cardFacts;
    CardView cardProfile;
    CardView cardLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enhancing_screen);
        getSupportActionBar().hide();
        cardHome = findViewById(R.id.home);
        cardMusic = findViewById(R.id.music);
        cardExercise = findViewById(R.id.Meditation);
        cardFacts = findViewById(R.id.Facts);
        cardProfile = findViewById(R.id.profile);
        cardLogout = findViewById(R.id.setting);

        cardHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // showToast("Home clicked");
                startActivity(new Intent(getApplicationContext(),Addpostscreen.class));

            }
        });
        cardMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Music.class));

            }
        });
        cardExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Yoga_List.class));
            }
        });
        cardFacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EnhancerTypes.class));
            }
        });
        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Nutrition_list.class));
            }
        });
        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Profile.class));

            }
        });
    }
    private void showToast(String mesaage){
        Toast.makeText(this,"message", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity(); // when user is on main screen and press to back button then shutdown the app
    }
}