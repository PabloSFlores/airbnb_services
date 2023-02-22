package mx.edu.utez.airbnb_services.controllers.user;

import mx.edu.utez.airbnb_services.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-airbnb/user/")
@CrossOrigin(origins = {"*"})
public class UserController {
    @Autowired
    private UserService service;
}
