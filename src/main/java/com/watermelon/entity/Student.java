package com.watermelon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends User {

    /**
     * gender 性别
     * region 籍贯
     * score 总学分
     * birth 出生日期
     * entranceDate 入学日期
     */
    private int gender;
    private String region;
    private float score;
    private Date birth;
    private Date entranceDate;

    /**
     * 通过一个登录的User构造出Student
     * @param user User
     */
    public Student(User user){
        super.setId(user.getId());
        super.setName(user.getName());
        super.setPassword(user.getPassword());
        super.setRoleId(user.getRoleId());
        super.setRole(user.getRole());
    }

}
