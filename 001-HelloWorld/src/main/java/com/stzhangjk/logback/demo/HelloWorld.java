package com.stzhangjk.logback.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhjk on 2017/3/8.
 */
public class HelloWorld {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.debug("hello world!");
    }
}
