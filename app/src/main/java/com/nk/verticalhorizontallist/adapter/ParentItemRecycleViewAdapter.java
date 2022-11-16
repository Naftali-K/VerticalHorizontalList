package com.nk.verticalhorizontallist.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nk.verticalhorizontallist.R;
import com.nk.verticalhorizontallist.model.ParentItem;

import java.util.List;

public class ParentItemRecycleViewAdapter extends RecyclerView.Adapter<ParentItemRecycleViewAdapter.ParentItemRecycleViewHolder> {

    private static final String TAG = "Test_Code";

    private RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
    private List<ParentItem> parentItemList;

    public ParentItemRecycleViewAdapter(List<ParentItem> parentItemList) {
        this.parentItemList = parentItemList;
    }

    @NonNull
    @Override
    public ParentItemRecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_parent_item, parent, false);

        return new ParentItemRecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParentItemRecycleViewHolder holder, int position) {

        holder.bind(parentItemList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return parentItemList.size();
    }





    class ParentItemRecycleViewHolder extends RecyclerView.ViewHolder {

        private TextView parentItemTitleTextView;
        private RecyclerView childRecycleView;

        public ParentItemRecycleViewHolder(@NonNull View itemView) {
            super(itemView);

            parentItemTitleTextView = itemView.findViewById(R.id.parent_item_title_text_view);
            childRecycleView = itemView.findViewById(R.id.child_recycle_view);
        }

        void bind(ParentItem parentItem, int position) {

            Log.d(TAG, "bind: Parent row: " + position);

            parentItemTitleTextView.setText(parentItem.getParentTitle());

            ChildItemRecycleViewAdapter adapter = new ChildItemRecycleViewAdapter(parentItem.getChildItemList());
            childRecycleView.setAdapter(adapter);
            childRecycleView.setRecycledViewPool(viewPool);
        }
    }
}
