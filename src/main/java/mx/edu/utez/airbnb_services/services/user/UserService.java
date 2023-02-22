package mx.edu.utez.airbnb_services.services.user;

import mx.edu.utez.airbnb_services.models.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository repository;
}
