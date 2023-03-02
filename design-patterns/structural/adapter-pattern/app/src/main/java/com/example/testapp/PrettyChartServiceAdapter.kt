package com.example.testapp

import fr.arnaudguyon.xmltojsonlib.XmlToJson
import org.json.JSONObject

class PrettyChartServiceAdapter : IStockPresenter {
    private val prettyChartService by lazy { PrettyChartService() }

    override fun displayBarChart(xmlData: XmlData) {
        prettyChartService.displayBarChart(convertXmlToJson(xmlData))
    }

    override fun displayPieChart(xmlData: XmlData) {
        prettyChartService.displayPieChart(convertXmlToJson(xmlData))
    }

    private fun convertXmlToJson(xmlData: XmlData): JSONObject? {
        return XmlToJson.Builder(xmlData.data).build().toJson()
    }
}