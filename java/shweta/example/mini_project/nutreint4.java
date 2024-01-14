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

public class nutreint4 extends AppCompatActivity {
    private PieChart pieChart;
    ListView listView;
    String mTitle[] = {"Almonds","Walnuts","Cashew","Pistachios","Brazil Nuts","Peanuts"};
    String mDescription[] = {"click image to know more","click image to know more","click image to know more","click image to know more","click image to know more"};
    int images[] = {R.drawable.almonds,R.drawable.cashew,R.drawable.pistachios,R.drawable.brazilnuts,R.drawable.nutsseeds};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutreint4);
        pieChart = findViewById(R.id.activity_main_piechart);
        setupPieChart();
        loadPieChartData();
        listView = findViewById(R.id.listview21);
        nutreint4.MyAdapter adapter = new nutreint4.MyAdapter(this,mTitle,mDescription,images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trulygoodfoods.com/blog/mood-boost-snacks/#:~:text=Walnuts,well%20as%20improve%20your%20mood."));
                    startActivity(browserIntent);
                }
                if (position==1) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trulygoodfoods.com/blog/mood-boost-snacks/#:~:text=Walnuts,well%20as%20improve%20your%20mood."));
                    startActivity(browserIntent);
                }
                if (position==2) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trulygoodfoods.com/blog/mood-boost-snacks/#:~:text=Walnuts,well%20as%20improve%20your%20mood."));
                    startActivity(browserIntent);

                }
                if (position==3) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trulygoodfoods.com/blog/mood-boost-snacks/#:~:text=Walnuts,well%20as%20improve%20your%20mood."));
                    startActivity(browserIntent);

                }
                if (position==4) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.trulygoodfoods.com/blog/mood-boost-snacks/#:~:text=Walnuts,well%20as%20improve%20your%20mood."));
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
        pieChart.setCenterText("Nuts and seeds calories");
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
        entries.add(new PieEntry(5.53f, "Cashew"));
        entries.add(new PieEntry(6.54f, "Walnuts"));
        entries.add(new PieEntry(6.73f, "Brazil Nuts"));
        entries.add(new PieEntry(5.62f, "Pistachios"));
        entries.add(new PieEntry(5.67f, "Peanuts"));
        entries.add(new PieEntry(5.79f, "Almonds"));

        ArrayList<Integer> colors = new ArrayList<>();
        for (int color: ColorTemplate.MATERIAL_COLORS) {
            colors.add(color);
        }

        for (int color: ColorTemplate.VORDIPLOM_COLORS) {
            colors.add(color);
        }

        PieDataSet dataSet = new PieDataSet(entries, "Nuts and seeds");
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