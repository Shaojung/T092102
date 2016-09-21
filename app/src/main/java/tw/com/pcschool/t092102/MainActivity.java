package tw.com.pcschool.t092102;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    String city[] = {"台北","台中","台南","高雄"};
    String code[] = {"02", "04", "06", "07"};
    ArrayList<Map<String, String>> data = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i=0;i<city.length;i++)
        {
            Map<String, String> m = new HashMap();
            m.put("city", city[i]);
            m.put("code", code[i]);
            data.add(m);
        }

        ListView lv = (ListView) findViewById(R.id.listView);
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,
                                    data,
                                    android.R.layout.simple_list_item_2,
                                    new String[] {"city", "code"},
                                    new int[] {android.R.id.text1, android.R.id.text2});
        lv.setAdapter(adapter);

    }
}
