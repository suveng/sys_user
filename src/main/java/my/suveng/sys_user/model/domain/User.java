package my.suveng.sys_user.model.domain;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;
import java.util.Date;

@Data
@Document(collection="sys_user")
public class User {
	/**
	 * 用户的唯一标识
	 */
	@Id
	private String userId;


	/**
	 * 用户名称
	 */
	private String name;

	/**
	 * 用户类型
	 */
	private Integer type;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date modifyTime;
}
