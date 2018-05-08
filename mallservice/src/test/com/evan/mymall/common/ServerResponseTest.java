package com.evan.mymall.common;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hbhu on 2018/5/8.
 */

public class ServerResponseTest {

    @Test
    public void createResponse(){
        ServerResponse response = ServerResponse.createBySuccessMessage("success test");
        Assert.assertTrue(response.getStatus() == ResponseCode.SUCCESS.getCode());
    }
}
