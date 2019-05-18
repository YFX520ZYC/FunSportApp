package com.love.fun_common.aliyunsms;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

/*
pom.xml
<dependency>
  <groupId>com.aliyun</groupId>
  <artifactId>aliyun-java-sdk-core</artifactId>
  <version>4.0.3</version>
</dependency>
*/
public class CommonRpc {
    public static void AliyunSms(String code) {
        DefaultProfile profile = DefaultProfile.getProfile(
        		"cn-hangzhou", 
        		"LTAIzUaSvlBBlVdu", 
        		"Q4Cz7WIMnZurdDwovaqquCmKIApDij");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        //request.setProtocol(ProtocolType.HTTPS);
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", "15688143214");
        request.putQueryParameter("SignName", "Fun运动APP");
        request.putQueryParameter("TemplateCode", "SMS_164276747");
        request.putQueryParameter("TemplateParam", "{\"code\":"+code+"}");
        request.putQueryParameter("SmsUpExtendCode", "90999");
        request.putQueryParameter("OutId", "abcdefgh");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}