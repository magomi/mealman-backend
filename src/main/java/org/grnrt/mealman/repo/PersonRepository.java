package org.grnrt.mealman.repo;

import org.grnrt.mealman.model.Meal;
import org.grnrt.mealman.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
	List<Meal> findByName(@Param("name") String name);
}

