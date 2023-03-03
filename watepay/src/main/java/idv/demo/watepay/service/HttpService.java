package idv.demo.watepay.service;

import idv.demo.watepay.model.hgpay.ReqModel;
import idv.demo.watepay.model.hgpay.ResModel;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

@Service
public class HttpService {

    public ResModel post(String url, ReqModel reqModel){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters()
                .add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<ReqModel> httpEntity = new HttpEntity<ReqModel>(reqModel, headers);

        ResponseEntity<ResModel> responseEntity =
                restTemplate.exchange(url, HttpMethod.POST, httpEntity, ResModel.class);
        ResModel resModel = responseEntity.getBody();

        return resModel;
    }
}
