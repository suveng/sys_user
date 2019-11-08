package my.suveng.sys_user.service;
import java.util.Date;

import my.suveng.sys_user.dao.mongo.UserRepository;
import my.suveng.sys_user.model.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;


	/**
	 * 读取一个user
	 * @author suwenguang
	 * @date 2019/11/8
	 */
	public Object read() {
		//从mongdb读取id为0的user
		Optional<User> byId = userRepository.findById("0");
		User defaultUser = new User();
		defaultUser.setName("默认");
		return byId.orElse(defaultUser);
	}

	/**
	 * 简单些
	 * @author suwenguang
	 * @date 2019/11/8
	 */
	public Object write() {

		User entity = new User();
		entity.setName("");
		entity.setType(0);
		entity.setCreateTime(new Date());
		entity.setModifyTime(new Date());

		userRepository.save(entity);
		return "sucess";
	}

	/**
	 * 根据id更新记录
	 * @author suwenguang
	 * @date 2019/11/8
	 */
	public Object update(String id) {
		//根据id查找user
		Optional<User> byId = userRepository.findById(id);
		if (byId.isPresent()){
			//查找到了
			User user = byId.get();
			//更新名字, 和 modifyTime
			Date date = new Date();
			user.setName("更新"+ date);
			user.setModifyTime(date);
			userRepository.save(user);
			return user;
		}
		return "没有找到user";
	}

	/**
	 * 删除
	 * @author suwenguang
	 * @date 2019/11/8
	 */
	public Object deleteAll() {
		userRepository.deleteAll();
		return "全部删除完成";
	}
}
