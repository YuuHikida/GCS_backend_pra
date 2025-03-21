package com.example.GCS.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.GCS.model.User;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    //findbyxxxのxxxにはフィールド名を入れる
    Optional<User> findByfirebaseUid(String firebaseUid);

    // DBに登録されているメアドがないか調べる
    Optional<User> findByNotificationEmail(String notificationEmail);
} 