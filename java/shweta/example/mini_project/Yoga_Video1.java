package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Yoga_Video1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga__video1);
        getSupportActionBar().hide();
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view2);
        YouTubePlayerView youTubePlayerView3 = findViewById(R.id.youtube_player_view3);
        YouTubePlayerView youTubePlayerView4 = findViewById(R.id.youtube_player_view4);
        YouTubePlayerView youTubePlayerView5 = findViewById(R.id.youtube_player_view5);
        YouTubePlayerView youTubePlayerView6 = findViewById(R.id.youtube_player_view6);
        YouTubePlayerView youTubePlayerView7 = findViewById(R.id.youtube_player_view7);
        getLifecycle().addObserver(youTubePlayerView);
        getLifecycle().addObserver(youTubePlayerView2);
        getLifecycle().addObserver(youTubePlayerView3);
        getLifecycle().addObserver(youTubePlayerView4);
        getLifecycle().addObserver(youTubePlayerView5);
        getLifecycle().addObserver(youTubePlayerView6);
        getLifecycle().addObserver(youTubePlayerView7);
        //mg9DwM8LIOk
    }
}