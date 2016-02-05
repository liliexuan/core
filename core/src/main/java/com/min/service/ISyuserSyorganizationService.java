/**
 * 使用自动化工具生成 version 1.0 
 * @author Jason.Wang
 * @blog http://kany.me
 * @email kzone.wang@gmail.com
 */
package com.min.service;
import java.io.Serializable;

import java.util.*;

import com.min.model.SyuserSyorganization;

/**
 *
 * @author Jason.Wang
 * @version $Id: ISyuserSyorganizationService.java, v 0.1 Jason.Wang Exp $.
 */
public interface ISyuserSyorganizationService extends Serializable{

	/**
	 * 保存SyuserSyorganization对象
	 * @param syuserSyorganization
	 */
	public int saveSyuserSyorganization(SyuserSyorganization syuserSyorganization) throws Exception;

	/**
	 * 保存SyuserSyorganization对象并不插入空数据
	 * @param syuserSyorganization
	 */
	public int saveSyuserSyorganizationSelective(SyuserSyorganization syuserSyorganization) throws Exception;

	/**
	 * 根据syuserId删除SyuserSyorganization
	 * @param syuserId
	 */
	public void deleteSyuserSyorganizationBysyuserId(java.lang.String syuserId) throws Exception;

	/**
	 * 更新对象SyuserSyorganization
	 * @param syuserSyorganization
	 */
	public int updateSyuserSyorganization(SyuserSyorganization syuserSyorganization) throws Exception;

	/**
	 * 根据syuserId获取SyuserSyorganization
	 * @param syuserId
	 * @return SyuserSyorganization
	 */
	public SyuserSyorganization querySyuserSyorganization(java.lang.String syuserId) throws Exception;

	/**
	 * 根据对象获取所有的SyuserSyorganization集合
	 * @param syuserSyorganization
	 * @return List<SyuserSyorganization>
	 */
	public List<SyuserSyorganization> querySyuserSyorganizationList(SyuserSyorganization syuserSyorganization) throws Exception;

}