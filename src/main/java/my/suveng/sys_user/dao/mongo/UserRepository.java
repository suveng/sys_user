package my.suveng.sys_user.dao.mongo;

import my.suveng.sys_user.model.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
