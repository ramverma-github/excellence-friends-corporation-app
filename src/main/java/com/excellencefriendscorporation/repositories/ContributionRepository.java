package com.excellencefriendscorporation.repositories;

import com.excellencefriendscorporation.domains.Contribution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContributionRepository extends JpaRepository<Contribution, Integer> {
}
