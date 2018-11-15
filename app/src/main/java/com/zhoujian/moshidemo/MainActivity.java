package com.zhoujian.moshidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private TextView tv_bean;
    private TextView tv_json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_bean = (TextView) findViewById(R.id.tv_bean);
        tv_json = (TextView) findViewById(R.id.tv_json);

        String json = "{\n" +
                "    \"name\": \"BeJson\",\n" +
                "    \"url\": \"http://www.bejson.com\",\n" +
                "    \"page\": 88,\n" +
                "    \"isNonProfit\": true,\n" +
                "    \"address\": {\n" +
                "        \"street\": \"科技园路.\",\n" +
                "        \"city\": \"江苏苏州\",\n" +
                "        \"country\": \"中国\"\n" +
                "    },\n" +
                "    \"links\": [\n" +
                "        {\n" +
                "            \"name\": \"Google\",\n" +
                "            \"url\": \"http://www.google.com\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Baidu\",\n" +
                "            \"url\": \"http://www.baidu.com\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"SoSo\",\n" +
                "            \"url\": \"http://www.SoSo.com\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";


        Moshi moshi = new Moshi.Builder().build();
        JsonAdapter<DemoBean> adapter = moshi.adapter(DemoBean.class);
        try {
            DemoBean demoBean = adapter.fromJson(json);
            Log.i("zhoujian", "demoBean==" + demoBean.toString());
            tv_bean.setText(demoBean.toString());


            String demoBeanJson = adapter.toJson(demoBean);
            Log.i("zhoujian", "demoBeanJson==" + demoBeanJson.toString());
            tv_json.setText(demoBeanJson);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
