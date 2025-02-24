package kz.enu.rest.hospitalmanagement.controller;

import kz.enu.rest.hospitalmanagement.model.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private List<Doctor> doctors = new ArrayList<>();

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    @PostMapping
    public void addDoctor(@RequestBody Doctor doctor) {
        doctors.add(doctor);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable int id) {
        doctors.removeIf(d -> d.getId() == id);
    }
}
