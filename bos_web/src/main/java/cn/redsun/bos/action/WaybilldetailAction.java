package cn.redsun.bos.action;
import cn.redsun.bos.biz.IWaybilldetailBiz;
import cn.redsun.bos.entity.Waybilldetail;

/**
 * Action 
 * @author Administrator
 *
 */
public class WaybilldetailAction extends BaseAction<Waybilldetail> {

	private IWaybilldetailBiz waybilldetailBiz;

	public void setWaybilldetailBiz(IWaybilldetailBiz waybilldetailBiz) {
		this.waybilldetailBiz = waybilldetailBiz;
		super.setBaseBiz(this.waybilldetailBiz);
	}

}
