package mx.edu.utez.airbnb_services.controllers.rent;

import mx.edu.utez.airbnb_services.services.rent.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-airbnb/rent/")
@CrossOrigin(origins = {"*"})
public class RentController {
    @Autowired
    private RentService service;
}
