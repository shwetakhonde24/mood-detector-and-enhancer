package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Downwardfacingdog extends AppCompatActivity {
    Button button,b2,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downwardfacingdog);
        VideoView videoView = findViewById(R.id.vd);
        button = findViewById(R.id.button3);
        b2 = findViewById(R.id.button2);
        b4 = findViewById(R.id.button4);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.downwardfacingdog));
        videoView.requestFocus();
        videoView.start();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Yoga6timer.class));
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
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.yogajournal.com/poses/types/downward-facing-dog/"));
                startActivity(browserIntent);
            }
        });
    }
}
