package example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    CheckBox cbKeyboard, cbMouse, cbWatch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        cbKeyboard = (CheckBox)findViewById(R.id.checkBox1);
        cbMouse = (CheckBox)findViewById(R.id.checkBox2);
        cbWatch = (CheckBox)findViewById(R.id.checkBox3);

        Button btnNext = (Button)findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!cbWatch.isChecked() && cbMouse.isChecked() && cbKeyboard.isChecked()) {
                    MainActivity.mSuccessNum = MainActivity.mSuccessNum + 1;
                    Intent intent = new Intent(SecondActivity.this, ThreeActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(SecondActivity.this, "Incorrect Answer!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
