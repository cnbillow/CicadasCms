package com.zhiliao.module.web.cms.service;

import com.github.pagehelper.PageInfo;
import com.zhiliao.common.base.BaseService;
import com.zhiliao.module.web.cms.vo.TCmsContentVo;
import com.zhiliao.mybatis.model.master.TCmsContent;
import com.zhiliao.mybatis.model.master.TCmsModelFiled;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Description:内容
 *
 * @author Jin
 * @create 2017-04-18
 **/
public interface  ContentService extends BaseService<TCmsContent,Long> {

    PageInfo<TCmsContent> page(Integer pageNumber, Integer pageSize, TCmsContentVo pojo);

    Map findContentByContentIdAndTableName(Long contentId, String tableName);
    /*回收站*/
    String recovery(Long[] ids);

    String save(TCmsContent content,String tableName, Map<String, Object> formParam,String[] tag) throws SQLException;

    String update(TCmsContent content, String tableName, List<TCmsModelFiled> cmsModelFileds , Map<String, Object> formParam, String[] tag) throws SQLException;

    PageInfo<TCmsContent> findContentListBySiteIdAndCategoryId(Integer siteId,
                                                               Long categoryId,
                                                               Integer orderBy,
                                                               Integer size,
                                                               Integer hasChild,
                                                               Integer isHot,
                                                               String isPic,
                                                               String isRecommend);

    PageInfo<TCmsContent> findContentListBySiteIdAndCategoryIds(Integer siteId,
                                                                Long[] categoryIds,
                                                                Integer orderBy,
                                                                Integer size,
                                                                Integer hasChild,
                                                                Integer isHot,
                                                                String isPic,
                                                                String isRecommend);

    PageInfo<TCmsContent> page(Integer pageNumber,Integer siteId,Long categoryId);

    PageInfo<TCmsContent>  findContentListByModelFiledValue(int pageNumber,Long categoryId, String tableName, Map<String, Object> param);

    int viewUpdate(Long contentId);

    String findAllMonthCount();

    Integer AllCount();

    List<TCmsContent> findByCategoryId(Long categoryId);
}
