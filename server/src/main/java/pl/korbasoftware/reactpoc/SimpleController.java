package pl.korbasoftware.reactpoc;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SimpleController {
    private final SimpleRepository simpleRepository;

    @PostMapping("/post")
    public void post(@RequestBody SimpleEntityDTO entity) {
        simpleRepository.save(entity);
    }

    @PutMapping("/put")
    public void put(@RequestBody SimpleEntityDTO entity) {
        simpleRepository.saveOrUpdate(entity);
    }

    @GetMapping("/get/{id}")
    public SimpleEntityDTO get(@PathVariable Long id) {
        return simpleRepository.get(id);
    }

    @GetMapping("/get")
    public List<SimpleEntityDTO> getAll() {
        return simpleRepository.getAll();
    }
}