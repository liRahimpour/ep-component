package de.evoila.backend.repository;

import de.evoila.backend.model.skill.Certificate;
import org.springframework.data.repository.CrudRepository;

public interface CertificateRepository extends CrudRepository<Certificate, Long> {
}
