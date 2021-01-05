package oop41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 3. 双重检测
public class Logger3 {
    private FileWriter writer;
    private static Logger3 instance;

    private Logger3() {

        try {
            File file = new File("E:/myVsCode_Java/Hellow/log/log.txt");
            writer = new FileWriter(file, true);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static Logger3 getInstance() {
        if (instance == null) {
            synchronized (Logger3.class) {
                if (instance == null)
                    instance = new Logger3();
            }
        }
        return instance;
    }

    public void log(String message) throws IOException {
        writer.write(message);
        writer.flush();
    }
}
