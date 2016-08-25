package example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FiveActivity extends AppCompatActivity {

    String mAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        Button btnNext = (Button)findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etAnswer = (EditText)findViewById(R.id.editText);
                mAnswer = etAnswer.getText().toString();
                if(mAnswer.equals("y")) {
                    MainActivity.mSuccessNum = MainActivity.mSuccessNum + 1;
                }
                Intent intent = new Intent(FiveActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });

    }
}
