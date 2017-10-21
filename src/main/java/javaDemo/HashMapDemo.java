package main.java.javaDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * User: chanson-pro
 * Date-Time: 2017-10-15 18:46
 * Description:
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();
        map.put(new Student("tom",12),"汤姆");
        map.put(new Student("mary",22),"玛丽");
        map.put(new Student("jack",13),"马云");
        map.put(new Student("jack",13),"马云2");
        System.out.println(map.size());
        Set<Map.Entry<Student,String>> entrySet = map.entrySet();
        for (Map.Entry entry:entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue() + "####");
        }
    }

}
class Student{
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
