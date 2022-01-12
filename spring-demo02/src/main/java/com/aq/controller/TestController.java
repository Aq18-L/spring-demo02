package com.aq.controller;

import com.aq.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/******************************************************************************
 * @Package: [com.aq.controller.TestController]

 * @ClassName: [TestController]

 * @Description: [一句话描述该类的功能]

 * @Author: [liang.wang@founder.com.cn]  

 * @CreateDate: [2022/1/12 14:07]   

 * @UpdateUser: [liang.wang@founder.com.cn (如多次修改保留历史记录，增加修改记录)]   

 * @UpdateDate: [2022/1/12 14:07，(如多次修改保留历史记录，增加修改记录)]   

 * @UpdateRemark: [说明本次修改内容, (如多次修改保留历史记录 ， 增加修改记录)]

 * @Version: [v1.0]

 * ${tags}

 */

@RestController
public class TestController {

    @Value("${studentname}")
    private String name;

    @Value("${citys[0]}")
    private String city0;

    @Value("${students[0].name}")
    private String studentname;

    @Value("${mysql.url}")
    private String url;

    @Value("${maps.age}")
    private String age;

    @Autowired
    private Student student;

    @RequestMapping("/show")
    public String showHello() {
        System.out.println(name);
        System.out.println(city0);
        System.out.println(studentname);
        System.out.println(url);
        System.out.println(age);

        System.out.println(student.getAge());
        return "hello world!";
    }
}
