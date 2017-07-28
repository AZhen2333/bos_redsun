package cn.redsun.bos.biz.impl;
import java.util.List;

import cn.redsun.bos.biz.IWaybilldetailBiz;
import cn.redsun.bos.dao.IWaybilldetailDao;
import cn.redsun.bos.entity.Waybilldetail;
/**
 * 业务逻辑类
 * @author Administrator
 *
 */
public class WaybilldetailBiz extends BaseBiz<Waybilldetail> implements IWaybilldetailBiz {

	private IWaybilldetailDao waybilldetailDao;
	
	public void setWaybilldetailDao(IWaybilldetailDao waybilldetailDao) {
		this.waybilldetailDao = waybilldetailDao;
		super.setBaseDao(this.waybilldetailDao);
	}

	@Override
	public List<Waybilldetail> waybilldetailList(Long sn) {
		Waybilldetail waybilldetail = new Waybilldetail();
		waybilldetail.setSn(sn);
		return waybilldetailDao.getList(waybilldetail, null, null);
	}

	
}
