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

    public class RestaurantsFragment extends Fragment {

        public static final String NAME = "Restaurants";

        public RestaurantsFragment() {
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
            View rootView = inflater.inflate(R.layout.fragment_restaurants, container, false);

            ArrayList<TourGuiditem> tourItems = new ArrayList<>();

            tourItems.add(new TourGuiditem(getString(R.string.Restaurants_nameElbrans),getString(R.string.Restaurants_locationElbrans),getString(R.string.Restaurants_detailsElbrans),R.drawable.yy));
            tourItems.add(new TourGuiditem(getString(R.string.Restaurants_nameELmalke),getString(R.string.Restaurants_locationELmalke),getString(R.string.Restaurants_detailsELmalke),R.drawable.images));

            ListView listView = (ListView) rootView.findViewById(R.id.Restaurants);
            TourGuideAdapter tourAdapter = new TourGuideAdapter(rootView.getContext(), tourItems);
            listView.setAdapter(tourAdapter);

            return rootView;
        }

    }