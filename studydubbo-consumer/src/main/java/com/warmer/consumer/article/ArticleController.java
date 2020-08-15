package com.warmer.consumer.article;

import com.warmer.common.demo.ArticleService;
import com.warmer.common.pojo.BaseResponse;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameArticleController
 * @Description TODO
 * @Author wanghai
 * @Date2020/8/15 11:15 AM
 * @Version V1.0
 **/
@RestController
public class ArticleController {
    /**
     * 功能描述: 注解配置服务降级
     *  通过[mock] 属性添加服务配置,该配置类必须以XxxServiceMock 为类名,
     *  并实现响应的dubbo接口,重写对应的方法,服务调用失败是会调用该方法
     */
    @DubboReference(timeout = 500 ,mock = "com.warmer.consumer.article.mock.ArticleServiceMock")
    private ArticleService articleService;

    @GetMapping("/articles")
    public BaseResponse getArticleList(){
        return articleService.findArticles();
    }
}
