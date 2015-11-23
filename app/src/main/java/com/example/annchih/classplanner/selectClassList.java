package com.example.annchih.classplanner;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by AnnChih on 11/15/15.
 */
public class selectClassList extends Activity {
    private selectClassAdapter itemArrayAdapter;
    ListView listView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_class);
        context = this;
        /* Array adapter to bind stringArray to a built-in Android layout resource
        for a simple list item (each row is a TextView)*/
        String[] strings = {"CSE3","CSE8A","CSE11"};
        listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(new selectClassAdapter(this,strings));
    }

}
