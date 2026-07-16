package org.bluebridge.circulardependence.injectbyconstruction.singleton;

/**
 * Teacher 实体
 *
 * @author lingwh
 * @date 2026/7/13 10:07
 */
public class Teacher {

    private String name;
    private Student student;

    public String getName() {
        return name;
    }

    public Teacher(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", student=" + student.getName() +
                '}';
    }
}
