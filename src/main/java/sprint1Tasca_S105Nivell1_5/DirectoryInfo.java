package sprint1Tasca_S105Nivell1_5;

import java.io.File;
import java.io.Serializable;
import java.lang.instrument.UnmodifiableModuleException;
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
public class DirectoryInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String type;
    private String lastModified;
    private List<DirectoryInfo> children; // For recursive structure

    public DirectoryInfo(String name, String type, String lastModified) {
        this.name = name;
        this.type = type;
        this.lastModified = lastModified;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLastModified() {
        return lastModified;
    }

    public List<DirectoryInfo> getChildren() {
        return Collections.unmodifiableList(children) ;
    }
    public void addChild(DirectoryInfo child) {
        children.add(child);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DirectoryInfo that = (DirectoryInfo) o;
        return Objects.equals(name, that.name) && Objects.equals(type, that.type) && Objects.equals(lastModified, that.lastModified) && Objects.equals(children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, lastModified, children);
    }

    @Override
    public String toString() {
        return name + " (" + type + ") - Last modified: " + lastModified;
    }
}
