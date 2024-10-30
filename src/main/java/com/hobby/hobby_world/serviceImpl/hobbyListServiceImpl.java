package com.hobby.hobby_world.serviceImpl;


import com.hobby.hobby_world.database.hobbyRepository;
import com.hobby.hobby_world.model.hobbyList;
import com.hobby.hobby_world.model1.hobbyList1;
import com.hobby.hobby_world.service.hobbyListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class hobbyListServiceImpl implements hobbyListService {

    @Autowired
    private hobbyRepository hobbyRepository;

    @Override
    public List<hobbyList1> getHobbyList() {
//        List<hobbyList> list = new ArrayList<hobbyList>();
//        for (hobbyList item : hobbyRepository.findAll()) {
//            list.add(item);
//        }
//        return list;

        List<hobbyList> hobbyList = hobbyRepository.getHobbyList();
        List<hobbyList1> hobbyList11 = new ArrayList<>();
        hobbyList.forEach(h->{
            hobbyList1 hobbyList1 = new hobbyList1();
            hobbyList1.setHobbyCode(h.getHobbyCode());
            hobbyList1.setHobbyName(h.getHobbyName());
            hobbyList11.add(hobbyList1);
        });
        return hobbyList11;
    }
}
