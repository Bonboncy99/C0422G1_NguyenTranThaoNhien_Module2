package ss16_io_text_file.bai_tap.doc_file_csv;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < ReadFile.readNation().size(); i++) {
            System.out.println(ReadFile.readNation().get(i));
        }
    }
}
