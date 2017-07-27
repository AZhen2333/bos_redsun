package com.redsun.bos.ws.impl;

import java.util.List;

import com.redsun.bos.ws.IWaybillWs;

import cn.redsun.bos.biz.IWaybillBiz;
import cn.redsun.bos.biz.IWaybilldetailBiz;
import cn.redsun.bos.biz.impl.WaybillBiz;
import cn.redsun.bos.dao.IWaybillDao;
import cn.redsun.bos.entity.Waybill;
import cn.redsun.bos.entity.Waybilldetail;

public class WaybillWs implements IWaybillWs {

	private IWaybilldetailBiz waybilldetailBiz;
	private IWaybillBiz waybillBiz;
	
	/*
	 * 根据运单号查询运单详情
	 * */
	@Override
	public List<Waybilldetail> waybilldetailsList(Long sn) {
		// 构建查询条件
		Waybilldetail waybilldetail=new Waybilldetail();
		//封装订单号
		waybilldetail.setSn(sn);
		return waybilldetailBiz.getList(waybilldetail, null, null);
	}

	/*
	 * 在线下单预约
	 * */
	@Override
	public Long addWaybill(Long userId, String toAddress, String address, String tele, String info) {
		Waybill waybill=new Waybill();
		waybill.setAddressee(address);
		waybill.setToaddress(toAddress);
		waybill.setUserid(userId);
		waybill.setInfo(info);
		waybill.setTele(tele);
		waybill.setState("0");
		return waybill.getSn();
	}

	public void setWaybilldetailBiz(IWaybilldetailBiz waybilldetailBiz) {
		this.waybilldetailBiz = waybilldetailBiz;
	}

	public void setWaybillBiz(IWaybillBiz waybillBiz) {
		this.waybillBiz = waybillBiz;
	}

}
