package org.grnrt.mealman.repo;

import org.grnrt.mealman.model.Receipe;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "receipe", path = "receipe")
public interface ReceipeRepository extends PagingAndSortingRepository<Receipe, Long> {
	List<Receipe> findByName(@Param("name") String name);
}

