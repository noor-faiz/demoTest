package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    // Handles the GET request to load the page
    @GetMapping("/")
    public String showForm(Model model) {
        // Send an empty User object to the template so the form has something to bind to
        model.addAttribute("user", new User());
        return "index";
    }

    // Handles the POST request when the form is submitted
    @PostMapping("/")
    public String submitForm(@ModelAttribute User user, Model model) {
        // The submitted data is bound to the 'user' object
        // We pass it back to the model to display a success message
        model.addAttribute("user", user);
        model.addAttribute("success", true);
        return "index";
    }
}