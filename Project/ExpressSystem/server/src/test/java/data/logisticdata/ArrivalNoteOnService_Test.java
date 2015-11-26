package data.logisticdata;

import data.logisticdata.MockObject.MockArrivalNoteOnService;
import data.logisticdata.MockObject.MockDeliverNoteOnService;
import dataservice.exception.ElementNotFoundException;
import dataservice.logisticdataservice.ArrivalNoteOnServiceDataService;
import dataservice.logisticdataservice.ArrivalNoteOnTransitDataService;
import org.junit.Test;
import po.ArrivalNoteOnServicePO;
import po.DeliverNoteOnServicePO;
import util.BarcodeAndState;
import util.enums.GoodsState;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kylin on 15/11/10.
 */
public class ArrivalNoteOnService_Test {

    private ArrivalNoteOnServiceDataService service = new ArrivalNoteOnServiceData();

    @Test
    public void testInsertArrivalNote() throws RemoteException, SQLException, ElementNotFoundException {
        ArrayList<BarcodeAndState> barcodes = new ArrayList<>();
        barcodes.add(new BarcodeAndState("1234567890", GoodsState.COMPLETE));
        barcodes.add(new BarcodeAndState("1234567890", GoodsState.COMPLETE));
        barcodes.add(new BarcodeAndState("1234567890", GoodsState.COMPLETE));
        barcodes.add(new BarcodeAndState("1234567890", GoodsState.COMPLETE));
        barcodes.add(new BarcodeAndState("1234567890", GoodsState.COMPLETE));
        ArrivalNoteOnServicePO mock1 = new ArrivalNoteOnServicePO("2015-11-11", false,
                "250000201510130000005", "北京", barcodes);
        service.insertArrivalNote(mock1);
    }

    //    @Test
    public void testInsertDeliverNote() throws RemoteException {
        MockDeliverNoteOnService mock1 = new MockDeliverNoteOnService("2015-11-16","王小二");
        MockDeliverNoteOnService mock2 = new MockDeliverNoteOnService("2015-11-17","王小三");
        //assertEquals(true,service.insertDeliverNote(mock1));
        //assertEquals(true,service.insertDeliverNote(mock2));
    }

}