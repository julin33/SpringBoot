package com.julin.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
//绑定配置文件可以采取以下两种注解进行绑定
@ConfigurationProperties(prefix = "person")
// 将配置文件的每一个属性值都映射到这个组件中；
// 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定

//@PropertySource(value = "classpath:julin.properties")//加载指定的配置文件
@Validated //数据校验
public class Person {
    //SPELL表达式取出配置文件的值
//    @Value("${name}")
//    @Email(message = "邮箱格式错误")
    private String lastName;
    private Integer age;
    private Boolean happy;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

}
