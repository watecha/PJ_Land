package idv.demo.watepay.controller;

import idv.demo.watepay.model.AllOrderInfoModel;
import idv.demo.watepay.service.EncodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "HAPPYGO Pay 資料加密")
@RestController
public class SupportController {

    @Autowired
    private EncodeService encodeService;

    @ApiOperation("建立訂單QRCode的Payload")
    @GetMapping("/support/createOrderPayload")
    public String createOrderPayload(@PathVariable int id){
        return "員編: 103571";
    }

    @ApiOperation("產出交易資料的HashCode")
    @GetMapping("/support/createHashCode")
    public String createHashCode(AllOrderInfoModel model) throws Throwable{


        String hashCode = encodeService.createHashCode(model);

        return hashCode;
    }
}
