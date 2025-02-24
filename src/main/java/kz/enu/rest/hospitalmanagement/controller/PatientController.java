package kz.enu.rest.hospitalmanagement.controller;

import kz.enu.rest.hospitalmanagement.model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private List<Patient> patients = new ArrayList<>();

    @GetMapping
    public List<Patient> getAllPatients() {
        return patients;
    }

    @PostMapping
    public void addPatient(@RequestBody Patient patient) {
        patients.add(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable int id) {
        patients.removeIf(p -> p.getId() == id);
    }
}
