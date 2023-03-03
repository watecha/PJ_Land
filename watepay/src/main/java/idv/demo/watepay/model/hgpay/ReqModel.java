package idv.demo.watepay.model.hgpay;

import org.springframework.stereotype.Component;

@Component
public class ReqModel {

    private String Sender;
    private String StoreID;
    private String TransType;
    private String PayType;
    private String DataInfo;

    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        Sender = sender;
    }

    public String getStoreID() {
        return StoreID;
    }

    public void setStoreID(String storeID) {
        StoreID = storeID;
    }

    public String getTransType() {
        return TransType;
    }

    public void setTransType(String transType) {
        TransType = transType;
    }

    public String getPayType() {
        return PayType;
    }

    public void setPayType(String payType) {
        PayType = payType;
    }

    public String getDataInfo() {
        return DataInfo;
    }

    public void setDataInfo(String dataInfo) {
        DataInfo = dataInfo;
    }
}
