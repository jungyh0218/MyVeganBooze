package yoohee.sselab.myveganbooze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.list);

        MenuListAdapter adapter = new MenuListAdapter(this, R.layout.list_item_view, makeMainMenuList());
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
    }

    private ArrayList<ListViewItem> makeMainMenuList(){
        ArrayList<ListViewItem> arrayList = new ArrayList<ListViewItem>();
        arrayList.add(new ListViewItem(R.mipmap.ic_launcher, "Beer", "Hop, sparkling."));
        arrayList.add(new ListViewItem(R.mipmap.ic_launcher, "Wine", "Grape, red and white."));
        arrayList.add(new ListViewItem(R.mipmap.ic_launcher, "Spirits", "Whiskey, Brandy, Vodka, and so on."));
        arrayList.add(new ListViewItem(R.mipmap.ic_launcher, "Liqueur", "Liqueur and other alcoholic beverages"));
        return arrayList;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        switch(position){
            case 0:
                intent = new Intent(MainActivity.this, BeerListActivity.class);
                startActivity(intent);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }

    }
}
