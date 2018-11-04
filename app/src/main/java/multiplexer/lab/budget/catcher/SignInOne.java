package multiplexer.lab.budget.catcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dell.designapp.R;

public class SignInOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_one);

    }
    public void continuee(View view) {
        Intent intent = new Intent(SignInOne.this, SignInTwo.class);
        startActivity(intent);
    }
}
