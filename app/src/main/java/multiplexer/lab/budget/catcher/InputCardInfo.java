package multiplexer.lab.budget.catcher;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.dell.designapp.R;

public class InputCardInfo extends AppCompatActivity {

    RecyclerView recyclerVieww;

    Context contextt;

    RecyclerView.Adapter recyclerView_Adapterr;

    RecyclerView.LayoutManager recyclerViewLayoutManagerr;

    String[] numberss = {
            "or"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_input_card_info);

        contextt = getApplicationContext();

        recyclerVieww = (RecyclerView) findViewById(R.id.recycler_view2);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManagerr = new GridLayoutManager(contextt, 1);

        recyclerVieww.setLayoutManager(recyclerViewLayoutManagerr);

        recyclerView_Adapterr = new RecyclerViewAdapterTwo(contextt,numberss);

        recyclerVieww.setAdapter(recyclerView_Adapterr);

    }

    public void scancard(View view) {
       // Intent intent = new Intent(getBaseContext(), Manage.class);
      //  startActivity(intent);
    }
}