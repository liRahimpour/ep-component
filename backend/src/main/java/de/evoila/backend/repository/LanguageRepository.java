package de.evoila.backend.repository;

import de.evoila.backend.model.skill.Language;
import org.springframework.data.repository.CrudRepository;

public interface LanguageRepository extends CrudRepository<Language, Long> {
}
