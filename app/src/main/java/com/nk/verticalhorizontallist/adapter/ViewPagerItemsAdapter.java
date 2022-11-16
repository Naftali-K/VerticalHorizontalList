package com.nk.verticalhorizontallist.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.nk.verticalhorizontallist.R;
import com.nk.verticalhorizontallist.model.PictureItem;
import com.nk.verticalhorizontallist.model.TimeLineItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerItemsAdapter extends PagerAdapter {

    private static final String TAG = "Test_Code";

    private Context context;
    private TimeLineItem timeLineItem;
    private List<PictureItem> pictureItemList = new ArrayList<>();

    private ImageView imageView;
    private TextView profileNameTextView;

    public ViewPagerItemsAdapter(Context context, TimeLineItem timeLineItem) {
        this.context = context;
        this.timeLineItem = timeLineItem;
        this.pictureItemList = timeLineItem.getPictures();

        Log.d(TAG, "ViewPagerItemsAdapter: Created View Pager");
        Log.d(TAG, "ViewPagerItemsAdapter: Shop Name: " + timeLineItem.getShopName());
        Log.d(TAG, "ViewPagerItemsAdapter: Pictures Size: " + pictureItemList.size() + "\n ");
    }

    @Override
    public int getCount() {
//        Log.d(TAG, "getCount: Picture List Size: " + pictureItemList.size());
        return pictureItemList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        Log.d(TAG, "instantiateItem: Image " + timeLineItem.getShopName() + " position: " + position + "\tList Size: " + pictureItemList.size());

        View view;
//        View view = LayoutInflater.from(context).inflate(R.layout.view_pager_profile_inf, container, false);;

        if (position == 0) {
            view = LayoutInflater.from(context).inflate(R.layout.view_pager_profile_inf, container, false);
            setReferencesProfile(view);
            setValueProfile();
        }else{
            view = LayoutInflater.from(context).inflate(R.layout.view_pager_picture, container, false);
            setReferencesImages(view);
            setValueImage(pictureItemList.get(position).getUrl());
        }

//        container.addView(view, position); //this option not working here, because have created only 3 cards. (if you not see in one screen more then one card.
        container.addView(view, 0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    private void setReferencesProfile(View view){
        imageView = view.findViewById(R.id.profile_image_view);
        profileNameTextView = view.findViewById(R.id.profile_name_text_view);
    }

    private void setValueProfile(){
        Picasso.get().load(timeLineItem.getUrlLogo()).into(imageView);
        profileNameTextView.setText(timeLineItem.getShopName());
    }

    private void setReferencesImages(View view){
        imageView = view.findViewById(R.id.image_view);
    }

    private void setValueImage(String url){
        Picasso.get().load(url).into(imageView);
    }
}
