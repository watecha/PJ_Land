package idv.demo.watepay.model.hgpay;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

//HGPay 扣款交易的DataInfo
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
public class PayDataInfo2HashCodeModel {
    @Schema(description = "特店代號", example = "86517001AE", required = true)
    private String storeID;
    @Schema(description = "特店代號", example = "UAT20230101001", required = true)
    private String merchantTradeNo;
    @Schema(description = "特店代號", example = "nAqhEoDFB5Wwer/l4mkk+N/FgqdXojeOhco5w/QPZVg=", required = true)
    private String hashKey;
    @Schema(description = "特店代號", example = "UAT_POS_01", required = true)
    private String termID;
    @Schema(description = "特店代號", example = "一份UAT商品")
    private String tradeDesc;
    @Schema(description = "特店代號", example = "66", required = true)
    private int tradeAmount;
    @Schema(description = "特店代號", example = "0", required = false)
    private int redeem;
    @Schema(description = " ")
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
