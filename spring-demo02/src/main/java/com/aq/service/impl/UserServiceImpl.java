package com.aq.service.impl;

import com.aq.dao.UserDao;
import com.aq.pojo.User;
import com.aq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/******************************************************************************
 * @Package: [com.aq.service.impl.UserServiceImpl]

 * @ClassName: [UserServiceImpl]

 * @Description: [一句话描述该类的功能]

 * @Author: [liang.wang@founder.com.cn]  

 * @CreateDate: [2022/1/12 15:12]   

 * @UpdateUser: [liang.wang@founder.com.cn (如多次修改保留历史记录，增加修改记录)]   

 * @UpdateDate: [2022/1/12 15:12，(如多次修改保留历史记录，增加修改记录)]   

 * @UpdateRemark: [说明本次修改内容, (如多次修改保留历史记录 ， 增加修改记录)]

 * @Version: [v1.0]

 * ${tags}

 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public List<User> findAllUser() {

        //1.获取Redis中的数据
        List<User> list = (List<User>)redisTemplate.boundValueOps("user:all").get();
        //2.判断是否有，有就返回，没有就从mysql获取，再存到Redis中
        if (list != null && list.size() > 0) {
            System.out.println("Redis中有数据");
            return list;
        }
        List<User> allUser = userDao.findAllUser();
        redisTemplate.boundValueOps("user:all").set(allUser);
        return allUser;
    }
}
