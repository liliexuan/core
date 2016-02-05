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

import com.min.mapper.SyorganizationSyresourceMapper;
import com.min.model.SyorganizationSyresource;
import com.min.service.ISyorganizationSyresourceService;

/**
 *
 * @author Jason.Wang
 * @version $Id: SyorganizationSyresourceServiceImpl.java, v 0.1 Jason.Wang Exp $.
 */
@SuppressWarnings("serial")
@Service("syorganizationSyresourceService")
@Transactional
public class SyorganizationSyresourceServiceImpl implements ISyorganizationSyresourceService{
	@Resource 
	private SyorganizationSyresourceMapper syorganizationSyresourceMapper;

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyorganizationSyresourceService#saveSyorganizationSyresource(SyorganizationSyresource)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyorganizationSyresource(SyorganizationSyresource syorganizationSyresource) throws Exception{
		return syorganizationSyresourceMapper.saveSyorganizationSyresource(syorganizationSyresource);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyorganizationSyresourceService#saveSyorganizationSyresourceSelective(SyorganizationSyresource)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyorganizationSyresourceSelective(SyorganizationSyresource syorganizationSyresource) throws Exception{
		return syorganizationSyresourceMapper.saveSyorganizationSyresourceSelective(syorganizationSyresource);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyorganizationSyresourceService#deleteSyorganizationSyresourceBysyorganizationId(java.lang.String)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public void deleteSyorganizationSyresourceBysyorganizationId(java.lang.String syorganizationId) throws Exception{
		syorganizationSyresourceMapper.deleteSyorganizationSyresourceBysyorganizationId(syorganizationId);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyorganizationSyresourceService#updateSyorganizationSyresource(SyorganizationSyresource)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int updateSyorganizationSyresource(SyorganizationSyresource syorganizationSyresource) throws Exception{
		return syorganizationSyresourceMapper.updateSyorganizationSyresource(syorganizationSyresource);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyorganizationSyresourceService#querySyorganizationSyresource(java.lang.String)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public SyorganizationSyresource querySyorganizationSyresource(java.lang.String syorganizationId) throws Exception{
		return syorganizationSyresourceMapper.querySyorganizationSyresource(syorganizationId);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyorganizationSyresourceService#querySyorganizationSyresourceList(SyorganizationSyresource)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public List<SyorganizationSyresource> querySyorganizationSyresourceList(SyorganizationSyresource syorganizationSyresource) throws Exception{
		return syorganizationSyresourceMapper.querySyorganizationSyresourceList(syorganizationSyresource);
	}

}