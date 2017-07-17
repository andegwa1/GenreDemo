package com.example.al.genredemo.genres.newage.newageFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.al.genredemo.R;
import com.example.al.genredemo.genres.newage.newageAdapters.NewAgeListAdapter;

public class NewAgeAlbumsFragment extends Fragment {

    ListView list;

    static final String BASE = "http://e.snmc.io/lk/f/l/";
    static final String EXT = ".jpg";
    static final String[] imgid = {
            BASE + "fcba7713761e6670adf52252609efd6b/1512680" + EXT,
            BASE + "5892ae22c2e4ec2e781600c5ac8d5218/3162686" + EXT,
            BASE + "526f8129c56e22a8bec25ec3120e6c7b/2137239" + EXT,
            BASE + "cfcd29431ebe376b0f3c2bc310d06293/2420418" + EXT,

            BASE + "aa5d1acee6a872c4c43de77385ea9a2c/2620121" + EXT,
            BASE + "e1b4100788da10ce41602ec7006a4c30/3946789" + EXT,

            BASE + "51be50583e6296eed2bcc817e8f64695/2198848" + EXT,
            BASE + "b428a38deb6c3f3f613c5a6cdd4492bf/3559999" + EXT,

            BASE + "bc11226564002a4232db54ffbc3aa85a/1271531" + EXT,
            BASE + "ac19255dc4630c5df42edf1e764518fe/2639363i/" + EXT
    };

    String[] itemname = {
            "Tom Waits",
            "Junior Wells' Chicago Blues Band",
            "Tom Waits",
            "Nina Simone",

            "Muddy Waters",
            "Magic Sam Blues Band",
            "Son House",
            "Muddy Waters",
            "Stevie Ray Vaughan and Double Trouble",
            "John Lee Hooker"
    };

    String[] albumname = {
            "Closing Time (1973)",
            "Hoodoo Man Blues (1965)",
            "Small Change (1976)",
            "Nina Simone Sings the Blues (1967)",

            "Folk Singer (1964)",
            "West Side Soul (1968)",
            "Father of Folk Blues (1965)",
            "Hard Again (1977)",
            "Texas Flood (1983)",
            "It Serve You Right to Suffer (1966)"
    };

    String[] genrename = {
            "Singer/Songwriter, Piano Blues",
            "Chicago Blues",
            "Singer/Songwriter, Piano Blues",
            "Blues, Slow Jazz",

            "Delta Blues",
            "Chicago Blues",
            "Delta Blues",
            "Chicago Blues",
            "Blues Rock, Electric Texas Blues",
            "Electric Blues"

    };


    public NewAgeAlbumsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_new_age_albums, container, false);

        NewAgeListAdapter adapter = new NewAgeListAdapter(getActivity(), itemname,
                imgid, albumname,
                genrename);
        list = (ListView) view.findViewById(R.id.newage_list);
        list.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;
    }

}
