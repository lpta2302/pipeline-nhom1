package vn.edu.ueh.bit.pipes.core.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vn.edu.ueh.bit.pipes.core.entities.Area;
import vn.edu.ueh.bit.pipes.core.repository.AreaRepository;

@Service
@RequiredArgsConstructor
public class AreaService extends BaseService<Area> {
    private final AreaRepository areaRepository;


    @Override
    protected JpaRepository<Area, Integer> getRepository() {
        return areaRepository;
    }
}
