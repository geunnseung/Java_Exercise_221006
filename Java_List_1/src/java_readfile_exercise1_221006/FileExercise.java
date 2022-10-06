package java_readfile_exercise1_221006;

import java.io.File;
import java.io.FileNotFoundException;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {

        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file : files) {
            System.out.println(file);
        }
    }
}

/*
"C:\Program Files\Java\openjdk-18.0.1.1_windows-x64_bin\jdk-18.0.1.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.2\lib\idea_rt.jar=63974:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\baeks\OneDrive\바탕 화면\221006\Java_List_1\out\production\Java_List_1" java_readfile_exercise1_221006.FileExercise
.\.idea
.\Java_List_1.iml
.\out
.\src

 */