package com.example.al.genredemo.genres.ambient.ambientAdapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.al.genredemo.R;

public class AmbientListAdapter extends ArrayAdapter<String> {

    private final Activity context;

    private final String[] itemname;
    private final String[] imgid;
    private final String[] albumname;
    private final String[] genrename;


    @Override
    public int getCount() {
        return this.itemname.length;
    }

    @Override
    public String getItem(int position) {
        return String.valueOf(itemname[position]);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public AmbientListAdapter(Activity context, String[] itemname, String[] imgid, String[] albumname,
                              String[] genrename) {
        super(context, R.layout.ambient_album_list, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.albumname = albumname;
        this.genrename = genrename;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.ambient_album_list, null, true);

        //title
        TextView txtTitle = (TextView) rowView.findViewById(R.id.ambient_item);
        txtTitle.setText(itemname[position]);

        //images
        ImageView imageView = (ImageView) rowView.findViewById(R.id.ambient_icon);
        // Get the image URL for the current position.
        String url = String.valueOf(imgid[position]);
        Glide.with(context)
                .load(url)
                .placeholder(R.drawable.akira_sh2)
                .error(R.drawable.bohren_black)
                .crossFade()
                .into(imageView);

        //bottom text
        TextView extratxt = (TextView) rowView.findViewById(R.id.ambient_textView1);
        extratxt.setText(albumname[position]);

        //genre
        TextView genretxt = (TextView) rowView.findViewById(R.id.ambient_textView2);
        genretxt.setText(genrename[position]);

        //rank
        ((TextView) rowView.findViewById(R.id.ambient_rank)).setText(""
                + (position + 1) + ".");

        return rowView;

    };
}