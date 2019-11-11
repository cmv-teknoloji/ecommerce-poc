package com.cmv.technology.ecommerce.cargo.service;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDispatcherServicesBindingStub;
import tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO;
import tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderVO;

import java.net.URL;

@Service
@RefreshScope
public class CreateShipmentService {

    @Value("${yurtici.cargo.create.wsdl}")
    private String spec;

    @Value("${yurtici.cargo.create.user}")
    private String username;

    @Value("${yurtici.cargo.create.password}")
    private String password;


    public ShippingOrderDispatcherServicesBindingStub craateWsStub() throws Exception {
        ShippingOrderDispatcherServicesBindingStub wsStub = new ShippingOrderDispatcherServicesBindingStub(new URL(spec), null);
        wsStub.setUsername(username);
        wsStub.setPassword(password);
        return wsStub;
    }


    public boolean createShipment(OrderDto orderDto) throws Exception {
        ShippingOrderVO shippingOrderVO = new ShippingOrderVO();
        shippingOrderVO.setCargoKey(orderDto.getCargoOrderId());
        shippingOrderVO.setInvoiceKey("");
        shippingOrderVO.setReceiverCustName("");
        shippingOrderVO.setReceiverAddress("");
        shippingOrderVO.setCityName("");
        shippingOrderVO.setTownName("");
        shippingOrderVO.setReceiverPhone1("");
        shippingOrderVO.setReceiverPhone2("");
        shippingOrderVO.setReceiverPhone3("");
        shippingOrderVO.setEmailAddress("");
        shippingOrderVO.setTaxOfficeId(0);
        shippingOrderVO.setTaxNumber("");
        shippingOrderVO.setTaxOfficeName("");
        shippingOrderVO.setDesi(1d);
        shippingOrderVO.setKg(1d);
        shippingOrderVO.setCargoCount(0);
        shippingOrderVO.setWaybillNo("");
        shippingOrderVO.setSpecialField1("");
        shippingOrderVO.setSpecialField2("");
        shippingOrderVO.setSpecialField3("");
        shippingOrderVO.setTtInvoiceAmount(0d);
        shippingOrderVO.setTtDocumentId(0);
        shippingOrderVO.setTtCollectionType("");
        shippingOrderVO.setTtDocumentSaveType("");
        shippingOrderVO.setDcSelectedCredit(0);
        shippingOrderVO.setDcCreditRule(0);
        shippingOrderVO.setDescription("");
        shippingOrderVO.setOrgGeoCode("");
        shippingOrderVO.setPrivilegeOrder("");
        shippingOrderVO.setCustProdId("");
        shippingOrderVO.setOrgReceiverCustId("");
        ShippingOrderResultVO shippingOrderResultVO = craateWsStub().createShipment
                (username, password, "en", new ShippingOrderVO[]{shippingOrderVO});
        return true;
    }
}
