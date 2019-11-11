/**
 * ShippingDataDetailVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.sswIntegrationServices;

public class ShippingDataDetailVO  implements java.io.Serializable {
    private java.lang.String transactionStatus;

    private java.lang.String transactionErrCode;

    private java.lang.String transactionMessage;

    private java.lang.String fieldName;

    private java.lang.String fieldValue;

    private java.lang.String docId;

    private java.lang.String invoiceNumber;

    private java.lang.String docNumber;

    private java.lang.String waybillNo;

    private java.lang.String docCargoId;

    private java.lang.String senderCustId;

    private java.lang.String senderCustName;

    private java.lang.String senderAddressTxt;

    private java.lang.String invCustId;

    private java.lang.String invCustName;

    private java.lang.String receiverCustId;

    private java.lang.String receiverCustName;

    private java.lang.String receiverAddressTxt;

    private java.lang.String senderAddressId;

    private java.lang.String receiverAddressId;

    private java.lang.String senderCityId;

    private java.lang.String receiverCityId;

    private java.lang.String senderCityName;

    private java.lang.String receiverCityName;

    private java.lang.String senderTownId;

    private java.lang.String receiverTownId;

    private java.lang.String senderTownName;

    private java.lang.String receiverTownName;

    private java.lang.String senderMobilePhoneNumber;

    private java.lang.String receiverMobilePhoneNumber;

    private java.lang.String documentReceiverMobilePhoneNumber;

    private java.lang.String documentDate;

    private java.lang.String documentTime;

    private java.lang.String documentDelFlag;

    private java.lang.String receiverInfo;

    private java.lang.String docType;

    private java.lang.String docTypeExplanation;

    private java.lang.String contractId;

    private java.lang.String trackingUrl;

    private java.lang.String shipmentDistance;

    private java.lang.String estimatedDeliveryDate;

    private java.lang.String cargoType;

    private java.lang.String cargoTypeExplanation;

    private java.lang.String pickupType;

    private java.lang.String pickupTypeExplanation;

    private java.lang.String deliveryType;

    private java.lang.String deliveryTypeExplanation;

    private java.lang.String deliveryDate;

    private java.lang.String deliveryTime;

    private java.lang.String totalPrice;

    private java.lang.String totalVat;

    private java.lang.String totalAmount;

    private java.lang.String product;

    private java.lang.String totalDesi;

    private java.lang.String totalKg;

    private java.lang.String totalDesiKg;

    private java.lang.String totalCargo;

    private java.lang.String arrivalUnitId;

    private java.lang.String arrivalUnitName;

    private java.lang.String departureUnitId;

    private java.lang.String departureUnitName;

    private java.lang.String deliveryUnitId;

    private java.lang.String deliveryUnitName;

    private java.lang.String cargoEventId;

    private java.lang.String cargoEventExplanation;

    private java.lang.String cargoReasonId;

    private java.lang.String cargoReasonExplanation;

    private java.lang.String documentEventId;

    private java.lang.String documentReasonId;

    private java.lang.String documentEventExplanation;

    private java.lang.String documentReasonExplanation;

    private java.lang.String delInfoDeliveryFlag;

    private java.lang.String delInfoDelUnitId;

    private java.lang.String delEmpName;

    private java.lang.String rejectFlag;

    private java.lang.String rejectStatus;

    private java.lang.String rejectStatusExplanation;

    private java.lang.String rejectDescription;

    private java.lang.String rejectReasonExplanation;

    private java.lang.String returnDocId;

    private java.lang.String returnDocumentDate;

    private java.lang.String returnDeliveryDate;

    private java.lang.String returnStatus;

    private java.lang.String returnStatusExplanation;

    private tr.com.yurticikargo.sswIntegrationServices.InvDocField2VO[] invDocFieldVOArray;

    private tr.com.yurticikargo.sswIntegrationServices.DocCargoField2VO[] docCargoFieldVOArray;

    private tr.com.yurticikargo.sswIntegrationServices.DocCargoLifeCycleVO[] docCargoLifeCycleVOArray;

    private tr.com.yurticikargo.sswIntegrationServices.DocCargoVO[] docCargoVOArray;

    private java.lang.String returnTotalPrice;

    private java.lang.String returnTotalVat;

    private java.lang.String returnTotalAmount;

    public ShippingDataDetailVO() {
    }

    public ShippingDataDetailVO(
           java.lang.String transactionStatus,
           java.lang.String transactionErrCode,
           java.lang.String transactionMessage,
           java.lang.String fieldName,
           java.lang.String fieldValue,
           java.lang.String docId,
           java.lang.String invoiceNumber,
           java.lang.String docNumber,
           java.lang.String waybillNo,
           java.lang.String docCargoId,
           java.lang.String senderCustId,
           java.lang.String senderCustName,
           java.lang.String senderAddressTxt,
           java.lang.String invCustId,
           java.lang.String invCustName,
           java.lang.String receiverCustId,
           java.lang.String receiverCustName,
           java.lang.String receiverAddressTxt,
           java.lang.String senderAddressId,
           java.lang.String receiverAddressId,
           java.lang.String senderCityId,
           java.lang.String receiverCityId,
           java.lang.String senderCityName,
           java.lang.String receiverCityName,
           java.lang.String senderTownId,
           java.lang.String receiverTownId,
           java.lang.String senderTownName,
           java.lang.String receiverTownName,
           java.lang.String senderMobilePhoneNumber,
           java.lang.String receiverMobilePhoneNumber,
           java.lang.String documentReceiverMobilePhoneNumber,
           java.lang.String documentDate,
           java.lang.String documentTime,
           java.lang.String documentDelFlag,
           java.lang.String receiverInfo,
           java.lang.String docType,
           java.lang.String docTypeExplanation,
           java.lang.String contractId,
           java.lang.String trackingUrl,
           java.lang.String shipmentDistance,
           java.lang.String estimatedDeliveryDate,
           java.lang.String cargoType,
           java.lang.String cargoTypeExplanation,
           java.lang.String pickupType,
           java.lang.String pickupTypeExplanation,
           java.lang.String deliveryType,
           java.lang.String deliveryTypeExplanation,
           java.lang.String deliveryDate,
           java.lang.String deliveryTime,
           java.lang.String totalPrice,
           java.lang.String totalVat,
           java.lang.String totalAmount,
           java.lang.String product,
           java.lang.String totalDesi,
           java.lang.String totalKg,
           java.lang.String totalDesiKg,
           java.lang.String totalCargo,
           java.lang.String arrivalUnitId,
           java.lang.String arrivalUnitName,
           java.lang.String departureUnitId,
           java.lang.String departureUnitName,
           java.lang.String deliveryUnitId,
           java.lang.String deliveryUnitName,
           java.lang.String cargoEventId,
           java.lang.String cargoEventExplanation,
           java.lang.String cargoReasonId,
           java.lang.String cargoReasonExplanation,
           java.lang.String documentEventId,
           java.lang.String documentReasonId,
           java.lang.String documentEventExplanation,
           java.lang.String documentReasonExplanation,
           java.lang.String delInfoDeliveryFlag,
           java.lang.String delInfoDelUnitId,
           java.lang.String delEmpName,
           java.lang.String rejectFlag,
           java.lang.String rejectStatus,
           java.lang.String rejectStatusExplanation,
           java.lang.String rejectDescription,
           java.lang.String rejectReasonExplanation,
           java.lang.String returnDocId,
           java.lang.String returnDocumentDate,
           java.lang.String returnDeliveryDate,
           java.lang.String returnStatus,
           java.lang.String returnStatusExplanation,
           tr.com.yurticikargo.sswIntegrationServices.InvDocField2VO[] invDocFieldVOArray,
           tr.com.yurticikargo.sswIntegrationServices.DocCargoField2VO[] docCargoFieldVOArray,
           tr.com.yurticikargo.sswIntegrationServices.DocCargoLifeCycleVO[] docCargoLifeCycleVOArray,
           tr.com.yurticikargo.sswIntegrationServices.DocCargoVO[] docCargoVOArray,
           java.lang.String returnTotalPrice,
           java.lang.String returnTotalVat,
           java.lang.String returnTotalAmount) {
           this.transactionStatus = transactionStatus;
           this.transactionErrCode = transactionErrCode;
           this.transactionMessage = transactionMessage;
           this.fieldName = fieldName;
           this.fieldValue = fieldValue;
           this.docId = docId;
           this.invoiceNumber = invoiceNumber;
           this.docNumber = docNumber;
           this.waybillNo = waybillNo;
           this.docCargoId = docCargoId;
           this.senderCustId = senderCustId;
           this.senderCustName = senderCustName;
           this.senderAddressTxt = senderAddressTxt;
           this.invCustId = invCustId;
           this.invCustName = invCustName;
           this.receiverCustId = receiverCustId;
           this.receiverCustName = receiverCustName;
           this.receiverAddressTxt = receiverAddressTxt;
           this.senderAddressId = senderAddressId;
           this.receiverAddressId = receiverAddressId;
           this.senderCityId = senderCityId;
           this.receiverCityId = receiverCityId;
           this.senderCityName = senderCityName;
           this.receiverCityName = receiverCityName;
           this.senderTownId = senderTownId;
           this.receiverTownId = receiverTownId;
           this.senderTownName = senderTownName;
           this.receiverTownName = receiverTownName;
           this.senderMobilePhoneNumber = senderMobilePhoneNumber;
           this.receiverMobilePhoneNumber = receiverMobilePhoneNumber;
           this.documentReceiverMobilePhoneNumber = documentReceiverMobilePhoneNumber;
           this.documentDate = documentDate;
           this.documentTime = documentTime;
           this.documentDelFlag = documentDelFlag;
           this.receiverInfo = receiverInfo;
           this.docType = docType;
           this.docTypeExplanation = docTypeExplanation;
           this.contractId = contractId;
           this.trackingUrl = trackingUrl;
           this.shipmentDistance = shipmentDistance;
           this.estimatedDeliveryDate = estimatedDeliveryDate;
           this.cargoType = cargoType;
           this.cargoTypeExplanation = cargoTypeExplanation;
           this.pickupType = pickupType;
           this.pickupTypeExplanation = pickupTypeExplanation;
           this.deliveryType = deliveryType;
           this.deliveryTypeExplanation = deliveryTypeExplanation;
           this.deliveryDate = deliveryDate;
           this.deliveryTime = deliveryTime;
           this.totalPrice = totalPrice;
           this.totalVat = totalVat;
           this.totalAmount = totalAmount;
           this.product = product;
           this.totalDesi = totalDesi;
           this.totalKg = totalKg;
           this.totalDesiKg = totalDesiKg;
           this.totalCargo = totalCargo;
           this.arrivalUnitId = arrivalUnitId;
           this.arrivalUnitName = arrivalUnitName;
           this.departureUnitId = departureUnitId;
           this.departureUnitName = departureUnitName;
           this.deliveryUnitId = deliveryUnitId;
           this.deliveryUnitName = deliveryUnitName;
           this.cargoEventId = cargoEventId;
           this.cargoEventExplanation = cargoEventExplanation;
           this.cargoReasonId = cargoReasonId;
           this.cargoReasonExplanation = cargoReasonExplanation;
           this.documentEventId = documentEventId;
           this.documentReasonId = documentReasonId;
           this.documentEventExplanation = documentEventExplanation;
           this.documentReasonExplanation = documentReasonExplanation;
           this.delInfoDeliveryFlag = delInfoDeliveryFlag;
           this.delInfoDelUnitId = delInfoDelUnitId;
           this.delEmpName = delEmpName;
           this.rejectFlag = rejectFlag;
           this.rejectStatus = rejectStatus;
           this.rejectStatusExplanation = rejectStatusExplanation;
           this.rejectDescription = rejectDescription;
           this.rejectReasonExplanation = rejectReasonExplanation;
           this.returnDocId = returnDocId;
           this.returnDocumentDate = returnDocumentDate;
           this.returnDeliveryDate = returnDeliveryDate;
           this.returnStatus = returnStatus;
           this.returnStatusExplanation = returnStatusExplanation;
           this.invDocFieldVOArray = invDocFieldVOArray;
           this.docCargoFieldVOArray = docCargoFieldVOArray;
           this.docCargoLifeCycleVOArray = docCargoLifeCycleVOArray;
           this.docCargoVOArray = docCargoVOArray;
           this.returnTotalPrice = returnTotalPrice;
           this.returnTotalVat = returnTotalVat;
           this.returnTotalAmount = returnTotalAmount;
    }


    /**
     * Gets the transactionStatus value for this ShippingDataDetailVO.
     * 
     * @return transactionStatus
     */
    public java.lang.String getTransactionStatus() {
        return transactionStatus;
    }


    /**
     * Sets the transactionStatus value for this ShippingDataDetailVO.
     * 
     * @param transactionStatus
     */
    public void setTransactionStatus(java.lang.String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }


    /**
     * Gets the transactionErrCode value for this ShippingDataDetailVO.
     * 
     * @return transactionErrCode
     */
    public java.lang.String getTransactionErrCode() {
        return transactionErrCode;
    }


    /**
     * Sets the transactionErrCode value for this ShippingDataDetailVO.
     * 
     * @param transactionErrCode
     */
    public void setTransactionErrCode(java.lang.String transactionErrCode) {
        this.transactionErrCode = transactionErrCode;
    }


    /**
     * Gets the transactionMessage value for this ShippingDataDetailVO.
     * 
     * @return transactionMessage
     */
    public java.lang.String getTransactionMessage() {
        return transactionMessage;
    }


    /**
     * Sets the transactionMessage value for this ShippingDataDetailVO.
     * 
     * @param transactionMessage
     */
    public void setTransactionMessage(java.lang.String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }


    /**
     * Gets the fieldName value for this ShippingDataDetailVO.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this ShippingDataDetailVO.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the fieldValue value for this ShippingDataDetailVO.
     * 
     * @return fieldValue
     */
    public java.lang.String getFieldValue() {
        return fieldValue;
    }


    /**
     * Sets the fieldValue value for this ShippingDataDetailVO.
     * 
     * @param fieldValue
     */
    public void setFieldValue(java.lang.String fieldValue) {
        this.fieldValue = fieldValue;
    }


    /**
     * Gets the docId value for this ShippingDataDetailVO.
     * 
     * @return docId
     */
    public java.lang.String getDocId() {
        return docId;
    }


    /**
     * Sets the docId value for this ShippingDataDetailVO.
     * 
     * @param docId
     */
    public void setDocId(java.lang.String docId) {
        this.docId = docId;
    }


    /**
     * Gets the invoiceNumber value for this ShippingDataDetailVO.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this ShippingDataDetailVO.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the docNumber value for this ShippingDataDetailVO.
     * 
     * @return docNumber
     */
    public java.lang.String getDocNumber() {
        return docNumber;
    }


    /**
     * Sets the docNumber value for this ShippingDataDetailVO.
     * 
     * @param docNumber
     */
    public void setDocNumber(java.lang.String docNumber) {
        this.docNumber = docNumber;
    }


    /**
     * Gets the waybillNo value for this ShippingDataDetailVO.
     * 
     * @return waybillNo
     */
    public java.lang.String getWaybillNo() {
        return waybillNo;
    }


    /**
     * Sets the waybillNo value for this ShippingDataDetailVO.
     * 
     * @param waybillNo
     */
    public void setWaybillNo(java.lang.String waybillNo) {
        this.waybillNo = waybillNo;
    }


    /**
     * Gets the docCargoId value for this ShippingDataDetailVO.
     * 
     * @return docCargoId
     */
    public java.lang.String getDocCargoId() {
        return docCargoId;
    }


    /**
     * Sets the docCargoId value for this ShippingDataDetailVO.
     * 
     * @param docCargoId
     */
    public void setDocCargoId(java.lang.String docCargoId) {
        this.docCargoId = docCargoId;
    }


    /**
     * Gets the senderCustId value for this ShippingDataDetailVO.
     * 
     * @return senderCustId
     */
    public java.lang.String getSenderCustId() {
        return senderCustId;
    }


    /**
     * Sets the senderCustId value for this ShippingDataDetailVO.
     * 
     * @param senderCustId
     */
    public void setSenderCustId(java.lang.String senderCustId) {
        this.senderCustId = senderCustId;
    }


    /**
     * Gets the senderCustName value for this ShippingDataDetailVO.
     * 
     * @return senderCustName
     */
    public java.lang.String getSenderCustName() {
        return senderCustName;
    }


    /**
     * Sets the senderCustName value for this ShippingDataDetailVO.
     * 
     * @param senderCustName
     */
    public void setSenderCustName(java.lang.String senderCustName) {
        this.senderCustName = senderCustName;
    }


    /**
     * Gets the senderAddressTxt value for this ShippingDataDetailVO.
     * 
     * @return senderAddressTxt
     */
    public java.lang.String getSenderAddressTxt() {
        return senderAddressTxt;
    }


    /**
     * Sets the senderAddressTxt value for this ShippingDataDetailVO.
     * 
     * @param senderAddressTxt
     */
    public void setSenderAddressTxt(java.lang.String senderAddressTxt) {
        this.senderAddressTxt = senderAddressTxt;
    }


    /**
     * Gets the invCustId value for this ShippingDataDetailVO.
     * 
     * @return invCustId
     */
    public java.lang.String getInvCustId() {
        return invCustId;
    }


    /**
     * Sets the invCustId value for this ShippingDataDetailVO.
     * 
     * @param invCustId
     */
    public void setInvCustId(java.lang.String invCustId) {
        this.invCustId = invCustId;
    }


    /**
     * Gets the invCustName value for this ShippingDataDetailVO.
     * 
     * @return invCustName
     */
    public java.lang.String getInvCustName() {
        return invCustName;
    }


    /**
     * Sets the invCustName value for this ShippingDataDetailVO.
     * 
     * @param invCustName
     */
    public void setInvCustName(java.lang.String invCustName) {
        this.invCustName = invCustName;
    }


    /**
     * Gets the receiverCustId value for this ShippingDataDetailVO.
     * 
     * @return receiverCustId
     */
    public java.lang.String getReceiverCustId() {
        return receiverCustId;
    }


    /**
     * Sets the receiverCustId value for this ShippingDataDetailVO.
     * 
     * @param receiverCustId
     */
    public void setReceiverCustId(java.lang.String receiverCustId) {
        this.receiverCustId = receiverCustId;
    }


    /**
     * Gets the receiverCustName value for this ShippingDataDetailVO.
     * 
     * @return receiverCustName
     */
    public java.lang.String getReceiverCustName() {
        return receiverCustName;
    }


    /**
     * Sets the receiverCustName value for this ShippingDataDetailVO.
     * 
     * @param receiverCustName
     */
    public void setReceiverCustName(java.lang.String receiverCustName) {
        this.receiverCustName = receiverCustName;
    }


    /**
     * Gets the receiverAddressTxt value for this ShippingDataDetailVO.
     * 
     * @return receiverAddressTxt
     */
    public java.lang.String getReceiverAddressTxt() {
        return receiverAddressTxt;
    }


    /**
     * Sets the receiverAddressTxt value for this ShippingDataDetailVO.
     * 
     * @param receiverAddressTxt
     */
    public void setReceiverAddressTxt(java.lang.String receiverAddressTxt) {
        this.receiverAddressTxt = receiverAddressTxt;
    }


    /**
     * Gets the senderAddressId value for this ShippingDataDetailVO.
     * 
     * @return senderAddressId
     */
    public java.lang.String getSenderAddressId() {
        return senderAddressId;
    }


    /**
     * Sets the senderAddressId value for this ShippingDataDetailVO.
     * 
     * @param senderAddressId
     */
    public void setSenderAddressId(java.lang.String senderAddressId) {
        this.senderAddressId = senderAddressId;
    }


    /**
     * Gets the receiverAddressId value for this ShippingDataDetailVO.
     * 
     * @return receiverAddressId
     */
    public java.lang.String getReceiverAddressId() {
        return receiverAddressId;
    }


    /**
     * Sets the receiverAddressId value for this ShippingDataDetailVO.
     * 
     * @param receiverAddressId
     */
    public void setReceiverAddressId(java.lang.String receiverAddressId) {
        this.receiverAddressId = receiverAddressId;
    }


    /**
     * Gets the senderCityId value for this ShippingDataDetailVO.
     * 
     * @return senderCityId
     */
    public java.lang.String getSenderCityId() {
        return senderCityId;
    }


    /**
     * Sets the senderCityId value for this ShippingDataDetailVO.
     * 
     * @param senderCityId
     */
    public void setSenderCityId(java.lang.String senderCityId) {
        this.senderCityId = senderCityId;
    }


    /**
     * Gets the receiverCityId value for this ShippingDataDetailVO.
     * 
     * @return receiverCityId
     */
    public java.lang.String getReceiverCityId() {
        return receiverCityId;
    }


    /**
     * Sets the receiverCityId value for this ShippingDataDetailVO.
     * 
     * @param receiverCityId
     */
    public void setReceiverCityId(java.lang.String receiverCityId) {
        this.receiverCityId = receiverCityId;
    }


    /**
     * Gets the senderCityName value for this ShippingDataDetailVO.
     * 
     * @return senderCityName
     */
    public java.lang.String getSenderCityName() {
        return senderCityName;
    }


    /**
     * Sets the senderCityName value for this ShippingDataDetailVO.
     * 
     * @param senderCityName
     */
    public void setSenderCityName(java.lang.String senderCityName) {
        this.senderCityName = senderCityName;
    }


    /**
     * Gets the receiverCityName value for this ShippingDataDetailVO.
     * 
     * @return receiverCityName
     */
    public java.lang.String getReceiverCityName() {
        return receiverCityName;
    }


    /**
     * Sets the receiverCityName value for this ShippingDataDetailVO.
     * 
     * @param receiverCityName
     */
    public void setReceiverCityName(java.lang.String receiverCityName) {
        this.receiverCityName = receiverCityName;
    }


    /**
     * Gets the senderTownId value for this ShippingDataDetailVO.
     * 
     * @return senderTownId
     */
    public java.lang.String getSenderTownId() {
        return senderTownId;
    }


    /**
     * Sets the senderTownId value for this ShippingDataDetailVO.
     * 
     * @param senderTownId
     */
    public void setSenderTownId(java.lang.String senderTownId) {
        this.senderTownId = senderTownId;
    }


    /**
     * Gets the receiverTownId value for this ShippingDataDetailVO.
     * 
     * @return receiverTownId
     */
    public java.lang.String getReceiverTownId() {
        return receiverTownId;
    }


    /**
     * Sets the receiverTownId value for this ShippingDataDetailVO.
     * 
     * @param receiverTownId
     */
    public void setReceiverTownId(java.lang.String receiverTownId) {
        this.receiverTownId = receiverTownId;
    }


    /**
     * Gets the senderTownName value for this ShippingDataDetailVO.
     * 
     * @return senderTownName
     */
    public java.lang.String getSenderTownName() {
        return senderTownName;
    }


    /**
     * Sets the senderTownName value for this ShippingDataDetailVO.
     * 
     * @param senderTownName
     */
    public void setSenderTownName(java.lang.String senderTownName) {
        this.senderTownName = senderTownName;
    }


    /**
     * Gets the receiverTownName value for this ShippingDataDetailVO.
     * 
     * @return receiverTownName
     */
    public java.lang.String getReceiverTownName() {
        return receiverTownName;
    }


    /**
     * Sets the receiverTownName value for this ShippingDataDetailVO.
     * 
     * @param receiverTownName
     */
    public void setReceiverTownName(java.lang.String receiverTownName) {
        this.receiverTownName = receiverTownName;
    }


    /**
     * Gets the senderMobilePhoneNumber value for this ShippingDataDetailVO.
     * 
     * @return senderMobilePhoneNumber
     */
    public java.lang.String getSenderMobilePhoneNumber() {
        return senderMobilePhoneNumber;
    }


    /**
     * Sets the senderMobilePhoneNumber value for this ShippingDataDetailVO.
     * 
     * @param senderMobilePhoneNumber
     */
    public void setSenderMobilePhoneNumber(java.lang.String senderMobilePhoneNumber) {
        this.senderMobilePhoneNumber = senderMobilePhoneNumber;
    }


    /**
     * Gets the receiverMobilePhoneNumber value for this ShippingDataDetailVO.
     * 
     * @return receiverMobilePhoneNumber
     */
    public java.lang.String getReceiverMobilePhoneNumber() {
        return receiverMobilePhoneNumber;
    }


    /**
     * Sets the receiverMobilePhoneNumber value for this ShippingDataDetailVO.
     * 
     * @param receiverMobilePhoneNumber
     */
    public void setReceiverMobilePhoneNumber(java.lang.String receiverMobilePhoneNumber) {
        this.receiverMobilePhoneNumber = receiverMobilePhoneNumber;
    }


    /**
     * Gets the documentReceiverMobilePhoneNumber value for this ShippingDataDetailVO.
     * 
     * @return documentReceiverMobilePhoneNumber
     */
    public java.lang.String getDocumentReceiverMobilePhoneNumber() {
        return documentReceiverMobilePhoneNumber;
    }


    /**
     * Sets the documentReceiverMobilePhoneNumber value for this ShippingDataDetailVO.
     * 
     * @param documentReceiverMobilePhoneNumber
     */
    public void setDocumentReceiverMobilePhoneNumber(java.lang.String documentReceiverMobilePhoneNumber) {
        this.documentReceiverMobilePhoneNumber = documentReceiverMobilePhoneNumber;
    }


    /**
     * Gets the documentDate value for this ShippingDataDetailVO.
     * 
     * @return documentDate
     */
    public java.lang.String getDocumentDate() {
        return documentDate;
    }


    /**
     * Sets the documentDate value for this ShippingDataDetailVO.
     * 
     * @param documentDate
     */
    public void setDocumentDate(java.lang.String documentDate) {
        this.documentDate = documentDate;
    }


    /**
     * Gets the documentTime value for this ShippingDataDetailVO.
     * 
     * @return documentTime
     */
    public java.lang.String getDocumentTime() {
        return documentTime;
    }


    /**
     * Sets the documentTime value for this ShippingDataDetailVO.
     * 
     * @param documentTime
     */
    public void setDocumentTime(java.lang.String documentTime) {
        this.documentTime = documentTime;
    }


    /**
     * Gets the documentDelFlag value for this ShippingDataDetailVO.
     * 
     * @return documentDelFlag
     */
    public java.lang.String getDocumentDelFlag() {
        return documentDelFlag;
    }


    /**
     * Sets the documentDelFlag value for this ShippingDataDetailVO.
     * 
     * @param documentDelFlag
     */
    public void setDocumentDelFlag(java.lang.String documentDelFlag) {
        this.documentDelFlag = documentDelFlag;
    }


    /**
     * Gets the receiverInfo value for this ShippingDataDetailVO.
     * 
     * @return receiverInfo
     */
    public java.lang.String getReceiverInfo() {
        return receiverInfo;
    }


    /**
     * Sets the receiverInfo value for this ShippingDataDetailVO.
     * 
     * @param receiverInfo
     */
    public void setReceiverInfo(java.lang.String receiverInfo) {
        this.receiverInfo = receiverInfo;
    }


    /**
     * Gets the docType value for this ShippingDataDetailVO.
     * 
     * @return docType
     */
    public java.lang.String getDocType() {
        return docType;
    }


    /**
     * Sets the docType value for this ShippingDataDetailVO.
     * 
     * @param docType
     */
    public void setDocType(java.lang.String docType) {
        this.docType = docType;
    }


    /**
     * Gets the docTypeExplanation value for this ShippingDataDetailVO.
     * 
     * @return docTypeExplanation
     */
    public java.lang.String getDocTypeExplanation() {
        return docTypeExplanation;
    }


    /**
     * Sets the docTypeExplanation value for this ShippingDataDetailVO.
     * 
     * @param docTypeExplanation
     */
    public void setDocTypeExplanation(java.lang.String docTypeExplanation) {
        this.docTypeExplanation = docTypeExplanation;
    }


    /**
     * Gets the contractId value for this ShippingDataDetailVO.
     * 
     * @return contractId
     */
    public java.lang.String getContractId() {
        return contractId;
    }


    /**
     * Sets the contractId value for this ShippingDataDetailVO.
     * 
     * @param contractId
     */
    public void setContractId(java.lang.String contractId) {
        this.contractId = contractId;
    }


    /**
     * Gets the trackingUrl value for this ShippingDataDetailVO.
     * 
     * @return trackingUrl
     */
    public java.lang.String getTrackingUrl() {
        return trackingUrl;
    }


    /**
     * Sets the trackingUrl value for this ShippingDataDetailVO.
     * 
     * @param trackingUrl
     */
    public void setTrackingUrl(java.lang.String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }


    /**
     * Gets the shipmentDistance value for this ShippingDataDetailVO.
     * 
     * @return shipmentDistance
     */
    public java.lang.String getShipmentDistance() {
        return shipmentDistance;
    }


    /**
     * Sets the shipmentDistance value for this ShippingDataDetailVO.
     * 
     * @param shipmentDistance
     */
    public void setShipmentDistance(java.lang.String shipmentDistance) {
        this.shipmentDistance = shipmentDistance;
    }


    /**
     * Gets the estimatedDeliveryDate value for this ShippingDataDetailVO.
     * 
     * @return estimatedDeliveryDate
     */
    public java.lang.String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }


    /**
     * Sets the estimatedDeliveryDate value for this ShippingDataDetailVO.
     * 
     * @param estimatedDeliveryDate
     */
    public void setEstimatedDeliveryDate(java.lang.String estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }


    /**
     * Gets the cargoType value for this ShippingDataDetailVO.
     * 
     * @return cargoType
     */
    public java.lang.String getCargoType() {
        return cargoType;
    }


    /**
     * Sets the cargoType value for this ShippingDataDetailVO.
     * 
     * @param cargoType
     */
    public void setCargoType(java.lang.String cargoType) {
        this.cargoType = cargoType;
    }


    /**
     * Gets the cargoTypeExplanation value for this ShippingDataDetailVO.
     * 
     * @return cargoTypeExplanation
     */
    public java.lang.String getCargoTypeExplanation() {
        return cargoTypeExplanation;
    }


    /**
     * Sets the cargoTypeExplanation value for this ShippingDataDetailVO.
     * 
     * @param cargoTypeExplanation
     */
    public void setCargoTypeExplanation(java.lang.String cargoTypeExplanation) {
        this.cargoTypeExplanation = cargoTypeExplanation;
    }


    /**
     * Gets the pickupType value for this ShippingDataDetailVO.
     * 
     * @return pickupType
     */
    public java.lang.String getPickupType() {
        return pickupType;
    }


    /**
     * Sets the pickupType value for this ShippingDataDetailVO.
     * 
     * @param pickupType
     */
    public void setPickupType(java.lang.String pickupType) {
        this.pickupType = pickupType;
    }


    /**
     * Gets the pickupTypeExplanation value for this ShippingDataDetailVO.
     * 
     * @return pickupTypeExplanation
     */
    public java.lang.String getPickupTypeExplanation() {
        return pickupTypeExplanation;
    }


    /**
     * Sets the pickupTypeExplanation value for this ShippingDataDetailVO.
     * 
     * @param pickupTypeExplanation
     */
    public void setPickupTypeExplanation(java.lang.String pickupTypeExplanation) {
        this.pickupTypeExplanation = pickupTypeExplanation;
    }


    /**
     * Gets the deliveryType value for this ShippingDataDetailVO.
     * 
     * @return deliveryType
     */
    public java.lang.String getDeliveryType() {
        return deliveryType;
    }


    /**
     * Sets the deliveryType value for this ShippingDataDetailVO.
     * 
     * @param deliveryType
     */
    public void setDeliveryType(java.lang.String deliveryType) {
        this.deliveryType = deliveryType;
    }


    /**
     * Gets the deliveryTypeExplanation value for this ShippingDataDetailVO.
     * 
     * @return deliveryTypeExplanation
     */
    public java.lang.String getDeliveryTypeExplanation() {
        return deliveryTypeExplanation;
    }


    /**
     * Sets the deliveryTypeExplanation value for this ShippingDataDetailVO.
     * 
     * @param deliveryTypeExplanation
     */
    public void setDeliveryTypeExplanation(java.lang.String deliveryTypeExplanation) {
        this.deliveryTypeExplanation = deliveryTypeExplanation;
    }


    /**
     * Gets the deliveryDate value for this ShippingDataDetailVO.
     * 
     * @return deliveryDate
     */
    public java.lang.String getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this ShippingDataDetailVO.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.lang.String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    /**
     * Gets the deliveryTime value for this ShippingDataDetailVO.
     * 
     * @return deliveryTime
     */
    public java.lang.String getDeliveryTime() {
        return deliveryTime;
    }


    /**
     * Sets the deliveryTime value for this ShippingDataDetailVO.
     * 
     * @param deliveryTime
     */
    public void setDeliveryTime(java.lang.String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }


    /**
     * Gets the totalPrice value for this ShippingDataDetailVO.
     * 
     * @return totalPrice
     */
    public java.lang.String getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this ShippingDataDetailVO.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(java.lang.String totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the totalVat value for this ShippingDataDetailVO.
     * 
     * @return totalVat
     */
    public java.lang.String getTotalVat() {
        return totalVat;
    }


    /**
     * Sets the totalVat value for this ShippingDataDetailVO.
     * 
     * @param totalVat
     */
    public void setTotalVat(java.lang.String totalVat) {
        this.totalVat = totalVat;
    }


    /**
     * Gets the totalAmount value for this ShippingDataDetailVO.
     * 
     * @return totalAmount
     */
    public java.lang.String getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this ShippingDataDetailVO.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.lang.String totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the product value for this ShippingDataDetailVO.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ShippingDataDetailVO.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the totalDesi value for this ShippingDataDetailVO.
     * 
     * @return totalDesi
     */
    public java.lang.String getTotalDesi() {
        return totalDesi;
    }


    /**
     * Sets the totalDesi value for this ShippingDataDetailVO.
     * 
     * @param totalDesi
     */
    public void setTotalDesi(java.lang.String totalDesi) {
        this.totalDesi = totalDesi;
    }


    /**
     * Gets the totalKg value for this ShippingDataDetailVO.
     * 
     * @return totalKg
     */
    public java.lang.String getTotalKg() {
        return totalKg;
    }


    /**
     * Sets the totalKg value for this ShippingDataDetailVO.
     * 
     * @param totalKg
     */
    public void setTotalKg(java.lang.String totalKg) {
        this.totalKg = totalKg;
    }


    /**
     * Gets the totalDesiKg value for this ShippingDataDetailVO.
     * 
     * @return totalDesiKg
     */
    public java.lang.String getTotalDesiKg() {
        return totalDesiKg;
    }


    /**
     * Sets the totalDesiKg value for this ShippingDataDetailVO.
     * 
     * @param totalDesiKg
     */
    public void setTotalDesiKg(java.lang.String totalDesiKg) {
        this.totalDesiKg = totalDesiKg;
    }


    /**
     * Gets the totalCargo value for this ShippingDataDetailVO.
     * 
     * @return totalCargo
     */
    public java.lang.String getTotalCargo() {
        return totalCargo;
    }


    /**
     * Sets the totalCargo value for this ShippingDataDetailVO.
     * 
     * @param totalCargo
     */
    public void setTotalCargo(java.lang.String totalCargo) {
        this.totalCargo = totalCargo;
    }


    /**
     * Gets the arrivalUnitId value for this ShippingDataDetailVO.
     * 
     * @return arrivalUnitId
     */
    public java.lang.String getArrivalUnitId() {
        return arrivalUnitId;
    }


    /**
     * Sets the arrivalUnitId value for this ShippingDataDetailVO.
     * 
     * @param arrivalUnitId
     */
    public void setArrivalUnitId(java.lang.String arrivalUnitId) {
        this.arrivalUnitId = arrivalUnitId;
    }


    /**
     * Gets the arrivalUnitName value for this ShippingDataDetailVO.
     * 
     * @return arrivalUnitName
     */
    public java.lang.String getArrivalUnitName() {
        return arrivalUnitName;
    }


    /**
     * Sets the arrivalUnitName value for this ShippingDataDetailVO.
     * 
     * @param arrivalUnitName
     */
    public void setArrivalUnitName(java.lang.String arrivalUnitName) {
        this.arrivalUnitName = arrivalUnitName;
    }


    /**
     * Gets the departureUnitId value for this ShippingDataDetailVO.
     * 
     * @return departureUnitId
     */
    public java.lang.String getDepartureUnitId() {
        return departureUnitId;
    }


    /**
     * Sets the departureUnitId value for this ShippingDataDetailVO.
     * 
     * @param departureUnitId
     */
    public void setDepartureUnitId(java.lang.String departureUnitId) {
        this.departureUnitId = departureUnitId;
    }


    /**
     * Gets the departureUnitName value for this ShippingDataDetailVO.
     * 
     * @return departureUnitName
     */
    public java.lang.String getDepartureUnitName() {
        return departureUnitName;
    }


    /**
     * Sets the departureUnitName value for this ShippingDataDetailVO.
     * 
     * @param departureUnitName
     */
    public void setDepartureUnitName(java.lang.String departureUnitName) {
        this.departureUnitName = departureUnitName;
    }


    /**
     * Gets the deliveryUnitId value for this ShippingDataDetailVO.
     * 
     * @return deliveryUnitId
     */
    public java.lang.String getDeliveryUnitId() {
        return deliveryUnitId;
    }


    /**
     * Sets the deliveryUnitId value for this ShippingDataDetailVO.
     * 
     * @param deliveryUnitId
     */
    public void setDeliveryUnitId(java.lang.String deliveryUnitId) {
        this.deliveryUnitId = deliveryUnitId;
    }


    /**
     * Gets the deliveryUnitName value for this ShippingDataDetailVO.
     * 
     * @return deliveryUnitName
     */
    public java.lang.String getDeliveryUnitName() {
        return deliveryUnitName;
    }


    /**
     * Sets the deliveryUnitName value for this ShippingDataDetailVO.
     * 
     * @param deliveryUnitName
     */
    public void setDeliveryUnitName(java.lang.String deliveryUnitName) {
        this.deliveryUnitName = deliveryUnitName;
    }


    /**
     * Gets the cargoEventId value for this ShippingDataDetailVO.
     * 
     * @return cargoEventId
     */
    public java.lang.String getCargoEventId() {
        return cargoEventId;
    }


    /**
     * Sets the cargoEventId value for this ShippingDataDetailVO.
     * 
     * @param cargoEventId
     */
    public void setCargoEventId(java.lang.String cargoEventId) {
        this.cargoEventId = cargoEventId;
    }


    /**
     * Gets the cargoEventExplanation value for this ShippingDataDetailVO.
     * 
     * @return cargoEventExplanation
     */
    public java.lang.String getCargoEventExplanation() {
        return cargoEventExplanation;
    }


    /**
     * Sets the cargoEventExplanation value for this ShippingDataDetailVO.
     * 
     * @param cargoEventExplanation
     */
    public void setCargoEventExplanation(java.lang.String cargoEventExplanation) {
        this.cargoEventExplanation = cargoEventExplanation;
    }


    /**
     * Gets the cargoReasonId value for this ShippingDataDetailVO.
     * 
     * @return cargoReasonId
     */
    public java.lang.String getCargoReasonId() {
        return cargoReasonId;
    }


    /**
     * Sets the cargoReasonId value for this ShippingDataDetailVO.
     * 
     * @param cargoReasonId
     */
    public void setCargoReasonId(java.lang.String cargoReasonId) {
        this.cargoReasonId = cargoReasonId;
    }


    /**
     * Gets the cargoReasonExplanation value for this ShippingDataDetailVO.
     * 
     * @return cargoReasonExplanation
     */
    public java.lang.String getCargoReasonExplanation() {
        return cargoReasonExplanation;
    }


    /**
     * Sets the cargoReasonExplanation value for this ShippingDataDetailVO.
     * 
     * @param cargoReasonExplanation
     */
    public void setCargoReasonExplanation(java.lang.String cargoReasonExplanation) {
        this.cargoReasonExplanation = cargoReasonExplanation;
    }


    /**
     * Gets the documentEventId value for this ShippingDataDetailVO.
     * 
     * @return documentEventId
     */
    public java.lang.String getDocumentEventId() {
        return documentEventId;
    }


    /**
     * Sets the documentEventId value for this ShippingDataDetailVO.
     * 
     * @param documentEventId
     */
    public void setDocumentEventId(java.lang.String documentEventId) {
        this.documentEventId = documentEventId;
    }


    /**
     * Gets the documentReasonId value for this ShippingDataDetailVO.
     * 
     * @return documentReasonId
     */
    public java.lang.String getDocumentReasonId() {
        return documentReasonId;
    }


    /**
     * Sets the documentReasonId value for this ShippingDataDetailVO.
     * 
     * @param documentReasonId
     */
    public void setDocumentReasonId(java.lang.String documentReasonId) {
        this.documentReasonId = documentReasonId;
    }


    /**
     * Gets the documentEventExplanation value for this ShippingDataDetailVO.
     * 
     * @return documentEventExplanation
     */
    public java.lang.String getDocumentEventExplanation() {
        return documentEventExplanation;
    }


    /**
     * Sets the documentEventExplanation value for this ShippingDataDetailVO.
     * 
     * @param documentEventExplanation
     */
    public void setDocumentEventExplanation(java.lang.String documentEventExplanation) {
        this.documentEventExplanation = documentEventExplanation;
    }


    /**
     * Gets the documentReasonExplanation value for this ShippingDataDetailVO.
     * 
     * @return documentReasonExplanation
     */
    public java.lang.String getDocumentReasonExplanation() {
        return documentReasonExplanation;
    }


    /**
     * Sets the documentReasonExplanation value for this ShippingDataDetailVO.
     * 
     * @param documentReasonExplanation
     */
    public void setDocumentReasonExplanation(java.lang.String documentReasonExplanation) {
        this.documentReasonExplanation = documentReasonExplanation;
    }


    /**
     * Gets the delInfoDeliveryFlag value for this ShippingDataDetailVO.
     * 
     * @return delInfoDeliveryFlag
     */
    public java.lang.String getDelInfoDeliveryFlag() {
        return delInfoDeliveryFlag;
    }


    /**
     * Sets the delInfoDeliveryFlag value for this ShippingDataDetailVO.
     * 
     * @param delInfoDeliveryFlag
     */
    public void setDelInfoDeliveryFlag(java.lang.String delInfoDeliveryFlag) {
        this.delInfoDeliveryFlag = delInfoDeliveryFlag;
    }


    /**
     * Gets the delInfoDelUnitId value for this ShippingDataDetailVO.
     * 
     * @return delInfoDelUnitId
     */
    public java.lang.String getDelInfoDelUnitId() {
        return delInfoDelUnitId;
    }


    /**
     * Sets the delInfoDelUnitId value for this ShippingDataDetailVO.
     * 
     * @param delInfoDelUnitId
     */
    public void setDelInfoDelUnitId(java.lang.String delInfoDelUnitId) {
        this.delInfoDelUnitId = delInfoDelUnitId;
    }


    /**
     * Gets the delEmpName value for this ShippingDataDetailVO.
     * 
     * @return delEmpName
     */
    public java.lang.String getDelEmpName() {
        return delEmpName;
    }


    /**
     * Sets the delEmpName value for this ShippingDataDetailVO.
     * 
     * @param delEmpName
     */
    public void setDelEmpName(java.lang.String delEmpName) {
        this.delEmpName = delEmpName;
    }


    /**
     * Gets the rejectFlag value for this ShippingDataDetailVO.
     * 
     * @return rejectFlag
     */
    public java.lang.String getRejectFlag() {
        return rejectFlag;
    }


    /**
     * Sets the rejectFlag value for this ShippingDataDetailVO.
     * 
     * @param rejectFlag
     */
    public void setRejectFlag(java.lang.String rejectFlag) {
        this.rejectFlag = rejectFlag;
    }


    /**
     * Gets the rejectStatus value for this ShippingDataDetailVO.
     * 
     * @return rejectStatus
     */
    public java.lang.String getRejectStatus() {
        return rejectStatus;
    }


    /**
     * Sets the rejectStatus value for this ShippingDataDetailVO.
     * 
     * @param rejectStatus
     */
    public void setRejectStatus(java.lang.String rejectStatus) {
        this.rejectStatus = rejectStatus;
    }


    /**
     * Gets the rejectStatusExplanation value for this ShippingDataDetailVO.
     * 
     * @return rejectStatusExplanation
     */
    public java.lang.String getRejectStatusExplanation() {
        return rejectStatusExplanation;
    }


    /**
     * Sets the rejectStatusExplanation value for this ShippingDataDetailVO.
     * 
     * @param rejectStatusExplanation
     */
    public void setRejectStatusExplanation(java.lang.String rejectStatusExplanation) {
        this.rejectStatusExplanation = rejectStatusExplanation;
    }


    /**
     * Gets the rejectDescription value for this ShippingDataDetailVO.
     * 
     * @return rejectDescription
     */
    public java.lang.String getRejectDescription() {
        return rejectDescription;
    }


    /**
     * Sets the rejectDescription value for this ShippingDataDetailVO.
     * 
     * @param rejectDescription
     */
    public void setRejectDescription(java.lang.String rejectDescription) {
        this.rejectDescription = rejectDescription;
    }


    /**
     * Gets the rejectReasonExplanation value for this ShippingDataDetailVO.
     * 
     * @return rejectReasonExplanation
     */
    public java.lang.String getRejectReasonExplanation() {
        return rejectReasonExplanation;
    }


    /**
     * Sets the rejectReasonExplanation value for this ShippingDataDetailVO.
     * 
     * @param rejectReasonExplanation
     */
    public void setRejectReasonExplanation(java.lang.String rejectReasonExplanation) {
        this.rejectReasonExplanation = rejectReasonExplanation;
    }


    /**
     * Gets the returnDocId value for this ShippingDataDetailVO.
     * 
     * @return returnDocId
     */
    public java.lang.String getReturnDocId() {
        return returnDocId;
    }


    /**
     * Sets the returnDocId value for this ShippingDataDetailVO.
     * 
     * @param returnDocId
     */
    public void setReturnDocId(java.lang.String returnDocId) {
        this.returnDocId = returnDocId;
    }


    /**
     * Gets the returnDocumentDate value for this ShippingDataDetailVO.
     * 
     * @return returnDocumentDate
     */
    public java.lang.String getReturnDocumentDate() {
        return returnDocumentDate;
    }


    /**
     * Sets the returnDocumentDate value for this ShippingDataDetailVO.
     * 
     * @param returnDocumentDate
     */
    public void setReturnDocumentDate(java.lang.String returnDocumentDate) {
        this.returnDocumentDate = returnDocumentDate;
    }


    /**
     * Gets the returnDeliveryDate value for this ShippingDataDetailVO.
     * 
     * @return returnDeliveryDate
     */
    public java.lang.String getReturnDeliveryDate() {
        return returnDeliveryDate;
    }


    /**
     * Sets the returnDeliveryDate value for this ShippingDataDetailVO.
     * 
     * @param returnDeliveryDate
     */
    public void setReturnDeliveryDate(java.lang.String returnDeliveryDate) {
        this.returnDeliveryDate = returnDeliveryDate;
    }


    /**
     * Gets the returnStatus value for this ShippingDataDetailVO.
     * 
     * @return returnStatus
     */
    public java.lang.String getReturnStatus() {
        return returnStatus;
    }


    /**
     * Sets the returnStatus value for this ShippingDataDetailVO.
     * 
     * @param returnStatus
     */
    public void setReturnStatus(java.lang.String returnStatus) {
        this.returnStatus = returnStatus;
    }


    /**
     * Gets the returnStatusExplanation value for this ShippingDataDetailVO.
     * 
     * @return returnStatusExplanation
     */
    public java.lang.String getReturnStatusExplanation() {
        return returnStatusExplanation;
    }


    /**
     * Sets the returnStatusExplanation value for this ShippingDataDetailVO.
     * 
     * @param returnStatusExplanation
     */
    public void setReturnStatusExplanation(java.lang.String returnStatusExplanation) {
        this.returnStatusExplanation = returnStatusExplanation;
    }


    /**
     * Gets the invDocFieldVOArray value for this ShippingDataDetailVO.
     * 
     * @return invDocFieldVOArray
     */
    public tr.com.yurticikargo.sswIntegrationServices.InvDocField2VO[] getInvDocFieldVOArray() {
        return invDocFieldVOArray;
    }


    /**
     * Sets the invDocFieldVOArray value for this ShippingDataDetailVO.
     * 
     * @param invDocFieldVOArray
     */
    public void setInvDocFieldVOArray(tr.com.yurticikargo.sswIntegrationServices.InvDocField2VO[] invDocFieldVOArray) {
        this.invDocFieldVOArray = invDocFieldVOArray;
    }

    public tr.com.yurticikargo.sswIntegrationServices.InvDocField2VO getInvDocFieldVOArray(int i) {
        return this.invDocFieldVOArray[i];
    }

    public void setInvDocFieldVOArray(int i, tr.com.yurticikargo.sswIntegrationServices.InvDocField2VO _value) {
        this.invDocFieldVOArray[i] = _value;
    }


    /**
     * Gets the docCargoFieldVOArray value for this ShippingDataDetailVO.
     * 
     * @return docCargoFieldVOArray
     */
    public tr.com.yurticikargo.sswIntegrationServices.DocCargoField2VO[] getDocCargoFieldVOArray() {
        return docCargoFieldVOArray;
    }


    /**
     * Sets the docCargoFieldVOArray value for this ShippingDataDetailVO.
     * 
     * @param docCargoFieldVOArray
     */
    public void setDocCargoFieldVOArray(tr.com.yurticikargo.sswIntegrationServices.DocCargoField2VO[] docCargoFieldVOArray) {
        this.docCargoFieldVOArray = docCargoFieldVOArray;
    }

    public tr.com.yurticikargo.sswIntegrationServices.DocCargoField2VO getDocCargoFieldVOArray(int i) {
        return this.docCargoFieldVOArray[i];
    }

    public void setDocCargoFieldVOArray(int i, tr.com.yurticikargo.sswIntegrationServices.DocCargoField2VO _value) {
        this.docCargoFieldVOArray[i] = _value;
    }


    /**
     * Gets the docCargoLifeCycleVOArray value for this ShippingDataDetailVO.
     * 
     * @return docCargoLifeCycleVOArray
     */
    public tr.com.yurticikargo.sswIntegrationServices.DocCargoLifeCycleVO[] getDocCargoLifeCycleVOArray() {
        return docCargoLifeCycleVOArray;
    }


    /**
     * Sets the docCargoLifeCycleVOArray value for this ShippingDataDetailVO.
     * 
     * @param docCargoLifeCycleVOArray
     */
    public void setDocCargoLifeCycleVOArray(tr.com.yurticikargo.sswIntegrationServices.DocCargoLifeCycleVO[] docCargoLifeCycleVOArray) {
        this.docCargoLifeCycleVOArray = docCargoLifeCycleVOArray;
    }

    public tr.com.yurticikargo.sswIntegrationServices.DocCargoLifeCycleVO getDocCargoLifeCycleVOArray(int i) {
        return this.docCargoLifeCycleVOArray[i];
    }

    public void setDocCargoLifeCycleVOArray(int i, tr.com.yurticikargo.sswIntegrationServices.DocCargoLifeCycleVO _value) {
        this.docCargoLifeCycleVOArray[i] = _value;
    }


    /**
     * Gets the docCargoVOArray value for this ShippingDataDetailVO.
     * 
     * @return docCargoVOArray
     */
    public tr.com.yurticikargo.sswIntegrationServices.DocCargoVO[] getDocCargoVOArray() {
        return docCargoVOArray;
    }


    /**
     * Sets the docCargoVOArray value for this ShippingDataDetailVO.
     * 
     * @param docCargoVOArray
     */
    public void setDocCargoVOArray(tr.com.yurticikargo.sswIntegrationServices.DocCargoVO[] docCargoVOArray) {
        this.docCargoVOArray = docCargoVOArray;
    }

    public tr.com.yurticikargo.sswIntegrationServices.DocCargoVO getDocCargoVOArray(int i) {
        return this.docCargoVOArray[i];
    }

    public void setDocCargoVOArray(int i, tr.com.yurticikargo.sswIntegrationServices.DocCargoVO _value) {
        this.docCargoVOArray[i] = _value;
    }


    /**
     * Gets the returnTotalPrice value for this ShippingDataDetailVO.
     * 
     * @return returnTotalPrice
     */
    public java.lang.String getReturnTotalPrice() {
        return returnTotalPrice;
    }


    /**
     * Sets the returnTotalPrice value for this ShippingDataDetailVO.
     * 
     * @param returnTotalPrice
     */
    public void setReturnTotalPrice(java.lang.String returnTotalPrice) {
        this.returnTotalPrice = returnTotalPrice;
    }


    /**
     * Gets the returnTotalVat value for this ShippingDataDetailVO.
     * 
     * @return returnTotalVat
     */
    public java.lang.String getReturnTotalVat() {
        return returnTotalVat;
    }


    /**
     * Sets the returnTotalVat value for this ShippingDataDetailVO.
     * 
     * @param returnTotalVat
     */
    public void setReturnTotalVat(java.lang.String returnTotalVat) {
        this.returnTotalVat = returnTotalVat;
    }


    /**
     * Gets the returnTotalAmount value for this ShippingDataDetailVO.
     * 
     * @return returnTotalAmount
     */
    public java.lang.String getReturnTotalAmount() {
        return returnTotalAmount;
    }


    /**
     * Sets the returnTotalAmount value for this ShippingDataDetailVO.
     * 
     * @param returnTotalAmount
     */
    public void setReturnTotalAmount(java.lang.String returnTotalAmount) {
        this.returnTotalAmount = returnTotalAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingDataDetailVO)) return false;
        ShippingDataDetailVO other = (ShippingDataDetailVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionStatus==null && other.getTransactionStatus()==null) || 
             (this.transactionStatus!=null &&
              this.transactionStatus.equals(other.getTransactionStatus()))) &&
            ((this.transactionErrCode==null && other.getTransactionErrCode()==null) || 
             (this.transactionErrCode!=null &&
              this.transactionErrCode.equals(other.getTransactionErrCode()))) &&
            ((this.transactionMessage==null && other.getTransactionMessage()==null) || 
             (this.transactionMessage!=null &&
              this.transactionMessage.equals(other.getTransactionMessage()))) &&
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.fieldValue==null && other.getFieldValue()==null) || 
             (this.fieldValue!=null &&
              this.fieldValue.equals(other.getFieldValue()))) &&
            ((this.docId==null && other.getDocId()==null) || 
             (this.docId!=null &&
              this.docId.equals(other.getDocId()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.docNumber==null && other.getDocNumber()==null) || 
             (this.docNumber!=null &&
              this.docNumber.equals(other.getDocNumber()))) &&
            ((this.waybillNo==null && other.getWaybillNo()==null) || 
             (this.waybillNo!=null &&
              this.waybillNo.equals(other.getWaybillNo()))) &&
            ((this.docCargoId==null && other.getDocCargoId()==null) || 
             (this.docCargoId!=null &&
              this.docCargoId.equals(other.getDocCargoId()))) &&
            ((this.senderCustId==null && other.getSenderCustId()==null) || 
             (this.senderCustId!=null &&
              this.senderCustId.equals(other.getSenderCustId()))) &&
            ((this.senderCustName==null && other.getSenderCustName()==null) || 
             (this.senderCustName!=null &&
              this.senderCustName.equals(other.getSenderCustName()))) &&
            ((this.senderAddressTxt==null && other.getSenderAddressTxt()==null) || 
             (this.senderAddressTxt!=null &&
              this.senderAddressTxt.equals(other.getSenderAddressTxt()))) &&
            ((this.invCustId==null && other.getInvCustId()==null) || 
             (this.invCustId!=null &&
              this.invCustId.equals(other.getInvCustId()))) &&
            ((this.invCustName==null && other.getInvCustName()==null) || 
             (this.invCustName!=null &&
              this.invCustName.equals(other.getInvCustName()))) &&
            ((this.receiverCustId==null && other.getReceiverCustId()==null) || 
             (this.receiverCustId!=null &&
              this.receiverCustId.equals(other.getReceiverCustId()))) &&
            ((this.receiverCustName==null && other.getReceiverCustName()==null) || 
             (this.receiverCustName!=null &&
              this.receiverCustName.equals(other.getReceiverCustName()))) &&
            ((this.receiverAddressTxt==null && other.getReceiverAddressTxt()==null) || 
             (this.receiverAddressTxt!=null &&
              this.receiverAddressTxt.equals(other.getReceiverAddressTxt()))) &&
            ((this.senderAddressId==null && other.getSenderAddressId()==null) || 
             (this.senderAddressId!=null &&
              this.senderAddressId.equals(other.getSenderAddressId()))) &&
            ((this.receiverAddressId==null && other.getReceiverAddressId()==null) || 
             (this.receiverAddressId!=null &&
              this.receiverAddressId.equals(other.getReceiverAddressId()))) &&
            ((this.senderCityId==null && other.getSenderCityId()==null) || 
             (this.senderCityId!=null &&
              this.senderCityId.equals(other.getSenderCityId()))) &&
            ((this.receiverCityId==null && other.getReceiverCityId()==null) || 
             (this.receiverCityId!=null &&
              this.receiverCityId.equals(other.getReceiverCityId()))) &&
            ((this.senderCityName==null && other.getSenderCityName()==null) || 
             (this.senderCityName!=null &&
              this.senderCityName.equals(other.getSenderCityName()))) &&
            ((this.receiverCityName==null && other.getReceiverCityName()==null) || 
             (this.receiverCityName!=null &&
              this.receiverCityName.equals(other.getReceiverCityName()))) &&
            ((this.senderTownId==null && other.getSenderTownId()==null) || 
             (this.senderTownId!=null &&
              this.senderTownId.equals(other.getSenderTownId()))) &&
            ((this.receiverTownId==null && other.getReceiverTownId()==null) || 
             (this.receiverTownId!=null &&
              this.receiverTownId.equals(other.getReceiverTownId()))) &&
            ((this.senderTownName==null && other.getSenderTownName()==null) || 
             (this.senderTownName!=null &&
              this.senderTownName.equals(other.getSenderTownName()))) &&
            ((this.receiverTownName==null && other.getReceiverTownName()==null) || 
             (this.receiverTownName!=null &&
              this.receiverTownName.equals(other.getReceiverTownName()))) &&
            ((this.senderMobilePhoneNumber==null && other.getSenderMobilePhoneNumber()==null) || 
             (this.senderMobilePhoneNumber!=null &&
              this.senderMobilePhoneNumber.equals(other.getSenderMobilePhoneNumber()))) &&
            ((this.receiverMobilePhoneNumber==null && other.getReceiverMobilePhoneNumber()==null) || 
             (this.receiverMobilePhoneNumber!=null &&
              this.receiverMobilePhoneNumber.equals(other.getReceiverMobilePhoneNumber()))) &&
            ((this.documentReceiverMobilePhoneNumber==null && other.getDocumentReceiverMobilePhoneNumber()==null) || 
             (this.documentReceiverMobilePhoneNumber!=null &&
              this.documentReceiverMobilePhoneNumber.equals(other.getDocumentReceiverMobilePhoneNumber()))) &&
            ((this.documentDate==null && other.getDocumentDate()==null) || 
             (this.documentDate!=null &&
              this.documentDate.equals(other.getDocumentDate()))) &&
            ((this.documentTime==null && other.getDocumentTime()==null) || 
             (this.documentTime!=null &&
              this.documentTime.equals(other.getDocumentTime()))) &&
            ((this.documentDelFlag==null && other.getDocumentDelFlag()==null) || 
             (this.documentDelFlag!=null &&
              this.documentDelFlag.equals(other.getDocumentDelFlag()))) &&
            ((this.receiverInfo==null && other.getReceiverInfo()==null) || 
             (this.receiverInfo!=null &&
              this.receiverInfo.equals(other.getReceiverInfo()))) &&
            ((this.docType==null && other.getDocType()==null) || 
             (this.docType!=null &&
              this.docType.equals(other.getDocType()))) &&
            ((this.docTypeExplanation==null && other.getDocTypeExplanation()==null) || 
             (this.docTypeExplanation!=null &&
              this.docTypeExplanation.equals(other.getDocTypeExplanation()))) &&
            ((this.contractId==null && other.getContractId()==null) || 
             (this.contractId!=null &&
              this.contractId.equals(other.getContractId()))) &&
            ((this.trackingUrl==null && other.getTrackingUrl()==null) || 
             (this.trackingUrl!=null &&
              this.trackingUrl.equals(other.getTrackingUrl()))) &&
            ((this.shipmentDistance==null && other.getShipmentDistance()==null) || 
             (this.shipmentDistance!=null &&
              this.shipmentDistance.equals(other.getShipmentDistance()))) &&
            ((this.estimatedDeliveryDate==null && other.getEstimatedDeliveryDate()==null) || 
             (this.estimatedDeliveryDate!=null &&
              this.estimatedDeliveryDate.equals(other.getEstimatedDeliveryDate()))) &&
            ((this.cargoType==null && other.getCargoType()==null) || 
             (this.cargoType!=null &&
              this.cargoType.equals(other.getCargoType()))) &&
            ((this.cargoTypeExplanation==null && other.getCargoTypeExplanation()==null) || 
             (this.cargoTypeExplanation!=null &&
              this.cargoTypeExplanation.equals(other.getCargoTypeExplanation()))) &&
            ((this.pickupType==null && other.getPickupType()==null) || 
             (this.pickupType!=null &&
              this.pickupType.equals(other.getPickupType()))) &&
            ((this.pickupTypeExplanation==null && other.getPickupTypeExplanation()==null) || 
             (this.pickupTypeExplanation!=null &&
              this.pickupTypeExplanation.equals(other.getPickupTypeExplanation()))) &&
            ((this.deliveryType==null && other.getDeliveryType()==null) || 
             (this.deliveryType!=null &&
              this.deliveryType.equals(other.getDeliveryType()))) &&
            ((this.deliveryTypeExplanation==null && other.getDeliveryTypeExplanation()==null) || 
             (this.deliveryTypeExplanation!=null &&
              this.deliveryTypeExplanation.equals(other.getDeliveryTypeExplanation()))) &&
            ((this.deliveryDate==null && other.getDeliveryDate()==null) || 
             (this.deliveryDate!=null &&
              this.deliveryDate.equals(other.getDeliveryDate()))) &&
            ((this.deliveryTime==null && other.getDeliveryTime()==null) || 
             (this.deliveryTime!=null &&
              this.deliveryTime.equals(other.getDeliveryTime()))) &&
            ((this.totalPrice==null && other.getTotalPrice()==null) || 
             (this.totalPrice!=null &&
              this.totalPrice.equals(other.getTotalPrice()))) &&
            ((this.totalVat==null && other.getTotalVat()==null) || 
             (this.totalVat!=null &&
              this.totalVat.equals(other.getTotalVat()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.totalDesi==null && other.getTotalDesi()==null) || 
             (this.totalDesi!=null &&
              this.totalDesi.equals(other.getTotalDesi()))) &&
            ((this.totalKg==null && other.getTotalKg()==null) || 
             (this.totalKg!=null &&
              this.totalKg.equals(other.getTotalKg()))) &&
            ((this.totalDesiKg==null && other.getTotalDesiKg()==null) || 
             (this.totalDesiKg!=null &&
              this.totalDesiKg.equals(other.getTotalDesiKg()))) &&
            ((this.totalCargo==null && other.getTotalCargo()==null) || 
             (this.totalCargo!=null &&
              this.totalCargo.equals(other.getTotalCargo()))) &&
            ((this.arrivalUnitId==null && other.getArrivalUnitId()==null) || 
             (this.arrivalUnitId!=null &&
              this.arrivalUnitId.equals(other.getArrivalUnitId()))) &&
            ((this.arrivalUnitName==null && other.getArrivalUnitName()==null) || 
             (this.arrivalUnitName!=null &&
              this.arrivalUnitName.equals(other.getArrivalUnitName()))) &&
            ((this.departureUnitId==null && other.getDepartureUnitId()==null) || 
             (this.departureUnitId!=null &&
              this.departureUnitId.equals(other.getDepartureUnitId()))) &&
            ((this.departureUnitName==null && other.getDepartureUnitName()==null) || 
             (this.departureUnitName!=null &&
              this.departureUnitName.equals(other.getDepartureUnitName()))) &&
            ((this.deliveryUnitId==null && other.getDeliveryUnitId()==null) || 
             (this.deliveryUnitId!=null &&
              this.deliveryUnitId.equals(other.getDeliveryUnitId()))) &&
            ((this.deliveryUnitName==null && other.getDeliveryUnitName()==null) || 
             (this.deliveryUnitName!=null &&
              this.deliveryUnitName.equals(other.getDeliveryUnitName()))) &&
            ((this.cargoEventId==null && other.getCargoEventId()==null) || 
             (this.cargoEventId!=null &&
              this.cargoEventId.equals(other.getCargoEventId()))) &&
            ((this.cargoEventExplanation==null && other.getCargoEventExplanation()==null) || 
             (this.cargoEventExplanation!=null &&
              this.cargoEventExplanation.equals(other.getCargoEventExplanation()))) &&
            ((this.cargoReasonId==null && other.getCargoReasonId()==null) || 
             (this.cargoReasonId!=null &&
              this.cargoReasonId.equals(other.getCargoReasonId()))) &&
            ((this.cargoReasonExplanation==null && other.getCargoReasonExplanation()==null) || 
             (this.cargoReasonExplanation!=null &&
              this.cargoReasonExplanation.equals(other.getCargoReasonExplanation()))) &&
            ((this.documentEventId==null && other.getDocumentEventId()==null) || 
             (this.documentEventId!=null &&
              this.documentEventId.equals(other.getDocumentEventId()))) &&
            ((this.documentReasonId==null && other.getDocumentReasonId()==null) || 
             (this.documentReasonId!=null &&
              this.documentReasonId.equals(other.getDocumentReasonId()))) &&
            ((this.documentEventExplanation==null && other.getDocumentEventExplanation()==null) || 
             (this.documentEventExplanation!=null &&
              this.documentEventExplanation.equals(other.getDocumentEventExplanation()))) &&
            ((this.documentReasonExplanation==null && other.getDocumentReasonExplanation()==null) || 
             (this.documentReasonExplanation!=null &&
              this.documentReasonExplanation.equals(other.getDocumentReasonExplanation()))) &&
            ((this.delInfoDeliveryFlag==null && other.getDelInfoDeliveryFlag()==null) || 
             (this.delInfoDeliveryFlag!=null &&
              this.delInfoDeliveryFlag.equals(other.getDelInfoDeliveryFlag()))) &&
            ((this.delInfoDelUnitId==null && other.getDelInfoDelUnitId()==null) || 
             (this.delInfoDelUnitId!=null &&
              this.delInfoDelUnitId.equals(other.getDelInfoDelUnitId()))) &&
            ((this.delEmpName==null && other.getDelEmpName()==null) || 
             (this.delEmpName!=null &&
              this.delEmpName.equals(other.getDelEmpName()))) &&
            ((this.rejectFlag==null && other.getRejectFlag()==null) || 
             (this.rejectFlag!=null &&
              this.rejectFlag.equals(other.getRejectFlag()))) &&
            ((this.rejectStatus==null && other.getRejectStatus()==null) || 
             (this.rejectStatus!=null &&
              this.rejectStatus.equals(other.getRejectStatus()))) &&
            ((this.rejectStatusExplanation==null && other.getRejectStatusExplanation()==null) || 
             (this.rejectStatusExplanation!=null &&
              this.rejectStatusExplanation.equals(other.getRejectStatusExplanation()))) &&
            ((this.rejectDescription==null && other.getRejectDescription()==null) || 
             (this.rejectDescription!=null &&
              this.rejectDescription.equals(other.getRejectDescription()))) &&
            ((this.rejectReasonExplanation==null && other.getRejectReasonExplanation()==null) || 
             (this.rejectReasonExplanation!=null &&
              this.rejectReasonExplanation.equals(other.getRejectReasonExplanation()))) &&
            ((this.returnDocId==null && other.getReturnDocId()==null) || 
             (this.returnDocId!=null &&
              this.returnDocId.equals(other.getReturnDocId()))) &&
            ((this.returnDocumentDate==null && other.getReturnDocumentDate()==null) || 
             (this.returnDocumentDate!=null &&
              this.returnDocumentDate.equals(other.getReturnDocumentDate()))) &&
            ((this.returnDeliveryDate==null && other.getReturnDeliveryDate()==null) || 
             (this.returnDeliveryDate!=null &&
              this.returnDeliveryDate.equals(other.getReturnDeliveryDate()))) &&
            ((this.returnStatus==null && other.getReturnStatus()==null) || 
             (this.returnStatus!=null &&
              this.returnStatus.equals(other.getReturnStatus()))) &&
            ((this.returnStatusExplanation==null && other.getReturnStatusExplanation()==null) || 
             (this.returnStatusExplanation!=null &&
              this.returnStatusExplanation.equals(other.getReturnStatusExplanation()))) &&
            ((this.invDocFieldVOArray==null && other.getInvDocFieldVOArray()==null) || 
             (this.invDocFieldVOArray!=null &&
              java.util.Arrays.equals(this.invDocFieldVOArray, other.getInvDocFieldVOArray()))) &&
            ((this.docCargoFieldVOArray==null && other.getDocCargoFieldVOArray()==null) || 
             (this.docCargoFieldVOArray!=null &&
              java.util.Arrays.equals(this.docCargoFieldVOArray, other.getDocCargoFieldVOArray()))) &&
            ((this.docCargoLifeCycleVOArray==null && other.getDocCargoLifeCycleVOArray()==null) || 
             (this.docCargoLifeCycleVOArray!=null &&
              java.util.Arrays.equals(this.docCargoLifeCycleVOArray, other.getDocCargoLifeCycleVOArray()))) &&
            ((this.docCargoVOArray==null && other.getDocCargoVOArray()==null) || 
             (this.docCargoVOArray!=null &&
              java.util.Arrays.equals(this.docCargoVOArray, other.getDocCargoVOArray()))) &&
            ((this.returnTotalPrice==null && other.getReturnTotalPrice()==null) || 
             (this.returnTotalPrice!=null &&
              this.returnTotalPrice.equals(other.getReturnTotalPrice()))) &&
            ((this.returnTotalVat==null && other.getReturnTotalVat()==null) || 
             (this.returnTotalVat!=null &&
              this.returnTotalVat.equals(other.getReturnTotalVat()))) &&
            ((this.returnTotalAmount==null && other.getReturnTotalAmount()==null) || 
             (this.returnTotalAmount!=null &&
              this.returnTotalAmount.equals(other.getReturnTotalAmount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTransactionStatus() != null) {
            _hashCode += getTransactionStatus().hashCode();
        }
        if (getTransactionErrCode() != null) {
            _hashCode += getTransactionErrCode().hashCode();
        }
        if (getTransactionMessage() != null) {
            _hashCode += getTransactionMessage().hashCode();
        }
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getFieldValue() != null) {
            _hashCode += getFieldValue().hashCode();
        }
        if (getDocId() != null) {
            _hashCode += getDocId().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getDocNumber() != null) {
            _hashCode += getDocNumber().hashCode();
        }
        if (getWaybillNo() != null) {
            _hashCode += getWaybillNo().hashCode();
        }
        if (getDocCargoId() != null) {
            _hashCode += getDocCargoId().hashCode();
        }
        if (getSenderCustId() != null) {
            _hashCode += getSenderCustId().hashCode();
        }
        if (getSenderCustName() != null) {
            _hashCode += getSenderCustName().hashCode();
        }
        if (getSenderAddressTxt() != null) {
            _hashCode += getSenderAddressTxt().hashCode();
        }
        if (getInvCustId() != null) {
            _hashCode += getInvCustId().hashCode();
        }
        if (getInvCustName() != null) {
            _hashCode += getInvCustName().hashCode();
        }
        if (getReceiverCustId() != null) {
            _hashCode += getReceiverCustId().hashCode();
        }
        if (getReceiverCustName() != null) {
            _hashCode += getReceiverCustName().hashCode();
        }
        if (getReceiverAddressTxt() != null) {
            _hashCode += getReceiverAddressTxt().hashCode();
        }
        if (getSenderAddressId() != null) {
            _hashCode += getSenderAddressId().hashCode();
        }
        if (getReceiverAddressId() != null) {
            _hashCode += getReceiverAddressId().hashCode();
        }
        if (getSenderCityId() != null) {
            _hashCode += getSenderCityId().hashCode();
        }
        if (getReceiverCityId() != null) {
            _hashCode += getReceiverCityId().hashCode();
        }
        if (getSenderCityName() != null) {
            _hashCode += getSenderCityName().hashCode();
        }
        if (getReceiverCityName() != null) {
            _hashCode += getReceiverCityName().hashCode();
        }
        if (getSenderTownId() != null) {
            _hashCode += getSenderTownId().hashCode();
        }
        if (getReceiverTownId() != null) {
            _hashCode += getReceiverTownId().hashCode();
        }
        if (getSenderTownName() != null) {
            _hashCode += getSenderTownName().hashCode();
        }
        if (getReceiverTownName() != null) {
            _hashCode += getReceiverTownName().hashCode();
        }
        if (getSenderMobilePhoneNumber() != null) {
            _hashCode += getSenderMobilePhoneNumber().hashCode();
        }
        if (getReceiverMobilePhoneNumber() != null) {
            _hashCode += getReceiverMobilePhoneNumber().hashCode();
        }
        if (getDocumentReceiverMobilePhoneNumber() != null) {
            _hashCode += getDocumentReceiverMobilePhoneNumber().hashCode();
        }
        if (getDocumentDate() != null) {
            _hashCode += getDocumentDate().hashCode();
        }
        if (getDocumentTime() != null) {
            _hashCode += getDocumentTime().hashCode();
        }
        if (getDocumentDelFlag() != null) {
            _hashCode += getDocumentDelFlag().hashCode();
        }
        if (getReceiverInfo() != null) {
            _hashCode += getReceiverInfo().hashCode();
        }
        if (getDocType() != null) {
            _hashCode += getDocType().hashCode();
        }
        if (getDocTypeExplanation() != null) {
            _hashCode += getDocTypeExplanation().hashCode();
        }
        if (getContractId() != null) {
            _hashCode += getContractId().hashCode();
        }
        if (getTrackingUrl() != null) {
            _hashCode += getTrackingUrl().hashCode();
        }
        if (getShipmentDistance() != null) {
            _hashCode += getShipmentDistance().hashCode();
        }
        if (getEstimatedDeliveryDate() != null) {
            _hashCode += getEstimatedDeliveryDate().hashCode();
        }
        if (getCargoType() != null) {
            _hashCode += getCargoType().hashCode();
        }
        if (getCargoTypeExplanation() != null) {
            _hashCode += getCargoTypeExplanation().hashCode();
        }
        if (getPickupType() != null) {
            _hashCode += getPickupType().hashCode();
        }
        if (getPickupTypeExplanation() != null) {
            _hashCode += getPickupTypeExplanation().hashCode();
        }
        if (getDeliveryType() != null) {
            _hashCode += getDeliveryType().hashCode();
        }
        if (getDeliveryTypeExplanation() != null) {
            _hashCode += getDeliveryTypeExplanation().hashCode();
        }
        if (getDeliveryDate() != null) {
            _hashCode += getDeliveryDate().hashCode();
        }
        if (getDeliveryTime() != null) {
            _hashCode += getDeliveryTime().hashCode();
        }
        if (getTotalPrice() != null) {
            _hashCode += getTotalPrice().hashCode();
        }
        if (getTotalVat() != null) {
            _hashCode += getTotalVat().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getTotalDesi() != null) {
            _hashCode += getTotalDesi().hashCode();
        }
        if (getTotalKg() != null) {
            _hashCode += getTotalKg().hashCode();
        }
        if (getTotalDesiKg() != null) {
            _hashCode += getTotalDesiKg().hashCode();
        }
        if (getTotalCargo() != null) {
            _hashCode += getTotalCargo().hashCode();
        }
        if (getArrivalUnitId() != null) {
            _hashCode += getArrivalUnitId().hashCode();
        }
        if (getArrivalUnitName() != null) {
            _hashCode += getArrivalUnitName().hashCode();
        }
        if (getDepartureUnitId() != null) {
            _hashCode += getDepartureUnitId().hashCode();
        }
        if (getDepartureUnitName() != null) {
            _hashCode += getDepartureUnitName().hashCode();
        }
        if (getDeliveryUnitId() != null) {
            _hashCode += getDeliveryUnitId().hashCode();
        }
        if (getDeliveryUnitName() != null) {
            _hashCode += getDeliveryUnitName().hashCode();
        }
        if (getCargoEventId() != null) {
            _hashCode += getCargoEventId().hashCode();
        }
        if (getCargoEventExplanation() != null) {
            _hashCode += getCargoEventExplanation().hashCode();
        }
        if (getCargoReasonId() != null) {
            _hashCode += getCargoReasonId().hashCode();
        }
        if (getCargoReasonExplanation() != null) {
            _hashCode += getCargoReasonExplanation().hashCode();
        }
        if (getDocumentEventId() != null) {
            _hashCode += getDocumentEventId().hashCode();
        }
        if (getDocumentReasonId() != null) {
            _hashCode += getDocumentReasonId().hashCode();
        }
        if (getDocumentEventExplanation() != null) {
            _hashCode += getDocumentEventExplanation().hashCode();
        }
        if (getDocumentReasonExplanation() != null) {
            _hashCode += getDocumentReasonExplanation().hashCode();
        }
        if (getDelInfoDeliveryFlag() != null) {
            _hashCode += getDelInfoDeliveryFlag().hashCode();
        }
        if (getDelInfoDelUnitId() != null) {
            _hashCode += getDelInfoDelUnitId().hashCode();
        }
        if (getDelEmpName() != null) {
            _hashCode += getDelEmpName().hashCode();
        }
        if (getRejectFlag() != null) {
            _hashCode += getRejectFlag().hashCode();
        }
        if (getRejectStatus() != null) {
            _hashCode += getRejectStatus().hashCode();
        }
        if (getRejectStatusExplanation() != null) {
            _hashCode += getRejectStatusExplanation().hashCode();
        }
        if (getRejectDescription() != null) {
            _hashCode += getRejectDescription().hashCode();
        }
        if (getRejectReasonExplanation() != null) {
            _hashCode += getRejectReasonExplanation().hashCode();
        }
        if (getReturnDocId() != null) {
            _hashCode += getReturnDocId().hashCode();
        }
        if (getReturnDocumentDate() != null) {
            _hashCode += getReturnDocumentDate().hashCode();
        }
        if (getReturnDeliveryDate() != null) {
            _hashCode += getReturnDeliveryDate().hashCode();
        }
        if (getReturnStatus() != null) {
            _hashCode += getReturnStatus().hashCode();
        }
        if (getReturnStatusExplanation() != null) {
            _hashCode += getReturnStatusExplanation().hashCode();
        }
        if (getInvDocFieldVOArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvDocFieldVOArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvDocFieldVOArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocCargoFieldVOArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocCargoFieldVOArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocCargoFieldVOArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocCargoLifeCycleVOArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocCargoLifeCycleVOArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocCargoLifeCycleVOArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocCargoVOArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocCargoVOArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocCargoVOArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnTotalPrice() != null) {
            _hashCode += getReturnTotalPrice().hashCode();
        }
        if (getReturnTotalVat() != null) {
            _hashCode += getReturnTotalVat().hashCode();
        }
        if (getReturnTotalAmount() != null) {
            _hashCode += getReturnTotalAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingDataDetailVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "ShippingDataDetailVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionErrCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionErrCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waybillNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waybillNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docCargoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docCargoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCustId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderCustId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCustName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderCustName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAddressTxt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderAddressTxt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invCustId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invCustId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invCustName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invCustName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverCustId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverCustId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverCustName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverCustName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverAddressTxt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverAddressTxt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderAddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverAddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverAddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderCityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverCityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverCityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderCityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverCityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverCityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderTownId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderTownId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverTownId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverTownId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderTownName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderTownName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverTownName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverTownName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderMobilePhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderMobilePhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverMobilePhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverMobilePhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentReceiverMobilePhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentReceiverMobilePhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentDelFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentDelFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docTypeExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docTypeExplanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackingUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipmentDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estimatedDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoTypeExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoTypeExplanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupTypeExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupTypeExplanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryTypeExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryTypeExplanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalVat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalVat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDesi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalDesi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalKg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalKg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDesiKg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalDesiKg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCargo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrivalUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrivalUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departureUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departureUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoEventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoEventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoEventExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoEventExplanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoReasonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoReasonExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoReasonExplanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentEventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentEventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentReasonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentEventExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentEventExplanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentReasonExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentReasonExplanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delInfoDeliveryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delInfoDeliveryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delInfoDelUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delInfoDelUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delEmpName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delEmpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rejectFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rejectStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectStatusExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rejectStatusExplanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rejectDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectReasonExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rejectReasonExplanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDocId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnDocId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDocumentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnDocumentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnStatusExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnStatusExplanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invDocFieldVOArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invDocFieldVOArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "InvDocField2VO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docCargoFieldVOArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docCargoFieldVOArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "DocCargoField2VO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docCargoLifeCycleVOArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docCargoLifeCycleVOArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "DocCargoLifeCycleVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docCargoVOArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docCargoVOArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "DocCargoVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnTotalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnTotalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnTotalVat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnTotalVat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnTotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
