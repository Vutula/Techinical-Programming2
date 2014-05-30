/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sandisiwe.clinicmanagementsystem.test.restapi;

import com.sandisiwe.clinicmanagementsystem.domain.Administrator;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

/**
 *
 * @author sandisiwe
 */
public class AdministratorRestControllerTest {
     private RestTemplate restTemplate;
    private final static String URL = "http://localhost:8084/askweb/";
    
     @Test
    public void tesCreate(){
        Administrator a =null;
        //HttpEntity<Administrator> requestEntity = new HttpEntity<>(a, getContentType());
//        Make the HTTP POST request, marshaling the request to JSON, and the response to a String
        //ResponseEntity<String> responseEntity = restTemplate.
                //exchange(URL+"api/person/create", HttpMethod.POST, requestEntity, String.class);

     
        
    }
    
    public void testRead(){
       // HttpEntity<?> requestEntity = getHttpEntity();
       // ResponseEntity<Person[]> responseEntity = restTemplate.exchange("URL",HttpMethod.GET,requestEntity, Person[].class);
        
       // Person [] people = responseEntity.getBody();
        //for (Person person : people) {
            
            
        }
       
    
}
