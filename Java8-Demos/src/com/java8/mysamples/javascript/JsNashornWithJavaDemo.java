package com.java8.mysamples.javascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Objects;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 23:42 PM
 */
public class JsNashornWithJavaDemo {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");
        String script = "var welcome = 'Hello';" +
                "welcome += ', David';" +
                "welcome;";

        try {
            Object result = engine.eval(script);
            System.out.println("result = " + result);
        } catch (ScriptException e) {
            System.out.println("There was JS error");
            e.printStackTrace();
        }
    }
}
