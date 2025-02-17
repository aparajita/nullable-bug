package com.mycompany.plugins.example;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Example")
public class ExamplePlugin extends Plugin {

    private final Example implementation = new Example();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value", "foo");

        if (value.length() > 0) {
            value = value.substring(0, 1).toUpperCase() + value.substring(1);
        }

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }
}
