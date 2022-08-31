package example.logback.logbackTest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockService {
    Logger logger = LoggerFactory.getLogger(MockService.class);

    @GetMapping
    public String saySomething(){
        logger.info("this is saySomething logger!!");
        return "Hi";
    }
}
