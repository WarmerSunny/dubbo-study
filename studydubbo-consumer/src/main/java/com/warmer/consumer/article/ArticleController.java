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
    @DubboReference(timeout = 500 ,mock = "com.warmer.consumer.article.mock.ArticleServiceMock")
    private ArticleService articleService;

    @GetMapping("/articles")
    public BaseResponse getArticleList(){
        return articleService.findArticles();
    }
}
