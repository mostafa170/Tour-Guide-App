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


    public class ClubsFragment extends Fragment {

        public static final String NAME = "Clubs";

        public ClubsFragment() {
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
            View rootView = inflater.inflate(R.layout.fragment_clubs, container, false);

            ArrayList<TourGuiditem> tourItems = new ArrayList<>();

            tourItems.add(new TourGuiditem(getString(R.string.Clubs_nameZamalak),getString(R.string.Clubs_locationZamalak),getString(R.string.Clubs_detailsZamalak),R.drawable.index1));
            tourItems.add(new TourGuiditem(getString(R.string.Clubs_namereal_madrid),getString(R.string.Clubs_locationReal_madrid),getString(R.string.Clubs_detailsReal_madrid),R.drawable.realmadrid));

            ListView listView = (ListView) rootView.findViewById(R.id.Clubs);
            TourGuideAdapter tourAdapter = new TourGuideAdapter(rootView.getContext(), tourItems);
            listView.setAdapter(tourAdapter);

            return rootView;
        }

    }