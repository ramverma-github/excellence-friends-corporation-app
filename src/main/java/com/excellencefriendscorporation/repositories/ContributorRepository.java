package com.excellencefriendscorporation.repositories;

import com.excellencefriendscorporation.domains.Contributor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContributorRepository extends JpaRepository<Contributor, Integer> {
}
