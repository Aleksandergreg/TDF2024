import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TDFFileReader {
    private File tdfFileList;
    public TDFFileReader(String filename){
        tdfFileList = new File(filename);
    }


public List<Rider> readFile() throws FileNotFoundException {
List<Rider> tdfResultList =new ArrayList<>();
    Scanner scanner =new Scanner(this.tdfFileList);
    while (scanner.hasNext()){
    String line = scanner.nextLine();
    String[] values = line.split(";");
    tdfResultList.add(new Rider(values[1], values[2]));


    }return tdfResultList;
}
}
