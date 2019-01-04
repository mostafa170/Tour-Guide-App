package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mostafa on 14/06/2017.
 */

public class TourGuideAdapter extends ArrayAdapter<TourGuiditem> {

    private Context mContext;

    public TourGuideAdapter(Context context, ArrayList<TourGuiditem> tourItemArrayList) {
        super(context, 0, tourItemArrayList);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TourGuiditem tourItem = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_main, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.title_textview);
        TextView detailsTextView = (TextView) convertView.findViewById(R.id.details_textview);
        TextView locTextView = (TextView) convertView.findViewById(R.id.loc_textview);

        imageView.setImageResource(tourItem.getImage());
        titleTextView.setText(tourItem.getTitle());
        detailsTextView.setText(tourItem.getDetails());
        locTextView.setText(tourItem.getLocation());

        return convertView;
    }
}
