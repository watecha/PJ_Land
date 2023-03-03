package idv.demo.watepay.model;

import idv.demo.watepay.model.hgpay.DataInfoModel;

public class AllOrderInfoModel extends DataInfoModel {

    private String TermID;

    private String HGPTradeNo;

    private String GatewayTradNo;

    private String TradeDesc;

    private String TradeAmount;

    private String Redeem;

    private String RedeemRate;

    private String Expired;

    private String PostBackUrl;

    private String ResulFwdUrl;

    private String DiscountLimit;

    private String HashCode;

    public String getTermID() {
        return TermID;
    }

    public void setTermID(String termID) {
        TermID = termID;
    }

    public String getTradeDesc() {
        return TradeDesc;
    }

    public void setTradeDesc(String tradeDesc) {
        TradeDesc = tradeDesc;
    }

    public String getTradeAmount() {
        return TradeAmount;
    }

    public void setTradeAmount(String tradeAmount) {
        TradeAmount = tradeAmount;
    }

    public String getRedeem() {
        return Redeem;
    }

    public void setRedeem(String redeem) {
        Redeem = redeem;
    }

    public String getRedeemRate() {
        return RedeemRate;
    }

    public void setRedeemRate(String redeemRate) {
        RedeemRate = redeemRate;
    }

    public String getExpired() {
        return Expired;
    }

    public void setExpired(String expired) {
        Expired = expired;
    }

    public String getPostBackUrl() {
        return PostBackUrl;
    }

    public void setPostBackUrl(String postBackUrl) {
        PostBackUrl = postBackUrl;
    }

    public String getResulFwdUrl() {
        return ResulFwdUrl;
    }

    public void setResulFwdUrl(String resulFwdUrl) {
        ResulFwdUrl = resulFwdUrl;
    }

    public String getDiscountLimit() {
        return DiscountLimit;
    }

    public void setDiscountLimit(String discountLimit) {
        DiscountLimit = discountLimit;
    }

    public String getHashCode() {
        return HashCode;
    }

    public void setHashCode(String hashCode) {
        HashCode = hashCode;
    }

    public String getHGPTradeNo() {

        return HGPTradeNo;
    }

    public void setHGPTradeNo(String HGPTradeNo) {
        this.HGPTradeNo = HGPTradeNo;
    }

    public String getGatewayTradNo() {
        return GatewayTradNo;
    }

    public void setGatewayTradNo(String gatewayTradNo) {
        GatewayTradNo = gatewayTradNo;
    }
}
