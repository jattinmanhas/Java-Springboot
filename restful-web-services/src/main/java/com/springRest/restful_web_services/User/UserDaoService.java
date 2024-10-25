package com.springRest.restful_web_services.User;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int countUser = 0;

    static{
        users.add(new User(++countUser, "Adam", LocalDate.now().minusYears(20)));
        users.add(new User(++countUser, "Eve", LocalDate.now().minusYears(24)));
        users.add(new User(++countUser, "Jim", LocalDate.now().minusYears(30)));
    }

    // public List<User> findAll()
    public List<User> findAll(){
        return users;
    }

    // public User save(User user)


    //public User findOne(int id)
    public User findOne(int id){
        Predicate<? super User> predicate = user -> user.getId() == id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User saveUser(User user){
        user.setId(++countUser);
        users.add(user);
        return user;
    }

    public void deleteById(int id){
        Predicate<? super User> predicate = user -> user.getId() == id;
        users.removeIf(predicate);
    }

}
