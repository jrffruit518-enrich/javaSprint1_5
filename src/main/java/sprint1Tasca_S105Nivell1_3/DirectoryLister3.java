package sprint1Tasca_S105Nivell1_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
public class DirectoryLister3 {
    public static void directoryLister(String path, String outputFile) {
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("Error: The path '" + path + "' does not exist.");
            return;
        } else if (!dir.isDirectory()) {
            System.out.println("Error: The path '" + path + "' is not a directory.");
            return;
        }
        File output = new File(outputFile);
        File outputDir = output.getParentFile();
        if (outputDir != null && !outputDir.exists()) {
            if (!outputDir.mkdirs()) {
                System.out.println("Error: Unable to create output directory '" + outputDir.getPath() + "'.");
                return;
            }
        }
        if (outputDir != null && !outputDir.canWrite()) {
            System.out.println("Error: No write permission for output directory '" + outputDir.getPath() + "'.");
            return;
        }
        try(PrintWriter writer = new PrintWriter(outputFile))  {
            writer.println("Listing contents of: " + path);
            listDirectoryRecursively(dir, 0, writer);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Unable to create or write to file '" + outputFile + "'.");
            e.printStackTrace();
        }

    }

    public static void listDirectoryRecursively(File dir, int level, PrintWriter writer) {
        File[] files = dir.listFiles();
        if (files == null) {
            writer.println(getIndent(level) + "Error: Unable to access directory.");
            return;
        } else if (files.length == 0) {
            writer.println(getIndent(level) + "Directory is empty.");
            return;
        }
        Arrays.sort(files, Comparator.comparing(file -> file.getName().toLowerCase()));

        for (File file : files) {
            String type = file.isDirectory() ? "D" : "F";
            String lastModified = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date(file.lastModified()));
            writer.println(getIndent(level) + file.getName() + " (" + type + ") - Last modified: " + lastModified);
            if (file.isDirectory()) {
                listDirectoryRecursively(file, level + 1, writer);
            }
        }

    }

    private static String getIndent(int level) {
        return "  ".repeat(level);
    }
}
