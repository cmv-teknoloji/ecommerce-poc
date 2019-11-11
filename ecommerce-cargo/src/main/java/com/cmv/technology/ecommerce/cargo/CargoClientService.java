package com.cmv.technology.ecommerce.cargo;

import com.cmv.technology.ecommerce.common.dto.cargo.OrderCargoStatusDto;
import com.cmv.technology.ecommerce.common.dto.cargo.OrderDto;
import org.springframework.stereotype.Service;
import tr.com.yurticikargo.ShippingOrderDispatcherServices.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
public class CargoClientService {

    private ShippingOrderDispatcherServicesBindingStub wsStub;

    public void CargoClientService() {
        try {
            wsStub = new ShippingOrderDispatcherServicesBindingStub(new URL(""), null);
            wsStub.setUsername("");
            wsStub.setPassword("");
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        ShippingOrderResultVO shippingOrderResultVO = wsStub.createShipment
                (wsStub.getUsername(), wsStub.getPassword(), "en", new ShippingOrderVO[]{shippingOrderVO});
        return true;

    }

    public List<OrderCargoStatusDto> queryShipment(List<OrderDto> ordersCargoNotCompleted) throws Exception {

        List<String> orderKeys = new ArrayList<>();
        ordersCargoNotCompleted.forEach(item -> orderKeys.add(item.getCargoOrderId()));

        ShippingDeliveryResultVO shippingDeliveryResultVO = wsStub.queryShipment(
                wsStub.getUsername(), wsStub.getPassword(), "en",
                orderKeys.toArray(new String[]{}), 0, true, true);

        ShippingDeliveryDetailVO[] shippingDeliveryDetailVOs = shippingDeliveryResultVO.getShippingDeliveryDetailVO();

        List<OrderCargoStatusDto> orderCargoStatusDtos = new ArrayList<>();
        for (ShippingDeliveryDetailVO shippingDeliveryDetailVO : shippingDeliveryDetailVOs) {

            OrderCargoStatusDto orderCargoStatusDto = new OrderCargoStatusDto();
            //orderCargoStatusDto.setOrder(orderDto);
            orderCargoStatusDto.setStatus(shippingDeliveryDetailVO.getOperationStatus());
            orderCargoStatusDtos.add(orderCargoStatusDto);
        }
        return orderCargoStatusDtos;
    }

}
