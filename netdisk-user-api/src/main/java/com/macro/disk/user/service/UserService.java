package com.macro.disk.user.service;



import com.macro.disk.user.bean.Page;
import com.macro.disk.user.bean.SessionUserBean;
import com.macro.disk.user.bean.TreeJson;
import com.macro.disk.user.bean.UserBean;

import java.util.List;

public interface UserService {
	/**
	 * 用户列表：分页
	 * @since: 1.14.1
	 * @param: [page, limit, username, nickname]
	 * @return: com.macro.disk.user.bean.Page<com.macro.disk.user.bean.UserBean>
	 * @author: hww
	 * @date: 2021/1/24
	 */
	public Page<UserBean> findUserPageList(Integer page, Integer limit, String username, String nickname);
	/**
	 * 用户树
	 * @since: 1.14.1
	 * @param: [pid, type]
	 * @return: java.util.List<com.macro.disk.user.bean.TreeJson>
	 * @author: hww
	 * @date: 2021/1/24
	 */
	public List<TreeJson> findUserTree(String pid, String type);
	/**
	 * 登录
	 * @since: 1.14.1
	 * @param: [username, password]
	 * @return: com.macro.disk.user.bean.SessionUserBean
	 * @author: hww
	 * @date: 2021/1/24
	 */
	public SessionUserBean login(String username, String password);
	/**
	 * 根据token获取用户信息
	 * @since: 1.14.1
	 * @param: [token]
	 * @return: com.macro.disk.user.bean.SessionUserBean
	 * @author: hww
	 * @date: 2021/1/24
	 */
	public SessionUserBean getUserByToken(String token);
	/**
	 * 登出
	 * @since: 1.14.1
	 * @param: [token]
	 * @return: void
	 * @author: hww
	 * @date: 2021/1/24
	 */
	public void logout(String token);
}
