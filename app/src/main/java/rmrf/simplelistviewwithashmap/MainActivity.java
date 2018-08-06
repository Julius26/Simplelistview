package rmrf.simplelistviewwithashmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String Universities[]={"a","b","c","d","e"};
    String mottos []={"This is motto a","This is motto b","This is motto c","This is motto d","This is motto e"};

    int [] flags={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<HashMap<String,String>> hashMaps=new ArrayList<HashMap<String, String>>();

        for (int i=0;i<5;i++){
            HashMap<String,String>hashMap=new HashMap<String, String>();
            hashMap.put("uni",Universities[i]);
            hashMap.put("moto",mottos[i]);
            hashMap.put("flag",Integer.toString(flags[i]));

            hashMaps.add(hashMap);
        }

//        keys used in the hashmap
        String [] from={"flag","uni","moto"};

//        keys used in the support layout
        int [] to  ={R.id.shadowimage,R.id.etnames,R.id.etexplained};

        SimpleAdapter adapter=new SimpleAdapter(getBaseContext(),hashMaps,R.layout.listsupport,from,to);

        ListView listView=findViewById(R.id.lst);
        listView.setAdapter(adapter);

    }

}
