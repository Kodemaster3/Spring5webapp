package ua.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.springframework.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
