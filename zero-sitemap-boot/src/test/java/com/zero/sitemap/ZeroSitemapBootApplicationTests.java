package com.zero.sitemap;

import com.zero.sitemap.common.config.SiteMapJob;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.MalformedURLException;

@Slf4j
@SpringBootTest
class ZeroSitemapBootApplicationTests {

    @Autowired
    SiteMapJob siteMapJob;

    @BeforeEach
    public void before()  {
        log.info("init some data");
    }

    @AfterEach
    public void after(){
        log.info("clean some data");
    }

    @Test
    public void execute() throws MalformedURLException {
        log.info("your method test Code");
        siteMapJob.generateSitemap();

    }

}
