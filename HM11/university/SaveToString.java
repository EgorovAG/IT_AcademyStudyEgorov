package university;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;

public class SaveToString {
    public void saveString(String file, List<Student> ls){
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(file))) {
            pw.print(ls);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
