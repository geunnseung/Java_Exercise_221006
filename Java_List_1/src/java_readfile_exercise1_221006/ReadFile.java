package java_readfile_exercise1_221006;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\baeks\\OneDrive\\바탕 화면\\221006\\Java_List_1\\src\\java_readfile_exercise1_221006\\newfile.txt");

        int ch= reader.read();
        System.out.print((char) ch);

        }
}

