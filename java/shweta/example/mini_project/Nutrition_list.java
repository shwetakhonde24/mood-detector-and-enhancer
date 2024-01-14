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

public class Nutrition_list extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Drinks","Fruits","Breakfast Cereals","Nuts Seeds","Egg Dairy","Sweets"};
    String mDescription[] = {"Morning Beverage","Fruits","Cornflakes Oatmeal Bread","Almomd cashew","Egg Milk Yoghurt","Chocolates icecream cookies"};
    int images[] = {R.drawable.drinks,R.drawable.fruits,R.drawable.breakfastcereals,R.drawable.nutsseeds,R.drawable.egg_dairy,R.drawable.chocolateh};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_list);
        listView = findViewById(R.id.listview);
        getSupportActionBar().hide();
        Nutrition_list.MyAdapter adapter = new Nutrition_list.MyAdapter(this,mTitle,mDescription,images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(getApplicationContext(), NutrientSuggester.class);
                    startActivity(intent);
                    //Bundle bundle = new Bundle();

                }
                if (position==1) {
                    startActivity(new Intent(getApplicationContext(),nutrient2.class));
                }
                if (position==2) {
                    startActivity(new Intent(getApplicationContext(),nutrients3.class));
                }
                if (position==3) {
                    startActivity(new Intent(getApplicationContext(),nutreint4.class));
                }
                if (position==4) {
                    startActivity(new Intent(getApplicationContext(),nutrient5.class));
                }
                if (position==5) {
                    startActivity(new Intent(getApplicationContext(),nutreint6.class));
                }
            }
        });

    }
    class MyAdapter extends ArrayAdapter<String> {
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