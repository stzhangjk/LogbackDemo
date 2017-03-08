package com.stzhangjk.logback.demo;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhjk on 2017/3/8.
 */
public class HelloWorld {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.debug("hello world!");
        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}
