package shreya.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class BasicDetails extends AppCompatActivity {
RadioGroup basicQues;
Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_details);
        getSupportActionBar().hide();
        basicQues = findViewById(R.id.basicQues);
        nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedId = basicQues.getCheckedRadioButtonId();
                if(checkedId== -1){
                    Toast.makeText(BasicDetails.this, "select any button", Toast.LENGTH_SHORT).show();
                } else{
                    findRadioButton(checkedId);
                    startActivity(new Intent(getApplicationContext(), Questions.class));
                   // openDialog();
                }
            }
        });
        //nextBtn.setOnClickListener(new View.OnClickListener() {
            //@Override
           // public void onClick(View v) {
               // basicQues.clearCheck();
          //  }
       // });

    }
    public void openDialog(){
        InfoDialog infoDialog = new InfoDialog();
        infoDialog.show(getSupportFragmentManager(),"Rating-Info");

    }

    private void findRadioButton(int checkedId) {
        switch (checkedId){
            case R.id.radioBtn2:
                Toast.makeText(this, "0-14", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioBtn3:
                Toast.makeText(this, "15-24", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioBtn4:
                Toast.makeText(this, "25-45", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioBtn5:
                Toast.makeText(this, "46-65", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioBtn6:
                Toast.makeText(this, "65+", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}