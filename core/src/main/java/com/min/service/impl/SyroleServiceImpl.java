/**
 * 使用自动化工具生成 version 1.0 
 * @author Jason.Wang
 * @blog http://kany.me
 * @email kzone.wang@gmail.com
 */
package com.min.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

import com.min.mapper.SyroleMapper;
import com.min.model.Syrole;
import com.min.service.ISyroleService;

/**
 *
 * @author Jason.Wang
 * @version $Id: SyroleServiceImpl.java, v 0.1 Jason.Wang Exp $.
 */
@SuppressWarnings("serial")
@Service("syroleService")
@Transactional
public class SyroleServiceImpl implements ISyroleService{
	@Resource 
	private SyroleMapper syroleMapper;

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyroleService#saveSyrole(Syrole)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyrole(Syrole syrole) throws Exception{
		return syroleMapper.saveSyrole(syrole);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyroleService#saveSyroleSelective(Syrole)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyroleSelective(Syrole syrole) throws Exception{
		return syroleMapper.saveSyroleSelective(syrole);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyroleService#deleteSyroleByid(java.lang.String)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public void deleteSyroleByid(java.lang.String id) throws Exception{
		syroleMapper.deleteSyroleByid(id);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyroleService#updateSyrole(Syrole)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int updateSyrole(Syrole syrole) throws Exception{
		return syroleMapper.updateSyrole(syrole);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyroleService#querySyrole(java.lang.String)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public Syrole querySyrole(java.lang.String id) throws Exception{
		return syroleMapper.querySyrole(id);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyroleService#querySyroleList(Syrole)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public List<Syrole> querySyroleList(Syrole syrole) throws Exception{
		return syroleMapper.querySyroleList(syrole);
	}

}