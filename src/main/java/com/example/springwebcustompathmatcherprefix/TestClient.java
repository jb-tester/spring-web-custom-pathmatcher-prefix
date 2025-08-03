package com.example.springwebcustompathmatcherprefix;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class TestClient {
    public void test1(){
        RestClient client = RestClient.create();

        String test1Url = "http://localhost:8080/foo/test1";
        String result = client.get()
                .uri(test1Url) // nothing in Endpoints
                .retrieve()
                .body(String.class);
        System.out.println("===== Trying /foo/test1: \n it returns \"" + result + "\"");

    }
}
