package com.wzj.test.logback;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wangzhijiang on 16/5/15.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Logger LOG = LoggerFactory.getLogger(HelloWorld.class);

        LOG.debug("Hello world, logback.");

        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}
