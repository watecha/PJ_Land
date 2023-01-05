package idv.demo.watepay.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "HAPPYGO Pay Online API 模擬串接")
@RestController
public class TodoController {

    @ApiOperation("建立訂單的連結(QRCode網頁)")
    @GetMapping("/api/Qr")
    public String createOrderPage(@PathVariable int id){
        return "員編: 103571";
    }

    @ApiOperation("建立訂單QRCode Payload")
    @GetMapping("/todo/createOrderPayload")
    public String createOrderPayload(@PathVariable int id){
        return "員編: 103571";
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
