package com.sr.service.inte;

import com.sr.batis.model.User;

public interface UserService {

    public User getUserByLoginId(String loginId);

}