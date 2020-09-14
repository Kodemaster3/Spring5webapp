package ua.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.springframework.spring5webapp.domain.Publisher;

import java.util.concurrent.Flow;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
