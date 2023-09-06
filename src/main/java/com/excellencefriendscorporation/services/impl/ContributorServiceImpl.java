package com.excellencefriendscorporation.services.impl;

import com.excellencefriendscorporation.domains.Contributor;
import com.excellencefriendscorporation.services.ContributorService;
import org.springframework.stereotype.Service;

@Service
public class ContributorServiceImpl implements ContributorService {
    @Override
    public String registerContributor(Contributor user) {
        //Dao Layer need to add here to store these data into DB!
        return "Success";
    }

}
