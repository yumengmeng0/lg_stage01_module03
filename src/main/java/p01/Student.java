package p01;

import java.util.Objects;

/**
 * @author: ymm
 * @date: 2022/3/10
 * @version: 1.0.0
 * @description:
 */
public class Student {
    private int id; // 学号
    private String name; // 姓名

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            System.out.println("学号不合理！");
        } else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * 为了比较两个对象的内容，学号信息需要重写该方法
     */

//    @Override
//    public boolean equals(Object o) {
//        // 当调用对象和参数对象指向同一个对象时，则内容一定相同
//        if (this == o) {
//            return true;
//        }
//
//        // 当调用对象不为空，而参数为空时，则内容太一定不相同
//        if (o == null) {
//            return false;
//        }
//
//        // 判断o指向的对象是否为Student类型的对象
//        if (o instanceof Student) {
//            Student st = (Student) o;
//            return this.getId() == st.getId();
//        }
//        // 否则类型不一致，没有可比性，内容一定不同
//        return false;
//    }

    // 自动生成的equals和hashCode方法

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Student student = (Student) o;
//
//        if (id != student.id) return false;
//        return name != null ? name.equals(student.name) : student.name == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        return result;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    /**
     * 为了使得该方法的结果与equals方法的结果保持一致，
     * 从而满足Java官方的常规协定，需要重写该方法
     */
//    @Override
//    public int hashCode() {
////       return getId(); // 不再代表内存地址编号
//        final int type = 12;
//        return type * 31 + getId();
//    }

    /**
     * 为了返回更有意义的字符串，需要重写此方法
     * @return
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
