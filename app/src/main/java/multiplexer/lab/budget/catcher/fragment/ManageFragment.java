package multiplexer.lab.budget.catcher.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import multiplexer.lab.budget.catcher.ABetterCard;
import multiplexer.lab.budget.catcher.AutoSave;
import multiplexer.lab.budget.catcher.Expenses;
import com.example.dell.designapp.R;

public class ManageFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {

        View v = inflater.inflate(R.layout.activity_manage_fragment, null);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = null;
                boolean error = false;

                Intent i = new Intent(getActivity(), AutoSave.class);
                startActivity(i);
            }
        };

        Button bt = (Button) v.findViewById(R.id.skyblue);
        bt.setOnClickListener(listener);

        View.OnClickListener list = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = null;
                boolean error = false;

                Intent i = new Intent(getActivity(), ABetterCard.class);
                startActivity(i);
            }
        };

        Button btn = (Button) v.findViewById(R.id.blue);
        btn.setOnClickListener(list);

        View.OnClickListener liss = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = null;
                boolean error = false;

                Intent i = new Intent(getActivity(), Expenses.class);
                startActivity(i);
            }
        };

        Button btnn = (Button) v.findViewById(R.id.lightpink);
        btnn.setOnClickListener(liss);
        return v;
    }
}
