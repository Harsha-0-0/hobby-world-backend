package com.hobby.hobby_world.database;

import com.hobby.hobby_world.model.hobbyList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface hobbyRepository extends CrudRepository<hobbyList, Integer> {
    @Query(nativeQuery = true,
            value="Select * from hobbylist")
    List<hobbyList> getHobbyList();
}
