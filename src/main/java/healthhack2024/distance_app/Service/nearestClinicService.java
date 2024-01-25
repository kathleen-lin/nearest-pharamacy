package healthhack2024.distance_app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import healthhack2024.distance_app.Model.Clinic;
import healthhack2024.distance_app.Repository.ClinicRepository;

@Service
public class nearestClinicService {
    
    @Autowired
    private ClinicRepository clinicRepo;

    public void addClinic(Clinic clinic) {
        clinicRepo.save(clinic);
    } 

    public List<Clinic> findClinic() {

        return clinicRepo.findAll();
    }
}
