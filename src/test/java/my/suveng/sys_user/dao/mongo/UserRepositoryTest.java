package my.suveng.sys_user.dao.mongo;
import java.util.Date;


import my.suveng.sys_user.SpringBaseTest;
import my.suveng.sys_user.model.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class UserRepositoryTest extends SpringBaseTest {
	@Autowired
	private UserRepository userRepository;

	@Test
	public void save() {
		User entity = new User();
		entity.setName("suveng");
		entity.setType(0);
		entity.setCreateTime(new Date());
		entity.setModifyTime(new Date());

		userRepository.save(entity);
	}
}
