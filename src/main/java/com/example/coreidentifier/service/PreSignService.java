package com.example.coreidentifier.service;

import com.example.coreidentifier.model.PreSignRequest;
import com.example.coreidentifier.model.PreSignResponse;
import com.example.coreidentifier.model.WebHookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PreSignService {

    @Autowired
    private RestTemplate restTemplate;

    public PreSignResponse getPresignedUrl(PreSignRequest request) {
        String url = "http://localhost:8081/api/v1/presign";
        return restTemplate.postForObject(url, request, PreSignResponse.class);
    }

    public boolean handleWebhook(WebHookRequest request) {
        boolean isSuccess = request.isSuccess();
        return isSuccess;
    }
}
