package com.example.coreidentifier.controller;

import com.example.coreidentifier.model.PreSignRequest;
import com.example.coreidentifier.model.PreSignResponse;
import com.example.coreidentifier.model.WebHookRequest;
import com.example.coreidentifier.model.WebHookResponse;
import com.example.coreidentifier.service.PreSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PreSignController {

    @Autowired
    private PreSignService presignService;

    @PostMapping("/presign")
    public PreSignResponse presign(@RequestBody PreSignRequest request) {
        return presignService.getPresignedUrl(request);
    }

    @PostMapping("/webhook")
    public WebHookResponse webhook(@RequestBody WebHookRequest request) {
        boolean success = presignService.handleWebhook(request);
        return new WebHookResponse(success ? "success" : "failure");
    }
}
