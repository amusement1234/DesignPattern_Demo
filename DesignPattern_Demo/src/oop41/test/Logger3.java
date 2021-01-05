package oop41.test;

public class Logger3 {
    private static Logger3 instance;

    private Logger3() {
        System.out.println("构造函数");
    }

    public static Logger3 getInstance() {
        if (instance == null) {
            synchronized (Logger3.class) {
                if (instance == null)
                    instance = new Logger3();
            }
        }
        System.out.println("返回实例");
        return instance;
    }
}
