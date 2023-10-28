package de.evoila.backend.repository;

import de.evoila.backend.model.basicinfo.Contacts;
import org.springframework.data.repository.CrudRepository;

public interface ContactsRepository extends CrudRepository<Contacts, Long> {
}
