package com.gyh.mall.dao.mall;

import com.gyh.mall.model.User;
import com.gyh.mall.model.bo.mall.UserDataBO;
import com.gyh.mall.model.bo.mall.UserLoginBO;
import com.gyh.mall.model.bo.mall.UserPwdBO;
import com.gyh.mall.model.vo.mall.UserLoginVO;

public interface UserDao {
    int signup(User user);

    UserLoginVO login(UserLoginBO loginBO);

    void updateUserData(UserDataBO dataBO);

    void updatePwd(UserPwdBO pwdBO);
}
