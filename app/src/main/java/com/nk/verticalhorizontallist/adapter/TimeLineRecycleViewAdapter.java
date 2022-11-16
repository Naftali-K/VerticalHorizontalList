package com.nk.verticalhorizontallist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.nk.verticalhorizontallist.R;
import com.nk.verticalhorizontallist.model.TimeLineItem;

import java.util.List;

public class TimeLineRecycleViewAdapter extends RecyclerView.Adapter<TimeLineRecycleViewAdapter.TimeLineRecycleViewViewHolder> {

    private static final String TAG = "Test_Code";

    private List<TimeLineItem> items;
    private Context context;

    public TimeLineRecycleViewAdapter(Context context, List<TimeLineItem> items) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public TimeLineRecycleViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_time_line_item, parent, false);

        return new TimeLineRecycleViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TimeLineRecycleViewViewHolder holder, int position) {
        holder.bind(position, items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    class TimeLineRecycleViewViewHolder extends RecyclerView.ViewHolder {

        private ViewPager itemsViewPager;
        private TextView itemTitleTextView;
        private ViewPagerItemsAdapter viewPagerItemsAdapter;

        public TimeLineRecycleViewViewHolder(@NonNull View itemView) {
            super(itemView);

            itemsViewPager = itemView.findViewById(R.id.items_view_pager);
            itemTitleTextView = itemView.findViewById(R.id.item_title_text_view);
        }

        private void bind(int position, TimeLineItem timeLineItem){
            itemTitleTextView.setText(timeLineItem.getShopName());

            viewPagerItemsAdapter = new ViewPagerItemsAdapter(context, timeLineItem);
            itemsViewPager.setAdapter(viewPagerItemsAdapter);
        }
    }
}
