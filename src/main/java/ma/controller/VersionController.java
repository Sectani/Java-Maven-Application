package ma.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class VersionController {
    @GetMapping
    public ResponseEntity<String> versionTeller(){
        return ResponseEntity.ok("Version 2 of this application running via Kubernetes");
    }
}
