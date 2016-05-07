package ym.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import ym.model.PoetsModel;
import ym.service.PoetService;

import java.util.List;

/**
 * Created by jiangyongming on 5/3/16.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/spring-config.xml");
        TestService testService = (TestService) ac.getBean("test");
        testService.hello();

        PoetService poetService = (PoetService)ac.getBean("poetService");
        List<PoetsModel> poetsModels =  poetService.getPoet("李世民");
        System.out.println(poetsModels.size());

    }
}
