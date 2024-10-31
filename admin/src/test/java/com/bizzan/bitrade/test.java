package com.bizzan.bitrade;

import com.sparkframework.security.Encrypt;

/**
 * @Author : liuXinYu
 * @create 2024/10/29 16:48
 */
public class test {
    public static void main(String[] args) {

        String password = Encrypt.MD5("123456" + "XehGyeyrVgOV4P8Uf70REVpIw3iVNwNs");
        System.out.println(password);
    }
}
