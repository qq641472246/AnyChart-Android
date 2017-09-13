package com.anychart.sample.charts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Waterfall;
import com.anychart.sample.R;

public class WaterfallChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Waterfall waterfall = new Waterfall();

        waterfall.setTitle("ACME corp. Revenue Flow 2017");

        waterfall.setData(new String[] {
                "{x: 'Start', value: 23000000}",
                "{x: 'Jan', value: 2200000}",
                "{x: 'Feb', value: -4600000}",
                "{x: 'Mar', value: -9100000}",
                "{x: 'Apr', value: 3700000}",
                "{x: 'May', value: -2100000}",
                "{x: 'Jun', value: 5300000}",
                "{x: 'Jul', value: 3100000}",
                "{x: 'Aug', value: -1500000}",
                "{x: 'Sep', value: 4200000}",
                "{x: 'Oct', value: 5300000}",
                "{x: 'Nov', value: -1500000}",
                "{x: 'Dec', value: 5100000}",
                "{x: 'End', isTotal: true}"
        });

        anyChartView.setChart(waterfall);
    }
}
