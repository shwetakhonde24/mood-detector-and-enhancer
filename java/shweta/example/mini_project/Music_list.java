package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Music_list extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Balasana","Baddha Konasana ","Sukhasana","Shavasana","viparita karani","Adho Mukha","Uttanasana","Paschimottanasana"};
    String mDescription[] = {"Child Pose- click on image to know more","Butterfly pose","Easy Pose","Corpse Pose","Leg up wall pose","Downward-facing Dog Pose","Standing Forward Bend","seated forward bend"};
    int images[] = {R.drawable.balasanah,R.drawable.butterflyposeh,R.drawable.sukhasanah,R.drawable.corpsepose,R.drawable.legupthewallh,R.drawable.downwardposeh,R.drawable.standingforwardfold,R.drawable.seatedforwardposehjpg};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);
    }
}