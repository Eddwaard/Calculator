package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String hello(){
        return "hello!";
    }

    public String answerHello( String userName){
        return "hello!" + userName;
    }
}
