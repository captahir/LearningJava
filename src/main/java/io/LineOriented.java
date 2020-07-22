package io;

import java.io.*;

@SuppressWarnings("ALL")
public class LineOriented {
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            in = new BufferedReader(new FileReader("src/main/resources/db/io/inputStream.txt"));
            out = new PrintWriter(new FileWriter("src/main/resources/db/io/outputStream.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                if (line.equalsIgnoreCase("hello there!")) out.println("GENERAL KENOBI!");
                else out.println(line);
            }
        }

        finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}
