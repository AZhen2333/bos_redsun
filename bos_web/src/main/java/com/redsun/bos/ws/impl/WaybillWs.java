package com.redsun.bos.ws.impl;

import com.redsun.bos.ws.IWaybillWs;

import cn.redsun.bos.biz.IWaybillBiz;

public class WaybillWs implements IWaybillWs {

	private IWaybillBiz waybillBiz;

	/*
	 * 在线下单预约
	 */
	@Override
	public Long addWaybill(Long userId, String address, String addressee, String tele, String info) {
		return waybillBiz.addWaybill(userId, address, addressee, tele, info);
	}

	public void setWaybillBiz(IWaybillBiz waybillBiz) {
		this.waybillBiz = waybillBiz;
	}

}
