package com.example.coreidentifier.service;

import com.example.coreidentifier.model.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class TemplateService {
    @Autowired
    private RestTemplate restTemplate;

    private static final Map<String, Template> templateStore = new HashMap<>();

    public String fetchAndStoreTemplate(String templateId) {
        String url = "http://localhost:8081/api/v1/template/" + templateId;
        Template template = restTemplate.getForObject(url, Template.class);
        if (template != null) {
            templateStore.put(templateId, template);
            return "http://example.com/" + templateId;
        } else {
            throw new RuntimeException("Template not found for: " + templateId);
        }
    }
}
