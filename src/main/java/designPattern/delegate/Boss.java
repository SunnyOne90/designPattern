package designPattern.delegate;

/**
 * bos对leader下达任务
 */
public class Boss {
    public void command(String command ,Leader leader){
        leader.doing(command);
    }
}
