package com.msa.ecommerce.userservice.dto;

import com.msa.ecommerce.userservice.vo.ResponseOrder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDto {

    private String email;

    private String name;

    private String pwd;

    private String userId;

    private Date createdAt;

    private String encryptedPwd;

    private List<ResponseOrder> ordrers;
}
