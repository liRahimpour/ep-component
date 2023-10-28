package de.evoila.backend.repository;

import de.evoila.backend.model.basicinfo.SocialNetwork;
import org.springframework.data.repository.CrudRepository;

public interface SocialNetworkRepository extends CrudRepository<SocialNetwork, Long> {
}
