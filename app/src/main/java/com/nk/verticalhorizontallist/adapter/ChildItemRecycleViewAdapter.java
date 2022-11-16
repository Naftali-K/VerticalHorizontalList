package com.nk.verticalhorizontallist.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nk.verticalhorizontallist.R;
import com.nk.verticalhorizontallist.model.ChildItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ChildItemRecycleViewAdapter extends RecyclerView.Adapter<ChildItemRecycleViewAdapter.ChildItemRecycleViewHolder> {

    private static final String TAG = "Test_Code";

    private List<ChildItem> childItemList;

    public ChildItemRecycleViewAdapter(List<ChildItem> childItemList) {
        this.childItemList = childItemList;
    }

    @NonNull
    @Override
    public ChildItemRecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_child_item, parent, false);

        return new ChildItemRecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildItemRecycleViewHolder holder, int position) {
        holder.bind(childItemList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return childItemList.size();
    }




    class ChildItemRecycleViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgChildItemImageView;
        private TextView childItemTitleTextView;

        public ChildItemRecycleViewHolder(@NonNull View itemView) {
            super(itemView);

            imgChildItemImageView = itemView.findViewById(R.id.img_child_item_image_view);
            childItemTitleTextView = itemView.findViewById(R.id.child_item_title_text_view);
        }

        void bind(ChildItem childItem, int position){

            Log.d(TAG, "bind: Child: " + position);

            Picasso.get().load(childItem.getUrlImage()).into(imgChildItemImageView);
            childItemTitleTextView.setText(childItem.getChildItemTitle());
        }
    }
}
