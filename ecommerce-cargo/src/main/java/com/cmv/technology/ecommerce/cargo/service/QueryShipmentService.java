package com.cmv.technology.ecommerce.cargo.service;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import tr.com.yurticikargo.sswIntegrationServices.CustParamsVO;
import tr.com.yurticikargo.sswIntegrationServices.ShippingDataDetailVO;
import tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO;
import tr.com.yurticikargo.sswIntegrationServices.WsReportWithReferenceServicesBindingStub;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
@RefreshScope
public class QueryShipmentService {


    @Value("${yurtici.cargo.create.wsdl}")
    private String spec;

    @Value("${yurtici.cargo.create.user}")
    private String username;

    @Value("${yurtici.cargo.create.password}")
    private String password;

    public WsReportWithReferenceServicesBindingStub createWsStub() throws Exception {

        WsReportWithReferenceServicesBindingStub wsStub = new WsReportWithReferenceServicesBindingStub(new URL(spec), null);
        wsStub.setUsername(username);
        wsStub.setPassword(password);
        return wsStub;
    }

    public List<OrderCargoStatusDto> queryShipment(List<OrderDto> ordersCargoNotCompleted) throws Exception {

        List<String> orderKeys = new ArrayList<>();
        ordersCargoNotCompleted.forEach(item -> orderKeys.add(item.getCargoOrderId()));

        CustParamsVO custParamsVO = new CustParamsVO();
        custParamsVO.setInvCustIdArray(new String[]{"235993189"});

        ShippingDataResponseVO shippingDataResponseVO = createWsStub().listInvDocumentInterfaceByReference("user", "password", "TR", custParamsVO, "53",
                orderKeys.toArray(new String[orderKeys.size()]), null, null, null, null, "0");


        //wsStub.getUsername(), wsStub.getPassword(), "en",
        //orderKeys.toArray(new String[]{}), 0, true, true);

        ShippingDataDetailVO[] ShippingDataDetailVOs = shippingDataResponseVO.getShippingDataDetailVOArray();

        List<OrderCargoStatusDto> orderCargoStatusDtos = new ArrayList<>();
        for (ShippingDataDetailVO shippingDeliveryDetailVO : ShippingDataDetailVOs) {

            OrderCargoStatusDto orderCargoStatusDto = new OrderCargoStatusDto();
            if ("OK".equals(shippingDeliveryDetailVO.getCargoEventId())) {
                orderCargoStatusDto.setStatus(shippingDeliveryDetailVO.getCargoEventId() + "-" + shippingDeliveryDetailVO.getRejectFlag());
            } else {
                orderCargoStatusDto.setStatus(shippingDeliveryDetailVO.getCargoEventExplanation());
            }
            orderCargoStatusDto.setStatus(shippingDeliveryDetailVO.getCargoEventId());
            orderCargoStatusDtos.add(orderCargoStatusDto);
        }
        return orderCargoStatusDtos;
    }

}
