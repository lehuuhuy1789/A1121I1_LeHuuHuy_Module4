package codegym.vn.controller;

import codegym.vn.entity.MailBox;
import codegym.vn.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequestMapping("/email")
public class MailBoxController {
    @Autowired
    private IEmailService emailService;


    @GetMapping("/list")
    public String email(Model model){
        List<MailBox> emailList = emailService.showAll();
        model.addAttribute("emails", emailList);
        return "list";
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id, ModelMap model) {
        model.addAttribute("email", emailService.findById(id));
        String[] language ={"English","Vietnamese","Japanese","Chinese"};
        Integer[] page = {5,10,15,25,50,100};
        model.addAttribute("page",page);
        model.addAttribute("language",language);
        return "edit";
    }

    @PostMapping("/edit")
    public String submit(@ModelAttribute("email") MailBox email, RedirectAttributes redirectAttributes) {
        emailService.update(email);
        redirectAttributes.addFlashAttribute("mess", "Update email successfully");
        return "redirect:/email/list";
    }
}
