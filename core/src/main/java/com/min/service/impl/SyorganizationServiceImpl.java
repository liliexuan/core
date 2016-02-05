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

import com.min.mapper.SyorganizationMapper;
import com.min.model.Syorganization;
import com.min.service.ISyorganizationService;

/**
 *
 * @author Jason.Wang
 * @version $Id: SyorganizationServiceImpl.java, v 0.1 Jason.Wang Exp $.
 */
@SuppressWarnings("serial")
@Service("syorganizationService")
@Transactional
public class SyorganizationServiceImpl implements ISyorganizationService{
	@Resource 
	private SyorganizationMapper syorganizationMapper;

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyorganizationService#saveSyorganization(Syorganization)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyorganization(Syorganization syorganization) throws Exception{
		return syorganizationMapper.saveSyorganization(syorganization);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyorganizationService#saveSyorganizationSelective(Syorganization)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyorganizationSelective(Syorganization syorganization) throws Exception{
		return syorganizationMapper.saveSyorganizationSelective(syorganization);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyorganizationService#deleteSyorganizationByid(java.lang.String)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public void deleteSyorganizationByid(java.lang.String id) throws Exception{
		syorganizationMapper.deleteSyorganizationByid(id);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyorganizationService#updateSyorganization(Syorganization)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int updateSyorganization(Syorganization syorganization) throws Exception{
		return syorganizationMapper.updateSyorganization(syorganization);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyorganizationService#querySyorganization(java.lang.String)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public Syorganization querySyorganization(java.lang.String id) throws Exception{
		return syorganizationMapper.querySyorganization(id);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyorganizationService#querySyorganizationList(Syorganization)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public List<Syorganization> querySyorganizationList(Syorganization syorganization) throws Exception{
		return syorganizationMapper.querySyorganizationList(syorganization);
	}

}