package com.redsun.bos.ws;


import javax.jws.WebService;


/**
 * @author Tay
 *
 */
@WebService
public interface IWaybillWs {
	/*
	 * 在线下单预约
	 * */
	Long addWaybill(Long userId,String roAddress,String address,String tele,String info);
}
