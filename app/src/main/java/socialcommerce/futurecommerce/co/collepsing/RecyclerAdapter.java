package socialcommerce.futurecommerce.co.collepsing;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by sunarcneel on 31/3/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
   // private List<RecyclerModelClass> list;

    private Context ctx;
    private String tag;
    public RecyclerAdapter(Context ctx ){
        this.ctx = ctx;
    }

/*
    public RecyclerAdapter(  List<RecyclerModelClass> list, Activity activity, String tag) {
       // this.list = list;
        this.ctx = activity;
        this.tag = tag;
    }*/


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d("tag", String.valueOf(ctx));
       /* holder.tvText1.setText(list.get(position).getTvText1());
        holder.tvText2.setText(list.get(position).getTvText2());
        holder.tvText3.setText(list.get(position).getTvText3());

        holder.tvText4.setText(list.get(position).getTvText4());
        holder.tvText5.setText(list.get(position).getTvText5());
        holder.tvText6.setText(list.get(position).getTvText6());*/

        /*if (tag.equals("myblock")) {
            holder.cellLinearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    NoticeTitle noticeTitle = new NoticeTitle();

                    FragmentManager fragmentManager = ctx.getFragmentManager();

                    fragmentManager.beginTransaction().replace(R.id.frameLayout, noticeTitle).commit();

                }
            });
        }*/
    }


    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvText1, tvText2, tvText3, tvText4, tvText5, tvText6;
        public LinearLayout cellLinearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
           /* tvText1 = (TextView) itemView.findViewById(R.id.tvText1);
            tvText2 = (TextView) itemView.findViewById(R.id.tvText2);
            tvText3 = (TextView) itemView.findViewById(R.id.tvText3);
            tvText4 = (TextView) itemView.findViewById(R.id.tvText4);
            tvText5 = (TextView) itemView.findViewById(R.id.tvText5);
            tvText6 = (TextView) itemView.findViewById(R.id.tvText6);
            cellLinearLayout = (LinearLayout) itemView.findViewById(R.id.cellLinearLayout);*/
        }
    }
}
