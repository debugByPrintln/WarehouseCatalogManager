package com.melnikov.warehousecatalogmanager.controllers;

import com.melnikov.warehousecatalogmanager.entities.Content;
import com.melnikov.warehousecatalogmanager.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/")
    public String showAllContent(Model model){
        List<Content> allContent = contentService.getAllContent();

        model.addAttribute("allContent", allContent);

        return "all-content";
    }

    @RequestMapping("/addNewContent")
    public String addNewContent(Model model){
        Content content = new Content();

        model.addAttribute("content", content);

        return "content-info";
    }

    @RequestMapping("/addContent")
    public String saveContent(@ModelAttribute("content") Content content){
        contentService.saveOrUpdateContent(content);

        return "redirect:/";
    }

    @RequestMapping("/updateContent")
    public String updateContent(@RequestParam("contentId") int id, Model model){
        Content contentById = contentService.getContentById(id);

        model.addAttribute("content", contentById);

        return "content-info";
    }

    @RequestMapping("/deleteContent")
    public String deleteContent(@RequestParam("contentId") int id){
        contentService.deleteContentById(id);

        return "redirect:/";
    }
}
