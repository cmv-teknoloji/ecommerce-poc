/**
 * WsReportWithReferenceServicesBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.sswIntegrationServices;

public class WsReportWithReferenceServicesBindingStub extends org.apache.axis.client.Stub implements tr.com.yurticikargo.sswIntegrationServices.WsReportWithReferenceServices {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeliveryCollectionInfoByReference");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "custDocNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "custId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subCustomer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "deliveryCollectionDataResponseVO"));
        oper.setReturnClass(tr.com.yurticikargo.sswIntegrationServices.DeliveryCollectionDataResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "DeliveryCollectionDataResponseVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listInvDocumentByCustIdV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "custParamsVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "CustParamsVO"), tr.com.yurticikargo.sswIntegrationServices.CustParamsVO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unitParamsVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "UnitParamsVO"), tr.com.yurticikargo.sswIntegrationServices.UnitParamsVO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subCustomerFlag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateParamType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "wsUserGroupId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "withCargoLifecycle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "shippingDataV3ResponseVO"));
        oper.setReturnClass(tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3ResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ShippingDataV3ResponseVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listInvDocumentByGrpSpecialField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "custParamsVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "CustParamsVO"), tr.com.yurticikargo.sswIntegrationServices.CustParamsVO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fieldName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fieldValueArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateParamType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "withCargoLifecycle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "shippingDataResponseVO"));
        oper.setReturnClass(tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ShippingDataResponseVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listInvDocumentByWaybillNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "custParamsVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "CustParamsVO"), tr.com.yurticikargo.sswIntegrationServices.CustParamsVO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "waybillNoArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateParamType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "withCargoLifecycle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "shippingDataResponseVO"));
        oper.setReturnClass(tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ShippingDataResponseVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listInvDocumentInterfaceByReference");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "custParamsVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "CustParamsVO"), tr.com.yurticikargo.sswIntegrationServices.CustParamsVO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fieldName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fieldValueArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "docIdArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateParamType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "withCargoLifecycle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "shippingDataResponseVO"));
        oper.setReturnClass(tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ShippingDataResponseVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listInvDocumentInterfaceWithFailedDeliveryV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "custParamsVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "CustParamsVO"), tr.com.yurticikargo.sswIntegrationServices.CustParamsVO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fieldName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "departureUnitId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateParamType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "shippingDataV2ResponseVO"));
        oper.setReturnClass(tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2ResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ShippingDataResponseVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listNgiShipping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "custParamsVO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "CustParamsVO"), tr.com.yurticikargo.sswIntegrationServices.CustParamsVO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fieldName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fieldValueArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "docIdArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateParamType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "withCargoLifecycle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "xShippingV2ResponseVO"));
        oper.setReturnClass(tr.com.yurticikargo.sswIntegrationServices.XShippingV2ResponseVO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "XShippingV2ResponseVO"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "YurticikargoWSException"),
                      "tr.com.yurticikargo.WSExceptions.YurticikargoWSException",
                      new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException"), 
                      true
                     ));
        _operations[6] = oper;

    }

    public WsReportWithReferenceServicesBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WsReportWithReferenceServicesBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WsReportWithReferenceServicesBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "baseResultVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.BaseResultVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "CustParamsVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.CustParamsVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "deliveryCollectionDataResponseVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.DeliveryCollectionDataResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "DocCargoField2VO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.DocCargoField2VO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "DocCargoLifeCycleVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.DocCargoLifeCycleVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "DocCargoVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.DocCargoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "extendedBaseResultVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.ExtendedBaseResultVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "InvDocField2VO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.InvDocField2VO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "qListDeliveryCollectionInfoVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.QListDeliveryCollectionInfoVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "ShippingDataDetailVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.ShippingDataDetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "shippingDataResponseVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "ShippingDataV2DetailVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2DetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "shippingDataV2ResponseVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2ResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "ShippingDataV3DetailVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3DetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "shippingDataV3ResponseVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3ResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "UnitParamsVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.UnitParamsVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "XShippingV2DetailVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.XShippingV2DetailVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "xShippingV2ResponseVO");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.sswIntegrationServices.XShippingV2ResponseVO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://yurticikargo.com.tr/WSExceptions/", "YurticikargoWSException");
            cachedSerQNames.add(qName);
            cls = tr.com.yurticikargo.WSExceptions.YurticikargoWSException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public tr.com.yurticikargo.sswIntegrationServices.DeliveryCollectionDataResponseVO getDeliveryCollectionInfoByReference(java.lang.String userName, java.lang.String password, java.lang.String language, java.lang.String startDate, java.lang.String endDate, java.lang.String dateType, java.lang.String[] custDocNumber, long[] custId, java.lang.String subCustomer) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "getDeliveryCollectionInfoByReference"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, language, startDate, endDate, dateType, custDocNumber, custId, subCustomer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.sswIntegrationServices.DeliveryCollectionDataResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.sswIntegrationServices.DeliveryCollectionDataResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.sswIntegrationServices.DeliveryCollectionDataResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3ResponseVO listInvDocumentByCustIdV2(java.lang.String userName, java.lang.String password, java.lang.String language, tr.com.yurticikargo.sswIntegrationServices.CustParamsVO custParamsVO, tr.com.yurticikargo.sswIntegrationServices.UnitParamsVO unitParamsVO, java.lang.String subCustomerFlag, java.lang.String startDate, java.lang.String endDate, java.lang.String dateParamType, java.lang.String wsUserGroupId, java.lang.String withCargoLifecycle) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentByCustIdV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, language, custParamsVO, unitParamsVO, subCustomerFlag, startDate, endDate, dateParamType, wsUserGroupId, withCargoLifecycle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3ResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3ResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3ResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO listInvDocumentByGrpSpecialField(java.lang.String userName, java.lang.String password, java.lang.String language, tr.com.yurticikargo.sswIntegrationServices.CustParamsVO custParamsVO, java.lang.String fieldName, java.lang.String[] fieldValueArray, java.lang.String startDate, java.lang.String endDate, java.lang.String dateParamType, java.lang.String withCargoLifecycle) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentByGrpSpecialField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, language, custParamsVO, fieldName, fieldValueArray, startDate, endDate, dateParamType, withCargoLifecycle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO listInvDocumentByWaybillNo(java.lang.String userName, java.lang.String password, java.lang.String language, tr.com.yurticikargo.sswIntegrationServices.CustParamsVO custParamsVO, java.lang.String[] waybillNoArray, java.lang.String startDate, java.lang.String endDate, java.lang.String dateParamType, java.lang.String withCargoLifecycle) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentByWaybillNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, language, custParamsVO, waybillNoArray, startDate, endDate, dateParamType, withCargoLifecycle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO listInvDocumentInterfaceByReference(java.lang.String userName, java.lang.String password, java.lang.String language, tr.com.yurticikargo.sswIntegrationServices.CustParamsVO custParamsVO, java.lang.String fieldName, java.lang.String[] fieldValueArray, java.lang.String[] docIdArray, java.lang.String startDate, java.lang.String endDate, java.lang.String dateParamType, java.lang.String withCargoLifecycle) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentInterfaceByReference"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, language, custParamsVO, fieldName, fieldValueArray, docIdArray, startDate, endDate, dateParamType, withCargoLifecycle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2ResponseVO listInvDocumentInterfaceWithFailedDeliveryV2(java.lang.String userName, java.lang.String password, java.lang.String language, tr.com.yurticikargo.sswIntegrationServices.CustParamsVO custParamsVO, java.lang.String fieldName, java.lang.String departureUnitId, java.lang.String startDate, java.lang.String endDate, java.lang.String dateParamType) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "listInvDocumentInterfaceWithFailedDeliveryV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, language, custParamsVO, fieldName, departureUnitId, startDate, endDate, dateParamType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2ResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2ResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2ResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public tr.com.yurticikargo.sswIntegrationServices.XShippingV2ResponseVO listNgiShipping(java.lang.String userName, java.lang.String password, java.lang.String language, tr.com.yurticikargo.sswIntegrationServices.CustParamsVO custParamsVO, java.lang.String fieldName, java.lang.String[] fieldValueArray, java.lang.String[] docIdArray, java.lang.String startDate, java.lang.String endDate, java.lang.String dateParamType, java.lang.String withCargoLifecycle) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "listNgiShipping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, language, custParamsVO, fieldName, fieldValueArray, docIdArray, startDate, endDate, dateParamType, withCargoLifecycle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (tr.com.yurticikargo.sswIntegrationServices.XShippingV2ResponseVO) _resp;
            } catch (java.lang.Exception _exception) {
                return (tr.com.yurticikargo.sswIntegrationServices.XShippingV2ResponseVO) org.apache.axis.utils.JavaUtils.convert(_resp, tr.com.yurticikargo.sswIntegrationServices.XShippingV2ResponseVO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof tr.com.yurticikargo.WSExceptions.YurticikargoWSException) {
              throw (tr.com.yurticikargo.WSExceptions.YurticikargoWSException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
