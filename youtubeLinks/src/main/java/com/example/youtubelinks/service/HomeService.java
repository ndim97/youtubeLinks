package com.example.youtubelinks.service;

import com.example.youtubelinks.dto.HomeDTO;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public HomeDTO sendLink(String link){
        HomeDTO homeDTO = new HomeDTO();
        homeDTO.setYoutubeLink(link);

        return homeDTO;
    }
}
