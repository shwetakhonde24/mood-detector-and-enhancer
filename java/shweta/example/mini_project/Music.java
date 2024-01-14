package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Music extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        getSupportActionBar().hide();
        String url10 = "https://firebasestorage.googleapis.com/v0/b/miniproject-62af1.appspot.com/o/Quiet_Time.mp3?alt=media&token=4279259c-30ed-4ac6-991d-a450c0fe8afb";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/miniproject-62af1.appspot.com/o/forest_birds_wind_trees_leaves_falling.mp3?alt=media&token=5ceb916a-1001-400a-8a4e-e448b48ef118";
        String url12 = "https://firebasestorage.googleapis.com/v0/b/miniproject-62af1.appspot.com/o/wind_palm_trees_constant.mp3?alt=media&token=dcc20e36-9628-4c03-ba3d-bee3df9c320b";
        String url13 = "https://firebasestorage.googleapis.com/v0/b/miniproject-62af1.appspot.com/o/Stasis.mp3?alt=media&token=470f2efa-7f1e-42f5-8533-2a8117542964";
        String url14 = "https://firebasestorage.googleapis.com/v0/b/miniproject-62af1.appspot.com/o/wind_trees_leaves_small_brances_fall_bird.mp3?alt=media&token=5ded0359-c3ff-4050-b6cb-ef522d35359c";
        String url1 = "https://firebasestorage.googleapis.com/v0/b/miniproject-62af1.appspot.com/o/At_the_Center_Is_Love.mp3?alt=media&token=1c9c5b73-b7d1-4dcb-8030-1e0263b5e631";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/miniproject-62af1.appspot.com/o/breatheinme.mp3?alt=media&token=4d89402a-4343-444d-b651-be365971b853";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/miniproject-62af1.appspot.com/o/meditation.mp3?alt=media&token=2fc27579-5aa8-4138-af7f-01e06c58be78";
        JcPlayerView jcPlayerView = findViewById(R.id.jcplayer);

        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Quiet Time",url10));
        jcAudios.add(JcAudio.createFromURL("Statis",url11));
        jcAudios.add(JcAudio.createFromURL("forest_birds_wind_trees_leaves_falling",url12));
        jcAudios.add(JcAudio.createFromURL("wind_palm_trees_constant",url13));
        jcAudios.add(JcAudio.createFromURL("wind_trees_leaves_small_brances_fall_bird",url14));
        jcAudios.add(JcAudio.createFromURL("Meditation",url1));
        jcAudios.add(JcAudio.createFromURL("Silence",url2));
        jcAudios.add(JcAudio.createFromURL("Peace",url3));
        // jcAudios.add(JcAudio.createFromAssets("Asset audio", "audio.mp3"));
        // jcAudios.add(JcAudio.createFromRaw("Raw audio", R.raw.audio));

        jcPlayerView.initPlaylist(jcAudios, null); // initializing jc player view

        jcPlayerView.createNotification();
    }
}