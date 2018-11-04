package multiplexer.lab.budget.catcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dell.designapp.R;

public class NewBillSelectRecurringTransaction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_bill_select_recurring_transaction);
    }

    public void selecttransaction(View view) {
        Intent intent = new Intent(NewBillSelectRecurringTransaction.this, CategoryTransactions.class);
        startActivity(intent);
    }
}
