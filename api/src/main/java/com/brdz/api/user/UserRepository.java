package com.brdz.api.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findUserById(Integer Id);
    List<User> findUserByScreenName(String screenName);
    List<User> findUserByName(String name);
    List<User> findUserByAddress(String address);
    List<User> findUserByCity(String city);
    List<User> findUserByState(String state);
    List<User> findUserByZipcode(Integer zipcode);
    List<User> findUserByUsercode(Integer usercode);
    List<User> findUserByContactName(String erContactName);
    List<User> findUserByContactNumber(Integer erContactNumber);
    List<User> findUserByContactEmail(String erContactEmail);
    List<User> findUserByNumChildren(Integer numChildren);
}
