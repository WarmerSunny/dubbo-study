package com.warmer.consumer.article.mock;

import com.warmer.common.demo.ArticleService;
import com.warmer.common.pojo.BaseResponse;

/**
 * @ClassNameArticleServiceMock
 * @Description TODO
 * @Author wanghai
 * @Date2020/8/15 11:24 AM
 * @Version V1.0
 **/
public class ArticleServiceMock implements ArticleService {
    @Override
    public BaseResponse findArticles() {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(200);
        baseResponse.setErrorCode("M0000");
        baseResponse.setMsg("本地伪装的数据,服务暂不可用!");
        return baseResponse;
    }
}
