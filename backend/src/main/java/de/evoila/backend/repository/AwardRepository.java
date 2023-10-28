package de.evoila.backend.repository;

import de.evoila.backend.model.other.Award;
import org.springframework.data.repository.CrudRepository;

public interface AwardRepository extends CrudRepository<Award, Long> {
}
