package sprint1Tasca_S105Nivell1_4;

import java.io.*;
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
public class DirectoryLister4 {
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
        try (PrintWriter writer = new PrintWriter(outputFile)) {
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

    public static void readTxtFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Error: The file '" + filePath + "' does not exist.");
            return;
        }
        if (!file.isFile()) {
            System.out.println("Error: The path '" + filePath + "' is not a file.");
            return;
        }
        if (!file.canRead()) {
            System.out.println("Error: The file '" + filePath + "' is not readable.");
            return;
        }
        if (!filePath.toLowerCase().endsWith(".txt")) {
            System.out.println("Warning: The file '" + filePath + "' may not be a TXT file.");
        }
        try (BufferedReader bf = new BufferedReader(new FileReader(file));) {
            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Unable to open file '" + filePath + "'.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error: Unable to read file '" + filePath + "': " + e.getMessage());
            e.printStackTrace();
        }

    }
}

