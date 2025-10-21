package sprint1Tasca_S105Nivell1_2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * ClassName: DirectoryLister
 * Package: spring1Tasca_S105Nivell1_1
 * Description:
 * Author: Rong Jiang
 * Create:11/10/2025 - 17:00
 * Version:v1.0
 */
public class DirectoryLister2 {
    public static void directoryLister(String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("Error: The path '" + path + "' does not exist.");
            return;
        } else if (!dir.isDirectory()) {
            System.out.println("Error: The path '" + path + "' is not a directory.");
            return;
        } else {
            System.out.println("Listing contents of: " + path);
            listDirectoryRecursively(dir, 0);

        }
    }

    public static void listDirectoryRecursively(File dir, int level) {
        File[] files = dir.listFiles();
        if (files == null) {
            System.out.println(getIndent(level) + "Error: Unable to access directory.");
            return;
        } else if (files.length == 0) {
            System.out.println(getIndent(level) + "Directory is empty.");
            return;
        }

        Arrays.sort(files, Comparator.comparing(File::getName , String.CASE_INSENSITIVE_ORDER));
        for (File file : files) {
            String type = file.isDirectory() ? "D" : "F";
            String lastModified = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date(file.lastModified()));
            System.out.println(getIndent(level) + file.getName() + " (" + type + ") - Last modified: " + lastModified);
            if (file.isDirectory()) {
                listDirectoryRecursively(file, level + 1);
            }
        }
    }

    private static String getIndent(int level) {
        return "  ".repeat(level);
    }
}
