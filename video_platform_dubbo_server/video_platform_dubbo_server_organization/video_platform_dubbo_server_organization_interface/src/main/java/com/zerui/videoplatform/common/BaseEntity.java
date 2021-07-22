package com.zerui.videoplatform.common;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

public abstract class BaseEntity<T extends BaseEntity<?>> extends Model<T> implements Serializable {

}
