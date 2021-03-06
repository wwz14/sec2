/**
 * 库存PO
 * @author wqy
 * @date 2015/10/17
 */
package po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import vo.CommodityGoodsVO;
import vo.InventoryVO;



public class InventoryPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5409693594601033268L;


	/**
	 * 总的库存数量
	 */
	private String num;


	/**
	 * 出库数量
	 */
	private String outNum;

	/**
	 * 入库数量
	 */
	private String inNum;

	/**
	 * 时间段内货物金额
	 */
	private String money;

	/**
	 * 货物信息
	 */
	private ArrayList<CommodityGoodsPO> goodsInfo;;

	/**
	 * 构造方法
	 * @param outNum
	 * @param inNum
	 * @param money
	 * @param goodsInfo
	 */
	public InventoryPO(String outNum, String inNum,String money,ArrayList<CommodityGoodsPO> goodsInfo){
		this.outNum = outNum;
		this.inNum = inNum;
		this.money = money;
		this.goodsInfo = goodsInfo;
		
	}

	public String getOutNum() {
		return outNum;
	}

	public String getInNum() {
		return inNum;
	}

	public String getMoney() {
		return money;
	}

	
	public ArrayList<CommodityGoodsPO> getGoodsInfo() {
		return goodsInfo;
	}

	public String getNum() {
		return num;
	}

	public Object toVO() {
		
		ArrayList<CommodityGoodsVO> list = new ArrayList<>();
		Iterator<CommodityGoodsPO> it = goodsInfo.iterator();
		while(it.hasNext()) {
			list.add((CommodityGoodsVO) it.next().toVO());
		}
		
		InventoryVO vo = new InventoryVO(outNum, inNum, money, list);
		return vo;
	}

}