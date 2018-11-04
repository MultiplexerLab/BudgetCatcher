package multiplexer.lab.budget.catcher.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import multiplexer.lab.budget.catcher.AddNewIncidental;

import com.example.dell.designapp.R;


public class ExpensesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {

        View v = inflater.inflate(R.layout.activity_expenses_fragment, null);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = null;
                boolean error = false;

                Intent i = new Intent(getActivity(), AddNewIncidental.class);
                startActivity(i);
                }
            };

        Button btn = (Button) v.findViewById(R.id.incidentals);
        btn.setOnClickListener(listener);

        return v;
    }
}

