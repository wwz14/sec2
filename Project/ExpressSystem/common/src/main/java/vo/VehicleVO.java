package vo;

import java.io.File;

import util.ResultMsg;

public class VehicleVO {
	
	/**
	 * 车辆代号
	 */
	private String vehiclecode;
	
	/**
	 * 车牌号
	 */
	private String platenumber;
	
	/**
	 * 服役时间
	 */
	private String serviceTimeLimit;
	
	private File picture;
	
	/**
	 * 
	 * @param vehiclecode
	 * @param platenumber
	 * @param serviceTimeLimit
	 */
	public VehicleVO(String vehiclecode,String platenumber,String serviceTimeLimit,File picture){
		this.vehiclecode = vehiclecode;
		this.platenumber = platenumber;
		this.serviceTimeLimit =serviceTimeLimit;
		this.picture = picture;
	}

	public String getVehiclecode() {
		return vehiclecode;
	}

	public String getPlatenumber() {
		return platenumber;
	}

	public String getServiceTimeLimit() {
		return serviceTimeLimit;
	}
	
	public File getPicture(){
		return picture;
	}
	
	public Object toPO(){
		return null;
		//TODO Fill up!
	}
	
	public ResultMsg checkFormat(){
		return null;
		//TODO So it is!
	}
}
