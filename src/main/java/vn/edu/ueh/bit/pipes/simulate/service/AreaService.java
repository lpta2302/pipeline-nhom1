package vn.edu.ueh.bit.pipes.simulate.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vn.edu.ueh.bit.pipes.simulate.entity.Area;
import vn.edu.ueh.bit.pipes.simulate.repository.AreaRepository;

@Service
@RequiredArgsConstructor
public class AreaService extends BaseService<Area> {
    private final AreaRepository areaRepository;


    @Override
    protected JpaRepository<Area, Integer> getRepository() {
        return areaRepository;
    }
}
