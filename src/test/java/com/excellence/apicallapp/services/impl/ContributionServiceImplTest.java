package com.excellence.apicallapp.services.impl;

import com.excellencefriendscorporation.domains.Contribution;
import com.excellencefriendscorporation.repositories.ContributionRepository;
import com.excellencefriendscorporation.services.impl.ContributionServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ContributionServiceImplTest {
    @Mock
    private ContributionRepository repository;

    @Test
    public void test_getContributionList() {
        List<Contribution> contributionsList = new ArrayList<>();
        contributionsList.add(new Contribution(1,65454.66,null));

        when(repository.findAll()).thenReturn(contributionsList);

        ContributionServiceImpl contributionService = new ContributionServiceImpl();
        List<Contribution> resultList = contributionService.getContributionList();

        assertEquals(1, resultList.get(0).getId());
    }
}
