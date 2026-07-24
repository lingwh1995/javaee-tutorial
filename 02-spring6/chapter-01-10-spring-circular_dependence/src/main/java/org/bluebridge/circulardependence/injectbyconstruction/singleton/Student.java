package org.bluebridge.circulardependence.injectbyconstruction.singleton;

/**
 * Student 实体
 *
 * @author lingwh
 * @date 2026/1/10 10:07
 */
public class Student {

    private String name;
    private Teacher teacher;

    public String getName() {
        return name;
    }

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher.getName() +
                '}';
    }
}
