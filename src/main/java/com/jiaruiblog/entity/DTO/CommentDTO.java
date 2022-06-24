package com.jiaruiblog.entity.DTO;

import com.jiaruiblog.common.MessageConstant;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @ClassName CommentDTO
 * @Description TODO
 * @Author luojiarui
 * @Date 2022/6/19 5:27 下午
 * @Version 1.0
 **/
@Data
public class CommentDTO {

    @NotNull(message = MessageConstant.PARAMS_IS_NOT_NULL)
    private String content;

    @NotNull(message = MessageConstant.PARAMS_IS_NOT_NULL)
    private String docId;

}
