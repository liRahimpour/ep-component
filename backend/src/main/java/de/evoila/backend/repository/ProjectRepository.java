package de.evoila.backend.repository;

import de.evoila.backend.model.project.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
