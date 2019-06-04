package designPattern.decorator.old;

public interface ISiginService {
     ResultMsg regist(String username, String password);
     ResultMsg login(String username, String password);
}
