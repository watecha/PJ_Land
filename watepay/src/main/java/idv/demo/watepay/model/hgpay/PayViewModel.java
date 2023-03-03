package idv.demo.watepay.model.hgpay;

import io.swagger.annotations.ApiModelProperty;

public class PayViewModel {

    public PayViewModel(){
        this.setSender("hgpay");
        this.setStoreID("12345678AE");
    }
    @ApiModelProperty(notes = "11Sender", example = "hgpay", required = true)
    private String Sender;
    @ApiModelProperty(notes = "22StoreID", example = "123456ae", required = true)
    private String StoreID;
    private String TransType;
    private String PayType;

    private PayDataInfo2AESEncodeModel DataInfo;

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

    public PayDataInfo2AESEncodeModel getDataInfo() {
        return DataInfo;
    }

    public void setDataInfo(PayDataInfo2AESEncodeModel dataInfo) {
        DataInfo = dataInfo;
    }
}
