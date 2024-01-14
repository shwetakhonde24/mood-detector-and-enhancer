package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import shreya.example.mini_project.R;
import shreya.example.mini_project.Timer;
import shreya.example.mini_project.Yoga_List;

public class Yoga_1 extends AppCompatActivity {
    Button button,b2,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_1);
        VideoView videoView = findViewById(R.id.vd);
        getSupportActionBar().hide();
        button = findViewById(R.id.button3);
        b2 = findViewById(R.id.button2);
        b4 = findViewById(R.id.button4);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.balasanav));
        videoView.requestFocus();
        videoView.start();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Timer.class));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), EnhancingScreen.class));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.stylecraze.com/articles/balasana-child-pose/"));
                startActivity(browserIntent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), Yoga_List.class)); // when user is on main screen and press to back button then shutdown the app
    }
    }
