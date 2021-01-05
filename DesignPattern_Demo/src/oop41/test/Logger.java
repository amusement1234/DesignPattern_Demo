package oop41.test;

// 1. 饿汉式
public class Logger {
    private static final Logger instance = new Logger();

    private Logger() {
        System.out.println("构造函数");
    }

    public static Logger getInstance() {
        System.out.println("返回实例");
        return instance;
    }

}
