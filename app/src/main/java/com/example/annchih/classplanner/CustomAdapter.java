package com.example.annchih.classplanner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.parse.ParseFile;
import com.parse.ParseImageView;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;

/**
 * Created by AnnChih on 11/21/15.
 */
public class CustomAdapter extends ParseQueryAdapter{

    public CustomAdapter(Context context, Class clazz) {
        super(context, clazz);
    }

    public CustomAdapter(Context context) {
        // Use the QueryFactory to construct a PQA that will only show
        // Todos marked as high-pri
        super(context, new ParseQueryAdapter.QueryFactory<ParseObject>() {
            public ParseQuery create() {
                ParseQuery query = new ParseQuery("classplanner");
                query.whereEqualTo("taken",false);
                return query;
            }
        });
    }
    // Customize the layout by overriding getItemView
    @Override
    public View getItemView(ParseObject object, View v, ViewGroup parent) {
        if (v == null) {
            v = View.inflate(getContext(), R.layout.class_item_listview, null);
        }

        super.getItemView(object, v, parent);

        // Add the title view
        TextView titleTextView = (TextView) v.findViewById(R.id.class_id);
        titleTextView.setText(object.getString("class_id"));

        // Add a reminder of how long this item has been outstanding
        //TextView timestampView = (TextView) v.findViewById(R.id.class_title);
        //timestampView.setText(object.getCreatedAt().toString());

        return v;
    }
}
