package com.tripadv.mty.util;

import com.tripadv.mty.domain.user.User;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Component;

@Component
public class PasswordHandler {

    private RandomNumberGenerator generator = new SecureRandomNumberGenerator();
    private String algorithmName = "md5";//采用md5加密
    private int hashIterations = 2;//加密次数为2次

    public RandomNumberGenerator getGenerator() {
        return generator;
    }

    public void setGenerator(RandomNumberGenerator generator) {
        this.generator = generator;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public int getHashIterations() {
        return hashIterations;
    }

    public void setHashIterations(int hashIterations) {
        this.hashIterations = hashIterations;
    }

    public void encryptPassword(User user){
        String newPassword = new SimpleHash(
                algorithmName,
                user.getPassword()).toHex();

        String newUserName = new SimpleHash(
                algorithmName,
                user.getUsername()).toHex();
        user.setPassword(newPassword);
        user.setUsername(newUserName);

    }
}
