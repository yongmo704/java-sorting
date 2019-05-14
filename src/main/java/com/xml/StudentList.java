package src.main.java.com.xml;

/**
 * Created by caowei on 2019/3/1.
 */
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="studentList")
public class StudentList {

    List<Student> students;    //所有学生信息的集合

    @XmlElement(name = "student")
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
