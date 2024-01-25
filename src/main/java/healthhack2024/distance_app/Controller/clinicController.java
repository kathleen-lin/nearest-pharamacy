package healthhack2024.distance_app.Controller;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import healthhack2024.distance_app.Model.Clinic;
import healthhack2024.distance_app.Service.nearestClinicService;


@RestController
@RequestMapping("clinic")
public class clinicController {

    @Autowired
    private nearestClinicService svc;

    @GetMapping
    public int addClinic() {

        Clinic c = new Clinic();
        
        c.setName("Clinic testing2");
        c.setContactNumber("10020034"); // Replace with an actual contact number
        c.setActive(true); // Replace with the desired value
        c.setLatitude(1.343462);
        c.setLongitude(103.732426);
        Coordinate coordinate = new Coordinate(103.732426, 1.343462); // Note the order: x (longitude), y (latitude)
        GeometryFactory geometryFactory = new GeometryFactory();
        Point location = geometryFactory.createPoint(coordinate);
        location.setSRID(4326); // Set the appropriate SRID
        c.setLocation(location);

        try {
            svc.addClinic(c);
            return 0;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            return 1;
        }
    }
    
}
