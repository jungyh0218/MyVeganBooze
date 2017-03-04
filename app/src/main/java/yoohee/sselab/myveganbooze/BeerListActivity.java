package yoohee.sselab.myveganbooze;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import static yoohee.sselab.myveganbooze.Country.*;


public class BeerListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_list);
    }

    private ArrayList<Drink> makeDummyList(){
        ArrayList<Drink> drinkList = new ArrayList<Drink>();
        drinkList.add(new Drink("하이트 맥주", KOREA, true));
        drinkList.add(new Drink("Pilsner Urquell", CZECH, true));
        return drinkList;
    }
}
