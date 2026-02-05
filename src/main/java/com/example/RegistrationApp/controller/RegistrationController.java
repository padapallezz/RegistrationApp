package com.example.RegistrationApp.controller;

import com.example.RegistrationApp.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showForm(Model model) {
        if (!model.containsAttribute("student")) {
            model.addAttribute("student", new Student());
        }
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("student") Student student,
                             RedirectAttributes redirectAttributes) {
        // In real app: add validation here (e.g. @Valid + BindingResult)

        // Pass data to confirmation via flash attribute (survives redirect)
        redirectAttributes.addFlashAttribute("student", student);

        return "redirect:/confirmation";
    }

    @GetMapping("/confirmation")
    public String showConfirmation() {
        return "confirmation";
    }
}