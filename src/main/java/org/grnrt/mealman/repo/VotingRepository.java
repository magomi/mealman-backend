package org.grnrt.mealman.repo;

import org.grnrt.mealman.model.Meal;
import org.grnrt.mealman.model.Person;
import org.grnrt.mealman.model.Voting;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "voting", path = "voting")
public interface VotingRepository extends PagingAndSortingRepository<Voting, Long> {
	List<Voting> findByMeal(@Param("meal") Meal meal);
}

