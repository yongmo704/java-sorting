package src.main.java.com.xml;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToBean {

    /**
     * xml文件配置转换为对象
     * @param load    java对象.Class
     * @return    java对象
     * @throws JAXBException
     * @throws IOException
     */
    public static Object xmlToBean(String xmlString,Class<?> load) throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(load);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object object = unmarshaller.unmarshal(new StringReader(xmlString));
        return object;
    }

    public static void main(String[] args) throws IOException, JAXBException {
        String xmlString = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?><list><student name=\"张三\" number=\"10001\" sex=\"男\"><className>尖子班</className><hobbys><hobby>篮球</hobby><hobby>音乐</hobby><hobby>乒乓球</hobby></hobbys></student><student name=\"李四\" number=\"10002\" sex=\"男\"><className>普通班</className><hobbys><hobby>篮球</hobby><hobby>音乐</hobby><hobby>乒乓球</hobby></hobbys></student><student name=\"莉莉\" number=\"10003\" sex=\"女\"><className>普通班</className><hobbys><hobby>篮球</hobby><hobby>音乐</hobby><hobby>乒乓球</hobby></hobbys></student></list>";
        Object object = XmlToBean.xmlToBean(xmlString,StudentList.class);
        StudentList students = (StudentList)object;
        List<Student> studentList = students.getStudents();

        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i).name);
            System.out.println(studentList.get(i).sex);
            System.out.println(studentList.get(i).number);
            System.out.println(studentList.get(i).className);
            for(String str :studentList.get(i).hobby){
                System.out.print(str+" ");
            }
            System.out.println("-------------");
        }
    }
}
