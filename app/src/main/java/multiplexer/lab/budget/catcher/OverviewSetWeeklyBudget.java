package multiplexer.lab.budget.catcher;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dell.designapp.R;

public class OverviewSetWeeklyBudget extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_set_weekly_budget);
    }

    public void one(View v)
    {
        TextView tv = (TextView)findViewById(R.id.budget);
        tv.setText("1");
    }

    public void two(View v)
    {
        TextView tv = (TextView)findViewById(R.id.budget);
        tv.setText("2");
    }

    public void three(View v)
    {
        TextView tv = (TextView)findViewById(R.id.budget);
        tv.setText("3");
    }

    public void four(View v)
    {
        TextView tv = (TextView)findViewById(R.id.budget);
        tv.setText("4");
    }

    public void five(View v)
    {
        TextView tv = (TextView)findViewById(R.id.budget);
        tv.setText("5");
    }

    public void six(View v)
    {
        TextView tv = (TextView)findViewById(R.id.budget);
        tv.setText("6");
    }

    public void seven(View v)
    {
        TextView tv = (TextView)findViewById(R.id.budget);
        tv.setText("7");
    }

    public void eight(View v)
    {
        TextView tv = (TextView)findViewById(R.id.budget);
        tv.setText("8");
    }

    public void nine(View v)
    {
        TextView tv = (TextView)findViewById(R.id.budget);
        tv.setText("9");
    }

    public void zero(View v)
    {
        TextView tv = (TextView)findViewById(R.id.budget);
        tv.setText("0");
    }

    public void none(View v)
    {
        TextView tv = (TextView)findViewById(R.id.budget);
        tv.setText("null");
    }

    public void done(View v)
    {
        Intent intent = new Intent(OverviewSetWeeklyBudget.this, Overview.class);
        startActivity(intent);
    }

  //  public void cross(View v)
  //  {
     //   Intent intent = new Intent(OverviewSetWeeklyBudget.this, Overview.class);
     //   startActivity(intent);
   // }
}
