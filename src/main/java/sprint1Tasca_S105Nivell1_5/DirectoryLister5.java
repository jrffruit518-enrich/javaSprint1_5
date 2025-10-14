package spring1Tasca_S105Nivell1_5;

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
public class DirectoryLister5 {
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
        Arrays.sort(files, new Comparator<File>() {
            @Override
            public int compare(File file1, File file2) {
                return file1.getName().compareTo(file2.getName());
            }
        });
        for (File file : files) {
            String type = file.isDirectory() ? "D" : "F";
            String lastModified = new SimpleDateFormat("dd-MM-yyyyy HH:mm:ss").format(new Date(file.lastModified()));
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
    private static DirectoryInfo buildDirectoryInfo(File dir) {
        String type = dir.isDirectory()?"D":"F";
        String lastModified = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date(dir.lastModified()));
        DirectoryInfo info = new DirectoryInfo(dir.getName(),type,lastModified);
        File[] files = dir.listFiles();
        if (files!=null) {
            Arrays.sort(files, new Comparator<File>() {
                @Override
                public int compare(File file1, File file2) {
                    return file1.getName().compareTo(file2.getName());
                }
            });
            for (File file: files) {
                info.addChild(buildDirectoryInfo(file));
            }
        }return info;
    }

    public static void serializeDirectory(String path, String serFile) {
        File dir = new File(path);
        if (!dir.exists()||!dir.isDirectory()) {
            System.out.println("Error: The path '" + path + "' is invalid or not a directory.");
            return;
        }
        DirectoryInfo info = buildDirectoryInfo(dir);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFile));) {
            oos.writeObject(info);
            System.out.println("Serialization successful: Object saved to '" + serFile + "'.");
        } catch (IOException e) {
            System.out.println("Error: Unable to serialize to file '" + serFile + "'.");
            e.printStackTrace();
        }
    }
    public static void  printDirectoryInfo(DirectoryInfo dirInfo, int level) {
        System.out.println(getIndent(level) + dirInfo);
        for (DirectoryInfo child: dirInfo.getChildren()) {
            printDirectoryInfo(child,level+1);
        }
    }
    public static void deserializeAndPrint(String serFile) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFile))) {
            DirectoryInfo directoryInfo = (DirectoryInfo) (ois.readObject());
            System.out.println("Deserialization successful: Object read from '" + serFile + "'.");
            printDirectoryInfo(directoryInfo,0);
        }catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + serFile + "' does not exist.");
            e.printStackTrace();}
        catch (IOException e) {
            System.out.println("Error: Unable to read or deserialize file '" + serFile + "'.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Class definition not found.");
            e.printStackTrace();
        }

    }
}

