package com.example.demo.run;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/api/runs")
public class RunController {
    
    private final RunRepository runRepository;

    public RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }
 
    @GetMapping("")
    List<Run> findAll() {
        return runRepository.findAll();
    }

    // @GetMapping("/{id}")
    // Run findById(@PathVariable Integer id) {
    //     Optional<Run> run = runRepository.findById(id);

    //     if (!run.isPresent()) {
    //         throw new RunNotFoundException();
    //     };

    //     return run.get();
    // }

    // // POST
    // @ResponseStatus(HttpStatus.CREATED)
    // @PostMapping("")
    // void create(@Valid @RequestBody Run run) {
    //     runRepository.create(run);
    // }

    // //PUT
    // @ResponseStatus(HttpStatus.NO_CONTENT)
    // @PutMapping("/{id}")
    // void update(@Valid @RequestBody Run run, @PathVariable Integer id) {
    //     runRepository.update(run, id);
    // }

    // @ResponseStatus(HttpStatus.NO_CONTENT)
    // @DeleteMapping("/{id}")
    // void delete(@PathVariable Integer id) {
    //     runRepository.delete(id);
    // }
}
