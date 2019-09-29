package com.mengxuegu.springboot.mapper;

import com.mengxuegu.springboot.entities.Bill;
import com.mengxuegu.springboot.entities.BillProvider;

import java.util.List;

/**
 * 帐单管理
 * @Auther: 梦学谷
 */
public interface BillMapper {

    //查询帐单信息，其中包含供应商id与名称
    List<BillProvider> getBills(Bill bill);

    BillProvider getBillByBid(Integer bid);

    int addBill(Bill bill);

    int updateBill(Bill bill);

    int deleteBillByBid(Integer bid);

}
