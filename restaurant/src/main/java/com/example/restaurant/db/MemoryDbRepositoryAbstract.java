package com.example.restaurant.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

abstract public class MemoryDbRepositoryAbstract<T extends MemoryDbEntity> implements MemoryDbRepositoryIfs<T> {

    private final List<T> db = new ArrayList<>();

    private int index = 0;

    @Override
    public Optional<T> findById(int index) {
        return db.stream()
                .filter(it -> it.getIndex() == index)
                .findFirst();
    }

    @Override
    public T save(T entity) {

        Optional<T> e = db.stream().filter(it -> it.getIndex() == entity.getIndex()).findFirst();

        if (e.isEmpty()) {
            // db에 데이터가 없는 경우
            index++;
            entity.setIndex(index);
        } else {
            // db에 데이터가 있는 경우
            int preIndex = e.get().getIndex();
            entity.setIndex(preIndex);

            deleteById(preIndex);
        }

        db.add(entity);
        return entity;
    }

    @Override
    public void deleteById(int index) {
        Optional<T> optionalT = db.stream().filter(it -> it.getIndex() == index).findFirst();

        optionalT.ifPresent(db::remove);
    }

    @Override
    public List<T> listAll() {
        return db;
    }

}
