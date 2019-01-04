package layouts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.TourGuideAdapter;
import com.example.android.tourguideapp.TourGuiditem;

import java.util.ArrayList;

    public class HotelsFragment extends Fragment {

        public static final String NAME = "Hotels";

        public HotelsFragment() {
            // Required empty public constructor
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View rootView = inflater.inflate(R.layout.fragment_blank_hotels, container, false);

            ArrayList<TourGuiditem> tourItems = new ArrayList<>();

            tourItems.add( new TourGuiditem(getString(R.string.hotel_nameHilton),getString(R.string.hotel_locationHilton),getString(R.string.hotel_detailsHilton),R.drawable.hhr));
            tourItems.add(new TourGuiditem(getString(R.string.hotel_namesherator),getString(R.string.hotel_locationsherator),getString(R.string.hotel_detailssherator),R.drawable.index));

            ListView listView = (ListView) rootView.findViewById(R.id.Hotel);
            TourGuideAdapter tourAdapter = new TourGuideAdapter(rootView.getContext(), tourItems);
            listView.setAdapter(tourAdapter);

            return rootView;
        }

    }