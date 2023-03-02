package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

const val DATA = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<library>\n" +
        "    <owner>John Doe</owner>\n" +
        "    <book id=\"007\">James Bond</book>\n" +
        "    <book id=\"000\">Book for the dummies</book>\n" +
        "</library>"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Client only support xml presenting, cannot integrate with PrettyChartService
        val stockDataToApp = StockPresenter()
        stockDataToApp.displayPieChart(XmlData(DATA))

        // By using PrettyChartServiceAdapter, we can us pass xml data to adapter
        // Adapter will help us convert it to JSON and display pretty chart by Service
        val adapter = PrettyChartServiceAdapter()
        adapter.displayPieChart(XmlData(DATA))
    }
}