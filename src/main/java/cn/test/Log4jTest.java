package cn.test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jTest {
    public static void main(String[] args) {
    Logger logger = LogManager.getLogger(Log4jTest.class.getName());
    logger.info("Hello world");
    System.out.println("Hello world");
    }
}
