package idv.demo.watepay.model.hgpay;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class TestDataInfoModel {
    @Schema(example = "中文123")
    private String TermID;
    @Schema(example = "產品456")
    private String TradeDesc;
    private int TradeAmount;
    private int Redeem;
    private String RedeemRate;
    private int UnRedeem;
    private String TradeTime;
    private String Expired;
    private String PostBackUrl;
    private String ResultFwdUrl;
    private int DiscountLimit;

}
