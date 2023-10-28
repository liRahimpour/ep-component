package de.evoila.backend.repository;

import de.evoila.backend.model.basicinfo.BasicInfo;
import org.springframework.data.repository.CrudRepository;

public interface BasicInfoRepository extends CrudRepository<BasicInfo, Long> {
}
