package org.accp.realm;

import org.accp.pojo.Persons;
import org.accp.service.yl.PersonService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;



/**
 * 自定义验证器
 * 
 * @author Administrator
 *
 */
public class PermRealm extends AuthorizingRealm {

	@Autowired
	private PersonService PService;

	/**
	 * 认证逻辑
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// 获得用户名
		if (token.getPrincipal() == null)
			return null;
		// 获得用户名
		String userName = token.getPrincipal().toString();
		Persons persons = PService.queryByA(userName); // 查询用户名
		if (persons == null)
			return null;
		SecurityUtils.getSubject().getSession().setAttribute("Users", persons);// 保存会话信息
		return new SimpleAuthenticationInfo(userName, persons.getPwd(), this.getName());//认证成功
	}

	/**
	 * 授权逻辑
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName = (String) principals.getPrimaryPrincipal();// 获得用户名
		Persons persons = PService.queryByA(userName);// 查询角色，权限操作
		SimpleAuthorizationInfo author = new SimpleAuthorizationInfo();
		author.addRole(persons.getPosition().getPpnamne());// 添加角色
		// 循环添加操作
		persons.getPosition().getRoots().forEach(obj -> {
			// 权限格式->挂号:r
			System.out.println(obj.getRname());
			author.addStringPermission(obj.getRname() + ":" + obj.getRoot());
		});
		return author;
	}

}
