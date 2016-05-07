package ym.test;

/**
 * Created by jiangyongming on 5/3/16.
 */
public class TestService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println("hello"+name);
    }
}
