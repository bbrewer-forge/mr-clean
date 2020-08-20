package com.smartcolumbusos.mrclean;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WSDLController {

  @RequestMapping("/")
  public String index() {
    return "So fresh and so clean";
  }
}
