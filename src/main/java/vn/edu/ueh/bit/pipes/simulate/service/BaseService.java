package vn.edu.ueh.bit.pipes.simulate.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.ueh.bit.pipes.simulate.entity.BaseEntity;

public abstract class BaseService<T extends BaseEntity> {
    public List<T> findAll() {
        return getRepository().findAll();
    }

    public T save(T entity) {
        return getRepository().save(entity);
    }

    public T create(T entity){
        return save(entity);
    }

    public void createAll(List<T> entities){
        getRepository().saveAll(entities);
    }
    
    protected abstract JpaRepository<T, Integer> getRepository();
}
