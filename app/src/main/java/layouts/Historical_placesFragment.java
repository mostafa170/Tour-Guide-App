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

    public class Historical_placesFragment extends Fragment {

        public static final String NAME = "Historical places";

        public Historical_placesFragment() {
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
            View rootView = inflater.inflate(R.layout.fragment_historical_places, container, false);

            ArrayList<TourGuiditem> tourItems = new ArrayList<>();

            tourItems.add(new TourGuiditem(getString(R.string.Historical_places_namePyramids),getString(R.string.Historical_places_locationPyramids),getString(R.string.Historical_places_detailsPyramids),R.drawable.antigoegito));
            tourItems.add(new TourGuiditem(getString(R.string.Historical_places_nameMohammed_Alis_castle),getString(R.string.Historical_places_locationMohammed_Alis_castle),getString(R.string.Historical_places_detailsMohammed_Alis_castle),R.drawable.ww));

            ListView listView = (ListView) rootView.findViewById(R.id.Historical_places);
            TourGuideAdapter tourAdapter = new TourGuideAdapter(rootView.getContext(), tourItems);
            listView.setAdapter(tourAdapter);

            return rootView;
        }

    }
