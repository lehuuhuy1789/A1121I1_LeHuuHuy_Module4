package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CaculatorController {
    @GetMapping("/caculator")
    public String caculator(){
        return "index";
    }

    @PostMapping("/caculator")
    public String result(@RequestParam(value ="match") String result, @RequestParam(value="caculator1") int x1,
                         @RequestParam(value="caculator2") int x2, Model model){
        switch (result){
            case "+":
                model.addAttribute("result",x1+x2);
                break;
            case "-":
                model.addAttribute("result",x1-x2);
                break;
            case "*":
                model.addAttribute("result",x1*x2);
                break;
            case "/":
                if(x2==0){
                    model.addAttribute("message","Khong the thuc hien phep tinh");
                }else{
                    model.addAttribute("result",x1/x2);
                }
                break;
        }
        return "index";
    }
}
