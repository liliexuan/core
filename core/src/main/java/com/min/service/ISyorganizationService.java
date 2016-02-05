/**
 * 使用自动化工具生成 version 1.0 
 * @author Jason.Wang
 * @blog http://kany.me
 * @email kzone.wang@gmail.com
 */
package com.min.service;
import java.io.Serializable;

import java.util.*;

import com.min.model.Syorganization;

/**
 *
 * @author Jason.Wang
 * @version $Id: ISyorganizationService.java, v 0.1 Jason.Wang Exp $.
 */
public interface ISyorganizationService extends Serializable{

	/**
	 * 保存Syorganization对象
	 * @param syorganization
	 */
	public int saveSyorganization(Syorganization syorganization) throws Exception;

	/**
	 * 保存Syorganization对象并不插入空数据
	 * @param syorganization
	 */
	public int saveSyorganizationSelective(Syorganization syorganization) throws Exception;

	/**
	 * 根据id删除Syorganization
	 * @param id
	 */
	public void deleteSyorganizationByid(java.lang.String id) throws Exception;

	/**
	 * 更新对象Syorganization
	 * @param syorganization
	 */
	public int updateSyorganization(Syorganization syorganization) throws Exception;

	/**
	 * 根据id获取Syorganization
	 * @param id
	 * @return Syorganization
	 */
	public Syorganization querySyorganization(java.lang.String id) throws Exception;

	/**
	 * 根据对象获取所有的Syorganization集合
	 * @param syorganization
	 * @return List<Syorganization>
	 */
	public List<Syorganization> querySyorganizationList(Syorganization syorganization) throws Exception;

}