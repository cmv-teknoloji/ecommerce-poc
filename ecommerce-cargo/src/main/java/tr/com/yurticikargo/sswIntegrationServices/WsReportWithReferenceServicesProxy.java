package tr.com.yurticikargo.sswIntegrationServices;

public class WsReportWithReferenceServicesProxy implements tr.com.yurticikargo.sswIntegrationServices.WsReportWithReferenceServices {
  private String _endpoint = null;
  private tr.com.yurticikargo.sswIntegrationServices.WsReportWithReferenceServices wsReportWithReferenceServices = null;
  
  public WsReportWithReferenceServicesProxy() {
    _initWsReportWithReferenceServicesProxy();
  }
  
  public WsReportWithReferenceServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsReportWithReferenceServicesProxy();
  }
  
  private void _initWsReportWithReferenceServicesProxy() {
    try {
      wsReportWithReferenceServices = (new tr.com.yurticikargo.sswIntegrationServices.KOPSWebServicesLocator()).getWsReportWithReferenceServicesPort();
      if (wsReportWithReferenceServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsReportWithReferenceServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsReportWithReferenceServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsReportWithReferenceServices != null)
      ((javax.xml.rpc.Stub)wsReportWithReferenceServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tr.com.yurticikargo.sswIntegrationServices.WsReportWithReferenceServices getWsReportWithReferenceServices() {
    if (wsReportWithReferenceServices == null)
      _initWsReportWithReferenceServicesProxy();
    return wsReportWithReferenceServices;
  }
  
  public tr.com.yurticikargo.sswIntegrationServices.DeliveryCollectionDataResponseVO getDeliveryCollectionInfoByReference(java.lang.String userName, java.lang.String password, java.lang.String language, java.lang.String startDate, java.lang.String endDate, java.lang.String dateType, java.lang.String[] custDocNumber, long[] custId, java.lang.String subCustomer) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (wsReportWithReferenceServices == null)
      _initWsReportWithReferenceServicesProxy();
    return wsReportWithReferenceServices.getDeliveryCollectionInfoByReference(userName, password, language, startDate, endDate, dateType, custDocNumber, custId, subCustomer);
  }
  
  public tr.com.yurticikargo.sswIntegrationServices.ShippingDataV3ResponseVO listInvDocumentByCustIdV2(java.lang.String userName, java.lang.String password, java.lang.String language, tr.com.yurticikargo.sswIntegrationServices.CustParamsVO custParamsVO, tr.com.yurticikargo.sswIntegrationServices.UnitParamsVO unitParamsVO, java.lang.String subCustomerFlag, java.lang.String startDate, java.lang.String endDate, java.lang.String dateParamType, java.lang.String wsUserGroupId, java.lang.String withCargoLifecycle) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (wsReportWithReferenceServices == null)
      _initWsReportWithReferenceServicesProxy();
    return wsReportWithReferenceServices.listInvDocumentByCustIdV2(userName, password, language, custParamsVO, unitParamsVO, subCustomerFlag, startDate, endDate, dateParamType, wsUserGroupId, withCargoLifecycle);
  }
  
  public tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO listInvDocumentByGrpSpecialField(java.lang.String userName, java.lang.String password, java.lang.String language, tr.com.yurticikargo.sswIntegrationServices.CustParamsVO custParamsVO, java.lang.String fieldName, java.lang.String[] fieldValueArray, java.lang.String startDate, java.lang.String endDate, java.lang.String dateParamType, java.lang.String withCargoLifecycle) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (wsReportWithReferenceServices == null)
      _initWsReportWithReferenceServicesProxy();
    return wsReportWithReferenceServices.listInvDocumentByGrpSpecialField(userName, password, language, custParamsVO, fieldName, fieldValueArray, startDate, endDate, dateParamType, withCargoLifecycle);
  }
  
  public tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO listInvDocumentByWaybillNo(java.lang.String userName, java.lang.String password, java.lang.String language, tr.com.yurticikargo.sswIntegrationServices.CustParamsVO custParamsVO, java.lang.String[] waybillNoArray, java.lang.String startDate, java.lang.String endDate, java.lang.String dateParamType, java.lang.String withCargoLifecycle) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (wsReportWithReferenceServices == null)
      _initWsReportWithReferenceServicesProxy();
    return wsReportWithReferenceServices.listInvDocumentByWaybillNo(userName, password, language, custParamsVO, waybillNoArray, startDate, endDate, dateParamType, withCargoLifecycle);
  }
  
  public tr.com.yurticikargo.sswIntegrationServices.ShippingDataResponseVO listInvDocumentInterfaceByReference(java.lang.String userName, java.lang.String password, java.lang.String language, tr.com.yurticikargo.sswIntegrationServices.CustParamsVO custParamsVO, java.lang.String fieldName, java.lang.String[] fieldValueArray, java.lang.String[] docIdArray, java.lang.String startDate, java.lang.String endDate, java.lang.String dateParamType, java.lang.String withCargoLifecycle) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (wsReportWithReferenceServices == null)
      _initWsReportWithReferenceServicesProxy();
    return wsReportWithReferenceServices.listInvDocumentInterfaceByReference(userName, password, language, custParamsVO, fieldName, fieldValueArray, docIdArray, startDate, endDate, dateParamType, withCargoLifecycle);
  }
  
  public tr.com.yurticikargo.sswIntegrationServices.ShippingDataV2ResponseVO listInvDocumentInterfaceWithFailedDeliveryV2(java.lang.String userName, java.lang.String password, java.lang.String language, tr.com.yurticikargo.sswIntegrationServices.CustParamsVO custParamsVO, java.lang.String fieldName, java.lang.String departureUnitId, java.lang.String startDate, java.lang.String endDate, java.lang.String dateParamType) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (wsReportWithReferenceServices == null)
      _initWsReportWithReferenceServicesProxy();
    return wsReportWithReferenceServices.listInvDocumentInterfaceWithFailedDeliveryV2(userName, password, language, custParamsVO, fieldName, departureUnitId, startDate, endDate, dateParamType);
  }
  
  public tr.com.yurticikargo.sswIntegrationServices.XShippingV2ResponseVO listNgiShipping(java.lang.String userName, java.lang.String password, java.lang.String language, tr.com.yurticikargo.sswIntegrationServices.CustParamsVO custParamsVO, java.lang.String fieldName, java.lang.String[] fieldValueArray, java.lang.String[] docIdArray, java.lang.String startDate, java.lang.String endDate, java.lang.String dateParamType, java.lang.String withCargoLifecycle) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (wsReportWithReferenceServices == null)
      _initWsReportWithReferenceServicesProxy();
    return wsReportWithReferenceServices.listNgiShipping(userName, password, language, custParamsVO, fieldName, fieldValueArray, docIdArray, startDate, endDate, dateParamType, withCargoLifecycle);
  }
  
  
}