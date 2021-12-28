package com.example.transaction.web;

import com.example.transaction.servises.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("ova")
public class CintrollerMy {

    private final UserService userService;

    @PutMapping("add")
    public ResponseEntity<String> addUser(@RequestParam String id) {
        userService.tester(Integer.valueOf(id));

        return ResponseEntity.ok("Success!!");
    }

}
