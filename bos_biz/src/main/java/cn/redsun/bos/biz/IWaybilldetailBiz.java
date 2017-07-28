package cn.redsun.bos.biz;
import java.util.List;

import cn.redsun.bos.entity.Waybilldetail;
/**
 * 业务逻辑层接口
 * @author Administrator
 *
 */
public interface IWaybilldetailBiz extends IBaseBiz<Waybilldetail>{
	List<Waybilldetail> waybilldetailList(Long sn);
}

