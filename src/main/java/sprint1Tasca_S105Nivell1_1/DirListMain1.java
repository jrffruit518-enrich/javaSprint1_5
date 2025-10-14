package sprint1Tasca_S105Nivell1_1;

/**
 * ClassName: Main
 * Package: spring1Tasca_S105Nivell1_1
 * Description:
 * Author: Rong Jiang
 * Create:11/10/2025 - 17:05
 * Version:v1.0
 */
public class DirListMain1 {
    public static void main(String[] args) {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        String path = args.length > 0 ? args[0] : "src/main/resources";
        spring1Tasca_S105Nivell1_1.DirectoryLister1.directoryLister(path);
    }
}
