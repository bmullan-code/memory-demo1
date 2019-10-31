package bm.memorydemo;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class HelloWorldController {
	

    @RequestMapping("/memory1")
    public String helloWorld(){
    	try {
    	    Thread.sleep(50);
    	} catch (InterruptedException ie) {
    	    Thread.currentThread().interrupt();
    	}
        return "Hello world";
    }
    
    @RequestMapping("/memory1/vars")
    public void helloWorldvars(){
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }
    }

}

