package university;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoaderObjekt {

    public List<Student> loadFile(File file){
        List<Student> list = new ArrayList<>();
        try (ObjectInputStream pw = new ObjectInputStream(new FileInputStream(file))) {
        list = (List<Student>)pw.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list ;
    }
}
