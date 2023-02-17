package org.spring.gitjartest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EC2jarTest {
    @GetMapping("/test")
    public String test(){
        return "gitHub ec2 jar test";
    }
}
