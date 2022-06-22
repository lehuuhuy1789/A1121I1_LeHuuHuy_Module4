package codegym.vn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

        @GetMapping("/dictionary")
    public String dictionary(){
        return "index";
    }


    @PostMapping("/dictionary")
    public String vocabulary(@RequestParam(value = "dictionary")String vocabulary, Model model){
        switch (vocabulary){

            case "red":
                model.addAttribute("vocabulary","Do");
                break;
            case "yellow":
                model.addAttribute("vocabulary","Vang");
                break;
            case "blue":
                model.addAttribute("vocabulary","Xanh");
                break;
            default:
                model.addAttribute("message","Không thể tìm thấy kết quả");
        }
        return "index";
    }
}
