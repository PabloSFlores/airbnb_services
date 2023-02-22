package mx.edu.utez.airbnb_services.services.rent;

import mx.edu.utez.airbnb_services.models.rent.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RentService {
    @Autowired
    private RentRepository repository;
}
