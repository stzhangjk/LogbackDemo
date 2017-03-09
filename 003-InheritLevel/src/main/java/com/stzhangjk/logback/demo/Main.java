package com.stzhangjk.logback.demo;



import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhjk on 2017/3/8.
 */
public class Main {
    public static void main(String[] args){
        Logger loggerA = (Logger)LoggerFactory.getLogger("demo.A");
        loggerA.setLevel(Level.DEBUG);

        Logger loggerB = (Logger)LoggerFactory.getLogger("demo.A.B");

        loggerA.debug(">");
        loggerB.trace("<");
    }
}
