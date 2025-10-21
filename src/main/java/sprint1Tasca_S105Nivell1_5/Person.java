package sprint1Tasca_S105Nivell1_5;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * ClassName: DirectoryInfo
 * Package: spring1Tasca_S105Nivell1_5
 * Description:
 * Author: Rong Jiang
 * Create:12/10/2025 - 20:59
 * Version:v1.0
 */
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}



