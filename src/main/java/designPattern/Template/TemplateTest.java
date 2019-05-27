package designPattern.Template;

public class TemplateTest {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse(true);
        javaCourse.createCourse();
        BigDataCourse bigDataCourse = new BigDataCourse();
        bigDataCourse.createCourse();
    }

}
