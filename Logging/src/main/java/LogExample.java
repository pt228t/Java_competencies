package main.java;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.*;

public class LogExample {
    private static final Logger logger = Logger.getLogger(LogExample.class.getName());


    static {
        //logger.setLevel(Level.FINEST);
        // This consle handler is default handler and prints the log in console
        //ConsoleHandler console = new ConsoleHandler();
        //console.setLevel(Level.FINEST);
        
        FileHandler logfile = null;
        try {
            logfile = new FileHandler(LogExample.class.getSimpleName() + ".log");
            logfile.setFormatter(new SimpleFormatter());
            Filter filterAll = s -> false;
            logfile.setFilter(filterAll);
            logger.setFilter(filterAll);
        } catch (SecurityException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        logger.addHandler(logfile);
    }
    public static void main(String[] args) throws Exception {
        System.out.println(LogExample.class.getName());
        System.out.println(LogExample.class.getSimpleName());
        
        logger.log(Level.INFO,"This is an example message");
    }

}


//Log Level represents the severity of situation
// There are 7 Log Level in Java logging API
// The most urgent logging level is placed at top - 
// SEVERE
// WARNING
// INFO
// CONFIG
// FINE
// FINER 
// FINEST