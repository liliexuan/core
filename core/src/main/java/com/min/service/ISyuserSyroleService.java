/**
 * 使用自动化工具生成 version 1.0 
 * @author Jason.Wang
 * @blog http://kany.me
 * @email kzone.wang@gmail.com
 */
package com.min.service;
import java.io.Serializable;

import java.util.*;

import com.min.model.SyuserSyrole;

/**
 *
 * @author Jason.Wang
 * @version $Id: ISyuserSyroleService.java, v 0.1 Jason.Wang Exp $.
 */
public interface ISyuserSyroleService extends Serializable{

	/**
	 * 保存SyuserSyrole对象
	 * @param syuserSyrole
	 */
	public int saveSyuserSyrole(SyuserSyrole syuserSyrole) throws Exception;

	/**
	 * 保存SyuserSyrole对象并不插入空数据
	 * @param syuserSyrole
	 */
	public int saveSyuserSyroleSelective(SyuserSyrole syuserSyrole) throws Exception;

	/**
	 * 根据syuserId删除SyuserSyrole
	 * @param syuserId
	 */
	public void deleteSyuserSyroleBysyuserId(java.lang.String syuserId) throws Exception;

	/**
	 * 更新对象SyuserSyrole
	 * @param syuserSyrole
	 */
	public int updateSyuserSyrole(SyuserSyrole syuserSyrole) throws Exception;

	/**
	 * 根据syuserId获取SyuserSyrole
	 * @param syuserId
	 * @return SyuserSyrole
	 */
	public SyuserSyrole querySyuserSyrole(java.lang.String syuserId) throws Exception;

	/**
	 * 根据对象获取所有的SyuserSyrole集合
	 * @param syuserSyrole
	 * @return List<SyuserSyrole>
	 */
	public List<SyuserSyrole> querySyuserSyroleList(SyuserSyrole syuserSyrole) throws Exception;

}