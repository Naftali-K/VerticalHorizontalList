package com.nk.verticalhorizontallist.frame;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nk.verticalhorizontallist.R;
import com.nk.verticalhorizontallist.adapter.ViewPagerItemsAdapter;
import com.nk.verticalhorizontallist.model.TimeLineItem;

public class ItemRowViewPagerFragment extends Fragment {

    private static final String TAG = "Test_Code";

    private TimeLineItem timeLineItem;
    private Context context;

    private ViewPager itemsViewPager;

    private ViewPagerItemsAdapter viewPagerItemsAdapter;

    public ItemRowViewPagerFragment(Context context, TimeLineItem timeLineItem) {
        this.timeLineItem = timeLineItem;
        this.context = context;
        Log.d(TAG, "ItemRowViewPagerFragment: Fragment made to: " + timeLineItem.getShopName());
        Log.d(TAG, "ItemRowViewPagerFragment: Fragment made images size: " + timeLineItem.getPictures().size() + "\n ");
    }

    public ItemRowViewPagerFragment(Context context, TimeLineItem timeLineItem, ViewPagerItemsAdapter viewPagerItemsAdapter) {
        this(context, timeLineItem);
        this.viewPagerItemsAdapter = viewPagerItemsAdapter;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_row_view_pager, container, false);

        setReference(view);

        viewPagerItemsAdapter = new ViewPagerItemsAdapter(context, timeLineItem);
        itemsViewPager.setAdapter(viewPagerItemsAdapter);

        return view;
    }

    private void setReference(View view){
        itemsViewPager = view.findViewById(R.id.items_view_pager);
    }
}