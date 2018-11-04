package multiplexer.lab.budget.catcher;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.dell.designapp.R;

public class RecyclerViewAdapterTwo extends RecyclerView.Adapter<RecyclerViewAdapterTwo.ViewHolder>{

    String[] valuess;
    Context contextt;

    public RecyclerViewAdapterTwo(Context context2,String[] values2){

        valuess = values2;

        contextt = context2;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textVieww;

        public Button scan;

        public ViewHolder(View v){

            super(v);

            textVieww = (TextView) v.findViewById(R.id.textvieww);

            scan = (Button) v.findViewById(R.id.buttoi);

            scan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View v) {
                    Context context = v.getContext();
                    Intent intent=null;
                    {
                        intent = new Intent(context, Recycler.class);
                        context.startActivity(intent);
                    }
                }});
        }
    }

    @Override
    public RecyclerViewAdapterTwo.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View view1 = LayoutInflater.from(contextt).inflate(R.layout.activity_recycler_view_adapter_two,parent,false);

        ViewHolder viewHolder1 = new ViewHolder(view1);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(ViewHolder Vholder, int position){

        Vholder.textVieww.setText(valuess[position]);
    }

    @Override
    public int getItemCount(){

        return valuess.length;
    }
}
