package multiplexer.lab.budget.catcher;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dell.designapp.R;

public class InputAccountInfo extends AppCompatActivity {

    RecyclerView recyclerViewww;

    Context contexttt;

    RecyclerView.Adapter recyclerView_Adapterrr;

    RecyclerView.LayoutManager recyclerViewLayoutManagerrr;

    String[] numbersss = {
            "or"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_input_account_info);

        contexttt = getApplicationContext();

        recyclerViewww = (RecyclerView) findViewById(R.id.recycler_view3);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManagerrr = new GridLayoutManager(contexttt, 1);

        recyclerViewww.setLayoutManager(recyclerViewLayoutManagerrr);

        recyclerView_Adapterrr = new RecyclerViewAdapterThree(contexttt,numbersss);

        recyclerViewww.setAdapter(recyclerView_Adapterrr);

    }
}