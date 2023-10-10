package org.launchcode.controllers;

import org.launchcode.models.User;
import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("")
    public String displayAddUserForm() {
        return "/user/add";
    }

    @PostMapping("")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
//        if (!user.getPassword().equals(verify)) {
//            return "/user/add";
//        }
//        model.addAttribute("user", user);
//
//        return "/user/index";
        if (!user.getPassword().equals(verify)) {
//            model.addAttribute("username", user.getUsername());
//            model.addAttribute("email", user.getEmail());
//            model.addAttribute("error", "Passwords do not match.");
            return "/user/add";
        }
//        UserData.add(user);
//        model.addAttribute("user", user);
//        model.addAttribute("users", UserData.getAll());
        return "/user/index";
    }
}
