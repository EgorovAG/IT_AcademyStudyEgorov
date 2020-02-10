package university;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;

public class Saver {

    public void saveFile(String file, List<Student> ls){
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(file))) {
            pw.println(ls);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}




