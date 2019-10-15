package my.suveng.sys_uer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * user管理系统
 * @author suwenguang
 * @date 2019/10/15
 */
@SpringBootApplication
public class UserApplication {
	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(UserApplication.class,args);
		System.out.println("hello,world");
	}
}
