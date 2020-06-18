package nl.ycolfield.voordoen.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.ycolfield.voordoen.model.Tafel;

@Component
public interface TafelRepository extends CrudRepository<Tafel, Long> {

}
