package sprint1Tasca_S105Nivell1_4;

/**
 * ClassName: DirListMain2
 * Package: spring1Tasca_S105Nivell1_2
 * Description:
 * Author: Rong Jiang
 * Create:12/10/2025 - 14:26
 * Version:v1.0
 */
public class DirListMain4 {
    public static void main(String[] args) {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        String path = args.length > 0 ? args[0] : "src/main/resources";
        String outputFile = "output/output.txt";
        DirectoryLister4.directoryLister(path,outputFile);

        String txtFile = args.length > 1 ? args[1] : "output/output.txt";
        DirectoryLister4.readTxtFile(txtFile);
    }
}
