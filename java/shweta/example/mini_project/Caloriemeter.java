package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Caloriemeter extends AppCompatActivity {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caloriemeter);
        spinner = findViewById(R.id.spinner);
        //List<String> breakfast = Arrays.asList("Tx","ca","wa","NY");

        List<String> categories = new ArrayList<String>();
        categories.add(0,"choose category");
        categories.add("Breakfastcereals");//Bars
        categories.add("Tea");//Meal Shakes, Soda, Coffee,
        categories.add("Cookies");//Breads, Bagels, Rolls, Crackers,
        categories.add("Cakes");//, Muffins, Donuts, Baking
        categories.add("Cheese");//, Cream, Ice Cream & Yogurts
       // categories.add("Desserts, Pancakes, Pastries, Pies");
        //categories.add("Eggs, Meats,Seafoods");
        //categories.add("Grains & Flour, Rice & Pasta");
        //categories.add("Snacks: Chips, Popcorn, Pretzels");
        //categories.add("Fruits,Beans, Salads");
        //categories.add("Vegetables");
        //categories.add("FastFood-items");


        //Style and populate the spinner
        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,categories);
        // Drop-down layout Style
        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        //attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("choose category")){
                    //do nothing
                }
                else
                {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"selected: "+ item, Toast.LENGTH_SHORT).show();
                    if (parent.getItemAtPosition(position).equals("Cheese")){
                        Intent intent = new Intent(Caloriemeter.this,NutrientSuggester.class);
                        startActivity(intent);
                    }

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button getText = findViewById(R.id.gettext);
        getText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String breakfast = spinner.getSelectedItem().toString();

                Toast.makeText(getApplicationContext(),breakfast,Toast.LENGTH_SHORT).show();

            }
        });
    }
}