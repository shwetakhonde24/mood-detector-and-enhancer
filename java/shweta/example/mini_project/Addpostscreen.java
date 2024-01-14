package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Addpostscreen extends AppCompatActivity {
    CardView type_1,type_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addpostscreen);
        getSupportActionBar().hide();
        type_1 = (CardView) findViewById(R.id.type_1);
        type_2 = (CardView) findViewById(R.id.type_2);
        type_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(EnhancerTypes.this, "clicked type 1", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),AddPostActivity.class));
            }
        });
        type_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(EnhancerTypes.this, "clicked type 1", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),HomeActivity.class));
            }
        });
    }
}