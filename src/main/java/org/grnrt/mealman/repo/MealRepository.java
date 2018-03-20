package org.grnrt.mealman.repo;

import org.grnrt.mealman.model.Meal;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "meal", path = "meal")
public interface MealRepository extends PagingAndSortingRepository<Meal, Long> {
	List<Meal> findByDate(@Param("date") Date date);
}

