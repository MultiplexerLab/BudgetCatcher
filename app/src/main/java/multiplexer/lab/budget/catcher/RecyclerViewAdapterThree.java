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

public class RecyclerViewAdapterThree extends RecyclerView.Adapter<RecyclerViewAdapterThree.ViewHolder>{

    String[] valuesss;
    Context contexttt;

    public RecyclerViewAdapterThree(Context context2,String[] values2){

        valuesss = values2;

        contexttt = context2;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewww;

        public Button openapp;

        public ViewHolder(View v){

            super(v);

            textViewww = (TextView) v.findViewById(R.id.textviewww);

            openapp = (Button) v.findViewById(R.id.bu);

            openapp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View v) {
                    Context context = v.getContext();
                    Intent intent=null;
                    {
                        intent = new Intent(context, AccountCreated.class);
                        context.startActivity(intent);
                    }
                }});
        }
    }

    @Override
    public RecyclerViewAdapterThree.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View view1 = LayoutInflater.from(contexttt).inflate(R.layout.activity_recycler_view_adapter_three,parent,false);

        ViewHolder viewHolder1 = new ViewHolder(view1);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(ViewHolder Vholder, int position){

        Vholder.textViewww.setText(valuesss[position]);
    }

    @Override
    public int getItemCount(){

        return valuesss.length;
    }
}
