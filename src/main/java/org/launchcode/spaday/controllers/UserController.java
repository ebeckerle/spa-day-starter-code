package org.launchcode.spaday.controllers;

import org.launchcode.spaday.data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping
    public String displayAllEvents(Model model){
        model.addAttribute("title", "All Events");
        model.addAttribute("users", UserData.getAll());
        return "user/index";
    }

    @GetMapping("add")
    public String displayAddUserForm(Model model){
        model.addAttribute("title", "Add a User");
        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User newUser, String verify){
//        model.addAttribute("user", user);
        model.addAttribute("verify", verify);
//        model.addAttribute("username", user.getUsername());
//        model.addAttribute("email", user.getEmail());
//        model.addAttribute("password", user.getPassword());
//        UserData.add(newUser);

        model.addAttribute("error", "Error: Passwords need to Match.");
        if(newUser.getPassword().equals(verify)){
            UserData.add(newUser);
            return "redirect:";
        }
        return "user/add";
    }

    @GetMapping("details")
    public String displayDetails(Model model){
//        User displayUser = UserData.getById(id);
//        model.addAttribute("username", displayUser.getUsername());
        return "user/details";
    }

    @PostMapping("details")
    public String processRequestForDetails(@RequestParam Integer id,  Model model){
        User displayUser = UserData.getById(id);
        model.addAttribute("username", displayUser.getUsername());
        model.addAttribute("email", displayUser.getEmail());
        model.addAttribute("dateJoined", displayUser.getDateJoined());
        return "user/details";
    }
}
