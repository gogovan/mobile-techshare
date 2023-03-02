package com.example.testapp

import android.util.Log
import org.json.JSONObject

// 3rd-party or legacy: only can use JSON as input
class PrettyChartService {
    fun displayBarChart(jsonData: JSONObject?) {
        Log.d(javaClass.simpleName,"Show pretty bar chart with ${jsonData?.toString(2)}")
    }

    fun displayPieChart(jsonData: JSONObject?) {
        Log.d(javaClass.simpleName,"Show pretty pie chart with ${jsonData?.toString(2)}")
    }
}