package mx.edu.utez.airbnb_services.services.person;

import mx.edu.utez.airbnb_services.models.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PersonService {
    @Autowired
    private PersonRepository repository;
}
