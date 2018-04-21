package helloWorld;

/**
 * Created by yek on 2016/9/1.
 */
public class HelloWorld {
    private String userName;
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void hello(){
        System.out.println("Hello: " + userName);
    }
}
