package com.java8.mysamples.javascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 23:48 PM
 */
public class LoadJsDemo {
    public static void main(String[] args) throws FileNotFoundException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");
        File jsFile = new File("script/sample.js"); //todo path problem here

        Reader reader = new FileReader(jsFile);

        try {
            Object result = engine.eval(reader);
            System.out.println("result = " + result);
        } catch (ScriptException e) {
            System.out.println("There was JS error");
            e.printStackTrace();
        }

    }
}
