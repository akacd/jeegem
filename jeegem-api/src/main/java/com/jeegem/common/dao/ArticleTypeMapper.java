package com.jeegem.common.dao;

import java.util.List;
import java.util.Map;

import com.jeegem.common.model.ArticleType;

/**
 * 
 * <p>
 * Title: ArcTypeDao.java
 * </p>
 * 
 * <p>
 * Description:帖子类型Dao接口
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2018
 * </p>
 * 
 * <p>
 * Company: www.jeegem.com
 * </p>
 * 
 * @author JeeGem
 * 
 * @date 2018年2月10日 上午5:45:56
 * 
 * @version JeeGem V3.0
 */
public interface ArticleTypeMapper {

	/**
	 * 获取分页数据
	 * 
	 * @param params
	 * @return
	 */
	List<ArticleType> getPageList(Map<String, Object> params);

	/**
	 * 获取分页数据总量
	 * 
	 * @param params
	 * @return
	 */
	Integer getTotalCount(Map<String, Object> params);

	/**
	 * 根据ID更新
	 * 
	 * @param articleType
	 */
	int updateById(ArticleType articleType);
}
