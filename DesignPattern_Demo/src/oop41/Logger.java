package oop41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//单例模式
// 1. 饿汉式
public class Logger {
    private FileWriter writer;
    private static final Logger instance = new Logger();

    private Logger() {
        try {
            File file = new File("E:/myVsCode_Java/Hellow/log/log.txt");
            writer = new FileWriter(file, true);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) throws IOException {
        writer.write(message);
        writer.flush();
    }
}
