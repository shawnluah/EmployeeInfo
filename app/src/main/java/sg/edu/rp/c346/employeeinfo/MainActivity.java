package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvInfo;

    ArrayList<InfoItem> alInfoList;

    CustomAdapter caInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = findViewById(R.id.ListViewEmployeeInfo);

        alInfoList = new ArrayList<>();

        InfoItem item1 = new InfoItem("John", "Software Technical Leader", 3400);
        InfoItem item2 = new InfoItem("May", "Programmer", 2200);


        alInfoList.add(item1);
        alInfoList.add(item2);

        caInfo = new CustomAdapter(this, R.layout.info_item, alInfoList);
        lvInfo.setAdapter(caInfo);
    }
}
