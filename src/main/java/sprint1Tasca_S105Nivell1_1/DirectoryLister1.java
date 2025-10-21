package sprint1Tasca_S105Nivell1_1;

import java.io.File;
import java.util.Arrays;

/**
 * ClassName: DirectoryLister
 * Package: spring1Tasca_S105Nivell1_1
 * Description:
 * Author: Rong Jiang
 * Create:11/10/2025 - 17:00
 * Version:v1.0
 */
public class DirectoryLister1 {
    public static void directoryLister(String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("Error: The path '" + path + "' does not exist.");
        } else if (!dir.isDirectory()) {
            System.out.println("Error: The path '" + path + "' is not a directory.");
        } else {
            String[] names = dir.list();
            if (names == null || names.length == 0) {
                System.out.println("The directory '" + path + "' is empty.");
            } else {
                Arrays.stream(names).sorted().forEach(System.out::println);
            }
        }
    }
}
