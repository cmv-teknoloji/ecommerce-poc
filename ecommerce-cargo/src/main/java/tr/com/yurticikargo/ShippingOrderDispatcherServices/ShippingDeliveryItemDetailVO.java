/**
 * ShippingDeliveryItemDetailVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class ShippingDeliveryItemDetailVO  implements java.io.Serializable {
    private java.lang.String cargoKey;

    private java.lang.String docId;

    private java.lang.String invoiceNumber;

    private java.lang.String docNumber;

    private java.lang.String waybillNo;

    private java.lang.String documentDebitId;

    private java.lang.String senderCustId;

    private java.lang.String senderCustName;

    private java.lang.String senderAddressTxt;

    private java.lang.String receiverCustId;

    private java.lang.String receiverCustName;

    private java.lang.String receiverAddressTxt;

    private java.lang.String documentDate;

    private java.lang.String documentTime;

    private java.lang.String documentDelFlag;

    private java.lang.String receiverInfo;

    private java.lang.String docType;

    private java.lang.String docTypeExplanation;

    private java.lang.String contractId;

    private java.lang.String trackingUrl;

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

    private java.lang.String arrivalTrCenterUnitId;

    private java.lang.String arrivalTrCenterName;

    private java.lang.String departureTrCenterUnitId;

    private java.lang.String departureTrCenterName;

    private java.lang.String deliveryUnitId;

    private java.lang.String deliveryUnitName;

    private java.lang.String deliveryUnitType;

    private java.lang.String deliveryUnitTypeExplanation;

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

    private java.lang.String delEmpId;

    private java.lang.String rejectStatus;

    private java.lang.String rejectStatusExplanation;

    private java.lang.String rejectDescription;

    private java.lang.String rejectReasonExplanation;

    private java.lang.String returnDocId;

    private java.lang.String returnDocumentDate;

    private java.lang.String returnDeliveryDate;

    private java.lang.String returnStatus;

    private java.lang.String returnStatusExplanation;

    private tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocFieldVO[] invDocFieldVOArray;

    private tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocCargoVO[] invDocCargoVOArray;

    public ShippingDeliveryItemDetailVO() {
    }

    public ShippingDeliveryItemDetailVO(
           java.lang.String cargoKey,
           java.lang.String docId,
           java.lang.String invoiceNumber,
           java.lang.String docNumber,
           java.lang.String waybillNo,
           java.lang.String documentDebitId,
           java.lang.String senderCustId,
           java.lang.String senderCustName,
           java.lang.String senderAddressTxt,
           java.lang.String receiverCustId,
           java.lang.String receiverCustName,
           java.lang.String receiverAddressTxt,
           java.lang.String documentDate,
           java.lang.String documentTime,
           java.lang.String documentDelFlag,
           java.lang.String receiverInfo,
           java.lang.String docType,
           java.lang.String docTypeExplanation,
           java.lang.String contractId,
           java.lang.String trackingUrl,
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
           java.lang.String arrivalTrCenterUnitId,
           java.lang.String arrivalTrCenterName,
           java.lang.String departureTrCenterUnitId,
           java.lang.String departureTrCenterName,
           java.lang.String deliveryUnitId,
           java.lang.String deliveryUnitName,
           java.lang.String deliveryUnitType,
           java.lang.String deliveryUnitTypeExplanation,
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
           java.lang.String delEmpId,
           java.lang.String rejectStatus,
           java.lang.String rejectStatusExplanation,
           java.lang.String rejectDescription,
           java.lang.String rejectReasonExplanation,
           java.lang.String returnDocId,
           java.lang.String returnDocumentDate,
           java.lang.String returnDeliveryDate,
           java.lang.String returnStatus,
           java.lang.String returnStatusExplanation,
           tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocFieldVO[] invDocFieldVOArray,
           tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocCargoVO[] invDocCargoVOArray) {
           this.cargoKey = cargoKey;
           this.docId = docId;
           this.invoiceNumber = invoiceNumber;
           this.docNumber = docNumber;
           this.waybillNo = waybillNo;
           this.documentDebitId = documentDebitId;
           this.senderCustId = senderCustId;
           this.senderCustName = senderCustName;
           this.senderAddressTxt = senderAddressTxt;
           this.receiverCustId = receiverCustId;
           this.receiverCustName = receiverCustName;
           this.receiverAddressTxt = receiverAddressTxt;
           this.documentDate = documentDate;
           this.documentTime = documentTime;
           this.documentDelFlag = documentDelFlag;
           this.receiverInfo = receiverInfo;
           this.docType = docType;
           this.docTypeExplanation = docTypeExplanation;
           this.contractId = contractId;
           this.trackingUrl = trackingUrl;
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
           this.arrivalTrCenterUnitId = arrivalTrCenterUnitId;
           this.arrivalTrCenterName = arrivalTrCenterName;
           this.departureTrCenterUnitId = departureTrCenterUnitId;
           this.departureTrCenterName = departureTrCenterName;
           this.deliveryUnitId = deliveryUnitId;
           this.deliveryUnitName = deliveryUnitName;
           this.deliveryUnitType = deliveryUnitType;
           this.deliveryUnitTypeExplanation = deliveryUnitTypeExplanation;
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
           this.delEmpId = delEmpId;
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
           this.invDocCargoVOArray = invDocCargoVOArray;
    }


    /**
     * Gets the cargoKey value for this ShippingDeliveryItemDetailVO.
     * 
     * @return cargoKey
     */
    public java.lang.String getCargoKey() {
        return cargoKey;
    }


    /**
     * Sets the cargoKey value for this ShippingDeliveryItemDetailVO.
     * 
     * @param cargoKey
     */
    public void setCargoKey(java.lang.String cargoKey) {
        this.cargoKey = cargoKey;
    }


    /**
     * Gets the docId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return docId
     */
    public java.lang.String getDocId() {
        return docId;
    }


    /**
     * Sets the docId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param docId
     */
    public void setDocId(java.lang.String docId) {
        this.docId = docId;
    }


    /**
     * Gets the invoiceNumber value for this ShippingDeliveryItemDetailVO.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this ShippingDeliveryItemDetailVO.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the docNumber value for this ShippingDeliveryItemDetailVO.
     * 
     * @return docNumber
     */
    public java.lang.String getDocNumber() {
        return docNumber;
    }


    /**
     * Sets the docNumber value for this ShippingDeliveryItemDetailVO.
     * 
     * @param docNumber
     */
    public void setDocNumber(java.lang.String docNumber) {
        this.docNumber = docNumber;
    }


    /**
     * Gets the waybillNo value for this ShippingDeliveryItemDetailVO.
     * 
     * @return waybillNo
     */
    public java.lang.String getWaybillNo() {
        return waybillNo;
    }


    /**
     * Sets the waybillNo value for this ShippingDeliveryItemDetailVO.
     * 
     * @param waybillNo
     */
    public void setWaybillNo(java.lang.String waybillNo) {
        this.waybillNo = waybillNo;
    }


    /**
     * Gets the documentDebitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return documentDebitId
     */
    public java.lang.String getDocumentDebitId() {
        return documentDebitId;
    }


    /**
     * Sets the documentDebitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param documentDebitId
     */
    public void setDocumentDebitId(java.lang.String documentDebitId) {
        this.documentDebitId = documentDebitId;
    }


    /**
     * Gets the senderCustId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return senderCustId
     */
    public java.lang.String getSenderCustId() {
        return senderCustId;
    }


    /**
     * Sets the senderCustId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param senderCustId
     */
    public void setSenderCustId(java.lang.String senderCustId) {
        this.senderCustId = senderCustId;
    }


    /**
     * Gets the senderCustName value for this ShippingDeliveryItemDetailVO.
     * 
     * @return senderCustName
     */
    public java.lang.String getSenderCustName() {
        return senderCustName;
    }


    /**
     * Sets the senderCustName value for this ShippingDeliveryItemDetailVO.
     * 
     * @param senderCustName
     */
    public void setSenderCustName(java.lang.String senderCustName) {
        this.senderCustName = senderCustName;
    }


    /**
     * Gets the senderAddressTxt value for this ShippingDeliveryItemDetailVO.
     * 
     * @return senderAddressTxt
     */
    public java.lang.String getSenderAddressTxt() {
        return senderAddressTxt;
    }


    /**
     * Sets the senderAddressTxt value for this ShippingDeliveryItemDetailVO.
     * 
     * @param senderAddressTxt
     */
    public void setSenderAddressTxt(java.lang.String senderAddressTxt) {
        this.senderAddressTxt = senderAddressTxt;
    }


    /**
     * Gets the receiverCustId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return receiverCustId
     */
    public java.lang.String getReceiverCustId() {
        return receiverCustId;
    }


    /**
     * Sets the receiverCustId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param receiverCustId
     */
    public void setReceiverCustId(java.lang.String receiverCustId) {
        this.receiverCustId = receiverCustId;
    }


    /**
     * Gets the receiverCustName value for this ShippingDeliveryItemDetailVO.
     * 
     * @return receiverCustName
     */
    public java.lang.String getReceiverCustName() {
        return receiverCustName;
    }


    /**
     * Sets the receiverCustName value for this ShippingDeliveryItemDetailVO.
     * 
     * @param receiverCustName
     */
    public void setReceiverCustName(java.lang.String receiverCustName) {
        this.receiverCustName = receiverCustName;
    }


    /**
     * Gets the receiverAddressTxt value for this ShippingDeliveryItemDetailVO.
     * 
     * @return receiverAddressTxt
     */
    public java.lang.String getReceiverAddressTxt() {
        return receiverAddressTxt;
    }


    /**
     * Sets the receiverAddressTxt value for this ShippingDeliveryItemDetailVO.
     * 
     * @param receiverAddressTxt
     */
    public void setReceiverAddressTxt(java.lang.String receiverAddressTxt) {
        this.receiverAddressTxt = receiverAddressTxt;
    }


    /**
     * Gets the documentDate value for this ShippingDeliveryItemDetailVO.
     * 
     * @return documentDate
     */
    public java.lang.String getDocumentDate() {
        return documentDate;
    }


    /**
     * Sets the documentDate value for this ShippingDeliveryItemDetailVO.
     * 
     * @param documentDate
     */
    public void setDocumentDate(java.lang.String documentDate) {
        this.documentDate = documentDate;
    }


    /**
     * Gets the documentTime value for this ShippingDeliveryItemDetailVO.
     * 
     * @return documentTime
     */
    public java.lang.String getDocumentTime() {
        return documentTime;
    }


    /**
     * Sets the documentTime value for this ShippingDeliveryItemDetailVO.
     * 
     * @param documentTime
     */
    public void setDocumentTime(java.lang.String documentTime) {
        this.documentTime = documentTime;
    }


    /**
     * Gets the documentDelFlag value for this ShippingDeliveryItemDetailVO.
     * 
     * @return documentDelFlag
     */
    public java.lang.String getDocumentDelFlag() {
        return documentDelFlag;
    }


    /**
     * Sets the documentDelFlag value for this ShippingDeliveryItemDetailVO.
     * 
     * @param documentDelFlag
     */
    public void setDocumentDelFlag(java.lang.String documentDelFlag) {
        this.documentDelFlag = documentDelFlag;
    }


    /**
     * Gets the receiverInfo value for this ShippingDeliveryItemDetailVO.
     * 
     * @return receiverInfo
     */
    public java.lang.String getReceiverInfo() {
        return receiverInfo;
    }


    /**
     * Sets the receiverInfo value for this ShippingDeliveryItemDetailVO.
     * 
     * @param receiverInfo
     */
    public void setReceiverInfo(java.lang.String receiverInfo) {
        this.receiverInfo = receiverInfo;
    }


    /**
     * Gets the docType value for this ShippingDeliveryItemDetailVO.
     * 
     * @return docType
     */
    public java.lang.String getDocType() {
        return docType;
    }


    /**
     * Sets the docType value for this ShippingDeliveryItemDetailVO.
     * 
     * @param docType
     */
    public void setDocType(java.lang.String docType) {
        this.docType = docType;
    }


    /**
     * Gets the docTypeExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @return docTypeExplanation
     */
    public java.lang.String getDocTypeExplanation() {
        return docTypeExplanation;
    }


    /**
     * Sets the docTypeExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @param docTypeExplanation
     */
    public void setDocTypeExplanation(java.lang.String docTypeExplanation) {
        this.docTypeExplanation = docTypeExplanation;
    }


    /**
     * Gets the contractId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return contractId
     */
    public java.lang.String getContractId() {
        return contractId;
    }


    /**
     * Sets the contractId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param contractId
     */
    public void setContractId(java.lang.String contractId) {
        this.contractId = contractId;
    }


    /**
     * Gets the trackingUrl value for this ShippingDeliveryItemDetailVO.
     * 
     * @return trackingUrl
     */
    public java.lang.String getTrackingUrl() {
        return trackingUrl;
    }


    /**
     * Sets the trackingUrl value for this ShippingDeliveryItemDetailVO.
     * 
     * @param trackingUrl
     */
    public void setTrackingUrl(java.lang.String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }


    /**
     * Gets the cargoType value for this ShippingDeliveryItemDetailVO.
     * 
     * @return cargoType
     */
    public java.lang.String getCargoType() {
        return cargoType;
    }


    /**
     * Sets the cargoType value for this ShippingDeliveryItemDetailVO.
     * 
     * @param cargoType
     */
    public void setCargoType(java.lang.String cargoType) {
        this.cargoType = cargoType;
    }


    /**
     * Gets the cargoTypeExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @return cargoTypeExplanation
     */
    public java.lang.String getCargoTypeExplanation() {
        return cargoTypeExplanation;
    }


    /**
     * Sets the cargoTypeExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @param cargoTypeExplanation
     */
    public void setCargoTypeExplanation(java.lang.String cargoTypeExplanation) {
        this.cargoTypeExplanation = cargoTypeExplanation;
    }


    /**
     * Gets the pickupType value for this ShippingDeliveryItemDetailVO.
     * 
     * @return pickupType
     */
    public java.lang.String getPickupType() {
        return pickupType;
    }


    /**
     * Sets the pickupType value for this ShippingDeliveryItemDetailVO.
     * 
     * @param pickupType
     */
    public void setPickupType(java.lang.String pickupType) {
        this.pickupType = pickupType;
    }


    /**
     * Gets the pickupTypeExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @return pickupTypeExplanation
     */
    public java.lang.String getPickupTypeExplanation() {
        return pickupTypeExplanation;
    }


    /**
     * Sets the pickupTypeExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @param pickupTypeExplanation
     */
    public void setPickupTypeExplanation(java.lang.String pickupTypeExplanation) {
        this.pickupTypeExplanation = pickupTypeExplanation;
    }


    /**
     * Gets the deliveryType value for this ShippingDeliveryItemDetailVO.
     * 
     * @return deliveryType
     */
    public java.lang.String getDeliveryType() {
        return deliveryType;
    }


    /**
     * Sets the deliveryType value for this ShippingDeliveryItemDetailVO.
     * 
     * @param deliveryType
     */
    public void setDeliveryType(java.lang.String deliveryType) {
        this.deliveryType = deliveryType;
    }


    /**
     * Gets the deliveryTypeExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @return deliveryTypeExplanation
     */
    public java.lang.String getDeliveryTypeExplanation() {
        return deliveryTypeExplanation;
    }


    /**
     * Sets the deliveryTypeExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @param deliveryTypeExplanation
     */
    public void setDeliveryTypeExplanation(java.lang.String deliveryTypeExplanation) {
        this.deliveryTypeExplanation = deliveryTypeExplanation;
    }


    /**
     * Gets the deliveryDate value for this ShippingDeliveryItemDetailVO.
     * 
     * @return deliveryDate
     */
    public java.lang.String getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this ShippingDeliveryItemDetailVO.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.lang.String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    /**
     * Gets the deliveryTime value for this ShippingDeliveryItemDetailVO.
     * 
     * @return deliveryTime
     */
    public java.lang.String getDeliveryTime() {
        return deliveryTime;
    }


    /**
     * Sets the deliveryTime value for this ShippingDeliveryItemDetailVO.
     * 
     * @param deliveryTime
     */
    public void setDeliveryTime(java.lang.String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }


    /**
     * Gets the totalPrice value for this ShippingDeliveryItemDetailVO.
     * 
     * @return totalPrice
     */
    public java.lang.String getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this ShippingDeliveryItemDetailVO.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(java.lang.String totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the totalVat value for this ShippingDeliveryItemDetailVO.
     * 
     * @return totalVat
     */
    public java.lang.String getTotalVat() {
        return totalVat;
    }


    /**
     * Sets the totalVat value for this ShippingDeliveryItemDetailVO.
     * 
     * @param totalVat
     */
    public void setTotalVat(java.lang.String totalVat) {
        this.totalVat = totalVat;
    }


    /**
     * Gets the totalAmount value for this ShippingDeliveryItemDetailVO.
     * 
     * @return totalAmount
     */
    public java.lang.String getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this ShippingDeliveryItemDetailVO.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.lang.String totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the product value for this ShippingDeliveryItemDetailVO.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ShippingDeliveryItemDetailVO.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the totalDesi value for this ShippingDeliveryItemDetailVO.
     * 
     * @return totalDesi
     */
    public java.lang.String getTotalDesi() {
        return totalDesi;
    }


    /**
     * Sets the totalDesi value for this ShippingDeliveryItemDetailVO.
     * 
     * @param totalDesi
     */
    public void setTotalDesi(java.lang.String totalDesi) {
        this.totalDesi = totalDesi;
    }


    /**
     * Gets the totalKg value for this ShippingDeliveryItemDetailVO.
     * 
     * @return totalKg
     */
    public java.lang.String getTotalKg() {
        return totalKg;
    }


    /**
     * Sets the totalKg value for this ShippingDeliveryItemDetailVO.
     * 
     * @param totalKg
     */
    public void setTotalKg(java.lang.String totalKg) {
        this.totalKg = totalKg;
    }


    /**
     * Gets the totalDesiKg value for this ShippingDeliveryItemDetailVO.
     * 
     * @return totalDesiKg
     */
    public java.lang.String getTotalDesiKg() {
        return totalDesiKg;
    }


    /**
     * Sets the totalDesiKg value for this ShippingDeliveryItemDetailVO.
     * 
     * @param totalDesiKg
     */
    public void setTotalDesiKg(java.lang.String totalDesiKg) {
        this.totalDesiKg = totalDesiKg;
    }


    /**
     * Gets the totalCargo value for this ShippingDeliveryItemDetailVO.
     * 
     * @return totalCargo
     */
    public java.lang.String getTotalCargo() {
        return totalCargo;
    }


    /**
     * Sets the totalCargo value for this ShippingDeliveryItemDetailVO.
     * 
     * @param totalCargo
     */
    public void setTotalCargo(java.lang.String totalCargo) {
        this.totalCargo = totalCargo;
    }


    /**
     * Gets the arrivalUnitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return arrivalUnitId
     */
    public java.lang.String getArrivalUnitId() {
        return arrivalUnitId;
    }


    /**
     * Sets the arrivalUnitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param arrivalUnitId
     */
    public void setArrivalUnitId(java.lang.String arrivalUnitId) {
        this.arrivalUnitId = arrivalUnitId;
    }


    /**
     * Gets the arrivalUnitName value for this ShippingDeliveryItemDetailVO.
     * 
     * @return arrivalUnitName
     */
    public java.lang.String getArrivalUnitName() {
        return arrivalUnitName;
    }


    /**
     * Sets the arrivalUnitName value for this ShippingDeliveryItemDetailVO.
     * 
     * @param arrivalUnitName
     */
    public void setArrivalUnitName(java.lang.String arrivalUnitName) {
        this.arrivalUnitName = arrivalUnitName;
    }


    /**
     * Gets the departureUnitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return departureUnitId
     */
    public java.lang.String getDepartureUnitId() {
        return departureUnitId;
    }


    /**
     * Sets the departureUnitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param departureUnitId
     */
    public void setDepartureUnitId(java.lang.String departureUnitId) {
        this.departureUnitId = departureUnitId;
    }


    /**
     * Gets the departureUnitName value for this ShippingDeliveryItemDetailVO.
     * 
     * @return departureUnitName
     */
    public java.lang.String getDepartureUnitName() {
        return departureUnitName;
    }


    /**
     * Sets the departureUnitName value for this ShippingDeliveryItemDetailVO.
     * 
     * @param departureUnitName
     */
    public void setDepartureUnitName(java.lang.String departureUnitName) {
        this.departureUnitName = departureUnitName;
    }


    /**
     * Gets the arrivalTrCenterUnitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return arrivalTrCenterUnitId
     */
    public java.lang.String getArrivalTrCenterUnitId() {
        return arrivalTrCenterUnitId;
    }


    /**
     * Sets the arrivalTrCenterUnitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param arrivalTrCenterUnitId
     */
    public void setArrivalTrCenterUnitId(java.lang.String arrivalTrCenterUnitId) {
        this.arrivalTrCenterUnitId = arrivalTrCenterUnitId;
    }


    /**
     * Gets the arrivalTrCenterName value for this ShippingDeliveryItemDetailVO.
     * 
     * @return arrivalTrCenterName
     */
    public java.lang.String getArrivalTrCenterName() {
        return arrivalTrCenterName;
    }


    /**
     * Sets the arrivalTrCenterName value for this ShippingDeliveryItemDetailVO.
     * 
     * @param arrivalTrCenterName
     */
    public void setArrivalTrCenterName(java.lang.String arrivalTrCenterName) {
        this.arrivalTrCenterName = arrivalTrCenterName;
    }


    /**
     * Gets the departureTrCenterUnitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return departureTrCenterUnitId
     */
    public java.lang.String getDepartureTrCenterUnitId() {
        return departureTrCenterUnitId;
    }


    /**
     * Sets the departureTrCenterUnitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param departureTrCenterUnitId
     */
    public void setDepartureTrCenterUnitId(java.lang.String departureTrCenterUnitId) {
        this.departureTrCenterUnitId = departureTrCenterUnitId;
    }


    /**
     * Gets the departureTrCenterName value for this ShippingDeliveryItemDetailVO.
     * 
     * @return departureTrCenterName
     */
    public java.lang.String getDepartureTrCenterName() {
        return departureTrCenterName;
    }


    /**
     * Sets the departureTrCenterName value for this ShippingDeliveryItemDetailVO.
     * 
     * @param departureTrCenterName
     */
    public void setDepartureTrCenterName(java.lang.String departureTrCenterName) {
        this.departureTrCenterName = departureTrCenterName;
    }


    /**
     * Gets the deliveryUnitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return deliveryUnitId
     */
    public java.lang.String getDeliveryUnitId() {
        return deliveryUnitId;
    }


    /**
     * Sets the deliveryUnitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param deliveryUnitId
     */
    public void setDeliveryUnitId(java.lang.String deliveryUnitId) {
        this.deliveryUnitId = deliveryUnitId;
    }


    /**
     * Gets the deliveryUnitName value for this ShippingDeliveryItemDetailVO.
     * 
     * @return deliveryUnitName
     */
    public java.lang.String getDeliveryUnitName() {
        return deliveryUnitName;
    }


    /**
     * Sets the deliveryUnitName value for this ShippingDeliveryItemDetailVO.
     * 
     * @param deliveryUnitName
     */
    public void setDeliveryUnitName(java.lang.String deliveryUnitName) {
        this.deliveryUnitName = deliveryUnitName;
    }


    /**
     * Gets the deliveryUnitType value for this ShippingDeliveryItemDetailVO.
     * 
     * @return deliveryUnitType
     */
    public java.lang.String getDeliveryUnitType() {
        return deliveryUnitType;
    }


    /**
     * Sets the deliveryUnitType value for this ShippingDeliveryItemDetailVO.
     * 
     * @param deliveryUnitType
     */
    public void setDeliveryUnitType(java.lang.String deliveryUnitType) {
        this.deliveryUnitType = deliveryUnitType;
    }


    /**
     * Gets the deliveryUnitTypeExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @return deliveryUnitTypeExplanation
     */
    public java.lang.String getDeliveryUnitTypeExplanation() {
        return deliveryUnitTypeExplanation;
    }


    /**
     * Sets the deliveryUnitTypeExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @param deliveryUnitTypeExplanation
     */
    public void setDeliveryUnitTypeExplanation(java.lang.String deliveryUnitTypeExplanation) {
        this.deliveryUnitTypeExplanation = deliveryUnitTypeExplanation;
    }


    /**
     * Gets the cargoEventId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return cargoEventId
     */
    public java.lang.String getCargoEventId() {
        return cargoEventId;
    }


    /**
     * Sets the cargoEventId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param cargoEventId
     */
    public void setCargoEventId(java.lang.String cargoEventId) {
        this.cargoEventId = cargoEventId;
    }


    /**
     * Gets the cargoEventExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @return cargoEventExplanation
     */
    public java.lang.String getCargoEventExplanation() {
        return cargoEventExplanation;
    }


    /**
     * Sets the cargoEventExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @param cargoEventExplanation
     */
    public void setCargoEventExplanation(java.lang.String cargoEventExplanation) {
        this.cargoEventExplanation = cargoEventExplanation;
    }


    /**
     * Gets the cargoReasonId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return cargoReasonId
     */
    public java.lang.String getCargoReasonId() {
        return cargoReasonId;
    }


    /**
     * Sets the cargoReasonId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param cargoReasonId
     */
    public void setCargoReasonId(java.lang.String cargoReasonId) {
        this.cargoReasonId = cargoReasonId;
    }


    /**
     * Gets the cargoReasonExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @return cargoReasonExplanation
     */
    public java.lang.String getCargoReasonExplanation() {
        return cargoReasonExplanation;
    }


    /**
     * Sets the cargoReasonExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @param cargoReasonExplanation
     */
    public void setCargoReasonExplanation(java.lang.String cargoReasonExplanation) {
        this.cargoReasonExplanation = cargoReasonExplanation;
    }


    /**
     * Gets the documentEventId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return documentEventId
     */
    public java.lang.String getDocumentEventId() {
        return documentEventId;
    }


    /**
     * Sets the documentEventId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param documentEventId
     */
    public void setDocumentEventId(java.lang.String documentEventId) {
        this.documentEventId = documentEventId;
    }


    /**
     * Gets the documentReasonId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return documentReasonId
     */
    public java.lang.String getDocumentReasonId() {
        return documentReasonId;
    }


    /**
     * Sets the documentReasonId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param documentReasonId
     */
    public void setDocumentReasonId(java.lang.String documentReasonId) {
        this.documentReasonId = documentReasonId;
    }


    /**
     * Gets the documentEventExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @return documentEventExplanation
     */
    public java.lang.String getDocumentEventExplanation() {
        return documentEventExplanation;
    }


    /**
     * Sets the documentEventExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @param documentEventExplanation
     */
    public void setDocumentEventExplanation(java.lang.String documentEventExplanation) {
        this.documentEventExplanation = documentEventExplanation;
    }


    /**
     * Gets the documentReasonExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @return documentReasonExplanation
     */
    public java.lang.String getDocumentReasonExplanation() {
        return documentReasonExplanation;
    }


    /**
     * Sets the documentReasonExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @param documentReasonExplanation
     */
    public void setDocumentReasonExplanation(java.lang.String documentReasonExplanation) {
        this.documentReasonExplanation = documentReasonExplanation;
    }


    /**
     * Gets the delInfoDeliveryFlag value for this ShippingDeliveryItemDetailVO.
     * 
     * @return delInfoDeliveryFlag
     */
    public java.lang.String getDelInfoDeliveryFlag() {
        return delInfoDeliveryFlag;
    }


    /**
     * Sets the delInfoDeliveryFlag value for this ShippingDeliveryItemDetailVO.
     * 
     * @param delInfoDeliveryFlag
     */
    public void setDelInfoDeliveryFlag(java.lang.String delInfoDeliveryFlag) {
        this.delInfoDeliveryFlag = delInfoDeliveryFlag;
    }


    /**
     * Gets the delInfoDelUnitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return delInfoDelUnitId
     */
    public java.lang.String getDelInfoDelUnitId() {
        return delInfoDelUnitId;
    }


    /**
     * Sets the delInfoDelUnitId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param delInfoDelUnitId
     */
    public void setDelInfoDelUnitId(java.lang.String delInfoDelUnitId) {
        this.delInfoDelUnitId = delInfoDelUnitId;
    }


    /**
     * Gets the delEmpName value for this ShippingDeliveryItemDetailVO.
     * 
     * @return delEmpName
     */
    public java.lang.String getDelEmpName() {
        return delEmpName;
    }


    /**
     * Sets the delEmpName value for this ShippingDeliveryItemDetailVO.
     * 
     * @param delEmpName
     */
    public void setDelEmpName(java.lang.String delEmpName) {
        this.delEmpName = delEmpName;
    }


    /**
     * Gets the delEmpId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return delEmpId
     */
    public java.lang.String getDelEmpId() {
        return delEmpId;
    }


    /**
     * Sets the delEmpId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param delEmpId
     */
    public void setDelEmpId(java.lang.String delEmpId) {
        this.delEmpId = delEmpId;
    }


    /**
     * Gets the rejectStatus value for this ShippingDeliveryItemDetailVO.
     * 
     * @return rejectStatus
     */
    public java.lang.String getRejectStatus() {
        return rejectStatus;
    }


    /**
     * Sets the rejectStatus value for this ShippingDeliveryItemDetailVO.
     * 
     * @param rejectStatus
     */
    public void setRejectStatus(java.lang.String rejectStatus) {
        this.rejectStatus = rejectStatus;
    }


    /**
     * Gets the rejectStatusExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @return rejectStatusExplanation
     */
    public java.lang.String getRejectStatusExplanation() {
        return rejectStatusExplanation;
    }


    /**
     * Sets the rejectStatusExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @param rejectStatusExplanation
     */
    public void setRejectStatusExplanation(java.lang.String rejectStatusExplanation) {
        this.rejectStatusExplanation = rejectStatusExplanation;
    }


    /**
     * Gets the rejectDescription value for this ShippingDeliveryItemDetailVO.
     * 
     * @return rejectDescription
     */
    public java.lang.String getRejectDescription() {
        return rejectDescription;
    }


    /**
     * Sets the rejectDescription value for this ShippingDeliveryItemDetailVO.
     * 
     * @param rejectDescription
     */
    public void setRejectDescription(java.lang.String rejectDescription) {
        this.rejectDescription = rejectDescription;
    }


    /**
     * Gets the rejectReasonExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @return rejectReasonExplanation
     */
    public java.lang.String getRejectReasonExplanation() {
        return rejectReasonExplanation;
    }


    /**
     * Sets the rejectReasonExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @param rejectReasonExplanation
     */
    public void setRejectReasonExplanation(java.lang.String rejectReasonExplanation) {
        this.rejectReasonExplanation = rejectReasonExplanation;
    }


    /**
     * Gets the returnDocId value for this ShippingDeliveryItemDetailVO.
     * 
     * @return returnDocId
     */
    public java.lang.String getReturnDocId() {
        return returnDocId;
    }


    /**
     * Sets the returnDocId value for this ShippingDeliveryItemDetailVO.
     * 
     * @param returnDocId
     */
    public void setReturnDocId(java.lang.String returnDocId) {
        this.returnDocId = returnDocId;
    }


    /**
     * Gets the returnDocumentDate value for this ShippingDeliveryItemDetailVO.
     * 
     * @return returnDocumentDate
     */
    public java.lang.String getReturnDocumentDate() {
        return returnDocumentDate;
    }


    /**
     * Sets the returnDocumentDate value for this ShippingDeliveryItemDetailVO.
     * 
     * @param returnDocumentDate
     */
    public void setReturnDocumentDate(java.lang.String returnDocumentDate) {
        this.returnDocumentDate = returnDocumentDate;
    }


    /**
     * Gets the returnDeliveryDate value for this ShippingDeliveryItemDetailVO.
     * 
     * @return returnDeliveryDate
     */
    public java.lang.String getReturnDeliveryDate() {
        return returnDeliveryDate;
    }


    /**
     * Sets the returnDeliveryDate value for this ShippingDeliveryItemDetailVO.
     * 
     * @param returnDeliveryDate
     */
    public void setReturnDeliveryDate(java.lang.String returnDeliveryDate) {
        this.returnDeliveryDate = returnDeliveryDate;
    }


    /**
     * Gets the returnStatus value for this ShippingDeliveryItemDetailVO.
     * 
     * @return returnStatus
     */
    public java.lang.String getReturnStatus() {
        return returnStatus;
    }


    /**
     * Sets the returnStatus value for this ShippingDeliveryItemDetailVO.
     * 
     * @param returnStatus
     */
    public void setReturnStatus(java.lang.String returnStatus) {
        this.returnStatus = returnStatus;
    }


    /**
     * Gets the returnStatusExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @return returnStatusExplanation
     */
    public java.lang.String getReturnStatusExplanation() {
        return returnStatusExplanation;
    }


    /**
     * Sets the returnStatusExplanation value for this ShippingDeliveryItemDetailVO.
     * 
     * @param returnStatusExplanation
     */
    public void setReturnStatusExplanation(java.lang.String returnStatusExplanation) {
        this.returnStatusExplanation = returnStatusExplanation;
    }


    /**
     * Gets the invDocFieldVOArray value for this ShippingDeliveryItemDetailVO.
     * 
     * @return invDocFieldVOArray
     */
    public tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocFieldVO[] getInvDocFieldVOArray() {
        return invDocFieldVOArray;
    }


    /**
     * Sets the invDocFieldVOArray value for this ShippingDeliveryItemDetailVO.
     * 
     * @param invDocFieldVOArray
     */
    public void setInvDocFieldVOArray(tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocFieldVO[] invDocFieldVOArray) {
        this.invDocFieldVOArray = invDocFieldVOArray;
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocFieldVO getInvDocFieldVOArray(int i) {
        return this.invDocFieldVOArray[i];
    }

    public void setInvDocFieldVOArray(int i, tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocFieldVO _value) {
        this.invDocFieldVOArray[i] = _value;
    }


    /**
     * Gets the invDocCargoVOArray value for this ShippingDeliveryItemDetailVO.
     * 
     * @return invDocCargoVOArray
     */
    public tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocCargoVO[] getInvDocCargoVOArray() {
        return invDocCargoVOArray;
    }


    /**
     * Sets the invDocCargoVOArray value for this ShippingDeliveryItemDetailVO.
     * 
     * @param invDocCargoVOArray
     */
    public void setInvDocCargoVOArray(tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocCargoVO[] invDocCargoVOArray) {
        this.invDocCargoVOArray = invDocCargoVOArray;
    }

    public tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocCargoVO getInvDocCargoVOArray(int i) {
        return this.invDocCargoVOArray[i];
    }

    public void setInvDocCargoVOArray(int i, tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocCargoVO _value) {
        this.invDocCargoVOArray[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingDeliveryItemDetailVO)) return false;
        ShippingDeliveryItemDetailVO other = (ShippingDeliveryItemDetailVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cargoKey==null && other.getCargoKey()==null) || 
             (this.cargoKey!=null &&
              this.cargoKey.equals(other.getCargoKey()))) &&
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
            ((this.documentDebitId==null && other.getDocumentDebitId()==null) || 
             (this.documentDebitId!=null &&
              this.documentDebitId.equals(other.getDocumentDebitId()))) &&
            ((this.senderCustId==null && other.getSenderCustId()==null) || 
             (this.senderCustId!=null &&
              this.senderCustId.equals(other.getSenderCustId()))) &&
            ((this.senderCustName==null && other.getSenderCustName()==null) || 
             (this.senderCustName!=null &&
              this.senderCustName.equals(other.getSenderCustName()))) &&
            ((this.senderAddressTxt==null && other.getSenderAddressTxt()==null) || 
             (this.senderAddressTxt!=null &&
              this.senderAddressTxt.equals(other.getSenderAddressTxt()))) &&
            ((this.receiverCustId==null && other.getReceiverCustId()==null) || 
             (this.receiverCustId!=null &&
              this.receiverCustId.equals(other.getReceiverCustId()))) &&
            ((this.receiverCustName==null && other.getReceiverCustName()==null) || 
             (this.receiverCustName!=null &&
              this.receiverCustName.equals(other.getReceiverCustName()))) &&
            ((this.receiverAddressTxt==null && other.getReceiverAddressTxt()==null) || 
             (this.receiverAddressTxt!=null &&
              this.receiverAddressTxt.equals(other.getReceiverAddressTxt()))) &&
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
            ((this.arrivalTrCenterUnitId==null && other.getArrivalTrCenterUnitId()==null) || 
             (this.arrivalTrCenterUnitId!=null &&
              this.arrivalTrCenterUnitId.equals(other.getArrivalTrCenterUnitId()))) &&
            ((this.arrivalTrCenterName==null && other.getArrivalTrCenterName()==null) || 
             (this.arrivalTrCenterName!=null &&
              this.arrivalTrCenterName.equals(other.getArrivalTrCenterName()))) &&
            ((this.departureTrCenterUnitId==null && other.getDepartureTrCenterUnitId()==null) || 
             (this.departureTrCenterUnitId!=null &&
              this.departureTrCenterUnitId.equals(other.getDepartureTrCenterUnitId()))) &&
            ((this.departureTrCenterName==null && other.getDepartureTrCenterName()==null) || 
             (this.departureTrCenterName!=null &&
              this.departureTrCenterName.equals(other.getDepartureTrCenterName()))) &&
            ((this.deliveryUnitId==null && other.getDeliveryUnitId()==null) || 
             (this.deliveryUnitId!=null &&
              this.deliveryUnitId.equals(other.getDeliveryUnitId()))) &&
            ((this.deliveryUnitName==null && other.getDeliveryUnitName()==null) || 
             (this.deliveryUnitName!=null &&
              this.deliveryUnitName.equals(other.getDeliveryUnitName()))) &&
            ((this.deliveryUnitType==null && other.getDeliveryUnitType()==null) || 
             (this.deliveryUnitType!=null &&
              this.deliveryUnitType.equals(other.getDeliveryUnitType()))) &&
            ((this.deliveryUnitTypeExplanation==null && other.getDeliveryUnitTypeExplanation()==null) || 
             (this.deliveryUnitTypeExplanation!=null &&
              this.deliveryUnitTypeExplanation.equals(other.getDeliveryUnitTypeExplanation()))) &&
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
            ((this.delEmpId==null && other.getDelEmpId()==null) || 
             (this.delEmpId!=null &&
              this.delEmpId.equals(other.getDelEmpId()))) &&
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
            ((this.invDocCargoVOArray==null && other.getInvDocCargoVOArray()==null) || 
             (this.invDocCargoVOArray!=null &&
              java.util.Arrays.equals(this.invDocCargoVOArray, other.getInvDocCargoVOArray())));
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
        if (getCargoKey() != null) {
            _hashCode += getCargoKey().hashCode();
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
        if (getDocumentDebitId() != null) {
            _hashCode += getDocumentDebitId().hashCode();
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
        if (getReceiverCustId() != null) {
            _hashCode += getReceiverCustId().hashCode();
        }
        if (getReceiverCustName() != null) {
            _hashCode += getReceiverCustName().hashCode();
        }
        if (getReceiverAddressTxt() != null) {
            _hashCode += getReceiverAddressTxt().hashCode();
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
        if (getArrivalTrCenterUnitId() != null) {
            _hashCode += getArrivalTrCenterUnitId().hashCode();
        }
        if (getArrivalTrCenterName() != null) {
            _hashCode += getArrivalTrCenterName().hashCode();
        }
        if (getDepartureTrCenterUnitId() != null) {
            _hashCode += getDepartureTrCenterUnitId().hashCode();
        }
        if (getDepartureTrCenterName() != null) {
            _hashCode += getDepartureTrCenterName().hashCode();
        }
        if (getDeliveryUnitId() != null) {
            _hashCode += getDeliveryUnitId().hashCode();
        }
        if (getDeliveryUnitName() != null) {
            _hashCode += getDeliveryUnitName().hashCode();
        }
        if (getDeliveryUnitType() != null) {
            _hashCode += getDeliveryUnitType().hashCode();
        }
        if (getDeliveryUnitTypeExplanation() != null) {
            _hashCode += getDeliveryUnitTypeExplanation().hashCode();
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
        if (getDelEmpId() != null) {
            _hashCode += getDelEmpId().hashCode();
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
        if (getInvDocCargoVOArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvDocCargoVOArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvDocCargoVOArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingDeliveryItemDetailVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "ShippingDeliveryItemDetailVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoKey"));
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
        elemField.setFieldName("documentDebitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentDebitId"));
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
        elemField.setFieldName("arrivalTrCenterUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrivalTrCenterUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTrCenterName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrivalTrCenterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureTrCenterUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departureTrCenterUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureTrCenterName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departureTrCenterName"));
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
        elemField.setFieldName("deliveryUnitType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryUnitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryUnitTypeExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryUnitTypeExplanation"));
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
        elemField.setFieldName("delEmpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delEmpId"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "InvDocFieldVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invDocCargoVOArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invDocCargoVOArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "InvDocCargoVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
