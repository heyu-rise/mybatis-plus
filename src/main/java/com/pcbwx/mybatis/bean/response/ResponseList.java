package com.pcbwx.mybatis.bean.response;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author heyu
 * @date 2019/5/23
 */
@Setter
@Getter
@ToString
public class ResponseList {

    private Set<Integer> items;
}
