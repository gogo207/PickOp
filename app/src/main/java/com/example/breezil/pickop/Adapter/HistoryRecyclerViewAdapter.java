package com.example.breezil.pickop.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.breezil.pickop.R;
import com.example.breezil.pickop.model.History;

import java.util.List;

public class HistoryRecyclerViewAdapter extends RecyclerView.Adapter<HistoryRecyclerViewAdapter.HistoryHolder> {

    Context mContext;
    List<History> mHistoryList;

    public HistoryRecyclerViewAdapter(Context mContext, List<History> mHistoryList) {
        this.mContext = mContext;
        this.mHistoryList = mHistoryList;
    }


    @NonNull
    @Override
    public HistoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_history,parent,false);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(layoutParams);

        HistoryHolder historyHolder = new HistoryHolder(view);

        return historyHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryHolder holder, int position) {
        holder.historyId.setText(mHistoryList.get(position).getHistoryId());
    }

    @Override
    public int getItemCount() {
        return mHistoryList.size();
    }

    public static class HistoryHolder  extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView historyId;
        public HistoryHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            historyId =itemView.findViewById(R.id.historyId);

        }

        @Override
        public void onClick(View v) {

        }
    }

}
