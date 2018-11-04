package multiplexer.lab.budget.catcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dell.designapp.R;

public class AutoSave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_save);
    }

    public void onceaweek(View view) {
       // Intent intent = new Intent(AutoSave.this, Analysis.class);
      //  startActivity(intent);
    }
}
