package nio;

import java.io.File;


public class BasicOperations {

    public static void main(String[] args) {
        

    }

    private boolean ifExist(String path) { return new File(path).exists(); }

    private boolean isReadable(String path) {
        if (ifExist(path)) {
            return new File(path).canRead();
        }
        else return false;
    }

    private boolean isWriteable(String path) {
        if (ifExist(path)) {
            return new File(path).canWrite();
        }
        else return false;
    }
}
