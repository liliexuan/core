/**
 * 使用自动化工具生成 version 1.0 
 * @author Jason.Wang
 * @blog http://kany.me
 * @email kzone.wang@gmail.com
 */
package com.min.service;
import java.io.Serializable;

import java.util.*;

import com.min.model.Syrole;

/**
 *
 * @author Jason.Wang
 * @version $Id: ISyroleService.java, v 0.1 Jason.Wang Exp $.
 */
public interface ISyroleService extends Serializable{

	/**
	 * 保存Syrole对象
	 * @param syrole
	 */
	public int saveSyrole(Syrole syrole) throws Exception;

	/**
	 * 保存Syrole对象并不插入空数据
	 * @param syrole
	 */
	public int saveSyroleSelective(Syrole syrole) throws Exception;

	/**
	 * 根据id删除Syrole
	 * @param id
	 */
	public void deleteSyroleByid(java.lang.String id) throws Exception;

	/**
	 * 更新对象Syrole
	 * @param syrole
	 */
	public int updateSyrole(Syrole syrole) throws Exception;

	/**
	 * 根据id获取Syrole
	 * @param id
	 * @return Syrole
	 */
	public Syrole querySyrole(java.lang.String id) throws Exception;

	/**
	 * 根据对象获取所有的Syrole集合
	 * @param syrole
	 * @return List<Syrole>
	 */
	public List<Syrole> querySyroleList(Syrole syrole) throws Exception;

}