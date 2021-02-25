package com.imtiaj.kotlindemoapp.statics

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import com.imtiaj.kotlindemoapp.R
import com.jjoe64.graphview.GridLabelRenderer
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import kotlinx.android.synthetic.main.activity_statics.*

class StaticsActivity : AppCompatActivity() {

    var x : Double = 0.0;  var y : Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statics)

        val lineChart = findViewById<LineChart>(R.id.lineChart);
        lineChart.setTouchEnabled(true);
        lineChart.setPinchZoom(true);


        val lineDataSet = LineDataSet(dataValue()," ")
        val dataset = ArrayList<ILineDataSet>()
        dataset.add(lineDataSet)
        val data = LineData(dataset)

        lineDataSet.setDrawValues(false)
        lineChart.setData(data)
        lineChart.invalidate()

        lineDataSet.getEntryForIndex(15).setIcon(getDrawable(R.drawable.linegraph_marker))

        lineDataSet.setDrawCircles(false)
        lineDataSet.setColor(ContextCompat.getColor(this,R.color.call_color))
        lineDataSet.lineWidth = 1.5F
        val xAxis = lineChart.xAxis
        val leftAxis = lineChart.axisLeft
        val rightAxis = lineChart.axisRight


        xAxis.setDrawAxisLine(false)
        leftAxis.setDrawAxisLine(false)
        rightAxis.setDrawAxisLine(false)

        xAxis.setDrawLabels(false)
        leftAxis.setDrawLabels(false)
        rightAxis.setDrawLabels(false)

        lineChart.minOffset = 0f
        lineChart.getData().setHighlightEnabled(false);

        xAxis.setDrawGridLines(false)
        //lineChart.setHighlightFullBarEnabled(false);
        lineChart.getAxisRight().setDrawLimitLinesBehindData(false);
        lineChart.getXAxis().setDrawLimitLinesBehindData(false);
        lineChart.getLegend().setEnabled(false);
        lineChart.getDescription().setEnabled(false);
        leftAxis.setGranularityEnabled(true);
    }

    fun dataValue():ArrayList<Entry>{

        val listData = ArrayList<Entry>()

        listData.add(Entry(0f, 0f))
        listData.add(Entry(.5f, 1f))
        listData.add(Entry(.7f, 2f))
        listData.add(Entry(.8f, 3f))
        listData.add(Entry(1.1f, 4f))
        listData.add(Entry(1.5f, 5f))
        listData.add(Entry(2.2f, 5.5f))
        listData.add(Entry(2.8f, 5f))
        listData.add(Entry(3.2f, 4f))
        listData.add(Entry(3.57f, 3f))
        listData.add(Entry(4f, 4f))
        listData.add(Entry(4.3f, 4.73f))
        listData.add(Entry(4.35f, 5f))
        listData.add(Entry(4.62f, 5.6f))
        listData.add(Entry(4.75f, 6f))
        listData.add(Entry(5.35f, 6.42f))
        listData.add(Entry(5.4f, 6.4f))
        listData.add(Entry(5.6f, 6f))

        listData.add(Entry(5.9f, 5f))
        listData.add(Entry(6.05f, 4.7f))
        listData.add(Entry(6.2f, 5f))
        listData.add(Entry(6.32f, 3f))
        listData.add(Entry(6.3f, 2.85f))
        listData.add(Entry(6.4f, 3f))
        listData.add(Entry(7f, 4f))
        listData.add(Entry(7.6f, 5f))
        listData.add(Entry(8.2f, 6f))
        listData.add(Entry(3.47f, 6.5f))

        return listData
    }


}