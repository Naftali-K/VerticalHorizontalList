package com.nk.verticalhorizontallist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.nk.verticalhorizontallist.adapter.ParentItemRecycleViewAdapter;
import com.nk.verticalhorizontallist.adapter.TimeLineFrameRecycleViewAdapter;
import com.nk.verticalhorizontallist.adapter.TimeLineRecycleViewAdapter;
import com.nk.verticalhorizontallist.adapter.ViewPagerItemsAdapter;
import com.nk.verticalhorizontallist.model.DataManager;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Test_Code";

    private RecyclerView timeLineRecycleView, parentRecyclerView;
    private ViewPager viewPager;

    private TimeLineRecycleViewAdapter timeLineRecycleViewAdapter;
    private TimeLineFrameRecycleViewAdapter timeLineFrameRecycleViewAdapter;
    private ParentItemRecycleViewAdapter parentItemRecycleViewAdapter;
    private ViewPagerItemsAdapter viewPagerItemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setReferences();

        DataManager.createTimeLineList();
        DataManager.createPatentList();

//        timeLineRecycleViewAdapter = new TimeLineRecycleViewAdapter(getBaseContext(), DataManager.timeLineItemList);
//        timeLineRecycleView.setAdapter(timeLineRecycleViewAdapter);

//        timeLineFrameRecycleViewAdapter = new TimeLineFrameRecycleViewAdapter(getBaseContext(), getSupportFragmentManager(), DataManager.timeLineItemList);
//        timeLineRecycleView.setAdapter(timeLineFrameRecycleViewAdapter);

//        viewPagerItemsAdapter = new ViewPagerItemsAdapter(getBaseContext(), DataManager.timeLineItemList.get(0));
//        viewPager.setAdapter(viewPagerItemsAdapter);


        parentItemRecycleViewAdapter = new ParentItemRecycleViewAdapter(DataManager.parentItemList);
        parentRecyclerView.setAdapter(parentItemRecycleViewAdapter);

    }

    private void setReferences(){
//        timeLineRecycleView = findViewById(R.id.time_line_recycle_view);
        parentRecyclerView = findViewById(R.id.parent_recycler_view);
//        viewPager = findViewById(R.id.view_pager);
    }
}