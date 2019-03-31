package com.fb.demo.entity;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class UserEntity {

    private String id;
    @NotBlank(message = "名称不能为空")
    @Pattern(regexp = ".{4,10}",message = "名称为4-10位")
    private String name;

    @NotBlank(message = "年龄不能为空")
    @Min(value = 1L,message = "年龄不能小于1")
    @Max(value = 150,message = "")
    private String age;

    @NotBlank(message = "邮件号不能为空")
    @Pattern(regexp = "/^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/\n" +
            " /^[a-z\\d]+(\\.[a-z\\d]+)*@([\\da-z](-[\\da-z])?)+(\\.{1,2}[a-z]+)+$/或\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*",message = "邮箱号格式错误")
    private String email;

    @NotBlank(message = "手机号不能为空")
    @Pattern(regexp = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$",message = "手机号格式错误")
    private String phone;

    @NotBlank(message = "生日不能为空")
    @Pattern(regexp = "^\\d{4}-\\d{1,2}-\\d{1,2}",message = "日期格式错误")
    private String birth;

    private String createBy;

    private String updateBy;

}
