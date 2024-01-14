package shreya.example.mini_project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class nutreint7 extends AppCompatActivity {
    private PieChart pieChart;
    ListView listView;
    String mTitle[] = {"Warm water with lemon","Coffee","Green tea","Chai tea","Chamomile tea latte"};
    String mDescription[] = {"For when you're distracted-click image to know more","Mood Regulation- click image to know more","when you're stressed","For when you're frustrated","For when you're exhausted"};
    int images[] = {R.drawable.waterwithlemon,R.drawable.coffee,R.drawable.greentea,R.drawable.tea,R.drawable.chaemeleonteaa};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutreint7);
        pieChart = findViewById(R.id.activity_main_piechart);
        setupPieChart();
        loadPieChartData();
        listView = findViewById(R.id.listview21);
        nutreint7.MyAdapter adapter = new nutreint7.MyAdapter(this,mTitle,mDescription,images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.prevention.com/food-nutrition/g20490663/healthy-drinks-that-improve-mood/"));
                    startActivity(browserIntent);
                }
                if (position==1) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coffeeandhealth.org/2017/04/might-coffee-caffeine-affect-mood-emotions/"));
                    startActivity(browserIntent);
                }
                if (position==2) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.prevention.com/food-nutrition/g20490663/healthy-drinks-that-improve-mood/"));
                    startActivity(browserIntent);

                }
                if (position==3) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.prevention.com/food-nutrition/g20490663/healthy-drinks-that-improve-mood/"));
                    startActivity(browserIntent);

                }
                if (position==4) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.prevention.com/food-nutrition/g20490663/healthy-drinks-that-improve-mood/"));
                    startActivity(browserIntent);

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
    private void setupPieChart() {
        pieChart.setDrawHoleEnabled(true);
        pieChart.setUsePercentValues(true);
        pieChart.setEntryLabelTextSize(12);
        pieChart.setEntryLabelColor(Color.BLACK);
        pieChart.setCenterText("Drinks calories(100g)");
        pieChart.setCenterTextSize(24);
        pieChart.getDescription().setEnabled(false);

        Legend l = pieChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(false);
        l.setEnabled(true);
    }
    private void loadPieChartData() {
        ArrayList<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(0.89f, "Banana"));
        entries.add(new PieEntry(0.57f, "Berries"));
        entries.add(new PieEntry(0.52f, "Apple"));
        entries.add(new PieEntry(0.15f, " Lettuce"));
        entries.add(new PieEntry(0.87f, "Grape"));
        entries.add(new PieEntry(0.61f, "Kiwi"));

        ArrayList<Integer> colors = new ArrayList<>();
        for (int color: ColorTemplate.MATERIAL_COLORS) {
            colors.add(color);
        }

        for (int color: ColorTemplate.VORDIPLOM_COLORS) {
            colors.add(color);
        }

        PieDataSet dataSet = new PieDataSet(entries, "Drinks Category");
        dataSet.setColors(colors);

        PieData data = new PieData(dataSet);
        data.setDrawValues(true);
        data.setValueFormatter(new PercentFormatter(pieChart));
        data.setValueTextSize(12f);
        data.setValueTextColor(Color.BLACK);

        pieChart.setData(data);
        pieChart.invalidate();

        pieChart.animateY(1400, Easing.EaseInOutQuad);
    }

}