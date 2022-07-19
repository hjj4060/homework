package com.intersella.homework.controller;

import com.intersella.homework.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeworkController {

    private HomeworkService homeworkService;

    @Autowired
    public HomeworkController(HomeworkService homeworkService) {
        this.homeworkService = homeworkService;
    }

    @GetMapping("homework2")
    public String homework2() {
        return "homework2";
    }

    @PostMapping("homework2/calculation")
    public String cal(HomeworkForm form, Model model) {
        model.addAttribute("result", homeworkService.calculation(form));
        return "homework2";
    }
}
