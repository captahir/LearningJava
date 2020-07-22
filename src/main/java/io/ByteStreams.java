package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@SuppressWarnings(value = "ALL")
public class ByteStreams {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/main/resources/db/io/inputStream.txt");
            out = new FileOutputStream("src/main/resources/db/io/outputStream.txt");
            int c;

            while ((c = in.read()) != -1) out.write(c);
        }

        finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}
