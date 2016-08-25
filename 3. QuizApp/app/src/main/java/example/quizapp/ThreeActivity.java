package example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ThreeActivity extends AppCompatActivity {

    RadioGroup rgOpinion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        rgOpinion = (RadioGroup) findViewById(R.id.radio_group);

        rgOpinion.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton1:
                        MainActivity.mSuccessNum = MainActivity.mSuccessNum + 1;
                        Toast.makeText(ThreeActivity.this, "Android", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radioButton2:
                        Toast.makeText(ThreeActivity.this, "Windows", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });


        Button btnNext = (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThreeActivity.this, FourActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
