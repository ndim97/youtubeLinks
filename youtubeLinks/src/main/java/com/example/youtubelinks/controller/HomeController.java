package com.example.youtubelinks.controller;

import com.example.youtubelinks.dto.HomeDTO;
import com.example.youtubelinks.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController{

    private final HomeService homeService;

    @Autowired
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/")
    public ModelAndView index(){
        return send("index.html");
    }

    @PostMapping("/")
    public ModelAndView toVideoPage(@RequestParam("youtubeLink") String link, HomeDTO homedto){
        homedto = homeService.sendLink(link);
        return send("youtubeVideo", "videoObj", homedto);
    }


}
