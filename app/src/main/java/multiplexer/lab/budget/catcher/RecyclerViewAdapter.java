package multiplexer.lab.budget.catcher;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dell.designapp.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    String[] values;
    Context context1;

    public RecyclerViewAdapter(Context context2,String[] values2){

        values = values2;

        context1 = context2;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;

        public ViewHolder(View v){

            super(v);

            textView = (TextView) v.findViewById(R.id.textview1);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View v) {
                    Context context = v.getContext();
                    Intent intent=null;
                    {
                      //  if (getAdapterPosition()==0) {
                         //   intent = new Intent(context, CseMarks.class);
                            //  break;
                      //  }
                         if (getAdapterPosition()==1) {
                            intent = new Intent(context, InputCardInfo.class);
                           //  break;
                        }
                        //else if (getAdapterPosition()==2) {
                         //   intent = new Intent(context, PhyMarks.class);
                            //  break;
                       // }

                      // else if (getAdapterPosition()==3) {
                         //   intent = new Intent(context, EngMarks.class);
                            //  break;
                      // }
                        context.startActivity(intent);
                    }
                }});
        }
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View view1 = LayoutInflater.from(context1).inflate(R.layout.activity_recycler_view_adapter,parent,false);

        ViewHolder viewHolder1 = new ViewHolder(view1);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(ViewHolder Vholder, int position){

        Vholder.textView.setText(values[position]);
    }

    @Override
    public int getItemCount(){

        return values.length;
    }
}
