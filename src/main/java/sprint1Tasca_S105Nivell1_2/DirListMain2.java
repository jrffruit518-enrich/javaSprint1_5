package sprint1Tasca_S105Nivell1_2;

/**
 * ClassName: DirListMain2
 * Package: spring1Tasca_S105Nivell1_2
 * Description:
 * Author: Rong Jiang
 * Create:12/10/2025 - 14:26
 * Version:v1.0
 */
public class DirListMain2 {
    public static void main(String[] args) {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        String path = args.length > 0 ? args[0] : "src/main/resources";
        DirectoryLister2.directoryLister(path);
    }
}
