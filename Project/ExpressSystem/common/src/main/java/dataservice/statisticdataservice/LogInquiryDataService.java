package dataservice.statisticdataservice;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

import po.LogEntryPO;

/**
* @author River
*/
public interface LogInquiryDataService extends Remote, Serializable {

	/**
	 * Data层根据时间、关键词查询Log，返回相关条目
	 *
	 * @param time
	 * @param keyword
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<LogEntryPO> findLogEntries(String time,ArrayList<String> keyword)
            throws RemoteException, SQLException;

}
