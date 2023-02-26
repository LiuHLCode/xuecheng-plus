package com.xuecheng.model.dto;

import lombok.Data;

/**
 * @USER: Liuhl
 * @DATE: 2023/2/26 19:23
 */
@Data
public class QueryCourseParamsDto {
//    审核状态
    private String auditStatus;
//    课程名称
    private String courseName;
//    发布状态
    private String publishStatus;
}
