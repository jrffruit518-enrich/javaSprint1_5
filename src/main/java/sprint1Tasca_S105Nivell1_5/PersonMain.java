package sprint1Tasca_S105Nivell1_5;

import java.io.*;

/**
 * ClassName: PersonMain
 * Package: sprint1Tasca_S105Nivell1_5
 * Description:
 * Author: Rong Jiang
 * Create:21/10/2025 - 20:00
 * Version:v1.0
 */
public class PersonMain {
    public static void main(String[] args) {
        String filename = "output/person.ser";
        Person person = new Person("Rong", 47 );
        serializeObject(person,filename);
        Person deserializePerson = (Person) deserializeObject(filename);
        System.out.println(deserializePerson);


    }

    private static void serializeObject(Object obj, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(obj);
            System.out.println("Object successfully serialized to " + filename);
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }

    private static Object deserializeObject(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
            return null;
        }
    }
}
