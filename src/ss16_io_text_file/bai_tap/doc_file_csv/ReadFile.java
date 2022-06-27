package ss16_io_text_file.bai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Nation> readNation (){
        List <Nation> nationList = new ArrayList<>();
        File file  = new File("src/ss16_io_text_file/bai_tap/doc_file_csv/csv.txt");
        FileReader fileReader= null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line = bufferedReader.readLine())!=null){
                String [] arr = line.split(",");
                nationList.add(new Nation(Integer.parseInt(arr[0]),arr[1],arr[2]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return nationList;
    }
}
