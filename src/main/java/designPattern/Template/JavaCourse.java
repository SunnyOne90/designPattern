package designPattern.Template;

/**
 * 具体的课程实现
 */
public class JavaCourse extends NetworkCourse{

    private boolean needHomeworkFlag = false;

    public JavaCourse(boolean needHomeworkFlag){
        this.needHomeworkFlag = needHomeworkFlag;
    }
    //是否检查作业由具体的子类实现
    @Override
    void checkHomework() {
        System.out.println("检查java课后作业");
    }
    //覆盖父类的needHomework()方法，对模板中的流程进行微调
    protected boolean needHomework(){
        return needHomeworkFlag;
    }
}
