package com.zerui.videoplatform.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zerui.videoplatform.common.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author xiaozhiyun
 * @since 2021-07-21
 */
@Data
@Accessors(chain = true)
@TableName("tb_base_organization")
public class Organization extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "组织唯一键")
    @TableField
    private String orgId;

    @ApiModelProperty(value = "组织编号")
    @NotEmpty(message = "组织编号不能为空")
    private String orgCode;

    @ApiModelProperty(value = "组织名称")
    @NotEmpty(message = "组织名称不能为空")
    private String orgName;

    @ApiModelProperty(value = "组织类型")
    @NotEmpty(message = "组织类型不能为空")
    private String orgType;

    @ApiModelProperty(value = "上级组织编号")
    private String parentOrgId;

    @ApiModelProperty(value = "当前组织路径")
    private String orgPath;

    @ApiModelProperty(value = "是否删除（0：正常，1：删除）")
    private Boolean isDelete;

    @ApiModelProperty(value = "组织创建的时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "组织最后更新的时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}
