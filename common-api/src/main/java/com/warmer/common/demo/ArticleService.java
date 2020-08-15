package com.warmer.common.demo;

import com.warmer.common.pojo.BaseResponse;

/**
 * @ClassNameArticleService
 * @Description 评论服务, 非主要业务服务, 当服务器负载较大时可以进行服务降级或者熔断
 * @Author wanghai
 * @Date2020/8/15 10:51 AM
 * @Version V1.0
 **/
public interface ArticleService {

    /**
     * 功能描述: 查询评论列表
     * @return:
     * @Author: wanghai
     * @Date: 2020/8/15 11:10 AM
     */
    BaseResponse findArticles();

}
