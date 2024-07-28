package tech.devops.springboot_kubernetes.controller;


import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/app/k8s")
public class StatusController {

  @Value ("${spring.instance.instanceId}")
  private String instanceId;

  @GetMapping("/status")
  public ResponseEntity<Map<String,String>> getStatus(){
    log.info("Status call triggered at:: {},apiVersion: {}",new Date (),"v5");
    return ResponseEntity.ok (Map.of("status", HttpStatus.OK.name (),"version","v5","instanceId",instanceId));
  }
}
