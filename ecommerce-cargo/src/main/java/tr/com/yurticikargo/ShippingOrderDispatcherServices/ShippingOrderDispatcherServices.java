/**
 * ShippingOrderDispatcherServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public interface ShippingOrderDispatcherServices extends java.rmi.Remote {
    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO cancelReturnShipmentCode(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String wsLanguage, java.lang.String fieldName, java.lang.String returnCode) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException;
    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingCancelResultVO cancelShipment(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String userLanguage, java.lang.String[] cargoKeys) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException;
    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO createShipment(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String userLanguage, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderVO[] shippingOrderVO) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException;
    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderResultVO createShipmentDetail(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String userLanguage, tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingOrderCreateVO[] shippingOrderVO) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException;
    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryResultVO queryShipment(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String wsLanguage, java.lang.String[] keys, int keyType, boolean addHistoricalData, boolean onlyTracking) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException;
    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ShipmentDeliveryResultVO queryShipmentDetail(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String wsLanguage, java.lang.String[] keys, int keyType, boolean addHistoricalData, boolean onlyTracking, boolean jsonData) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException;
    public tr.com.yurticikargo.ShippingOrderDispatcherServices.ExtendedBaseResultVO saveReturnShipmentCode(java.lang.String wsUserName, java.lang.String wsPassword, java.lang.String wsLanguage, java.lang.String fieldName, java.lang.String returnCode, java.lang.String startDate, java.lang.String endDate, int maxCount) throws java.rmi.RemoteException, tr.com.yurticikargo.WSExceptions.YurticikargoWSException;
}
