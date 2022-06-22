package codegym.vn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConversionController {
    @GetMapping("/currency")
    public String currency(){
        return "index";
    }

    @PostMapping("/currency")
    public String result(@RequestParam(value = "usd") int usd, Model model){
        model.addAttribute("result",usd*23000);
        model.addAttribute("usd",usd);
        return "index";
    }
}
