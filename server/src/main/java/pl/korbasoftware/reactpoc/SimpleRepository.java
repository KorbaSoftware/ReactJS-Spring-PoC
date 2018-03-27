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
