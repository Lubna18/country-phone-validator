package com.jumia.country.controller;

import com.jumia.country.model.Phone;
import com.jumia.country.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PageController {

    @Autowired
    PhoneService phoneService;

    @GetMapping("/")
    public String index(Model model) {

        List<Phone> phones =phoneService.validatePhoneNumbers();
        model.addAttribute("phones", phones);
        return "index";
    }
}
