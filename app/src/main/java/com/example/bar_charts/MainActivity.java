package com.example.bar_charts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class MainActivity<bardataSet, barData> extends AppCompatActivity {
BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        barChart=(BarChart)findViewById(R.id.bars);
        BarDataSet bardataSet=new BarDataSet(datavalues(),"datas");
        BarData barData=new BarData();
        barData.addDataSet(bardataSet);
        barChart.setData(barData);
        barChart.invalidate();
        bardataSet.setColor(Color.RED);
        bardataSet.setValueTextColor(Color.BLACK);
        bardataSet.setValueTextSize(15f);


    }
    private ArrayList<BarEntry> datavalues(){
        ArrayList<BarEntry> datavals=new ArrayList<>();
        datavals.add(new BarEntry(0,3));
        datavals.add(new BarEntry(1,6));
        datavals.add(new BarEntry(3,7));
        datavals.add(new BarEntry(4,4));
        datavals.add(new BarEntry(5,3));
        return datavals;
    }



}