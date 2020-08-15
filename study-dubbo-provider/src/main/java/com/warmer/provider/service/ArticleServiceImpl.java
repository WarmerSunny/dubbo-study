package com.warmer.provider.service;

import com.warmer.common.demo.ArticleService;
import com.warmer.common.pojo.BaseResponse;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @ClassNameArticleServiceImpl
 * @Description TODO
 * @Author wanghai
 * @Date2020/8/15 11:12 AM
 * @Version V1.0
 **/
@DubboService
public class ArticleServiceImpl implements ArticleService {
    @Override
    public BaseResponse findArticles() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(200);
        baseResponse.setErrorCode("A0000");
        baseResponse.setMsg("请求成功");
        return baseResponse;
    }
}
