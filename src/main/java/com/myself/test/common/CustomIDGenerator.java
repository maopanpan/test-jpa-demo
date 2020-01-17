package com.myself.test.common;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;

import java.io.Serializable;

/**
 * 类名称：CustomIDGenerator<br>
 * 类描述：<br>
 * 创建时间：2020年01月16日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
public class CustomIDGenerator extends IdentityGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor s, Object obj) {
        //return super.generate(s, obj);
        Object id = SnowflakeIdHelper.getId();
        if (id != null) {
            return (Serializable) id;
        }
        return super.generate(s, obj);
    }
}
