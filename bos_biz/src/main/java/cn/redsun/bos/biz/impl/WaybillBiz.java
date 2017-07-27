package cn.redsun.bos.biz.impl;
import cn.redsun.bos.biz.IWaybillBiz;
import cn.redsun.bos.dao.IWaybillDao;
import cn.redsun.bos.entity.Waybill;
/**
 * 业务逻辑类
 * @author Administrator
 *
 */
public class WaybillBiz extends BaseBiz<Waybill> implements IWaybillBiz {

	private IWaybillDao waybillDao;
	
	public void setWaybillDao(IWaybillDao waybillDao) {
		this.waybillDao = waybillDao;
		super.setBaseDao(this.waybillDao);
	}
	
}
