package ss16_io_text_file.bai_tap.copy_file_text;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhaapj chuoix");
        String str = scanner.nextLine();
        WriteFile1  writeFile1= new WriteFile1();
        writeFile1.writeFile1(str,true);
        ReadAndWrite readAndWrite = new ReadAndWrite();
        String str1 = readAndWrite.readFile1(true,"src/ss16_io_text_file/bai_tap/copy_file_text/file1.txt");
        readAndWrite.writeFile2(str1, true);
    }
}
