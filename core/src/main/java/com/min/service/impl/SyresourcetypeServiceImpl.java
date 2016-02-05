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

import com.min.mapper.SyresourcetypeMapper;
import com.min.model.Syresourcetype;
import com.min.service.ISyresourcetypeService;

/**
 *
 * @author Jason.Wang
 * @version $Id: SyresourcetypeServiceImpl.java, v 0.1 Jason.Wang Exp $.
 */
@SuppressWarnings("serial")
@Service("syresourcetypeService")
@Transactional
public class SyresourcetypeServiceImpl implements ISyresourcetypeService{
	@Resource 
	private SyresourcetypeMapper syresourcetypeMapper;

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyresourcetypeService#saveSyresourcetype(Syresourcetype)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyresourcetype(Syresourcetype syresourcetype) throws Exception{
		return syresourcetypeMapper.saveSyresourcetype(syresourcetype);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyresourcetypeService#saveSyresourcetypeSelective(Syresourcetype)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyresourcetypeSelective(Syresourcetype syresourcetype) throws Exception{
		return syresourcetypeMapper.saveSyresourcetypeSelective(syresourcetype);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyresourcetypeService#deleteSyresourcetypeByid(java.lang.String)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public void deleteSyresourcetypeByid(java.lang.String id) throws Exception{
		syresourcetypeMapper.deleteSyresourcetypeByid(id);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyresourcetypeService#updateSyresourcetype(Syresourcetype)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int updateSyresourcetype(Syresourcetype syresourcetype) throws Exception{
		return syresourcetypeMapper.updateSyresourcetype(syresourcetype);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyresourcetypeService#querySyresourcetype(java.lang.String)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public Syresourcetype querySyresourcetype(java.lang.String id) throws Exception{
		return syresourcetypeMapper.querySyresourcetype(id);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyresourcetypeService#querySyresourcetypeList(Syresourcetype)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public List<Syresourcetype> querySyresourcetypeList(Syresourcetype syresourcetype) throws Exception{
		return syresourcetypeMapper.querySyresourcetypeList(syresourcetype);
	}

}