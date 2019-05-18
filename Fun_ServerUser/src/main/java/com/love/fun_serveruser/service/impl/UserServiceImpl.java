package com.love.fun_serveruser.service.impl;


import com.love.fun_common.utils.ResultUtil;
import com.love.fun_common.utils.ResultVo;
import com.love.fun_entity.user.User;
import com.love.fun_serveruser.dao.UserMapper;
import com.love.fun_serveruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userDao;

    @Override
    public ResultVo login(String phone, String password) {
        System.out.println(phone);
        System.out.println(password);

            User user = userDao.selectByPhone(phone);
        System.out.println(" ooo "+user);
            if (user != null){
                if (user.getPassword().equals(password)){
                    return ResultUtil.execOk(phone);
                }
            }
        return ResultUtil.execERROR();
    }

    @Override
    public ResultVo insert(User user) {
       if(user != null){
           return ResultUtil.execOk(userDao.insert(user));
       }else{
           return ResultUtil.execERROR();
       }
    }

    @Override
    public User findByPhone(String phone) {

        return userDao.selectByPhone(phone);
    }
}
