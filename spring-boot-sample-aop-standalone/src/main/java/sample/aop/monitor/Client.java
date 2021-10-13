package sample.aop.monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client implements IRun, IClient {

    @Autowired
    IFastLine iFastLine;
    @Autowired
    ILane iLane;
    @Autowired
    IJustHaveALook iJustHaveALook;

    @Override
    public void run() {
   System.out.println("Hello from Client \n /////////////////////////////////////");
    }
    @Override
    public  String hello(){return "helloworld";}
}
