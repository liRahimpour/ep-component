package de.evoila.backend.repository;

import de.evoila.backend.model.other.Research;
import org.springframework.data.repository.CrudRepository;

public interface ResearchRepository extends CrudRepository<Research, Long> {
}
