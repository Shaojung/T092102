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
    Integer img[] = {R.drawable.a01, R.drawable.a02, R.drawable.a03, R.drawable.a04};
    ArrayList<Map<String, Object>> data = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i=0;i<city.length;i++)
        {
            Map<String, Object> m = new HashMap();
            m.put("city", city[i]);
            m.put("code", code[i]);
            m.put("img", img[i]);
            data.add(m);
        }

        ListView lv = (ListView) findViewById(R.id.listView);
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,
                                    data,
                                    R.layout.mylist,
                                    new String[] {"city", "code", "img"},
                                    new int[] {R.id.textView, R.id.textView2, R.id.imageView});
        lv.setAdapter(adapter);

    }
}
