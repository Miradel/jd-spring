package com.cybertek.repoaitory;

import com.cybertek.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    //    ---------------------------------DERIVED QUERIES------------------------

    //    Write a derived query to read a user with an email?
    Optional<User> findByEmail(String email);

    //    Write a derived query to read a user with an username?
    Optional<User> findByUsername(String userName);

//    //    Write a derived query to list all users that contain a specific name?
//    List<User> findAllByAccountDetailsNameContaining(String name);
//
//    //    Write a derived query to list all users that contain a specific name in the ignore case mode?
//    List<User> findAllByAccountDetailsNameContainingIgnoreCase(String name);

    //    Write a derived query to list all users with an age greater than a specified age?
    List<User> getAllByAccountAgeGreaterThan(int age);


    //    ----------------------------------- JPQL QUERIES--------------------------

    //Write a JPQL query that returns a user read by email?
    @Query("select u from User u where u.email = ?1 ")
    Optional<User> getUserByEmail(String email);

    //Write a JPQL query that returns a user read by username?
    @Query("select u from User u where u.username = ?1")
    Optional<User> getUserByUserName(String userName);

    //   Write a JPQL query that returns all users?
    @Query("select u from User u")
    List<User> getAllUser();

    // ------------------------------NATIVE QUERIES------------------------

    //Write a native query that returns all users that contain a specific name?
    @Query(value = "select * from user_account u join account_details ad on ad.id = u.account_details_id where ad.name ILIKE concat('%',?1,'%')",nativeQuery = true)
    List<User> getUserByName(String name);

    //Write a native query that returns all users?
    @Query(value = "select * from User",nativeQuery = true)
    List<User> getAllUser2();

    //Write a native query that returns all users in the range of ages?
    @Query(value = "select * from user_account u join account_details ad on ad.id = u.account_details_id where ad.age between ?1 amd ?2",nativeQuery = true)
    List<User> getAllUserInRangeOfAge(int first, int last);

    //Write a native query to read a user by email?
    @Query(value = "select * from User u where u.email=?1",nativeQuery = true)
    Optional<User> fetchUserByEmail(String email);


}
