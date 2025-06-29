package cicdplatform.javamavenapplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingController {
    @GetMapping
    public ResponseEntity<String> greet(){
        return ResponseEntity.ok("Hello from this Java Maven Application version 1");
    }
}
