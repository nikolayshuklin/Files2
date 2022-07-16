import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\Николай\\Documents\\Professional","1.txt"); //ПУТЬ К ФАЙЛУ 1
        File file2 = new File("C:\\Users\\Николай\\Documents\\Professional","2.txt"); //ПУТЬ К ФАЙЛУ 2
        FileReader fr1 = new FileReader(file1); // Считываем данные из первого файла
        FileWriter fw2 = new FileWriter(file2); // Перезаписываем данные во второй файл
        int b = -1;
        while ((b = fr1.read()) != -1){
            fw2.write(b);
        }
        fr1.close();
        fw2.close();

    }
}
