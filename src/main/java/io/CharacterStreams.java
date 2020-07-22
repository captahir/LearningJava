package io;

import java.io.*;

@SuppressWarnings("ALL")
public class CharacterStreams {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
       FileWriter out = null;

        try {
            in = new FileReader("src/main/resources/db/io/inputStream.txt");
            out = new FileWriter("src/main/resources/db/io/outputStream.txt");
            int c;

            while ((c = in.read()) != -1) out.write(c);
        }

        finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}
