package designPattern.observer;

public class ObserverTest {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher tom = new Teacher("tom");
        gPer.addObserver(tom);

        Question question = new Question();
        question.setContent("观察者模式适用于哪些场景？");
        question.setUserName("小明");
        gPer.publishQuestion(question);
    }
}
