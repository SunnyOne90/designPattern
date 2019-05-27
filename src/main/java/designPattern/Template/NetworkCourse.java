package designPattern.Template;

/**
 * 模板会有一个或者多个未实现的方法
 * 而且这几个未实现方法有固定的执行顺序
 */
public abstract class NetworkCourse {

    protected final void createCourse(){
        //分发预习资料
        this.postPreResource();
        //2、制作PPT 课件
        this.createPPT();
        ////3、在线直播
        this.liveVideo();
        //4、提交课件、课堂笔记
        this.postNote();
        //5、提交源码
        this.postSource();
        if(needHomework()){
            checkHomework();
        }
    }
    //钩子方法：实现流程的微调，通过子类重写对执行流程进行微调
    protected boolean needHomework(){return false;}

    //因为有的课程有作业，就需要老师检查作业，所以定义为抽象的交给子类实现
    abstract void checkHomework();

    protected final void postSource(){
        System.out.println("提交代码");
    }


    protected final void postNote(){
        System.out.println("提交上课资料");
    }

    protected final void liveVideo(){
        System.out.println("在线直播课程");
    }

    protected final void  createPPT(){
        System.out.println("制作PPT");
    }

    protected final void postPreResource(){
        System.out.println("分发预习资料");
    }
}
