package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket inDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("入库")
                .apiInfo(apiInfo("入库"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.in"))
//                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket outDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("出库")
                .apiInfo(apiInfo("出库"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.out"))
//                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket masterDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("master")
                .apiInfo(apiInfo("master"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
//                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(String title) {
        Contact contact = new Contact("网规技术部", "www.my.com", "my@my.com");
        return new ApiInfoBuilder()
                .title(title)
                .description("文档描述")
                .contact(contact)   // 联系方式
                .version("1.1.0")  // 版本
                .build();
    }

}
