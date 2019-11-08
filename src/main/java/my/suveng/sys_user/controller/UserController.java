package my.suveng.sys_user.controller;

import my.suveng.sys_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mongodb")
public class UserController {

	@Autowired
	private UserService userService;
	/**
	 * 读
	 * @author suwenguang
	 * @date 2019/11/8
	 */
	@RequestMapping("/read")
	@ResponseBody
	public Object read(){
		return userService.read();
	}

	/**
	 * 写
	 * @author suwenguang
	 * @date 2019/11/8
	 */
	@RequestMapping("/write")
	@ResponseBody
	public Object write(){
		return  userService.write();
	}

	/**
	 * 更新
	 * @author suwenguang
	 * @date 2019/11/8
	 */
	@RequestMapping("update")
	@ResponseBody
	public Object update(String id){
		return userService.update(id);
	}

	/**
	 * 删除
	 * @author suwenguang
	 * @date 2019/11/8
	 */
	@RequestMapping("deleteAll")
	@ResponseBody
	public Object deleteAll(){
		return userService.deleteAll();
	}


}
