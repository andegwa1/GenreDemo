package com.example.al.genredemo.blues.bluesFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.al.genredemo.R;
import com.example.al.genredemo.blues.bluesAdapters.CustomListAdapter;

public class BluesAlbumsFragment extends Fragment {

    ListView list;

    static final String BASE = "http://e.snmc.io/lk/f/l/";
    static final String EXT = ".jpg";
    static final String[] imgid = {
            BASE + "fcba7713761e6670adf52252609efd6b/1512680" + EXT,
            BASE + "5892ae22c2e4ec2e781600c5ac8d5218/3162686" + EXT
    };

    String[] itemname ={
            "Tom Waits",
            "Junior Wells' Chicago Blues Band"
    };

    String[] albumname = {
            "Closing Time (1973)",
            "Hoodoo Man Blues (1965)",
    };

    String[] genrename = {
            "Singer/Songwriter, Piano Blues",
            "Chicago Blues"
    };


    public BluesAlbumsFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blues_albums, container, false);

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), itemname, imgid, albumname,
                genrename);
        list=(ListView)view.findViewById(R.id.list);
        list.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;
    }

}
