package com.mi.excelcsv.helper.writer;

import java.util.List;

/**
 * 将bean写入excel或csv格式流中的BeanWriter接口类定义
 *
 * @author 陈奕鸿
 * @Description
 * @Date 创建于 18-12-21 下午7:38
 */
public interface BeanWriter {

    /**
     * 将bean列表写入流中
     *
     * @param list 待写入bean列表
     * @param beanType， 待写入的bean类型
     */
    <E> void write(List<E> list, Class<E> beanType);

    /**
     *  关闭writer对应的流, 不需要再执行写入操作时，需要执行close操作
     */
    void close();

}
