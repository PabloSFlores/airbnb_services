package mx.edu.utez.airbnb_services.controllers.department;

import mx.edu.utez.airbnb_services.services.department.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-airbnb/department/")
@CrossOrigin(origins = {"*"})
public class DepartmentController {
    @Autowired
    private DepartmentService service;
}
