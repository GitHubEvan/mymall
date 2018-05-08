package com.evan.mymall.service.impl;

import com.evan.mymall.common.ServerResponse;
import com.evan.mymall.domain.User;
import com.evan.mymall.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by hbhu on 2018/5/8.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public ServerResponse<User> login(String userName, String password) {
        return null;
    }

    @Override
    public ServerResponse<String> register(User user) {
        return null;
    }

    @Override
    public ServerResponse<String> checkValid(String checkValue, String checkType) {
        return null;
    }

    @Override
    public ServerResponse<User> updateInformation(User user) {
        return null;
    }

    @Override
    public ServerResponse<User> getInformation(Integer userId) {
        return null;
    }

    @Override
    public ServerResponse getQuestion(String userName) {
        return null;
    }

    @Override
    public ServerResponse<String> checkAnswer(String userName, String question, String answer) {
        return null;
    }

    @Override
    public ServerResponse<String> resetPassword(User user, String oldPassword, String newPassword) {
        return null;
    }

    @Override
    public ServerResponse<String> forgetRestPassword(String userName, String newPassword, String forgetToken) {
        return null;
    }
}
