package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class Yoga3timer extends AppCompatActivity {
    SeekBar seekBar;
    TextView timer_tv;
    Button start_btn,b1,info;
    CountDownTimer countDownTimer;
    Boolean counterIsAactive = false;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga3timer);
        getSupportActionBar().hide();
        SliderView sliderView = findViewById(R.id.imageslider);
        List<Integer> images = new ArrayList<>();
        images.add(R.drawable.corpse1);
        MyAdapter myAdapter = new MyAdapter(images);
        sliderView.setSliderAdapter(myAdapter);
        sliderView.setAutoCycle(true);
        sliderView.setSliderTransformAnimation(SliderAnimations.ZOOMOUTTRANSFORMATION);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        seekBar = findViewById(R.id.timer_sb);
        info = findViewById(R.id.info_btn);
        timer_tv = findViewById(R.id.timer_tv);
        start_btn = findViewById(R.id.start_btn);
        b1 = findViewById(R.id.next_btn);
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.alarm);
        seekBar.setMax(3000);
        seekBar.setProgress(300);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                update(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CorpsePose.class));
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

    }

    private void update(int progress) {
        int minute = progress / 60;
        int second = progress % 60;
        String secondFinal = "";
        if (second <= 9) {
            secondFinal = "0" + second;
        } else {
            secondFinal = "" + second;
        }
        seekBar.setProgress(progress);
        timer_tv.setText("" + minute + ":" + secondFinal);
    }

    public void start_timer(View view) {
        if (counterIsAactive == false) {
            counterIsAactive = true;
            seekBar.setEnabled(false);
            start_btn.setText("STOP");
            countDownTimer = new CountDownTimer(seekBar.getProgress() * 1000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    update((int) millisUntilFinished / 1000);

                }

                @Override
                public void onFinish() {
                    reset();
                    if (mediaPlayer != null)
                        mediaPlayer.start();

                }
            }.start();
        } else {
            reset();
        }
    }

    private void reset() {
        timer_tv.setText("5:00");
        seekBar.setProgress(300);
        countDownTimer.cancel();
        start_btn.setText("START");
        seekBar.setEnabled(true);
        counterIsAactive = false;
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (counterIsAactive) {
            countDownTimer.cancel();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (counterIsAactive) {
            countDownTimer.cancel();
        }
    }
    public void openDialog(){
        Balasanainfo infoDialog = new Balasanainfo();
        infoDialog.show(getSupportFragmentManager(),"Rating-Info");

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), Yoga_1.class)); // when user is on main screen and press to back button then shutdown the app
    }

}