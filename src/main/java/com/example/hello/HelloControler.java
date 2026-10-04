package com.example.hello;
import org.springframework.web.bind.annotation.*;

import java.util.Random;


@RestController
public class HelloControler {
    @GetMapping("/signup")
    public String signup(){
        return "欢迎访问控制中心";
    }

    @GetMapping("/check/{cargo}")
    public String check(@PathVariable String cargo){
        return "正在运行射控系统自检" + "\n" + "载荷：" + cargo + "已就绪";
    }

    @GetMapping("/launch")
    public String Launch(){
        String t = "";
        for(int i =10 ; i > 0 ; i--){
            t += String.valueOf(i) + "\n";
        }
        return t + "点火";
    }

    @GetMapping("/condition")
    public String condition(){
        int p = new Random().nextInt(100);
        if (p >30){
            return "发射成功，载荷已进入预定轨道。";
        }else{
            return "发射失败";
        }
    }
    
}