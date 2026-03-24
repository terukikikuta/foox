package com.foox.backend.Contoroller;

import org.springframework.web.bind.annotation.RestController;

import com.foox.backend.Dto.LoginUserDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class LoginContoroller {
    @RequestMapping("/login")
    public ResponseEntity<String> postMethodName(@RequestBody LoginUserDto loginUserDto) {

        String userName = loginUserDto.getUserName();
        String passWord = loginUserDto.getPassWord();


        if ("username".equals(userName) && "password".equals(passWord)) {
            return ResponseEntity.ok("ログイン成功");
        } else {
            return ResponseEntity.ok("ログイン失敗");
        }

    }
}
