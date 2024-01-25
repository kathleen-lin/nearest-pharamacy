package healthhack2024.distance_app.Model;

import org.locationtech.jts.geom.Point;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contactNumber;
    private boolean isActive;
    private double latitude;
    private double longitude;
    private Point location;
    
}
