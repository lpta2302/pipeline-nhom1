package vn.edu.ueh.bit.pipes.core.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import vn.edu.ueh.bit.pipes.core.entities.Area;
import vn.edu.ueh.bit.pipes.core.service.AreaService;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/areas")
@RequiredArgsConstructor
public class AreaController {
    private final AreaService areaService;

    @GetMapping
    public ResponseEntity<List<Area>> getAll() {
        return ResponseEntity.ok(areaService.findAll());
    }

}
