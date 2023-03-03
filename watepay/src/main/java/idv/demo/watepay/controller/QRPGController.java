package idv.demo.watepay.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "QRPG(POS機-掃碼支付) API 模擬串接")
@RestController
public class QRPGController {

    @ApiOperation("註冊/更新端末機(泛指POS機)")
    @GetMapping("/img/register")
    public String registerTerm(@PathVariable int id){
        return "員編: 103571";
    }

    @ApiOperation("掃碼扣款交易")
    @GetMapping("/img/pay")
    public String pay(@PathVariable int id){
        return "員編: 103571";
    }

    @ApiOperation("掃碼退款交易")
    @GetMapping("/img/refund")
    public String refund(@PathVariable int id){
        return "員編: 103571";
    }
}
