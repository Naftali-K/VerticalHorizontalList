package com.nk.verticalhorizontallist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.nk.verticalhorizontallist.R;
import com.nk.verticalhorizontallist.frame.ItemRowViewPagerFragment;
import com.nk.verticalhorizontallist.model.TimeLineItem;

import java.util.List;

public class TimeLineFrameRecycleViewAdapter extends RecyclerView.Adapter<TimeLineFrameRecycleViewAdapter.TimeLineRecycleViewViewHolder> {

    private static final String TAG = "Test_Code";

    private List<TimeLineItem> items;
    private Context context;
    private FragmentManager fragmentManager;

    private RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();

    public TimeLineFrameRecycleViewAdapter(Context context, FragmentManager fragmentManager, List<TimeLineItem> items) {
        this.items = items;
        this.context = context;
        this.fragmentManager = fragmentManager;
    }

    @NonNull
    @Override
    public TimeLineRecycleViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_time_line_item_frame, parent, false);

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

        private TextView itemTitleTextView;
        private FrameLayout frameLayout;
        private int frameLayoutInt;

        public TimeLineRecycleViewViewHolder(@NonNull View itemView) {
            super(itemView);

            itemTitleTextView = itemView.findViewById(R.id.item_title_text_view);
            frameLayout = itemView.findViewById(R.id.frame_layout);
            frameLayoutInt = R.id.frame_layout;

        }

        private void bind(int position, TimeLineItem timeLineItem){
            fragmentReplace(new ItemRowViewPagerFragment(context, timeLineItem));
//            fragmentReplace(new ItemRowViewPagerFragment(context, timeLineItem, new ViewPagerItemsAdapter(context, timeLineItem)));
            itemTitleTextView.setText(timeLineItem.getShopName());
        }

        private void fragmentReplace(Fragment fragment){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(frameLayoutInt, fragment).commit();
        }
    }
}
