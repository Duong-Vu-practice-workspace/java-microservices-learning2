package vn.edu.ptit.duongvct.practice1.socialmedia.user_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.edu.ptit.duongvct.practice1.socialmedia.user_service.domain.User;
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
