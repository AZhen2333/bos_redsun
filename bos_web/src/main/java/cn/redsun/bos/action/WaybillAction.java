package cn.redsun.bos.action;
import cn.redsun.bos.biz.IWaybillBiz;
import cn.redsun.bos.entity.Waybill;

/**
 * Action 
 * @author Administrator
 *
 */
public class WaybillAction extends BaseAction<Waybill> {

	private IWaybillBiz waybillBiz;

	public void setWaybillBiz(IWaybillBiz waybillBiz) {
		this.waybillBiz = waybillBiz;
		super.setBaseBiz(this.waybillBiz);
	}

}
