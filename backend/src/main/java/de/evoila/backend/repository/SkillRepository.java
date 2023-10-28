package de.evoila.backend.repository;

import de.evoila.backend.model.skill.Skill;
import org.springframework.data.repository.CrudRepository;

public interface SkillRepository extends CrudRepository<Skill, Long> {
}
