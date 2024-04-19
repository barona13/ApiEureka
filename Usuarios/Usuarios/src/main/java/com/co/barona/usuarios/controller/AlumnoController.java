package com.co.barona.usuarios.controller;

import com.co.barona.usuarios.entity.Alumno;
import com.co.barona.usuarios.service.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.Optional;



@RestController
public class AlumnoController {

    private AlumnoService alumnoService;

    @GetMapping
    public ResponseEntity<?> listarAlumno(){

        return ResponseEntity.ok().body(alumnoService.findAll());
    }

    @GetMapping("/")
    public ResponseEntity<?> ver(@PathVariable Long id){

        Optional <Alumno> ob = alumnoService.findById(id);

        if(ob.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(ob.get());
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Alumno alumno){
        Alumno alumnoDb = alumnoService.save(alumno);

        return ResponseEntity.status(HttpStatus.CREATED).body(alumnoDb);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id){

        Optional<Alumno> ob = alumnoService.findById(id);

        if (ob.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        Alumno alumnoBd = ob.get();
        alumnoBd.setNombre(alumno.getNombre());
        alumnoBd.setApellido(alumno.getApellido());
        alumnoBd.setEmail(alumno.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(alumnoService.save(alumnoBd));
    }

    @DeleteMapping("{id}")
    private ResponseEntity<?> eliminar(@PathVariable Long id){

        alumnoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
