package kz.enu.rest.hospitalmanagement.controller;

import kz.enu.rest.hospitalmanagement.model.Hospital;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hospitals")
public class HospitalController {

    private List<Hospital> hospitals = new ArrayList<>();

    @GetMapping
    public List<Hospital> getAllHospitals() {
        return hospitals;
    }

    @PostMapping
    public void addHospital(@RequestBody Hospital hospital) {
        hospitals.add(hospital);
    }

    @DeleteMapping("/{id}")
    public void deleteHospital(@PathVariable int id) {
        hospitals.removeIf(h -> h.getId() == id);
    }
}
