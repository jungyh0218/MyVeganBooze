package yoohee.sselab.myveganbooze;

import android.content.Context;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sec on 2017-03-03.
 */

public class MenuListAdapter extends ArrayAdapter<ListViewItem>{

    private ArrayList<ListViewItem> items;

    public MenuListAdapter(Context context, int resource) {
        super(context, resource);
    }

    public MenuListAdapter(Context context, int resource, ArrayList<ListViewItem> items) {
        super(context, resource, items);
        this.items = items;
        Log.d("check", "size="+items.size());
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.list_item_view, null);
        }
        ListViewItem item = items.get(position);
        if(item != null){
            ImageView iv = (ImageView)v.findViewById(R.id.imageView);
            TextView name = (TextView)v.findViewById(R.id.textView);
            TextView description = (TextView)v.findViewById(R.id.textView2);
            if(iv != null){
                iv.setImageResource(item.getImage());
                Log.d("check", "getImage");
            }
            if(name != null){
                name.setText(item.getName());
            }
            if(description != null){
                description.setText(item.getDescription());
            }
        }
        return v;
    }
}
