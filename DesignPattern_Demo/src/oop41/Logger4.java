package oop41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 4. 静态内部类
public class Logger4 {
    private FileWriter writer;
    private static Logger4 instance;

    private static class SingletonHolder {
        private static final Logger4 instance = new Logger4();
    }

    private Logger4() {

        try {
            File file = new File("E:/myVsCode_Java/Hellow/log/log.txt");
            writer = new FileWriter(file, true);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static Logger4 getInstance() {
        return SingletonHolder.instance;
    }

    public void log(String message) throws IOException {
        writer.write(message);
        writer.flush();
    }
}