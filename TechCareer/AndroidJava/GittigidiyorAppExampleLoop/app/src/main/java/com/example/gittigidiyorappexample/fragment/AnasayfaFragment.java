package com.example.gittigidiyorappexample.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gittigidiyorappexample.MainActivity;
import com.example.gittigidiyorappexample.R;
import com.example.gittigidiyorappexample.adapter.ParentItemAdapter;
import com.example.gittigidiyorappexample.entity.ChildItem;
import com.example.gittigidiyorappexample.entity.ParentItem;

import java.util.ArrayList;
import java.util.List;

public class AnasayfaFragment extends Fragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView ParentRecyclerViewItem = (RecyclerView) getView().findViewById(R.id.parent_recyclerview);


        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext());

        ParentItemAdapter parentItemAdapter = new ParentItemAdapter(ParentItemList());
        ParentRecyclerViewItem.setAdapter(parentItemAdapter);
        ParentRecyclerViewItem.setLayoutManager(layoutManager);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_anasayfa, container, false);
    }

    private List<ParentItem> ParentItemList()
    {
        List<ParentItem> itemList = new ArrayList<>();
        ParentItem item1 = new ParentItem("Title 1", ChildItemList());
        itemList.add(item1);
        ParentItem item2 = new ParentItem("Title 2", ChildItemList());
        itemList.add(item2);
        ParentItem item3 = new ParentItem("Title 3", ChildItemList());
        itemList.add(item3);
        ParentItem item4 = new ParentItem("Title 4", ChildItemList());
        itemList.add(item4);

        return itemList;
    }

    private List<ChildItem> ChildItemList() {
        List<ChildItem> ChildItemList = new ArrayList<>();

        ChildItemList.add(new ChildItem("Card 1"));
        ChildItemList.add(new ChildItem("Card 2"));
        ChildItemList.add(new ChildItem("Card 3"));
        ChildItemList.add(new ChildItem("Card 4"));
        ChildItemList.add(new ChildItem("Card 5"));

        return ChildItemList;
    }
}