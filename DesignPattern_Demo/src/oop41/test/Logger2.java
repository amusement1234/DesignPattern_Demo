package oop41.test;

public class Logger2 {
    private static Logger2 instance;

    private Logger2() {
        System.out.println("构造函数");
    }

    public static Logger2 getInstance() {
        if (instance == null)
            instance = new Logger2();

        System.out.println("返回实例");
        return instance;
    }
}
