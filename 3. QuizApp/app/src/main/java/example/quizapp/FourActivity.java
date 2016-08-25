package example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FourActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

    }

    public void OnClick(View v) {
        switch (v.getId()) {
            case R.id.btn_yes:
                break;
            case R.id.btn_no:
                MainActivity.mSuccessNum = MainActivity.mSuccessNum + 1;
                break;
        }
        Intent intent = new Intent(FourActivity.this, FiveActivity.class);
        startActivity(intent);
    }
}
