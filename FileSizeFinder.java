import java.io.File;
import java.util.Scanner;


public class FileSizeFinder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter the path ");
            String FilePath = scanner.nextLine();

            File file = new File(FilePath);
            if(file.exists()) {
                long filesize = file.length();
                System.out.println(FilePath+":"+filesize+"bytes");
            }
            else {
                System.out.println("File is not Found"+FilePath);
            
            }
        }
    }
}