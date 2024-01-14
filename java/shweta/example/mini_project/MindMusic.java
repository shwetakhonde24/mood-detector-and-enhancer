package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MindMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind_music);
        getSupportActionBar().hide();
        YouTubePlayerView youTubePlayerViewm1 = findViewById(R.id.youtube_player_viewm1);
        YouTubePlayerView youTubePlayerViewm3 = findViewById(R.id.youtube_player_viewm3);
        YouTubePlayerView youTubePlayerViewm4 = findViewById(R.id.youtube_player_viewm4);
        YouTubePlayerView youTubePlayerViewm5 = findViewById(R.id.youtube_player_viewm5);
        YouTubePlayerView youTubePlayerViewm6 = findViewById(R.id.youtube_player_viewm6);
        YouTubePlayerView youTubePlayerViewm7 = findViewById(R.id.youtube_player_viewm7);
        getLifecycle().addObserver(youTubePlayerViewm1);
        getLifecycle().addObserver(youTubePlayerViewm3);
        getLifecycle().addObserver(youTubePlayerViewm4);
        getLifecycle().addObserver(youTubePlayerViewm5);
        getLifecycle().addObserver(youTubePlayerViewm6);
        getLifecycle().addObserver(youTubePlayerViewm7);
    }
}