package com.mycompany.plugins.example

import com.getcapacitor.PluginCall

class ExampleTest {
    fun test(call: PluginCall) {
        val value = call.getString("value", "foo")
        val length = value.length
    }
}