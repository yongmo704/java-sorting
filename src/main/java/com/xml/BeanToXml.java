package src.main.java.com.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by caowei on 2019/3/1.
 */
public class BeanToXml {

    /**
     * java对象转换为xml文件
     * @param load    java对象.Class
     * @return    xml文件的String
     * @throws JAXBException
     */
    public static String beanToXml(Object obj,Class<?> load) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(load);
        Marshaller marshaller = context.createMarshaller();
        //marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
        StringWriter writer = new StringWriter();
        marshaller.marshal(obj,writer);
        return writer.toString();
    }
    public static void main(String[] args) throws JAXBException {
        List<String> hobby = new ArrayList<>();
        hobby.add("篮球");
        hobby.add("音乐");
        hobby.add("乒乓球");

        List<Student> studentList = new ArrayList<>();

        Student st = new Student("张三","男",10001,"尖子班",hobby);
        studentList.add(st);
        Student st1 = new Student("李四","男",10002,"普通班",hobby);
        studentList.add(st1);
        Student st2 = new Student("莉莉","女",10003,"普通班",hobby);
        studentList.add(st2);

        StudentList students = new StudentList();
        students.setStudents(studentList);
        String str =  BeanToXml.beanToXml(students, StudentList.class);
        System.out.println(str);

    }
}
