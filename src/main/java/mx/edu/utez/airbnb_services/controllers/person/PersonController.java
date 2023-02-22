package mx.edu.utez.airbnb_services.controllers.person;

import mx.edu.utez.airbnb_services.services.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-airbnb/person/")
@CrossOrigin(origins = {"*"})
public class PersonController {
    @Autowired
    private PersonService service;
}
