package idv.demo.watepay.model.hgpay;

public class ResModel {
    private String StoreID;
    private String TransType;
    private String PayType;
    private String DataInfo;

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
