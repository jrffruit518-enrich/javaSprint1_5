package sprint1Tasca_S105Nivell1_5;

/**
 * ClassName: DirListMain2
 * Package: spring1Tasca_S105Nivell1_2
 * Description:
 * Author: Rong Jiang
 * Create:12/10/2025 - 14:26
 * Version:v1.0
 */
public class DirListMain5 {
    public static void main(String[] args) {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        String path = args.length > 0 ? args[0] : "src/main/resources";
        String outputFile = "output/output.txt";
        DirectoryLister5.directoryLister(path,outputFile);

        String txtFile = args.length > 1 ? args[1] : "output/output.txt";
        DirectoryLister5.readTxtFile(txtFile);

        System.out.println("\nSerializing directory information:");
        DirectoryLister5.serializeDirectory("src/main/resources","output/directory.ser");

        System.out.println("\nDeserializing and printing directory information:");
        DirectoryLister5.deserializeAndPrint("output/directory.ser");
    }
}
