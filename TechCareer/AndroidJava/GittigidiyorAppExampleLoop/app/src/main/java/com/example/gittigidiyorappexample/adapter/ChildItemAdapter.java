package com.example.gittigidiyorappexample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gittigidiyorappexample.R;
import com.example.gittigidiyorappexample.entity.ChildItem;

import java.util.List;

public class ChildItemAdapter extends RecyclerView.Adapter<ChildItemAdapter.ChildViewHolder> {

    private List<ChildItem> ChildItemList;

    ChildItemAdapter(List<ChildItem> childItemList){
        this.ChildItemList = childItemList;
    }

    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.child_item, viewGroup, false);
        return new ChildViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder childViewHolder, int position){
        ChildItem childItem = ChildItemList.get(position);
        childViewHolder.ChildItemTitle.setText(childItem.getChildItemTitle());
    }

    @Override
    public int getItemCount(){
        return ChildItemList.size();
    }

    class ChildViewHolder extends RecyclerView.ViewHolder {
        TextView ChildItemTitle;
        ChildViewHolder(View itemView) {
            super(itemView);
            ChildItemTitle = itemView.findViewById(R.id.child_item_title);
        }
    }
}
