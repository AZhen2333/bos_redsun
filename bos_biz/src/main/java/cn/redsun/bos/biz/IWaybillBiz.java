package cn.redsun.bos.biz;

import cn.redsun.bos.entity.Waybill;

/**
 * 业务逻辑层接口
 * 
 * @author Administrator
 *
 */
public interface IWaybillBiz extends IBaseBiz<Waybill> {
	Long addWaybill(Long userId, String address, String addressee, String tele, String info);
}
