package multiplexer.lab.budget.catcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dell.designapp.R;

public class ConnectFinances extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_finances);
    }

    public void okletsdoit(View view) {
        Intent intent = new Intent(ConnectFinances.this, AddPaymentMethod.class);
        startActivity(intent);
    }
}
