package mx.edu.utez.airbnb_services.services.department;

import mx.edu.utez.airbnb_services.models.department.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DepartmentService {
    @Autowired
    private DepartmentRepository repository;
}
