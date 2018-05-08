package com.evan.mymall.service;

import com.evan.mymall.common.ServerResponse;
import com.evan.mymall.domain.User;


/**
 * Created by hbhu on 2018/5/8.
 */
public interface IUserService {

    ServerResponse<User> login(String userName, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String checkValue, String checkType);

    ServerResponse<User> updateInformation(User user);

    ServerResponse<User> getInformation(Integer userId);

    ServerResponse getQuestion(String userName);

    ServerResponse<String> checkAnswer(String userName, String question, String answer);

    ServerResponse<String> resetPassword(User user, String oldPassword, String newPassword);

    ServerResponse<String> forgetRestPassword(String userName, String newPassword, String forgetToken);

}
