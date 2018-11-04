package multiplexer.lab.budget.catcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dell.designapp.R;

public class SignInTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_two);
    }

    public void signin(View view) {
        Intent intent = new Intent(SignInTwo.this, SignUp.class);
        startActivity(intent);
    }
}
