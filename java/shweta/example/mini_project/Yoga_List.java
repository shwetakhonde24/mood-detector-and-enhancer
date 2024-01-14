package shreya.example.mini_project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Yoga_List extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Balasana","Baddha Konasana ","Sukhasana","Shavasana","viparita karani","Adho Mukha","Uttanasana","Paschimottanasana"};
    String mDescription[] = {"Child Pose- click on image to know more","Butterfly pose","Easy Pose","Corpse Pose","Leg up wall pose","Downward-facing Dog Pose","Standing Forward Bend","seated forward bend"};
    int images[] = {R.drawable.balasanah,R.drawable.butterflyposeh,R.drawable.sukhasanah,R.drawable.corpsepose,R.drawable.legupthewallh,R.drawable.downwardposeh,R.drawable.standingforwardfold,R.drawable.seatedforwardposehjpg};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga__list);
        getSupportActionBar().hide();
        listView = findViewById(R.id.listview);
        MyAdapter adapter = new MyAdapter(this,mTitle,mDescription,images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(getApplicationContext(), Yoga_1.class);
                    startActivity(intent);
                    //Bundle bundle = new Bundle();

                }
                if (position==1) {
                    startActivity(new Intent(getApplicationContext(),Butterflypose.class));
                }
                if (position==2) {
                    startActivity(new Intent(getApplicationContext(),Sukhasana.class));
                }
                if (position==3) {
                    startActivity(new Intent(getApplicationContext(),CorpsePose.class));
                }
                if (position==4) {
                    startActivity(new Intent(getApplicationContext(),Legupthewall.class));
                }
                if (position==5) {
                    startActivity(new Intent(getApplicationContext(),Downwardfacingdog.class));
                }
                if (position==6) {
                    startActivity(new Intent(getApplicationContext(),StandingforwardBend.class));
                }
                if (position==7) {
                    startActivity(new Intent(getApplicationContext(),Seatedforwardbend.class));
                }
            }
        });

    }
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];
        MyAdapter(Context c, String title[],String description[],int imgs[]){
            super(c,R.layout.rows, R.id.textView101,title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;


        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.rows,parent,false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView101);
            TextView myDescription = row.findViewById(R.id.textview102);
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row;
        }
    }
}