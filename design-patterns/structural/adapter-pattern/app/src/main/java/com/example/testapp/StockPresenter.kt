package com.example.testapp

import android.util.Log

class StockPresenter : IStockPresenter {
    override fun displayBarChart(xmlData: XmlData) {
        Log.d(javaClass.simpleName, "Show bar chart with ${xmlData.data}")
    }

    override fun displayPieChart(xmlData: XmlData) {
        Log.d(javaClass.simpleName,"Show pie chart with ${xmlData.data}")
    }
}