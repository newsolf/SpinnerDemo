package com.newsolf.spinnerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.newsolf.spinnerdemo.CustomView.NiceSpinner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final NiceSpinner niceSpinner = (NiceSpinner) findViewById(R.id.ns);
        NiceSpinner niceSpinner1 = (NiceSpinner) findViewById(R.id.ns1);

        List<String> dataset = new LinkedList<>(Arrays.asList("1", "2", "3", "4", "5"));
        niceSpinner1.attachDataSource(dataset);
        final TextView tv = (TextView) findViewById(R.id.tv);

        dataset = new LinkedList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
        niceSpinner.attachDataSource(dataset);
        niceSpinner.addOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                int selectedIndex = niceSpinner.getSelectedIndex();
                tv.setText("选择的内容是："+niceSpinner.getText() +"\t" +
                        "selectedIndex = "+position );
            }
        });

    }
}
