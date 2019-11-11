package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class ShippingOrderDispatcherServicesProxy implements tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDispatcherServices {
  private String _endpoint = null;
  private tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDispatcherServices shippingOrderDispatcherServices = null;
  
  public ShippingOrderDispatcherServicesProxy() {
    _initShippingOrderDispatcherServicesProxy();
  }
  
  public ShippingOrderDispatcherServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initShippingOrderDispatcherServicesProxy();
  }
  
  private void _initShippingOrderDispatcherServicesProxy() {
    try {
      shippingOrderDispatcherServices = (new tr.com.yurticikargo.ShippingOrderDispatcherServices.KOPSWebServicesLocator()).getShippingOrderDispatcherServicesPort();
      if (shippingOrderDispatcherServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)shippingOrderDispatcherServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)shippingOrderDispatcherServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (shippingOrderDispatcherServices != null)
      ((javax.xml.rpc.Stub)shippingOrderDispatcherServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderDispatcherServices getShippingOrderDispatcherServices() {
    if (shippingOrderDispatcherServices == null)
      _initShippingOrderDispatcherServicesProxy();
    return shippingOrderDispatcherServices;
  }
  
  public tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO cancelReturnShipmentCode(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String wsLanguage, java.lang.String fieldName, java.lang.String returnCode) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (shippingOrderDispatcherServices == null)
      _initShippingOrderDispatcherServicesProxy();
    return shippingOrderDispatcherServices.cancelReturnShipmentCode(wsUserName, wsPassword, wsLanguage, fieldName, returnCode);
  }
  
  public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelResultVO cancelShipment(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String userLanguage, java.lang.String[] cargoKeys) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (shippingOrderDispatcherServices == null)
      _initShippingOrderDispatcherServicesProxy();
    return shippingOrderDispatcherServices.cancelShipment(wsUserName, wsPassword, userLanguage, cargoKeys);
  }
  
  public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO createShipment(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String userLanguage, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderVO[] shippingOrderVO) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (shippingOrderDispatcherServices == null)
      _initShippingOrderDispatcherServicesProxy();
    return shippingOrderDispatcherServices.createShipment(wsUserName, wsPassword, userLanguage, shippingOrderVO);
  }
  
  public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO createShipmentDetail(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String userLanguage, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderCreateVO[] shippingOrderVO) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (shippingOrderDispatcherServices == null)
      _initShippingOrderDispatcherServicesProxy();
    return shippingOrderDispatcherServices.createShipmentDetail(wsUserName, wsPassword, userLanguage, shippingOrderVO);
  }
  
  public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryResultVO queryShipment(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String wsLanguage, java.lang.String[] keys, int keyType, boolean addHistoricalData, boolean onlyTracking) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (shippingOrderDispatcherServices == null)
      _initShippingOrderDispatcherServicesProxy();
    return shippingOrderDispatcherServices.queryShipment(wsUserName, wsPassword, wsLanguage, keys, keyType, addHistoricalData, onlyTracking);
  }
  
  public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryResultVO queryShipmentDetail(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String wsLanguage, java.lang.String[] keys, int keyType, boolean addHistoricalData, boolean onlyTracking, boolean jsonData) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (shippingOrderDispatcherServices == null)
      _initShippingOrderDispatcherServicesProxy();
    return shippingOrderDispatcherServices.queryShipmentDetail(wsUserName, wsPassword, wsLanguage, keys, keyType, addHistoricalData, onlyTracking, jsonData);
  }
  
  public tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO saveReturnShipmentCode(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String wsLanguage, java.lang.String fieldName, java.lang.String returnCode, java.lang.String startDate, java.lang.String endDate, int maxCount) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException{
    if (shippingOrderDispatcherServices == null)
      _initShippingOrderDispatcherServicesProxy();
    return shippingOrderDispatcherServices.saveReturnShipmentCode(wsUserName, wsPassword, wsLanguage, fieldName, returnCode, startDate, endDate, maxCount);
  }
  
  
}