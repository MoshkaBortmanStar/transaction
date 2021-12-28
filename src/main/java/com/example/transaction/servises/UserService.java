package com.example.transaction.servises;

import com.example.transaction.entity.Users;
import com.example.transaction.entity.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Lazy
    @Autowired
    private UserService self;

    public void tester(Integer id) {
        self.insertDuableUser(id);
        //getSelff().insertDuableUser(id);
    }

    @Transactional
    public void insertDuableUser(Integer  id) {
        var first = Users.builder().name("Misha" + id).age(id).build();
        var second = Users.builder().name("Bortman" + (id+2)).age(id+1).build();

        userRepository.save(first);
        userRepository.save(second);

    }

   /* @Lookup
    UserService getSelff() {
        return null;
    }*/


}
