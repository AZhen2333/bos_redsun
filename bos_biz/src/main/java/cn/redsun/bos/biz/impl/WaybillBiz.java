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
	
	@Override
	public Long addWaybill(Long userId, String address, String addressee, String tele, String info) {
		//构建运单
		Waybill waybill = new Waybill();
		waybill.setUserid(userId);
		waybill.setAddressee(addressee);
		waybill.setToaddress(address);
		waybill.setTele(tele);
		waybill.setInfo(info);
		//状态
		waybill.setState("0");
		waybillDao.add(waybill);
		return waybill.getSn();
	}
	
}
