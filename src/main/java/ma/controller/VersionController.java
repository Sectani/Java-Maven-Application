package ma.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class VersionController {
    @GetMapping
    public ResponseEntity<String> versionTeller(){
        return ResponseEntity.ok("Version 1 of this application running via Kubernetes");
    }
}
