package com.excellencefriendscorporation.controllers;

import com.excellencefriendscorporation.domains.Contributor;
import com.excellencefriendscorporation.services.ContributorService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ContributorController {

    @Autowired
    private ContributorService contributorService;

    @PostMapping("/contributor")
    public String registerContributor(@RequestBody String contributor){
        System.out.println(contributor);
        Gson gson = new Gson();
        Contributor contributorPerson = gson.fromJson(contributor, Contributor.class);
        String successMsg = contributorService.registerContributor(contributorPerson);
        return successMsg;
    }

  /*  @PutMapping("/contributor/{id}")
    public Contribution updateContributor(@RequestBody String contributor){
        System.out.println(contributor);
        Gson gson = new Gson();
        Contribution user = gson.fromJson(contributor, Contribution.class);
        return user;
    }

    @GetMapping("/contributor/{id}")
    public Contribution getContributor(@RequestBody String contributor){
        System.out.println(contributor);
        Gson gson = new Gson();
        Contribution user = gson.fromJson(contributor, Contribution.class);
        return user;
    }

    @DeleteMapping("/contributor/{id}")
    public Contribution deleteContributor(@RequestBody String contributor){
        System.out.println(contributor);
        Gson gson = new Gson();
        Contribution user = gson.fromJson(contributor, Contribution.class);
        return user;
    }*/
}
