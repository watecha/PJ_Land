package idv.demo.watepay.model.hgpay;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

//HGPay 扣款交易的DataInfo
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
public class PayDataInfo2AESEncodeModel {
    @Schema(example = "86517001AE", required = true)
    private String storeID;
    @Schema(example = "UAT20230101001", required = true)
    private String merchantTradeNo;
    @Schema(example = "請輸入訂單hashCode", required = true)
    private String hashCode;
    @Schema(example = "UAT_POS_01", required = true)
    private String termID;
    @Schema(example = "一份UAT商品")
    private String tradeDesc;
    @Schema(example = "66", required = true)
    private int tradeAmount;
    private int redeem;
    @Schema(example = " ")
    private String redeemRate;
    private int unRedeem;
    @Schema(example = "20230301235959", required = true)
    private String tradeTime;
    @Schema(example = "20231231235959")
    private String expired;
    @Schema(example = "http://qrpg-t.feib.com.tw/hgpay/postback")
    private String postBackUrl;
    @Schema(example = "http://qrpg-t.feib.com.tw/hgpay/resultfwd")
    private String resultFwdUrl;
    private int discountLimit;

}
