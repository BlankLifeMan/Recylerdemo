package com.example.a846252219.recylerdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 846252219 on 2018-09-20.
 */

class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewldHoer>{

    private Context context;
    private List<String> mList;

    public HomeAdapter(Context context, List<String> mList){
        this.context=context;
        this.mList=mList;
    }

    public void removeData(int position){
        mList.remove(position);
        notifyItemRemoved(position);
    }
    @Override
    public MyViewldHoer onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewldHoer holder = new MyViewldHoer(LayoutInflater.from(
                context).inflate(R.layout.item_recycler, parent,
                false));
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewldHoer holder,final int position) {
        holder.tv.setText(mList.get(position));
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

     class MyViewldHoer extends RecyclerView.ViewHolder {
        TextView tv;
       public MyViewldHoer(View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.tv_item);
        }
    }
}
