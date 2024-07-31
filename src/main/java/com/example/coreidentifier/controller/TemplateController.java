package com.example.coreidentifier.controller;


import com.example.coreidentifier.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TemplateController {

    @Autowired
    private TemplateService templateService;

    @GetMapping("/template/{templateId}")
    public String getTemplateUrl(@PathVariable String templateId) {
        return templateService.fetchAndStoreTemplate(templateId);
    }

}
