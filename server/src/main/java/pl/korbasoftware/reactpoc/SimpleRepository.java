package pl.korbasoftware.reactpoc;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SimpleRepository {
    private final Map<Long, SimpleEntityDTO> database = new HashMap<>();

    public void save(SimpleEntityDTO entity) {
        database.put(entity.getId(), entity);
    }

    public void saveOrUpdate(SimpleEntityDTO entity) {
        database.put(entity.getId(), entity);
    }

    public SimpleEntityDTO get(long id) {
        return database.get(id);
    }

    public List<SimpleEntityDTO> getAll() {
        return new ArrayList<>(database.values());
    }
}

//curl -X POST -H 'Content-Type: application/json' -d '{"id": 1, "age": 24, "city": "Wrocław", "experience": 1, "technologies": ["java", "spring", "git"], "salaryNet": 4000}' http://localhost:8080/post
//curl -X GET http://localhost:8080/get