package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class ImageSlider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider);
        SliderView sliderView = findViewById(R.id.imageslider);
        List<Integer> images = new ArrayList<>();
        images.add(R.drawable.exercise);
        images.add(R.drawable.nature);
        images.add(R.drawable.brain_games);
        images.add(R.drawable.food);
        images.add(R.drawable.exercise);
        images.add(R.drawable.ic_meditation);
        MyAdapter myAdapter = new MyAdapter(images);
        sliderView.setSliderAdapter(myAdapter);
        sliderView.setAutoCycle(true);
        sliderView.setSliderTransformAnimation(SliderAnimations.ZOOMOUTTRANSFORMATION);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
    }
}