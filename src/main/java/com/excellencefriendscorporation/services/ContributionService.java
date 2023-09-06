package com.excellencefriendscorporation.services;

import com.excellencefriendscorporation.domains.Contribution;

import java.util.List;
import java.util.Optional;

public interface ContributionService {
    public List<Contribution> getContributionList();
    public boolean addContribution(Contribution contribution);

    public Optional<Contribution> getContributionById(Integer id);

    public void deleteContributionById(Integer id);

    public Contribution updateContributionById(Contribution contribution);
}
