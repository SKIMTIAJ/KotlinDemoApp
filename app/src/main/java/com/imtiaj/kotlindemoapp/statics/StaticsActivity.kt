package com.imtiaj.kotlindemoapp.statics

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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


        graph.getGridLabelRenderer().setGridStyle(GridLabelRenderer.GridStyle.HORIZONTAL) // It will remove the background grids
        graph.getGridLabelRenderer().setHorizontalLabelsVisible(false) // remove horizontal x labels and line
        graph.getGridLabelRenderer().setVerticalLabelsVisible(false)/*graph.getGridLabelRenderer().labelHorizontalHeight = 5*/

        val series = LineGraphSeries<DataPoint>()
        var y: Double
        for (i in 0..89) {
            x = i.toDouble()
            y = Math.sin(2 * x * 0.2) - 2 * Math.sin(x * 0.2)
            series.appendData(DataPoint(x,y), true, 90)
        }
        series.color = Color.GREEN
        series.thickness = 3
       // series.setCustomPaint()
        graph.addSeries(series)

    }
}