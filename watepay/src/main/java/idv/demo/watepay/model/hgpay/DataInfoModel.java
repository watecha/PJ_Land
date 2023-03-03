package idv.demo.watepay.model.hgpay;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic=true)
public class DataInfoModel {
    @Schema(description = "特店代號", example = "111111111")
    private String storeID;
    @Schema(example = "2222222")
    private String merchantTradeNo;
    private String hashCode;
    private String hashKey;

}
