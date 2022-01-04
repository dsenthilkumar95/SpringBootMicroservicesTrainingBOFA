package com.improve.mvccontroller;

import com.improve.model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UIController {

    @GetMapping(path = "/")
    public String getIndex(Model model) {
        Category category = new Category(1,"Senthil");
        Category category1 = new Category(2,"Saro");
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category);
        categoryList.add(category1);
        model.addAttribute("categoryList", categoryList);
        return "index";
    }
}
