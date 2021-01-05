package oop41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 2. 懒汉式
public class Logger2 {
    private FileWriter writer;
    private static Logger2 instance;

    private Logger2() {

        try {
            File file = new File("E:/myVsCode_Java/Hellow/log/log.txt");
            writer = new FileWriter(file, true);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static synchronized Logger2 getInstance() {

        if (instance == null)
            instance = new Logger2();
        return instance;
    }

    public void log(String message) throws IOException {
        writer.write(message);
        writer.flush();
    }
}
