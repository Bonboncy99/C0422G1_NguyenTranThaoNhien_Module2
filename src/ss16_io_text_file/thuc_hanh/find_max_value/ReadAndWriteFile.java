package ss16_io_text_file.thuc_hanh.find_max_value;

import ss16_io_text_file.thuc_hanh.ReadFileExample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
public  List<Integer> readFile (String filePath){
    List<Integer> numbers = new ArrayList<>();
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;


    try {
        File file = new File(filePath);
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine())!= null){
            System.out.println(line);
            numbers.add(Integer.parseInt(line));
        }
        bufferedReader.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return numbers;
}

public void writeFile (String filePath, int max) {
   FileWriter fileWriter = null;
    BufferedWriter bufferedWriter = null;

   File file = new File(filePath);
    try {
        fileWriter = new FileWriter(file);
        bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Giá trị lớn nhất là "+ max);
        bufferedWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
