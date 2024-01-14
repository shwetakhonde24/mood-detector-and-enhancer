package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.TintTypedArray;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.protobuf.ByteString;

import org.tensorflow.lite.DataType;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

import soup.neumorphism.NeumorphCardView;

public class Questions extends AppCompatActivity {
    RadioGroup radioGroup,r1,r2,r3,r4,r5,r6,r7;
    ImageView I1;
    RadioButton radioButton;
    CardView c21;
    TextView T1,T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12;;
    Button btn;
    TextView tv;
    NeumorphCardView c1,c2,c3,c4,c5,c6,c7,c8,c9;
    //Interpreter tflite;
    //int v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        getSupportActionBar().hide();
        I1 = findViewById(R.id.test);
        c21 = findViewById(R.id.type_12);
        c1 = findViewById(R.id.heading);
        c2 = findViewById(R.id.question_2);
        c3 = findViewById(R.id.question_3);
        c4 = findViewById(R.id.question_4);
        c5 = findViewById(R.id.question_5);
        c6 = findViewById(R.id.question_6);
        c7 = findViewById(R.id.question_7);
        c8 = findViewById(R.id.question_8);
        radioGroup = findViewById(R.id.basicQues);
        r1 = findViewById(R.id.basicQues1);
        r2 = findViewById(R.id.basicQues2);
        r3 = findViewById(R.id.basicQues3);
        r4 = findViewById(R.id.basicQues4);
        r5 = findViewById(R.id.basicQues5);
        r6 = findViewById(R.id.basicQues6);
        r7 = findViewById(R.id.basicQues7);
        T1 = findViewById(R.id.editTextNumber); //do you have any task pending
        T1.setFilters(new InputFilter[]{new MinMaxFilter("1", "5")});
        T2 = findViewById(R.id.editTextNumber2); //are you feeling blue or low
        T2.setFilters(new InputFilter[]{new MinMaxFilter("1", "5")});
        T3 = findViewById(R.id.editTextNumber3); // I am full of energy. I am literally bouncing off the walls.
        T3.setFilters(new InputFilter[]{new MinMaxFilter("1", "5")});
        //Over the last two weeks have you been feeling down, depressed, irritable, or hopeless?
        T4 = findViewById(R.id.editTextNumber4);
        //Over the last two weeks have you had little interest or pleasure in doing things?
        T4.setFilters(new InputFilter[]{new MinMaxFilter("1", "5")});
        T5 = findViewById(R.id.editTextNumber5);
        //Over the last two weeks have you had trouble falling asleep, staying asleep, or have you been sleeping too much?
        T5.setFilters(new InputFilter[]{new MinMaxFilter("1", "5")});
        T6 = findViewById(R.id.editTextNumber6);
        //Over the last two weeks have you been feeling tired, or have you had little energy?
        T6.setFilters(new InputFilter[]{new MinMaxFilter("1", "5")});
        //feeling that you are a failure, or that you have let yourself or your family down?
        T7 = findViewById(R.id.editTextNumber7);
        //ver the last two weeks have you had trouble concentrating on things like schoolwork, reading, or watching TV?
        T7.setFilters(new InputFilter[]{new MinMaxFilter("1", "5")});
        //Over the last two weeks have you had thoughts that you would be better off dead, or of hurting yourself in some way?
        T8 = findViewById(R.id.editTextNumber8);
        T8.setFilters(new InputFilter[]{new MinMaxFilter("1", "5")});
        btn = findViewById(R.id.next_btn);
        //btn2 = findViewById(R.id.NextBtns);
       // tv = findViewById(R.id.textView6);
        c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer i1 = Integer.parseInt(T1.getText().toString());
                Integer i2 = Integer.parseInt(T2.getText().toString());
                Integer i3 = Integer.parseInt(T3.getText().toString());
                Integer i4 = Integer.parseInt(T4.getText().toString());
                Integer i5 = Integer.parseInt(T5.getText().toString());
                Integer i6 = Integer.parseInt(T6.getText().toString());
                Integer i7 = Integer.parseInt(T7.getText().toString());
                Integer i8 = Integer.parseInt(T8.getText().toString());
               // Integer i9 = Integer.parseInt(T9.getText().toString());

                float num1 = ((i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8)/8);
                int num = (int) num1;
                if (num < 3){
                    startActivity(new Intent(getApplicationContext(),GoodMood.class));
                }
                else if (num == 3){
                    startActivity(new Intent(getApplicationContext(),NeutralMood.class));
                }
                else if(num > 3 ) {
                    startActivity(new Intent(getApplicationContext(),BadMood.class));
                }else {
                    tv.setText("Bad");
                }


            }
        });
      //  btn2.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View v) {
              //  startActivity(new Intent(getApplicationContext(),EnhancingScreen.class));
           // }
        //});

    }

    public void checkButton(View view) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        T1.setText(radioButton.getText());
        int radioId1 = r1.getCheckedRadioButtonId();
        radioButton = findViewById(radioId1);
        T2.setText(radioButton.getText());
        int radioId2 = r2.getCheckedRadioButtonId();
        radioButton = findViewById(radioId2);
        T3.setText(radioButton.getText());
        int radioId3 = r3.getCheckedRadioButtonId();
        radioButton = findViewById(radioId3);
        T4.setText(radioButton.getText());
        int radioId5 = r4.getCheckedRadioButtonId();
        radioButton = findViewById(radioId5);
        T5.setText(radioButton.getText());
        int radioId6 = r5.getCheckedRadioButtonId();
        radioButton = findViewById(radioId6);
        T6.setText(radioButton.getText());
        int radioId7 = r6.getCheckedRadioButtonId();
        radioButton = findViewById(radioId7);
        T7.setText(radioButton.getText());
        int radioId8 = r7.getCheckedRadioButtonId();
        radioButton = findViewById(radioId8);
        T8.setText(radioButton.getText());
    }
    public void openDialog(){
        InfoDialog infoDialog = new InfoDialog();
        infoDialog.show(getSupportFragmentManager(),"Rating-Info");

    }
}
