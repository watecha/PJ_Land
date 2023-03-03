package idv.demo.watepay.controller;

import idv.demo.watepay.model.hgpay.*;
import idv.demo.watepay.service.EncodeService;
import idv.demo.watepay.service.HttpService;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
* test data
* AESKey
9C0AA11280C50795B07ABFE5E26924F8DFC582A757A2378E85CA39C3F40F6558

HashKey
nAqhEoDFB5Wwer/l4mkk+N/FgqdXojeOhco5w/QPZVg=

StoreID
86517001AE
* */

@Api(tags = "HAPPYGO Pay Online API 模擬串接")
@RestController
public class HGPayController{

    @Autowired
    private ReqModel reqModel;
    private ResModel resModel;
    private EncodeService encodeService;
    private HttpService httpService;

    @PostMapping("/users")
    @ApiOperation("Create user")
    public User createUser(@RequestBody User user) {

        return  null;
    }

    @PostMapping("/users2")
    @ApiOperation("Create user2")
    public User createUser2(@RequestBody Test3DataInfoModel testDataInfoModel) {

        return  null;
    }

    @ApiOperation(value = "Step.01 取得扣款交易的訂單hashcode")
    @PostMapping("/getHashcode/Pay")
    //@ApiParam(required = true, value = "書本內容") @RequestBody BookDto bookDto
    //public ResModel createOrderPage(PayViewModel model) throws Throwable{
    public ResModel getHashcodeForPay(@RequestBody PayDataInfo2HashCodeModel reqBody) throws Throwable{

        return null;
    }

    @ApiOperation(value = "Step.02 取得扣款交易的加密DataInfo")
    @PostMapping("/getAESDataInfo/Pay")
    //@ApiParam(required = true, value = "書本內容") @RequestBody BookDto bookDto
    //public ResModel createOrderPage(PayViewModel model) throws Throwable{
    public ResModel getAESDataInfoForPay(@RequestBody PayDataInfo2AESEncodeModel reqBody) throws Throwable{

        return null;
    }


    //@ApiOperation("建立訂單的連結(QRCode網頁)")
    @ApiOperation(value = "取得扣款交易的加密DataInfo")
    @PostMapping("/getDataInfoEncode/Pay")
    //@ApiParam(required = true, value = "書本內容") @RequestBody BookDto bookDto
    //public ResModel createOrderPage(PayViewModel model) throws Throwable{
    public ResModel getDataInfoEncodeForPay(@RequestBody PayDataInfo2AESEncodeModel payDataInfoModel) throws Throwable{

        /*
        PayDataInfoModel payDataInfoModel= new PayDataInfoModel();
        //prepare to aes ecnode when posting
        String aesKey = payDataInfoModel.getAESKey();
        payDataInfoModel.setAESKey(null); // not in hashCode
        //create hashCode
        String hashCode = encodeService.createHashCode(payDataInfoModel);
        //serial datainfo(with hashCode) to json
        payDataInfoModel.setHashCode(hashCode);
        payDataInfoModel.setHashKey(null); // not in dataInfoJson
        String dataInfoJsonStr = encodeService.serializeObj2Json(payDataInfoModel);
        //prepare to post
        //reqModel.setSender(model.getSender());
        //reqModel.setStoreID(model.getStoreID());
        //reqModel.setPayType(model.getPayType());
        //reqModel.setTransType(model.getTransType());
        reqModel.setDataInfo(dataInfoJsonStr);
        //post api
        String url = "https://qrpg-t.feib.com.tw/HGPay/Uat/Forward/api/qr";
        resModel = httpService.post(url, reqModel);
         */
        return null;
    }

    @Data
    public class User {
        @Schema(example = "John Doe1qq")
        private String name;

        @Schema(example = "johndoe@example.com2ss")
        private String email;

        @Schema(example = "中文12345")
        private String termID;
        @Schema(example = "產品456888")
        private String tradeDesc;
    }

    @Data
    public class Test3DataInfoModel {
        @Schema(example = "中文123")
        private String termID;
        @Schema(example = "產品456")
        private String tradeDesc;
        @Schema(example = "walter")
        private String name;

        @Schema(example = "gogo@example.com2ss")
        private String email;
        /*
        private int TradeAmount;
        private int Redeem;
        private String RedeemRate;
        private int UnRedeem;
        private String TradeTime;
        private String Expired;
        private String PostBackUrl;
        private String ResultFwdUrl;
        private int DiscountLimit;
*/
    }

    @ApiOperation("查詢訂單")
    @GetMapping("/api/Trans#TransType=07")
    public String queryOrder(@PathVariable int id){
        return "員編: 103571";
    }

    @ApiOperation("取消訂單(未請款)")
    @GetMapping("/api/Trans#TransType=08")
    public String cancelOrder(@PathVariable int id){
        return "員編: 103571";
    }

    @ApiOperation("退款訂單(已請款)")
    @GetMapping("/api/Trans#TransType=03")
    public String refundOrder(@PathVariable int id){
        return "員編: 103571";
    }
}

