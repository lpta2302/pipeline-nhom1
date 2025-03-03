package vn.edu.ueh.bit.pipes.simulate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.ueh.bit.pipes.simulate.entity.Area;

public interface AreaRepository extends JpaRepository<Area, Integer> {
    
}
