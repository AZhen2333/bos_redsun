package com.redsun.bos.ws;

import java.util.List;

import javax.jws.WebService;

import cn.redsun.bos.entity.Waybilldetail;

/**
 * @author Tay
 *
 */
@WebService
public interface IWaybillWs {
	/*
	 * 根据运单号查询运单详情
	 * */
	List<Waybilldetail> waybilldetailsList(Long sn);
	
	/*
	 * 在线下单预约
	 * */
	Long addWaybill(Long userId,String roAddress,String address,String tele,String info);
}
