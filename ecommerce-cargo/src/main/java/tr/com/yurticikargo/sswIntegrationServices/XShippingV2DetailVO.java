/**
 * XShippingV2DetailVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.sswIntegrationServices;

public class XShippingV2DetailVO  implements java.io.Serializable {
    private java.lang.String docId;

    private java.lang.String trackingUrl;

    private java.lang.String docNumber;

    private java.lang.String senderCustId;

    private java.lang.String senderCustName;

    private java.lang.String receiverCustId;

    private java.lang.String recCustName;

    private java.lang.String invCustId;

    private java.lang.String invCustName;

    private java.lang.String depUnitName;

    private java.lang.String depCityName;

    private java.lang.String departureDate;

    private java.lang.String departureTime;

    private java.lang.String arrUnitName;

    private java.lang.String arrUnitId;

    private java.lang.String arrCityName;

    private java.lang.String arrivalDate;

    private java.lang.String docType;

    private java.lang.String paymentType;

    private java.lang.String pickUpType;

    private java.lang.String deliveryType;

    private java.lang.String prodName;

    private java.lang.String prodGrpName;

    private java.lang.String cargoType;

    private int totalCargo;

    private double totalDesiKg;

    private double productPrice;

    private double totalPrice;

    private double totalVat;

    private double totalPriceWithVat;

    private java.lang.String docCargoId;

    private java.lang.String currentUnitId;

    private java.lang.String currentUnitName;

    private java.lang.String cargoEventDate;

    private java.lang.String cargoEventTime;

    private java.lang.String cargoEventId;

    private java.lang.String cargoReasonId;

    private java.lang.String cargoEventExplanation;

    private java.lang.String cargoReasonExplanation;

    private java.lang.String deliveredTo;

    private java.lang.String deliveryDate;

    private java.lang.String deliveryTime;

    private java.lang.String pickupDocumentNo;

    private java.lang.String waybillNo;

    private java.lang.String extraInfo;

    private java.lang.String description;

    private java.lang.String activeFlag;

    private java.lang.String userCreate;

    private java.lang.String dateCreate;

    private java.lang.String timeCreate;

    private java.lang.String userUpdate;

    private java.lang.String delUnitName;

    private java.lang.String delUnitId;

    private java.lang.String delCityName;

    private java.lang.String depCityId;

    private java.lang.String arrCityId;

    private java.lang.String delCityId;

    private java.lang.String recAddressTxt;

    private java.lang.String invoiceNumber;

    private java.lang.String arrUnitTelArea;

    private java.lang.String arrUnitTelNo;

    private java.lang.String arrMainUnitId;

    private java.lang.String delMainUnitId;

    private java.lang.String campaignName;

    private java.lang.String campaignId;

    private java.lang.String campaignKey;

    private java.lang.String insurance;

    private java.lang.String arrivalTime;

    private int dayDiff;

    private java.lang.String recCustTelArea1;

    private java.lang.String recCustTelNo1;

    private java.lang.String depMainUnitId;

    private java.lang.String perfCFlag;

    private int delivDurationWorkDay;

    private int delivDuration;

    private java.lang.String perfLateCEventId;

    private java.lang.String perfLateCReasonId;

    private java.lang.String contractId;

    private java.lang.String docFieldAllValue;

    private int shipmentDistance;

    private java.lang.String estimatedDeliveryDate;

    private java.lang.String campaignAreaType;

    private java.lang.String reroutingFlag;

    private java.lang.String deliveryUnitArrivalDate;

    private java.lang.String deliveryUnitArrivalTime;

    private int waybillCount;

    private java.lang.String docCarryBagNo;

    private java.lang.String senderAddress;

    private java.lang.String senderTownName;

    private java.lang.String receiverTownName;

    private java.lang.String senderPhone1;

    private java.lang.String senderGsm;

    private java.lang.String receiverPhone1;

    private java.lang.String receiverGsm;

    private java.lang.String arrCountyId;

    private java.lang.String depCountyId;

    private java.lang.String receiverCountyName;

    private java.lang.String nextDayDeliveryFlag;

    private java.lang.String nextDayDeliveryEventId;

    private java.lang.String nextDayDeliveryReasonId;

    private java.lang.String txEventDate;

    private java.lang.String senderCountyName;

    private java.lang.String transactionChannel;

    private java.lang.String senderCustTelArea1;

    private java.lang.String senderCustTelNo1;

    private java.lang.String delFlag;

    private java.lang.String rejectFlag;

    private java.lang.String rejectReason;

    private java.lang.String delMainUnitName;

    private java.lang.String arrMainUnitName;

    private java.lang.String depMainUnitName;

    private tr.com.yurticikargo.sswIntegrationServices.InvDocField2VO[] invDocFieldVOArray;

    private tr.com.yurticikargo.sswIntegrationServices.DocCargoField2VO[] docCargoFieldVOArray;

    private tr.com.yurticikargo.sswIntegrationServices.DocCargoLifeCycleVO[] docCargoLifeCycleVOArray;

    private tr.com.yurticikargo.sswIntegrationServices.DocCargoVO[] docCargoVOArray;

    public XShippingV2DetailVO() {
    }

    public XShippingV2DetailVO(
           java.lang.String docId,
           java.lang.String trackingUrl,
           java.lang.String docNumber,
           java.lang.String senderCustId,
           java.lang.String senderCustName,
           java.lang.String receiverCustId,
           java.lang.String recCustName,
           java.lang.String invCustId,
           java.lang.String invCustName,
           java.lang.String depUnitName,
           java.lang.String depCityName,
           java.lang.String departureDate,
           java.lang.String departureTime,
           java.lang.String arrUnitName,
           java.lang.String arrUnitId,
           java.lang.String arrCityName,
           java.lang.String arrivalDate,
           java.lang.String docType,
           java.lang.String paymentType,
           java.lang.String pickUpType,
           java.lang.String deliveryType,
           java.lang.String prodName,
           java.lang.String prodGrpName,
           java.lang.String cargoType,
           int totalCargo,
           double totalDesiKg,
           double productPrice,
           double totalPrice,
           double totalVat,
           double totalPriceWithVat,
           java.lang.String docCargoId,
           java.lang.String currentUnitId,
           java.lang.String currentUnitName,
           java.lang.String cargoEventDate,
           java.lang.String cargoEventTime,
           java.lang.String cargoEventId,
           java.lang.String cargoReasonId,
           java.lang.String cargoEventExplanation,
           java.lang.String cargoReasonExplanation,
           java.lang.String deliveredTo,
           java.lang.String deliveryDate,
           java.lang.String deliveryTime,
           java.lang.String pickupDocumentNo,
           java.lang.String waybillNo,
           java.lang.String extraInfo,
           java.lang.String description,
           java.lang.String activeFlag,
           java.lang.String userCreate,
           java.lang.String dateCreate,
           java.lang.String timeCreate,
           java.lang.String userUpdate,
           java.lang.String delUnitName,
           java.lang.String delUnitId,
           java.lang.String delCityName,
           java.lang.String depCityId,
           java.lang.String arrCityId,
           java.lang.String delCityId,
           java.lang.String recAddressTxt,
           java.lang.String invoiceNumber,
           java.lang.String arrUnitTelArea,
           java.lang.String arrUnitTelNo,
           java.lang.String arrMainUnitId,
           java.lang.String delMainUnitId,
           java.lang.String campaignName,
           java.lang.String campaignId,
           java.lang.String campaignKey,
           java.lang.String insurance,
           java.lang.String arrivalTime,
           int dayDiff,
           java.lang.String recCustTelArea1,
           java.lang.String recCustTelNo1,
           java.lang.String depMainUnitId,
           java.lang.String perfCFlag,
           int delivDurationWorkDay,
           int delivDuration,
           java.lang.String perfLateCEventId,
           java.lang.String perfLateCReasonId,
           java.lang.String contractId,
           java.lang.String docFieldAllValue,
           int shipmentDistance,
           java.lang.String estimatedDeliveryDate,
           java.lang.String campaignAreaType,
           java.lang.String reroutingFlag,
           java.lang.String deliveryUnitArrivalDate,
           java.lang.String deliveryUnitArrivalTime,
           int waybillCount,
           java.lang.String docCarryBagNo,
           java.lang.String senderAddress,
           java.lang.String senderTownName,
           java.lang.String receiverTownName,
           java.lang.String senderPhone1,
           java.lang.String senderGsm,
           java.lang.String receiverPhone1,
           java.lang.String receiverGsm,
           java.lang.String arrCountyId,
           java.lang.String depCountyId,
           java.lang.String receiverCountyName,
           java.lang.String nextDayDeliveryFlag,
           java.lang.String nextDayDeliveryEventId,
           java.lang.String nextDayDeliveryReasonId,
           java.lang.String txEventDate,
           java.lang.String senderCountyName,
           java.lang.String transactionChannel,
           java.lang.String senderCustTelArea1,
           java.lang.String senderCustTelNo1,
           java.lang.String delFlag,
           java.lang.String rejectFlag,
           java.lang.String rejectReason,
           java.lang.String delMainUnitName,
           java.lang.String arrMainUnitName,
           java.lang.String depMainUnitName,
           tr.com.yurticikargo.sswIntegrationServices.InvDocField2VO[] invDocFieldVOArray,
           tr.com.yurticikargo.sswIntegrationServices.DocCargoField2VO[] docCargoFieldVOArray,
           tr.com.yurticikargo.sswIntegrationServices.DocCargoLifeCycleVO[] docCargoLifeCycleVOArray,
           tr.com.yurticikargo.sswIntegrationServices.DocCargoVO[] docCargoVOArray) {
           this.docId = docId;
           this.trackingUrl = trackingUrl;
           this.docNumber = docNumber;
           this.senderCustId = senderCustId;
           this.senderCustName = senderCustName;
           this.receiverCustId = receiverCustId;
           this.recCustName = recCustName;
           this.invCustId = invCustId;
           this.invCustName = invCustName;
           this.depUnitName = depUnitName;
           this.depCityName = depCityName;
           this.departureDate = departureDate;
           this.departureTime = departureTime;
           this.arrUnitName = arrUnitName;
           this.arrUnitId = arrUnitId;
           this.arrCityName = arrCityName;
           this.arrivalDate = arrivalDate;
           this.docType = docType;
           this.paymentType = paymentType;
           this.pickUpType = pickUpType;
           this.deliveryType = deliveryType;
           this.prodName = prodName;
           this.prodGrpName = prodGrpName;
           this.cargoType = cargoType;
           this.totalCargo = totalCargo;
           this.totalDesiKg = totalDesiKg;
           this.productPrice = productPrice;
           this.totalPrice = totalPrice;
           this.totalVat = totalVat;
           this.totalPriceWithVat = totalPriceWithVat;
           this.docCargoId = docCargoId;
           this.currentUnitId = currentUnitId;
           this.currentUnitName = currentUnitName;
           this.cargoEventDate = cargoEventDate;
           this.cargoEventTime = cargoEventTime;
           this.cargoEventId = cargoEventId;
           this.cargoReasonId = cargoReasonId;
           this.cargoEventExplanation = cargoEventExplanation;
           this.cargoReasonExplanation = cargoReasonExplanation;
           this.deliveredTo = deliveredTo;
           this.deliveryDate = deliveryDate;
           this.deliveryTime = deliveryTime;
           this.pickupDocumentNo = pickupDocumentNo;
           this.waybillNo = waybillNo;
           this.extraInfo = extraInfo;
           this.description = description;
           this.activeFlag = activeFlag;
           this.userCreate = userCreate;
           this.dateCreate = dateCreate;
           this.timeCreate = timeCreate;
           this.userUpdate = userUpdate;
           this.delUnitName = delUnitName;
           this.delUnitId = delUnitId;
           this.delCityName = delCityName;
           this.depCityId = depCityId;
           this.arrCityId = arrCityId;
           this.delCityId = delCityId;
           this.recAddressTxt = recAddressTxt;
           this.invoiceNumber = invoiceNumber;
           this.arrUnitTelArea = arrUnitTelArea;
           this.arrUnitTelNo = arrUnitTelNo;
           this.arrMainUnitId = arrMainUnitId;
           this.delMainUnitId = delMainUnitId;
           this.campaignName = campaignName;
           this.campaignId = campaignId;
           this.campaignKey = campaignKey;
           this.insurance = insurance;
           this.arrivalTime = arrivalTime;
           this.dayDiff = dayDiff;
           this.recCustTelArea1 = recCustTelArea1;
           this.recCustTelNo1 = recCustTelNo1;
           this.depMainUnitId = depMainUnitId;
           this.perfCFlag = perfCFlag;
           this.delivDurationWorkDay = delivDurationWorkDay;
           this.delivDuration = delivDuration;
           this.perfLateCEventId = perfLateCEventId;
           this.perfLateCReasonId = perfLateCReasonId;
           this.contractId = contractId;
           this.docFieldAllValue = docFieldAllValue;
           this.shipmentDistance = shipmentDistance;
           this.estimatedDeliveryDate = estimatedDeliveryDate;
           this.campaignAreaType = campaignAreaType;
           this.reroutingFlag = reroutingFlag;
           this.deliveryUnitArrivalDate = deliveryUnitArrivalDate;
           this.deliveryUnitArrivalTime = deliveryUnitArrivalTime;
           this.waybillCount = waybillCount;
           this.docCarryBagNo = docCarryBagNo;
           this.senderAddress = senderAddress;
           this.senderTownName = senderTownName;
           this.receiverTownName = receiverTownName;
           this.senderPhone1 = senderPhone1;
           this.senderGsm = senderGsm;
           this.receiverPhone1 = receiverPhone1;
           this.receiverGsm = receiverGsm;
           this.arrCountyId = arrCountyId;
           this.depCountyId = depCountyId;
           this.receiverCountyName = receiverCountyName;
           this.nextDayDeliveryFlag = nextDayDeliveryFlag;
           this.nextDayDeliveryEventId = nextDayDeliveryEventId;
           this.nextDayDeliveryReasonId = nextDayDeliveryReasonId;
           this.txEventDate = txEventDate;
           this.senderCountyName = senderCountyName;
           this.transactionChannel = transactionChannel;
           this.senderCustTelArea1 = senderCustTelArea1;
           this.senderCustTelNo1 = senderCustTelNo1;
           this.delFlag = delFlag;
           this.rejectFlag = rejectFlag;
           this.rejectReason = rejectReason;
           this.delMainUnitName = delMainUnitName;
           this.arrMainUnitName = arrMainUnitName;
           this.depMainUnitName = depMainUnitName;
           this.invDocFieldVOArray = invDocFieldVOArray;
           this.docCargoFieldVOArray = docCargoFieldVOArray;
           this.docCargoLifeCycleVOArray = docCargoLifeCycleVOArray;
           this.docCargoVOArray = docCargoVOArray;
    }


    /**
     * Gets the docId value for this XShippingV2DetailVO.
     * 
     * @return docId
     */
    public java.lang.String getDocId() {
        return docId;
    }


    /**
     * Sets the docId value for this XShippingV2DetailVO.
     * 
     * @param docId
     */
    public void setDocId(java.lang.String docId) {
        this.docId = docId;
    }


    /**
     * Gets the trackingUrl value for this XShippingV2DetailVO.
     * 
     * @return trackingUrl
     */
    public java.lang.String getTrackingUrl() {
        return trackingUrl;
    }


    /**
     * Sets the trackingUrl value for this XShippingV2DetailVO.
     * 
     * @param trackingUrl
     */
    public void setTrackingUrl(java.lang.String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }


    /**
     * Gets the docNumber value for this XShippingV2DetailVO.
     * 
     * @return docNumber
     */
    public java.lang.String getDocNumber() {
        return docNumber;
    }


    /**
     * Sets the docNumber value for this XShippingV2DetailVO.
     * 
     * @param docNumber
     */
    public void setDocNumber(java.lang.String docNumber) {
        this.docNumber = docNumber;
    }


    /**
     * Gets the senderCustId value for this XShippingV2DetailVO.
     * 
     * @return senderCustId
     */
    public java.lang.String getSenderCustId() {
        return senderCustId;
    }


    /**
     * Sets the senderCustId value for this XShippingV2DetailVO.
     * 
     * @param senderCustId
     */
    public void setSenderCustId(java.lang.String senderCustId) {
        this.senderCustId = senderCustId;
    }


    /**
     * Gets the senderCustName value for this XShippingV2DetailVO.
     * 
     * @return senderCustName
     */
    public java.lang.String getSenderCustName() {
        return senderCustName;
    }


    /**
     * Sets the senderCustName value for this XShippingV2DetailVO.
     * 
     * @param senderCustName
     */
    public void setSenderCustName(java.lang.String senderCustName) {
        this.senderCustName = senderCustName;
    }


    /**
     * Gets the receiverCustId value for this XShippingV2DetailVO.
     * 
     * @return receiverCustId
     */
    public java.lang.String getReceiverCustId() {
        return receiverCustId;
    }


    /**
     * Sets the receiverCustId value for this XShippingV2DetailVO.
     * 
     * @param receiverCustId
     */
    public void setReceiverCustId(java.lang.String receiverCustId) {
        this.receiverCustId = receiverCustId;
    }


    /**
     * Gets the recCustName value for this XShippingV2DetailVO.
     * 
     * @return recCustName
     */
    public java.lang.String getRecCustName() {
        return recCustName;
    }


    /**
     * Sets the recCustName value for this XShippingV2DetailVO.
     * 
     * @param recCustName
     */
    public void setRecCustName(java.lang.String recCustName) {
        this.recCustName = recCustName;
    }


    /**
     * Gets the invCustId value for this XShippingV2DetailVO.
     * 
     * @return invCustId
     */
    public java.lang.String getInvCustId() {
        return invCustId;
    }


    /**
     * Sets the invCustId value for this XShippingV2DetailVO.
     * 
     * @param invCustId
     */
    public void setInvCustId(java.lang.String invCustId) {
        this.invCustId = invCustId;
    }


    /**
     * Gets the invCustName value for this XShippingV2DetailVO.
     * 
     * @return invCustName
     */
    public java.lang.String getInvCustName() {
        return invCustName;
    }


    /**
     * Sets the invCustName value for this XShippingV2DetailVO.
     * 
     * @param invCustName
     */
    public void setInvCustName(java.lang.String invCustName) {
        this.invCustName = invCustName;
    }


    /**
     * Gets the depUnitName value for this XShippingV2DetailVO.
     * 
     * @return depUnitName
     */
    public java.lang.String getDepUnitName() {
        return depUnitName;
    }


    /**
     * Sets the depUnitName value for this XShippingV2DetailVO.
     * 
     * @param depUnitName
     */
    public void setDepUnitName(java.lang.String depUnitName) {
        this.depUnitName = depUnitName;
    }


    /**
     * Gets the depCityName value for this XShippingV2DetailVO.
     * 
     * @return depCityName
     */
    public java.lang.String getDepCityName() {
        return depCityName;
    }


    /**
     * Sets the depCityName value for this XShippingV2DetailVO.
     * 
     * @param depCityName
     */
    public void setDepCityName(java.lang.String depCityName) {
        this.depCityName = depCityName;
    }


    /**
     * Gets the departureDate value for this XShippingV2DetailVO.
     * 
     * @return departureDate
     */
    public java.lang.String getDepartureDate() {
        return departureDate;
    }


    /**
     * Sets the departureDate value for this XShippingV2DetailVO.
     * 
     * @param departureDate
     */
    public void setDepartureDate(java.lang.String departureDate) {
        this.departureDate = departureDate;
    }


    /**
     * Gets the departureTime value for this XShippingV2DetailVO.
     * 
     * @return departureTime
     */
    public java.lang.String getDepartureTime() {
        return departureTime;
    }


    /**
     * Sets the departureTime value for this XShippingV2DetailVO.
     * 
     * @param departureTime
     */
    public void setDepartureTime(java.lang.String departureTime) {
        this.departureTime = departureTime;
    }


    /**
     * Gets the arrUnitName value for this XShippingV2DetailVO.
     * 
     * @return arrUnitName
     */
    public java.lang.String getArrUnitName() {
        return arrUnitName;
    }


    /**
     * Sets the arrUnitName value for this XShippingV2DetailVO.
     * 
     * @param arrUnitName
     */
    public void setArrUnitName(java.lang.String arrUnitName) {
        this.arrUnitName = arrUnitName;
    }


    /**
     * Gets the arrUnitId value for this XShippingV2DetailVO.
     * 
     * @return arrUnitId
     */
    public java.lang.String getArrUnitId() {
        return arrUnitId;
    }


    /**
     * Sets the arrUnitId value for this XShippingV2DetailVO.
     * 
     * @param arrUnitId
     */
    public void setArrUnitId(java.lang.String arrUnitId) {
        this.arrUnitId = arrUnitId;
    }


    /**
     * Gets the arrCityName value for this XShippingV2DetailVO.
     * 
     * @return arrCityName
     */
    public java.lang.String getArrCityName() {
        return arrCityName;
    }


    /**
     * Sets the arrCityName value for this XShippingV2DetailVO.
     * 
     * @param arrCityName
     */
    public void setArrCityName(java.lang.String arrCityName) {
        this.arrCityName = arrCityName;
    }


    /**
     * Gets the arrivalDate value for this XShippingV2DetailVO.
     * 
     * @return arrivalDate
     */
    public java.lang.String getArrivalDate() {
        return arrivalDate;
    }


    /**
     * Sets the arrivalDate value for this XShippingV2DetailVO.
     * 
     * @param arrivalDate
     */
    public void setArrivalDate(java.lang.String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }


    /**
     * Gets the docType value for this XShippingV2DetailVO.
     * 
     * @return docType
     */
    public java.lang.String getDocType() {
        return docType;
    }


    /**
     * Sets the docType value for this XShippingV2DetailVO.
     * 
     * @param docType
     */
    public void setDocType(java.lang.String docType) {
        this.docType = docType;
    }


    /**
     * Gets the paymentType value for this XShippingV2DetailVO.
     * 
     * @return paymentType
     */
    public java.lang.String getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this XShippingV2DetailVO.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.String paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the pickUpType value for this XShippingV2DetailVO.
     * 
     * @return pickUpType
     */
    public java.lang.String getPickUpType() {
        return pickUpType;
    }


    /**
     * Sets the pickUpType value for this XShippingV2DetailVO.
     * 
     * @param pickUpType
     */
    public void setPickUpType(java.lang.String pickUpType) {
        this.pickUpType = pickUpType;
    }


    /**
     * Gets the deliveryType value for this XShippingV2DetailVO.
     * 
     * @return deliveryType
     */
    public java.lang.String getDeliveryType() {
        return deliveryType;
    }


    /**
     * Sets the deliveryType value for this XShippingV2DetailVO.
     * 
     * @param deliveryType
     */
    public void setDeliveryType(java.lang.String deliveryType) {
        this.deliveryType = deliveryType;
    }


    /**
     * Gets the prodName value for this XShippingV2DetailVO.
     * 
     * @return prodName
     */
    public java.lang.String getProdName() {
        return prodName;
    }


    /**
     * Sets the prodName value for this XShippingV2DetailVO.
     * 
     * @param prodName
     */
    public void setProdName(java.lang.String prodName) {
        this.prodName = prodName;
    }


    /**
     * Gets the prodGrpName value for this XShippingV2DetailVO.
     * 
     * @return prodGrpName
     */
    public java.lang.String getProdGrpName() {
        return prodGrpName;
    }


    /**
     * Sets the prodGrpName value for this XShippingV2DetailVO.
     * 
     * @param prodGrpName
     */
    public void setProdGrpName(java.lang.String prodGrpName) {
        this.prodGrpName = prodGrpName;
    }


    /**
     * Gets the cargoType value for this XShippingV2DetailVO.
     * 
     * @return cargoType
     */
    public java.lang.String getCargoType() {
        return cargoType;
    }


    /**
     * Sets the cargoType value for this XShippingV2DetailVO.
     * 
     * @param cargoType
     */
    public void setCargoType(java.lang.String cargoType) {
        this.cargoType = cargoType;
    }


    /**
     * Gets the totalCargo value for this XShippingV2DetailVO.
     * 
     * @return totalCargo
     */
    public int getTotalCargo() {
        return totalCargo;
    }


    /**
     * Sets the totalCargo value for this XShippingV2DetailVO.
     * 
     * @param totalCargo
     */
    public void setTotalCargo(int totalCargo) {
        this.totalCargo = totalCargo;
    }


    /**
     * Gets the totalDesiKg value for this XShippingV2DetailVO.
     * 
     * @return totalDesiKg
     */
    public double getTotalDesiKg() {
        return totalDesiKg;
    }


    /**
     * Sets the totalDesiKg value for this XShippingV2DetailVO.
     * 
     * @param totalDesiKg
     */
    public void setTotalDesiKg(double totalDesiKg) {
        this.totalDesiKg = totalDesiKg;
    }


    /**
     * Gets the productPrice value for this XShippingV2DetailVO.
     * 
     * @return productPrice
     */
    public double getProductPrice() {
        return productPrice;
    }


    /**
     * Sets the productPrice value for this XShippingV2DetailVO.
     * 
     * @param productPrice
     */
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }


    /**
     * Gets the totalPrice value for this XShippingV2DetailVO.
     * 
     * @return totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this XShippingV2DetailVO.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the totalVat value for this XShippingV2DetailVO.
     * 
     * @return totalVat
     */
    public double getTotalVat() {
        return totalVat;
    }


    /**
     * Sets the totalVat value for this XShippingV2DetailVO.
     * 
     * @param totalVat
     */
    public void setTotalVat(double totalVat) {
        this.totalVat = totalVat;
    }


    /**
     * Gets the totalPriceWithVat value for this XShippingV2DetailVO.
     * 
     * @return totalPriceWithVat
     */
    public double getTotalPriceWithVat() {
        return totalPriceWithVat;
    }


    /**
     * Sets the totalPriceWithVat value for this XShippingV2DetailVO.
     * 
     * @param totalPriceWithVat
     */
    public void setTotalPriceWithVat(double totalPriceWithVat) {
        this.totalPriceWithVat = totalPriceWithVat;
    }


    /**
     * Gets the docCargoId value for this XShippingV2DetailVO.
     * 
     * @return docCargoId
     */
    public java.lang.String getDocCargoId() {
        return docCargoId;
    }


    /**
     * Sets the docCargoId value for this XShippingV2DetailVO.
     * 
     * @param docCargoId
     */
    public void setDocCargoId(java.lang.String docCargoId) {
        this.docCargoId = docCargoId;
    }


    /**
     * Gets the currentUnitId value for this XShippingV2DetailVO.
     * 
     * @return currentUnitId
     */
    public java.lang.String getCurrentUnitId() {
        return currentUnitId;
    }


    /**
     * Sets the currentUnitId value for this XShippingV2DetailVO.
     * 
     * @param currentUnitId
     */
    public void setCurrentUnitId(java.lang.String currentUnitId) {
        this.currentUnitId = currentUnitId;
    }


    /**
     * Gets the currentUnitName value for this XShippingV2DetailVO.
     * 
     * @return currentUnitName
     */
    public java.lang.String getCurrentUnitName() {
        return currentUnitName;
    }


    /**
     * Sets the currentUnitName value for this XShippingV2DetailVO.
     * 
     * @param currentUnitName
     */
    public void setCurrentUnitName(java.lang.String currentUnitName) {
        this.currentUnitName = currentUnitName;
    }


    /**
     * Gets the cargoEventDate value for this XShippingV2DetailVO.
     * 
     * @return cargoEventDate
     */
    public java.lang.String getCargoEventDate() {
        return cargoEventDate;
    }


    /**
     * Sets the cargoEventDate value for this XShippingV2DetailVO.
     * 
     * @param cargoEventDate
     */
    public void setCargoEventDate(java.lang.String cargoEventDate) {
        this.cargoEventDate = cargoEventDate;
    }


    /**
     * Gets the cargoEventTime value for this XShippingV2DetailVO.
     * 
     * @return cargoEventTime
     */
    public java.lang.String getCargoEventTime() {
        return cargoEventTime;
    }


    /**
     * Sets the cargoEventTime value for this XShippingV2DetailVO.
     * 
     * @param cargoEventTime
     */
    public void setCargoEventTime(java.lang.String cargoEventTime) {
        this.cargoEventTime = cargoEventTime;
    }


    /**
     * Gets the cargoEventId value for this XShippingV2DetailVO.
     * 
     * @return cargoEventId
     */
    public java.lang.String getCargoEventId() {
        return cargoEventId;
    }


    /**
     * Sets the cargoEventId value for this XShippingV2DetailVO.
     * 
     * @param cargoEventId
     */
    public void setCargoEventId(java.lang.String cargoEventId) {
        this.cargoEventId = cargoEventId;
    }


    /**
     * Gets the cargoReasonId value for this XShippingV2DetailVO.
     * 
     * @return cargoReasonId
     */
    public java.lang.String getCargoReasonId() {
        return cargoReasonId;
    }


    /**
     * Sets the cargoReasonId value for this XShippingV2DetailVO.
     * 
     * @param cargoReasonId
     */
    public void setCargoReasonId(java.lang.String cargoReasonId) {
        this.cargoReasonId = cargoReasonId;
    }


    /**
     * Gets the cargoEventExplanation value for this XShippingV2DetailVO.
     * 
     * @return cargoEventExplanation
     */
    public java.lang.String getCargoEventExplanation() {
        return cargoEventExplanation;
    }


    /**
     * Sets the cargoEventExplanation value for this XShippingV2DetailVO.
     * 
     * @param cargoEventExplanation
     */
    public void setCargoEventExplanation(java.lang.String cargoEventExplanation) {
        this.cargoEventExplanation = cargoEventExplanation;
    }


    /**
     * Gets the cargoReasonExplanation value for this XShippingV2DetailVO.
     * 
     * @return cargoReasonExplanation
     */
    public java.lang.String getCargoReasonExplanation() {
        return cargoReasonExplanation;
    }


    /**
     * Sets the cargoReasonExplanation value for this XShippingV2DetailVO.
     * 
     * @param cargoReasonExplanation
     */
    public void setCargoReasonExplanation(java.lang.String cargoReasonExplanation) {
        this.cargoReasonExplanation = cargoReasonExplanation;
    }


    /**
     * Gets the deliveredTo value for this XShippingV2DetailVO.
     * 
     * @return deliveredTo
     */
    public java.lang.String getDeliveredTo() {
        return deliveredTo;
    }


    /**
     * Sets the deliveredTo value for this XShippingV2DetailVO.
     * 
     * @param deliveredTo
     */
    public void setDeliveredTo(java.lang.String deliveredTo) {
        this.deliveredTo = deliveredTo;
    }


    /**
     * Gets the deliveryDate value for this XShippingV2DetailVO.
     * 
     * @return deliveryDate
     */
    public java.lang.String getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this XShippingV2DetailVO.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.lang.String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    /**
     * Gets the deliveryTime value for this XShippingV2DetailVO.
     * 
     * @return deliveryTime
     */
    public java.lang.String getDeliveryTime() {
        return deliveryTime;
    }


    /**
     * Sets the deliveryTime value for this XShippingV2DetailVO.
     * 
     * @param deliveryTime
     */
    public void setDeliveryTime(java.lang.String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }


    /**
     * Gets the pickupDocumentNo value for this XShippingV2DetailVO.
     * 
     * @return pickupDocumentNo
     */
    public java.lang.String getPickupDocumentNo() {
        return pickupDocumentNo;
    }


    /**
     * Sets the pickupDocumentNo value for this XShippingV2DetailVO.
     * 
     * @param pickupDocumentNo
     */
    public void setPickupDocumentNo(java.lang.String pickupDocumentNo) {
        this.pickupDocumentNo = pickupDocumentNo;
    }


    /**
     * Gets the waybillNo value for this XShippingV2DetailVO.
     * 
     * @return waybillNo
     */
    public java.lang.String getWaybillNo() {
        return waybillNo;
    }


    /**
     * Sets the waybillNo value for this XShippingV2DetailVO.
     * 
     * @param waybillNo
     */
    public void setWaybillNo(java.lang.String waybillNo) {
        this.waybillNo = waybillNo;
    }


    /**
     * Gets the extraInfo value for this XShippingV2DetailVO.
     * 
     * @return extraInfo
     */
    public java.lang.String getExtraInfo() {
        return extraInfo;
    }


    /**
     * Sets the extraInfo value for this XShippingV2DetailVO.
     * 
     * @param extraInfo
     */
    public void setExtraInfo(java.lang.String extraInfo) {
        this.extraInfo = extraInfo;
    }


    /**
     * Gets the description value for this XShippingV2DetailVO.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this XShippingV2DetailVO.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the activeFlag value for this XShippingV2DetailVO.
     * 
     * @return activeFlag
     */
    public java.lang.String getActiveFlag() {
        return activeFlag;
    }


    /**
     * Sets the activeFlag value for this XShippingV2DetailVO.
     * 
     * @param activeFlag
     */
    public void setActiveFlag(java.lang.String activeFlag) {
        this.activeFlag = activeFlag;
    }


    /**
     * Gets the userCreate value for this XShippingV2DetailVO.
     * 
     * @return userCreate
     */
    public java.lang.String getUserCreate() {
        return userCreate;
    }


    /**
     * Sets the userCreate value for this XShippingV2DetailVO.
     * 
     * @param userCreate
     */
    public void setUserCreate(java.lang.String userCreate) {
        this.userCreate = userCreate;
    }


    /**
     * Gets the dateCreate value for this XShippingV2DetailVO.
     * 
     * @return dateCreate
     */
    public java.lang.String getDateCreate() {
        return dateCreate;
    }


    /**
     * Sets the dateCreate value for this XShippingV2DetailVO.
     * 
     * @param dateCreate
     */
    public void setDateCreate(java.lang.String dateCreate) {
        this.dateCreate = dateCreate;
    }


    /**
     * Gets the timeCreate value for this XShippingV2DetailVO.
     * 
     * @return timeCreate
     */
    public java.lang.String getTimeCreate() {
        return timeCreate;
    }


    /**
     * Sets the timeCreate value for this XShippingV2DetailVO.
     * 
     * @param timeCreate
     */
    public void setTimeCreate(java.lang.String timeCreate) {
        this.timeCreate = timeCreate;
    }


    /**
     * Gets the userUpdate value for this XShippingV2DetailVO.
     * 
     * @return userUpdate
     */
    public java.lang.String getUserUpdate() {
        return userUpdate;
    }


    /**
     * Sets the userUpdate value for this XShippingV2DetailVO.
     * 
     * @param userUpdate
     */
    public void setUserUpdate(java.lang.String userUpdate) {
        this.userUpdate = userUpdate;
    }


    /**
     * Gets the delUnitName value for this XShippingV2DetailVO.
     * 
     * @return delUnitName
     */
    public java.lang.String getDelUnitName() {
        return delUnitName;
    }


    /**
     * Sets the delUnitName value for this XShippingV2DetailVO.
     * 
     * @param delUnitName
     */
    public void setDelUnitName(java.lang.String delUnitName) {
        this.delUnitName = delUnitName;
    }


    /**
     * Gets the delUnitId value for this XShippingV2DetailVO.
     * 
     * @return delUnitId
     */
    public java.lang.String getDelUnitId() {
        return delUnitId;
    }


    /**
     * Sets the delUnitId value for this XShippingV2DetailVO.
     * 
     * @param delUnitId
     */
    public void setDelUnitId(java.lang.String delUnitId) {
        this.delUnitId = delUnitId;
    }


    /**
     * Gets the delCityName value for this XShippingV2DetailVO.
     * 
     * @return delCityName
     */
    public java.lang.String getDelCityName() {
        return delCityName;
    }


    /**
     * Sets the delCityName value for this XShippingV2DetailVO.
     * 
     * @param delCityName
     */
    public void setDelCityName(java.lang.String delCityName) {
        this.delCityName = delCityName;
    }


    /**
     * Gets the depCityId value for this XShippingV2DetailVO.
     * 
     * @return depCityId
     */
    public java.lang.String getDepCityId() {
        return depCityId;
    }


    /**
     * Sets the depCityId value for this XShippingV2DetailVO.
     * 
     * @param depCityId
     */
    public void setDepCityId(java.lang.String depCityId) {
        this.depCityId = depCityId;
    }


    /**
     * Gets the arrCityId value for this XShippingV2DetailVO.
     * 
     * @return arrCityId
     */
    public java.lang.String getArrCityId() {
        return arrCityId;
    }


    /**
     * Sets the arrCityId value for this XShippingV2DetailVO.
     * 
     * @param arrCityId
     */
    public void setArrCityId(java.lang.String arrCityId) {
        this.arrCityId = arrCityId;
    }


    /**
     * Gets the delCityId value for this XShippingV2DetailVO.
     * 
     * @return delCityId
     */
    public java.lang.String getDelCityId() {
        return delCityId;
    }


    /**
     * Sets the delCityId value for this XShippingV2DetailVO.
     * 
     * @param delCityId
     */
    public void setDelCityId(java.lang.String delCityId) {
        this.delCityId = delCityId;
    }


    /**
     * Gets the recAddressTxt value for this XShippingV2DetailVO.
     * 
     * @return recAddressTxt
     */
    public java.lang.String getRecAddressTxt() {
        return recAddressTxt;
    }


    /**
     * Sets the recAddressTxt value for this XShippingV2DetailVO.
     * 
     * @param recAddressTxt
     */
    public void setRecAddressTxt(java.lang.String recAddressTxt) {
        this.recAddressTxt = recAddressTxt;
    }


    /**
     * Gets the invoiceNumber value for this XShippingV2DetailVO.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this XShippingV2DetailVO.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the arrUnitTelArea value for this XShippingV2DetailVO.
     * 
     * @return arrUnitTelArea
     */
    public java.lang.String getArrUnitTelArea() {
        return arrUnitTelArea;
    }


    /**
     * Sets the arrUnitTelArea value for this XShippingV2DetailVO.
     * 
     * @param arrUnitTelArea
     */
    public void setArrUnitTelArea(java.lang.String arrUnitTelArea) {
        this.arrUnitTelArea = arrUnitTelArea;
    }


    /**
     * Gets the arrUnitTelNo value for this XShippingV2DetailVO.
     * 
     * @return arrUnitTelNo
     */
    public java.lang.String getArrUnitTelNo() {
        return arrUnitTelNo;
    }


    /**
     * Sets the arrUnitTelNo value for this XShippingV2DetailVO.
     * 
     * @param arrUnitTelNo
     */
    public void setArrUnitTelNo(java.lang.String arrUnitTelNo) {
        this.arrUnitTelNo = arrUnitTelNo;
    }


    /**
     * Gets the arrMainUnitId value for this XShippingV2DetailVO.
     * 
     * @return arrMainUnitId
     */
    public java.lang.String getArrMainUnitId() {
        return arrMainUnitId;
    }


    /**
     * Sets the arrMainUnitId value for this XShippingV2DetailVO.
     * 
     * @param arrMainUnitId
     */
    public void setArrMainUnitId(java.lang.String arrMainUnitId) {
        this.arrMainUnitId = arrMainUnitId;
    }


    /**
     * Gets the delMainUnitId value for this XShippingV2DetailVO.
     * 
     * @return delMainUnitId
     */
    public java.lang.String getDelMainUnitId() {
        return delMainUnitId;
    }


    /**
     * Sets the delMainUnitId value for this XShippingV2DetailVO.
     * 
     * @param delMainUnitId
     */
    public void setDelMainUnitId(java.lang.String delMainUnitId) {
        this.delMainUnitId = delMainUnitId;
    }


    /**
     * Gets the campaignName value for this XShippingV2DetailVO.
     * 
     * @return campaignName
     */
    public java.lang.String getCampaignName() {
        return campaignName;
    }


    /**
     * Sets the campaignName value for this XShippingV2DetailVO.
     * 
     * @param campaignName
     */
    public void setCampaignName(java.lang.String campaignName) {
        this.campaignName = campaignName;
    }


    /**
     * Gets the campaignId value for this XShippingV2DetailVO.
     * 
     * @return campaignId
     */
    public java.lang.String getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this XShippingV2DetailVO.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.String campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the campaignKey value for this XShippingV2DetailVO.
     * 
     * @return campaignKey
     */
    public java.lang.String getCampaignKey() {
        return campaignKey;
    }


    /**
     * Sets the campaignKey value for this XShippingV2DetailVO.
     * 
     * @param campaignKey
     */
    public void setCampaignKey(java.lang.String campaignKey) {
        this.campaignKey = campaignKey;
    }


    /**
     * Gets the insurance value for this XShippingV2DetailVO.
     * 
     * @return insurance
     */
    public java.lang.String getInsurance() {
        return insurance;
    }


    /**
     * Sets the insurance value for this XShippingV2DetailVO.
     * 
     * @param insurance
     */
    public void setInsurance(java.lang.String insurance) {
        this.insurance = insurance;
    }


    /**
     * Gets the arrivalTime value for this XShippingV2DetailVO.
     * 
     * @return arrivalTime
     */
    public java.lang.String getArrivalTime() {
        return arrivalTime;
    }


    /**
     * Sets the arrivalTime value for this XShippingV2DetailVO.
     * 
     * @param arrivalTime
     */
    public void setArrivalTime(java.lang.String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    /**
     * Gets the dayDiff value for this XShippingV2DetailVO.
     * 
     * @return dayDiff
     */
    public int getDayDiff() {
        return dayDiff;
    }


    /**
     * Sets the dayDiff value for this XShippingV2DetailVO.
     * 
     * @param dayDiff
     */
    public void setDayDiff(int dayDiff) {
        this.dayDiff = dayDiff;
    }


    /**
     * Gets the recCustTelArea1 value for this XShippingV2DetailVO.
     * 
     * @return recCustTelArea1
     */
    public java.lang.String getRecCustTelArea1() {
        return recCustTelArea1;
    }


    /**
     * Sets the recCustTelArea1 value for this XShippingV2DetailVO.
     * 
     * @param recCustTelArea1
     */
    public void setRecCustTelArea1(java.lang.String recCustTelArea1) {
        this.recCustTelArea1 = recCustTelArea1;
    }


    /**
     * Gets the recCustTelNo1 value for this XShippingV2DetailVO.
     * 
     * @return recCustTelNo1
     */
    public java.lang.String getRecCustTelNo1() {
        return recCustTelNo1;
    }


    /**
     * Sets the recCustTelNo1 value for this XShippingV2DetailVO.
     * 
     * @param recCustTelNo1
     */
    public void setRecCustTelNo1(java.lang.String recCustTelNo1) {
        this.recCustTelNo1 = recCustTelNo1;
    }


    /**
     * Gets the depMainUnitId value for this XShippingV2DetailVO.
     * 
     * @return depMainUnitId
     */
    public java.lang.String getDepMainUnitId() {
        return depMainUnitId;
    }


    /**
     * Sets the depMainUnitId value for this XShippingV2DetailVO.
     * 
     * @param depMainUnitId
     */
    public void setDepMainUnitId(java.lang.String depMainUnitId) {
        this.depMainUnitId = depMainUnitId;
    }


    /**
     * Gets the perfCFlag value for this XShippingV2DetailVO.
     * 
     * @return perfCFlag
     */
    public java.lang.String getPerfCFlag() {
        return perfCFlag;
    }


    /**
     * Sets the perfCFlag value for this XShippingV2DetailVO.
     * 
     * @param perfCFlag
     */
    public void setPerfCFlag(java.lang.String perfCFlag) {
        this.perfCFlag = perfCFlag;
    }


    /**
     * Gets the delivDurationWorkDay value for this XShippingV2DetailVO.
     * 
     * @return delivDurationWorkDay
     */
    public int getDelivDurationWorkDay() {
        return delivDurationWorkDay;
    }


    /**
     * Sets the delivDurationWorkDay value for this XShippingV2DetailVO.
     * 
     * @param delivDurationWorkDay
     */
    public void setDelivDurationWorkDay(int delivDurationWorkDay) {
        this.delivDurationWorkDay = delivDurationWorkDay;
    }


    /**
     * Gets the delivDuration value for this XShippingV2DetailVO.
     * 
     * @return delivDuration
     */
    public int getDelivDuration() {
        return delivDuration;
    }


    /**
     * Sets the delivDuration value for this XShippingV2DetailVO.
     * 
     * @param delivDuration
     */
    public void setDelivDuration(int delivDuration) {
        this.delivDuration = delivDuration;
    }


    /**
     * Gets the perfLateCEventId value for this XShippingV2DetailVO.
     * 
     * @return perfLateCEventId
     */
    public java.lang.String getPerfLateCEventId() {
        return perfLateCEventId;
    }


    /**
     * Sets the perfLateCEventId value for this XShippingV2DetailVO.
     * 
     * @param perfLateCEventId
     */
    public void setPerfLateCEventId(java.lang.String perfLateCEventId) {
        this.perfLateCEventId = perfLateCEventId;
    }


    /**
     * Gets the perfLateCReasonId value for this XShippingV2DetailVO.
     * 
     * @return perfLateCReasonId
     */
    public java.lang.String getPerfLateCReasonId() {
        return perfLateCReasonId;
    }


    /**
     * Sets the perfLateCReasonId value for this XShippingV2DetailVO.
     * 
     * @param perfLateCReasonId
     */
    public void setPerfLateCReasonId(java.lang.String perfLateCReasonId) {
        this.perfLateCReasonId = perfLateCReasonId;
    }


    /**
     * Gets the contractId value for this XShippingV2DetailVO.
     * 
     * @return contractId
     */
    public java.lang.String getContractId() {
        return contractId;
    }


    /**
     * Sets the contractId value for this XShippingV2DetailVO.
     * 
     * @param contractId
     */
    public void setContractId(java.lang.String contractId) {
        this.contractId = contractId;
    }


    /**
     * Gets the docFieldAllValue value for this XShippingV2DetailVO.
     * 
     * @return docFieldAllValue
     */
    public java.lang.String getDocFieldAllValue() {
        return docFieldAllValue;
    }


    /**
     * Sets the docFieldAllValue value for this XShippingV2DetailVO.
     * 
     * @param docFieldAllValue
     */
    public void setDocFieldAllValue(java.lang.String docFieldAllValue) {
        this.docFieldAllValue = docFieldAllValue;
    }


    /**
     * Gets the shipmentDistance value for this XShippingV2DetailVO.
     * 
     * @return shipmentDistance
     */
    public int getShipmentDistance() {
        return shipmentDistance;
    }


    /**
     * Sets the shipmentDistance value for this XShippingV2DetailVO.
     * 
     * @param shipmentDistance
     */
    public void setShipmentDistance(int shipmentDistance) {
        this.shipmentDistance = shipmentDistance;
    }


    /**
     * Gets the estimatedDeliveryDate value for this XShippingV2DetailVO.
     * 
     * @return estimatedDeliveryDate
     */
    public java.lang.String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }


    /**
     * Sets the estimatedDeliveryDate value for this XShippingV2DetailVO.
     * 
     * @param estimatedDeliveryDate
     */
    public void setEstimatedDeliveryDate(java.lang.String estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }


    /**
     * Gets the campaignAreaType value for this XShippingV2DetailVO.
     * 
     * @return campaignAreaType
     */
    public java.lang.String getCampaignAreaType() {
        return campaignAreaType;
    }


    /**
     * Sets the campaignAreaType value for this XShippingV2DetailVO.
     * 
     * @param campaignAreaType
     */
    public void setCampaignAreaType(java.lang.String campaignAreaType) {
        this.campaignAreaType = campaignAreaType;
    }


    /**
     * Gets the reroutingFlag value for this XShippingV2DetailVO.
     * 
     * @return reroutingFlag
     */
    public java.lang.String getReroutingFlag() {
        return reroutingFlag;
    }


    /**
     * Sets the reroutingFlag value for this XShippingV2DetailVO.
     * 
     * @param reroutingFlag
     */
    public void setReroutingFlag(java.lang.String reroutingFlag) {
        this.reroutingFlag = reroutingFlag;
    }


    /**
     * Gets the deliveryUnitArrivalDate value for this XShippingV2DetailVO.
     * 
     * @return deliveryUnitArrivalDate
     */
    public java.lang.String getDeliveryUnitArrivalDate() {
        return deliveryUnitArrivalDate;
    }


    /**
     * Sets the deliveryUnitArrivalDate value for this XShippingV2DetailVO.
     * 
     * @param deliveryUnitArrivalDate
     */
    public void setDeliveryUnitArrivalDate(java.lang.String deliveryUnitArrivalDate) {
        this.deliveryUnitArrivalDate = deliveryUnitArrivalDate;
    }


    /**
     * Gets the deliveryUnitArrivalTime value for this XShippingV2DetailVO.
     * 
     * @return deliveryUnitArrivalTime
     */
    public java.lang.String getDeliveryUnitArrivalTime() {
        return deliveryUnitArrivalTime;
    }


    /**
     * Sets the deliveryUnitArrivalTime value for this XShippingV2DetailVO.
     * 
     * @param deliveryUnitArrivalTime
     */
    public void setDeliveryUnitArrivalTime(java.lang.String deliveryUnitArrivalTime) {
        this.deliveryUnitArrivalTime = deliveryUnitArrivalTime;
    }


    /**
     * Gets the waybillCount value for this XShippingV2DetailVO.
     * 
     * @return waybillCount
     */
    public int getWaybillCount() {
        return waybillCount;
    }


    /**
     * Sets the waybillCount value for this XShippingV2DetailVO.
     * 
     * @param waybillCount
     */
    public void setWaybillCount(int waybillCount) {
        this.waybillCount = waybillCount;
    }


    /**
     * Gets the docCarryBagNo value for this XShippingV2DetailVO.
     * 
     * @return docCarryBagNo
     */
    public java.lang.String getDocCarryBagNo() {
        return docCarryBagNo;
    }


    /**
     * Sets the docCarryBagNo value for this XShippingV2DetailVO.
     * 
     * @param docCarryBagNo
     */
    public void setDocCarryBagNo(java.lang.String docCarryBagNo) {
        this.docCarryBagNo = docCarryBagNo;
    }


    /**
     * Gets the senderAddress value for this XShippingV2DetailVO.
     * 
     * @return senderAddress
     */
    public java.lang.String getSenderAddress() {
        return senderAddress;
    }


    /**
     * Sets the senderAddress value for this XShippingV2DetailVO.
     * 
     * @param senderAddress
     */
    public void setSenderAddress(java.lang.String senderAddress) {
        this.senderAddress = senderAddress;
    }


    /**
     * Gets the senderTownName value for this XShippingV2DetailVO.
     * 
     * @return senderTownName
     */
    public java.lang.String getSenderTownName() {
        return senderTownName;
    }


    /**
     * Sets the senderTownName value for this XShippingV2DetailVO.
     * 
     * @param senderTownName
     */
    public void setSenderTownName(java.lang.String senderTownName) {
        this.senderTownName = senderTownName;
    }


    /**
     * Gets the receiverTownName value for this XShippingV2DetailVO.
     * 
     * @return receiverTownName
     */
    public java.lang.String getReceiverTownName() {
        return receiverTownName;
    }


    /**
     * Sets the receiverTownName value for this XShippingV2DetailVO.
     * 
     * @param receiverTownName
     */
    public void setReceiverTownName(java.lang.String receiverTownName) {
        this.receiverTownName = receiverTownName;
    }


    /**
     * Gets the senderPhone1 value for this XShippingV2DetailVO.
     * 
     * @return senderPhone1
     */
    public java.lang.String getSenderPhone1() {
        return senderPhone1;
    }


    /**
     * Sets the senderPhone1 value for this XShippingV2DetailVO.
     * 
     * @param senderPhone1
     */
    public void setSenderPhone1(java.lang.String senderPhone1) {
        this.senderPhone1 = senderPhone1;
    }


    /**
     * Gets the senderGsm value for this XShippingV2DetailVO.
     * 
     * @return senderGsm
     */
    public java.lang.String getSenderGsm() {
        return senderGsm;
    }


    /**
     * Sets the senderGsm value for this XShippingV2DetailVO.
     * 
     * @param senderGsm
     */
    public void setSenderGsm(java.lang.String senderGsm) {
        this.senderGsm = senderGsm;
    }


    /**
     * Gets the receiverPhone1 value for this XShippingV2DetailVO.
     * 
     * @return receiverPhone1
     */
    public java.lang.String getReceiverPhone1() {
        return receiverPhone1;
    }


    /**
     * Sets the receiverPhone1 value for this XShippingV2DetailVO.
     * 
     * @param receiverPhone1
     */
    public void setReceiverPhone1(java.lang.String receiverPhone1) {
        this.receiverPhone1 = receiverPhone1;
    }


    /**
     * Gets the receiverGsm value for this XShippingV2DetailVO.
     * 
     * @return receiverGsm
     */
    public java.lang.String getReceiverGsm() {
        return receiverGsm;
    }


    /**
     * Sets the receiverGsm value for this XShippingV2DetailVO.
     * 
     * @param receiverGsm
     */
    public void setReceiverGsm(java.lang.String receiverGsm) {
        this.receiverGsm = receiverGsm;
    }


    /**
     * Gets the arrCountyId value for this XShippingV2DetailVO.
     * 
     * @return arrCountyId
     */
    public java.lang.String getArrCountyId() {
        return arrCountyId;
    }


    /**
     * Sets the arrCountyId value for this XShippingV2DetailVO.
     * 
     * @param arrCountyId
     */
    public void setArrCountyId(java.lang.String arrCountyId) {
        this.arrCountyId = arrCountyId;
    }


    /**
     * Gets the depCountyId value for this XShippingV2DetailVO.
     * 
     * @return depCountyId
     */
    public java.lang.String getDepCountyId() {
        return depCountyId;
    }


    /**
     * Sets the depCountyId value for this XShippingV2DetailVO.
     * 
     * @param depCountyId
     */
    public void setDepCountyId(java.lang.String depCountyId) {
        this.depCountyId = depCountyId;
    }


    /**
     * Gets the receiverCountyName value for this XShippingV2DetailVO.
     * 
     * @return receiverCountyName
     */
    public java.lang.String getReceiverCountyName() {
        return receiverCountyName;
    }


    /**
     * Sets the receiverCountyName value for this XShippingV2DetailVO.
     * 
     * @param receiverCountyName
     */
    public void setReceiverCountyName(java.lang.String receiverCountyName) {
        this.receiverCountyName = receiverCountyName;
    }


    /**
     * Gets the nextDayDeliveryFlag value for this XShippingV2DetailVO.
     * 
     * @return nextDayDeliveryFlag
     */
    public java.lang.String getNextDayDeliveryFlag() {
        return nextDayDeliveryFlag;
    }


    /**
     * Sets the nextDayDeliveryFlag value for this XShippingV2DetailVO.
     * 
     * @param nextDayDeliveryFlag
     */
    public void setNextDayDeliveryFlag(java.lang.String nextDayDeliveryFlag) {
        this.nextDayDeliveryFlag = nextDayDeliveryFlag;
    }


    /**
     * Gets the nextDayDeliveryEventId value for this XShippingV2DetailVO.
     * 
     * @return nextDayDeliveryEventId
     */
    public java.lang.String getNextDayDeliveryEventId() {
        return nextDayDeliveryEventId;
    }


    /**
     * Sets the nextDayDeliveryEventId value for this XShippingV2DetailVO.
     * 
     * @param nextDayDeliveryEventId
     */
    public void setNextDayDeliveryEventId(java.lang.String nextDayDeliveryEventId) {
        this.nextDayDeliveryEventId = nextDayDeliveryEventId;
    }


    /**
     * Gets the nextDayDeliveryReasonId value for this XShippingV2DetailVO.
     * 
     * @return nextDayDeliveryReasonId
     */
    public java.lang.String getNextDayDeliveryReasonId() {
        return nextDayDeliveryReasonId;
    }


    /**
     * Sets the nextDayDeliveryReasonId value for this XShippingV2DetailVO.
     * 
     * @param nextDayDeliveryReasonId
     */
    public void setNextDayDeliveryReasonId(java.lang.String nextDayDeliveryReasonId) {
        this.nextDayDeliveryReasonId = nextDayDeliveryReasonId;
    }


    /**
     * Gets the txEventDate value for this XShippingV2DetailVO.
     * 
     * @return txEventDate
     */
    public java.lang.String getTxEventDate() {
        return txEventDate;
    }


    /**
     * Sets the txEventDate value for this XShippingV2DetailVO.
     * 
     * @param txEventDate
     */
    public void setTxEventDate(java.lang.String txEventDate) {
        this.txEventDate = txEventDate;
    }


    /**
     * Gets the senderCountyName value for this XShippingV2DetailVO.
     * 
     * @return senderCountyName
     */
    public java.lang.String getSenderCountyName() {
        return senderCountyName;
    }


    /**
     * Sets the senderCountyName value for this XShippingV2DetailVO.
     * 
     * @param senderCountyName
     */
    public void setSenderCountyName(java.lang.String senderCountyName) {
        this.senderCountyName = senderCountyName;
    }


    /**
     * Gets the transactionChannel value for this XShippingV2DetailVO.
     * 
     * @return transactionChannel
     */
    public java.lang.String getTransactionChannel() {
        return transactionChannel;
    }


    /**
     * Sets the transactionChannel value for this XShippingV2DetailVO.
     * 
     * @param transactionChannel
     */
    public void setTransactionChannel(java.lang.String transactionChannel) {
        this.transactionChannel = transactionChannel;
    }


    /**
     * Gets the senderCustTelArea1 value for this XShippingV2DetailVO.
     * 
     * @return senderCustTelArea1
     */
    public java.lang.String getSenderCustTelArea1() {
        return senderCustTelArea1;
    }


    /**
     * Sets the senderCustTelArea1 value for this XShippingV2DetailVO.
     * 
     * @param senderCustTelArea1
     */
    public void setSenderCustTelArea1(java.lang.String senderCustTelArea1) {
        this.senderCustTelArea1 = senderCustTelArea1;
    }


    /**
     * Gets the senderCustTelNo1 value for this XShippingV2DetailVO.
     * 
     * @return senderCustTelNo1
     */
    public java.lang.String getSenderCustTelNo1() {
        return senderCustTelNo1;
    }


    /**
     * Sets the senderCustTelNo1 value for this XShippingV2DetailVO.
     * 
     * @param senderCustTelNo1
     */
    public void setSenderCustTelNo1(java.lang.String senderCustTelNo1) {
        this.senderCustTelNo1 = senderCustTelNo1;
    }


    /**
     * Gets the delFlag value for this XShippingV2DetailVO.
     * 
     * @return delFlag
     */
    public java.lang.String getDelFlag() {
        return delFlag;
    }


    /**
     * Sets the delFlag value for this XShippingV2DetailVO.
     * 
     * @param delFlag
     */
    public void setDelFlag(java.lang.String delFlag) {
        this.delFlag = delFlag;
    }


    /**
     * Gets the rejectFlag value for this XShippingV2DetailVO.
     * 
     * @return rejectFlag
     */
    public java.lang.String getRejectFlag() {
        return rejectFlag;
    }


    /**
     * Sets the rejectFlag value for this XShippingV2DetailVO.
     * 
     * @param rejectFlag
     */
    public void setRejectFlag(java.lang.String rejectFlag) {
        this.rejectFlag = rejectFlag;
    }


    /**
     * Gets the rejectReason value for this XShippingV2DetailVO.
     * 
     * @return rejectReason
     */
    public java.lang.String getRejectReason() {
        return rejectReason;
    }


    /**
     * Sets the rejectReason value for this XShippingV2DetailVO.
     * 
     * @param rejectReason
     */
    public void setRejectReason(java.lang.String rejectReason) {
        this.rejectReason = rejectReason;
    }


    /**
     * Gets the delMainUnitName value for this XShippingV2DetailVO.
     * 
     * @return delMainUnitName
     */
    public java.lang.String getDelMainUnitName() {
        return delMainUnitName;
    }


    /**
     * Sets the delMainUnitName value for this XShippingV2DetailVO.
     * 
     * @param delMainUnitName
     */
    public void setDelMainUnitName(java.lang.String delMainUnitName) {
        this.delMainUnitName = delMainUnitName;
    }


    /**
     * Gets the arrMainUnitName value for this XShippingV2DetailVO.
     * 
     * @return arrMainUnitName
     */
    public java.lang.String getArrMainUnitName() {
        return arrMainUnitName;
    }


    /**
     * Sets the arrMainUnitName value for this XShippingV2DetailVO.
     * 
     * @param arrMainUnitName
     */
    public void setArrMainUnitName(java.lang.String arrMainUnitName) {
        this.arrMainUnitName = arrMainUnitName;
    }


    /**
     * Gets the depMainUnitName value for this XShippingV2DetailVO.
     * 
     * @return depMainUnitName
     */
    public java.lang.String getDepMainUnitName() {
        return depMainUnitName;
    }


    /**
     * Sets the depMainUnitName value for this XShippingV2DetailVO.
     * 
     * @param depMainUnitName
     */
    public void setDepMainUnitName(java.lang.String depMainUnitName) {
        this.depMainUnitName = depMainUnitName;
    }


    /**
     * Gets the invDocFieldVOArray value for this XShippingV2DetailVO.
     * 
     * @return invDocFieldVOArray
     */
    public tr.com.yurticikargo.sswIntegrationServices.InvDocField2VO[] getInvDocFieldVOArray() {
        return invDocFieldVOArray;
    }


    /**
     * Sets the invDocFieldVOArray value for this XShippingV2DetailVO.
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
     * Gets the docCargoFieldVOArray value for this XShippingV2DetailVO.
     * 
     * @return docCargoFieldVOArray
     */
    public tr.com.yurticikargo.sswIntegrationServices.DocCargoField2VO[] getDocCargoFieldVOArray() {
        return docCargoFieldVOArray;
    }


    /**
     * Sets the docCargoFieldVOArray value for this XShippingV2DetailVO.
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
     * Gets the docCargoLifeCycleVOArray value for this XShippingV2DetailVO.
     * 
     * @return docCargoLifeCycleVOArray
     */
    public tr.com.yurticikargo.sswIntegrationServices.DocCargoLifeCycleVO[] getDocCargoLifeCycleVOArray() {
        return docCargoLifeCycleVOArray;
    }


    /**
     * Sets the docCargoLifeCycleVOArray value for this XShippingV2DetailVO.
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
     * Gets the docCargoVOArray value for this XShippingV2DetailVO.
     * 
     * @return docCargoVOArray
     */
    public tr.com.yurticikargo.sswIntegrationServices.DocCargoVO[] getDocCargoVOArray() {
        return docCargoVOArray;
    }


    /**
     * Sets the docCargoVOArray value for this XShippingV2DetailVO.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XShippingV2DetailVO)) return false;
        XShippingV2DetailVO other = (XShippingV2DetailVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docId==null && other.getDocId()==null) || 
             (this.docId!=null &&
              this.docId.equals(other.getDocId()))) &&
            ((this.trackingUrl==null && other.getTrackingUrl()==null) || 
             (this.trackingUrl!=null &&
              this.trackingUrl.equals(other.getTrackingUrl()))) &&
            ((this.docNumber==null && other.getDocNumber()==null) || 
             (this.docNumber!=null &&
              this.docNumber.equals(other.getDocNumber()))) &&
            ((this.senderCustId==null && other.getSenderCustId()==null) || 
             (this.senderCustId!=null &&
              this.senderCustId.equals(other.getSenderCustId()))) &&
            ((this.senderCustName==null && other.getSenderCustName()==null) || 
             (this.senderCustName!=null &&
              this.senderCustName.equals(other.getSenderCustName()))) &&
            ((this.receiverCustId==null && other.getReceiverCustId()==null) || 
             (this.receiverCustId!=null &&
              this.receiverCustId.equals(other.getReceiverCustId()))) &&
            ((this.recCustName==null && other.getRecCustName()==null) || 
             (this.recCustName!=null &&
              this.recCustName.equals(other.getRecCustName()))) &&
            ((this.invCustId==null && other.getInvCustId()==null) || 
             (this.invCustId!=null &&
              this.invCustId.equals(other.getInvCustId()))) &&
            ((this.invCustName==null && other.getInvCustName()==null) || 
             (this.invCustName!=null &&
              this.invCustName.equals(other.getInvCustName()))) &&
            ((this.depUnitName==null && other.getDepUnitName()==null) || 
             (this.depUnitName!=null &&
              this.depUnitName.equals(other.getDepUnitName()))) &&
            ((this.depCityName==null && other.getDepCityName()==null) || 
             (this.depCityName!=null &&
              this.depCityName.equals(other.getDepCityName()))) &&
            ((this.departureDate==null && other.getDepartureDate()==null) || 
             (this.departureDate!=null &&
              this.departureDate.equals(other.getDepartureDate()))) &&
            ((this.departureTime==null && other.getDepartureTime()==null) || 
             (this.departureTime!=null &&
              this.departureTime.equals(other.getDepartureTime()))) &&
            ((this.arrUnitName==null && other.getArrUnitName()==null) || 
             (this.arrUnitName!=null &&
              this.arrUnitName.equals(other.getArrUnitName()))) &&
            ((this.arrUnitId==null && other.getArrUnitId()==null) || 
             (this.arrUnitId!=null &&
              this.arrUnitId.equals(other.getArrUnitId()))) &&
            ((this.arrCityName==null && other.getArrCityName()==null) || 
             (this.arrCityName!=null &&
              this.arrCityName.equals(other.getArrCityName()))) &&
            ((this.arrivalDate==null && other.getArrivalDate()==null) || 
             (this.arrivalDate!=null &&
              this.arrivalDate.equals(other.getArrivalDate()))) &&
            ((this.docType==null && other.getDocType()==null) || 
             (this.docType!=null &&
              this.docType.equals(other.getDocType()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.pickUpType==null && other.getPickUpType()==null) || 
             (this.pickUpType!=null &&
              this.pickUpType.equals(other.getPickUpType()))) &&
            ((this.deliveryType==null && other.getDeliveryType()==null) || 
             (this.deliveryType!=null &&
              this.deliveryType.equals(other.getDeliveryType()))) &&
            ((this.prodName==null && other.getProdName()==null) || 
             (this.prodName!=null &&
              this.prodName.equals(other.getProdName()))) &&
            ((this.prodGrpName==null && other.getProdGrpName()==null) || 
             (this.prodGrpName!=null &&
              this.prodGrpName.equals(other.getProdGrpName()))) &&
            ((this.cargoType==null && other.getCargoType()==null) || 
             (this.cargoType!=null &&
              this.cargoType.equals(other.getCargoType()))) &&
            this.totalCargo == other.getTotalCargo() &&
            this.totalDesiKg == other.getTotalDesiKg() &&
            this.productPrice == other.getProductPrice() &&
            this.totalPrice == other.getTotalPrice() &&
            this.totalVat == other.getTotalVat() &&
            this.totalPriceWithVat == other.getTotalPriceWithVat() &&
            ((this.docCargoId==null && other.getDocCargoId()==null) || 
             (this.docCargoId!=null &&
              this.docCargoId.equals(other.getDocCargoId()))) &&
            ((this.currentUnitId==null && other.getCurrentUnitId()==null) || 
             (this.currentUnitId!=null &&
              this.currentUnitId.equals(other.getCurrentUnitId()))) &&
            ((this.currentUnitName==null && other.getCurrentUnitName()==null) || 
             (this.currentUnitName!=null &&
              this.currentUnitName.equals(other.getCurrentUnitName()))) &&
            ((this.cargoEventDate==null && other.getCargoEventDate()==null) || 
             (this.cargoEventDate!=null &&
              this.cargoEventDate.equals(other.getCargoEventDate()))) &&
            ((this.cargoEventTime==null && other.getCargoEventTime()==null) || 
             (this.cargoEventTime!=null &&
              this.cargoEventTime.equals(other.getCargoEventTime()))) &&
            ((this.cargoEventId==null && other.getCargoEventId()==null) || 
             (this.cargoEventId!=null &&
              this.cargoEventId.equals(other.getCargoEventId()))) &&
            ((this.cargoReasonId==null && other.getCargoReasonId()==null) || 
             (this.cargoReasonId!=null &&
              this.cargoReasonId.equals(other.getCargoReasonId()))) &&
            ((this.cargoEventExplanation==null && other.getCargoEventExplanation()==null) || 
             (this.cargoEventExplanation!=null &&
              this.cargoEventExplanation.equals(other.getCargoEventExplanation()))) &&
            ((this.cargoReasonExplanation==null && other.getCargoReasonExplanation()==null) || 
             (this.cargoReasonExplanation!=null &&
              this.cargoReasonExplanation.equals(other.getCargoReasonExplanation()))) &&
            ((this.deliveredTo==null && other.getDeliveredTo()==null) || 
             (this.deliveredTo!=null &&
              this.deliveredTo.equals(other.getDeliveredTo()))) &&
            ((this.deliveryDate==null && other.getDeliveryDate()==null) || 
             (this.deliveryDate!=null &&
              this.deliveryDate.equals(other.getDeliveryDate()))) &&
            ((this.deliveryTime==null && other.getDeliveryTime()==null) || 
             (this.deliveryTime!=null &&
              this.deliveryTime.equals(other.getDeliveryTime()))) &&
            ((this.pickupDocumentNo==null && other.getPickupDocumentNo()==null) || 
             (this.pickupDocumentNo!=null &&
              this.pickupDocumentNo.equals(other.getPickupDocumentNo()))) &&
            ((this.waybillNo==null && other.getWaybillNo()==null) || 
             (this.waybillNo!=null &&
              this.waybillNo.equals(other.getWaybillNo()))) &&
            ((this.extraInfo==null && other.getExtraInfo()==null) || 
             (this.extraInfo!=null &&
              this.extraInfo.equals(other.getExtraInfo()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.activeFlag==null && other.getActiveFlag()==null) || 
             (this.activeFlag!=null &&
              this.activeFlag.equals(other.getActiveFlag()))) &&
            ((this.userCreate==null && other.getUserCreate()==null) || 
             (this.userCreate!=null &&
              this.userCreate.equals(other.getUserCreate()))) &&
            ((this.dateCreate==null && other.getDateCreate()==null) || 
             (this.dateCreate!=null &&
              this.dateCreate.equals(other.getDateCreate()))) &&
            ((this.timeCreate==null && other.getTimeCreate()==null) || 
             (this.timeCreate!=null &&
              this.timeCreate.equals(other.getTimeCreate()))) &&
            ((this.userUpdate==null && other.getUserUpdate()==null) || 
             (this.userUpdate!=null &&
              this.userUpdate.equals(other.getUserUpdate()))) &&
            ((this.delUnitName==null && other.getDelUnitName()==null) || 
             (this.delUnitName!=null &&
              this.delUnitName.equals(other.getDelUnitName()))) &&
            ((this.delUnitId==null && other.getDelUnitId()==null) || 
             (this.delUnitId!=null &&
              this.delUnitId.equals(other.getDelUnitId()))) &&
            ((this.delCityName==null && other.getDelCityName()==null) || 
             (this.delCityName!=null &&
              this.delCityName.equals(other.getDelCityName()))) &&
            ((this.depCityId==null && other.getDepCityId()==null) || 
             (this.depCityId!=null &&
              this.depCityId.equals(other.getDepCityId()))) &&
            ((this.arrCityId==null && other.getArrCityId()==null) || 
             (this.arrCityId!=null &&
              this.arrCityId.equals(other.getArrCityId()))) &&
            ((this.delCityId==null && other.getDelCityId()==null) || 
             (this.delCityId!=null &&
              this.delCityId.equals(other.getDelCityId()))) &&
            ((this.recAddressTxt==null && other.getRecAddressTxt()==null) || 
             (this.recAddressTxt!=null &&
              this.recAddressTxt.equals(other.getRecAddressTxt()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.arrUnitTelArea==null && other.getArrUnitTelArea()==null) || 
             (this.arrUnitTelArea!=null &&
              this.arrUnitTelArea.equals(other.getArrUnitTelArea()))) &&
            ((this.arrUnitTelNo==null && other.getArrUnitTelNo()==null) || 
             (this.arrUnitTelNo!=null &&
              this.arrUnitTelNo.equals(other.getArrUnitTelNo()))) &&
            ((this.arrMainUnitId==null && other.getArrMainUnitId()==null) || 
             (this.arrMainUnitId!=null &&
              this.arrMainUnitId.equals(other.getArrMainUnitId()))) &&
            ((this.delMainUnitId==null && other.getDelMainUnitId()==null) || 
             (this.delMainUnitId!=null &&
              this.delMainUnitId.equals(other.getDelMainUnitId()))) &&
            ((this.campaignName==null && other.getCampaignName()==null) || 
             (this.campaignName!=null &&
              this.campaignName.equals(other.getCampaignName()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.campaignKey==null && other.getCampaignKey()==null) || 
             (this.campaignKey!=null &&
              this.campaignKey.equals(other.getCampaignKey()))) &&
            ((this.insurance==null && other.getInsurance()==null) || 
             (this.insurance!=null &&
              this.insurance.equals(other.getInsurance()))) &&
            ((this.arrivalTime==null && other.getArrivalTime()==null) || 
             (this.arrivalTime!=null &&
              this.arrivalTime.equals(other.getArrivalTime()))) &&
            this.dayDiff == other.getDayDiff() &&
            ((this.recCustTelArea1==null && other.getRecCustTelArea1()==null) || 
             (this.recCustTelArea1!=null &&
              this.recCustTelArea1.equals(other.getRecCustTelArea1()))) &&
            ((this.recCustTelNo1==null && other.getRecCustTelNo1()==null) || 
             (this.recCustTelNo1!=null &&
              this.recCustTelNo1.equals(other.getRecCustTelNo1()))) &&
            ((this.depMainUnitId==null && other.getDepMainUnitId()==null) || 
             (this.depMainUnitId!=null &&
              this.depMainUnitId.equals(other.getDepMainUnitId()))) &&
            ((this.perfCFlag==null && other.getPerfCFlag()==null) || 
             (this.perfCFlag!=null &&
              this.perfCFlag.equals(other.getPerfCFlag()))) &&
            this.delivDurationWorkDay == other.getDelivDurationWorkDay() &&
            this.delivDuration == other.getDelivDuration() &&
            ((this.perfLateCEventId==null && other.getPerfLateCEventId()==null) || 
             (this.perfLateCEventId!=null &&
              this.perfLateCEventId.equals(other.getPerfLateCEventId()))) &&
            ((this.perfLateCReasonId==null && other.getPerfLateCReasonId()==null) || 
             (this.perfLateCReasonId!=null &&
              this.perfLateCReasonId.equals(other.getPerfLateCReasonId()))) &&
            ((this.contractId==null && other.getContractId()==null) || 
             (this.contractId!=null &&
              this.contractId.equals(other.getContractId()))) &&
            ((this.docFieldAllValue==null && other.getDocFieldAllValue()==null) || 
             (this.docFieldAllValue!=null &&
              this.docFieldAllValue.equals(other.getDocFieldAllValue()))) &&
            this.shipmentDistance == other.getShipmentDistance() &&
            ((this.estimatedDeliveryDate==null && other.getEstimatedDeliveryDate()==null) || 
             (this.estimatedDeliveryDate!=null &&
              this.estimatedDeliveryDate.equals(other.getEstimatedDeliveryDate()))) &&
            ((this.campaignAreaType==null && other.getCampaignAreaType()==null) || 
             (this.campaignAreaType!=null &&
              this.campaignAreaType.equals(other.getCampaignAreaType()))) &&
            ((this.reroutingFlag==null && other.getReroutingFlag()==null) || 
             (this.reroutingFlag!=null &&
              this.reroutingFlag.equals(other.getReroutingFlag()))) &&
            ((this.deliveryUnitArrivalDate==null && other.getDeliveryUnitArrivalDate()==null) || 
             (this.deliveryUnitArrivalDate!=null &&
              this.deliveryUnitArrivalDate.equals(other.getDeliveryUnitArrivalDate()))) &&
            ((this.deliveryUnitArrivalTime==null && other.getDeliveryUnitArrivalTime()==null) || 
             (this.deliveryUnitArrivalTime!=null &&
              this.deliveryUnitArrivalTime.equals(other.getDeliveryUnitArrivalTime()))) &&
            this.waybillCount == other.getWaybillCount() &&
            ((this.docCarryBagNo==null && other.getDocCarryBagNo()==null) || 
             (this.docCarryBagNo!=null &&
              this.docCarryBagNo.equals(other.getDocCarryBagNo()))) &&
            ((this.senderAddress==null && other.getSenderAddress()==null) || 
             (this.senderAddress!=null &&
              this.senderAddress.equals(other.getSenderAddress()))) &&
            ((this.senderTownName==null && other.getSenderTownName()==null) || 
             (this.senderTownName!=null &&
              this.senderTownName.equals(other.getSenderTownName()))) &&
            ((this.receiverTownName==null && other.getReceiverTownName()==null) || 
             (this.receiverTownName!=null &&
              this.receiverTownName.equals(other.getReceiverTownName()))) &&
            ((this.senderPhone1==null && other.getSenderPhone1()==null) || 
             (this.senderPhone1!=null &&
              this.senderPhone1.equals(other.getSenderPhone1()))) &&
            ((this.senderGsm==null && other.getSenderGsm()==null) || 
             (this.senderGsm!=null &&
              this.senderGsm.equals(other.getSenderGsm()))) &&
            ((this.receiverPhone1==null && other.getReceiverPhone1()==null) || 
             (this.receiverPhone1!=null &&
              this.receiverPhone1.equals(other.getReceiverPhone1()))) &&
            ((this.receiverGsm==null && other.getReceiverGsm()==null) || 
             (this.receiverGsm!=null &&
              this.receiverGsm.equals(other.getReceiverGsm()))) &&
            ((this.arrCountyId==null && other.getArrCountyId()==null) || 
             (this.arrCountyId!=null &&
              this.arrCountyId.equals(other.getArrCountyId()))) &&
            ((this.depCountyId==null && other.getDepCountyId()==null) || 
             (this.depCountyId!=null &&
              this.depCountyId.equals(other.getDepCountyId()))) &&
            ((this.receiverCountyName==null && other.getReceiverCountyName()==null) || 
             (this.receiverCountyName!=null &&
              this.receiverCountyName.equals(other.getReceiverCountyName()))) &&
            ((this.nextDayDeliveryFlag==null && other.getNextDayDeliveryFlag()==null) || 
             (this.nextDayDeliveryFlag!=null &&
              this.nextDayDeliveryFlag.equals(other.getNextDayDeliveryFlag()))) &&
            ((this.nextDayDeliveryEventId==null && other.getNextDayDeliveryEventId()==null) || 
             (this.nextDayDeliveryEventId!=null &&
              this.nextDayDeliveryEventId.equals(other.getNextDayDeliveryEventId()))) &&
            ((this.nextDayDeliveryReasonId==null && other.getNextDayDeliveryReasonId()==null) || 
             (this.nextDayDeliveryReasonId!=null &&
              this.nextDayDeliveryReasonId.equals(other.getNextDayDeliveryReasonId()))) &&
            ((this.txEventDate==null && other.getTxEventDate()==null) || 
             (this.txEventDate!=null &&
              this.txEventDate.equals(other.getTxEventDate()))) &&
            ((this.senderCountyName==null && other.getSenderCountyName()==null) || 
             (this.senderCountyName!=null &&
              this.senderCountyName.equals(other.getSenderCountyName()))) &&
            ((this.transactionChannel==null && other.getTransactionChannel()==null) || 
             (this.transactionChannel!=null &&
              this.transactionChannel.equals(other.getTransactionChannel()))) &&
            ((this.senderCustTelArea1==null && other.getSenderCustTelArea1()==null) || 
             (this.senderCustTelArea1!=null &&
              this.senderCustTelArea1.equals(other.getSenderCustTelArea1()))) &&
            ((this.senderCustTelNo1==null && other.getSenderCustTelNo1()==null) || 
             (this.senderCustTelNo1!=null &&
              this.senderCustTelNo1.equals(other.getSenderCustTelNo1()))) &&
            ((this.delFlag==null && other.getDelFlag()==null) || 
             (this.delFlag!=null &&
              this.delFlag.equals(other.getDelFlag()))) &&
            ((this.rejectFlag==null && other.getRejectFlag()==null) || 
             (this.rejectFlag!=null &&
              this.rejectFlag.equals(other.getRejectFlag()))) &&
            ((this.rejectReason==null && other.getRejectReason()==null) || 
             (this.rejectReason!=null &&
              this.rejectReason.equals(other.getRejectReason()))) &&
            ((this.delMainUnitName==null && other.getDelMainUnitName()==null) || 
             (this.delMainUnitName!=null &&
              this.delMainUnitName.equals(other.getDelMainUnitName()))) &&
            ((this.arrMainUnitName==null && other.getArrMainUnitName()==null) || 
             (this.arrMainUnitName!=null &&
              this.arrMainUnitName.equals(other.getArrMainUnitName()))) &&
            ((this.depMainUnitName==null && other.getDepMainUnitName()==null) || 
             (this.depMainUnitName!=null &&
              this.depMainUnitName.equals(other.getDepMainUnitName()))) &&
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
              java.util.Arrays.equals(this.docCargoVOArray, other.getDocCargoVOArray())));
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
        if (getDocId() != null) {
            _hashCode += getDocId().hashCode();
        }
        if (getTrackingUrl() != null) {
            _hashCode += getTrackingUrl().hashCode();
        }
        if (getDocNumber() != null) {
            _hashCode += getDocNumber().hashCode();
        }
        if (getSenderCustId() != null) {
            _hashCode += getSenderCustId().hashCode();
        }
        if (getSenderCustName() != null) {
            _hashCode += getSenderCustName().hashCode();
        }
        if (getReceiverCustId() != null) {
            _hashCode += getReceiverCustId().hashCode();
        }
        if (getRecCustName() != null) {
            _hashCode += getRecCustName().hashCode();
        }
        if (getInvCustId() != null) {
            _hashCode += getInvCustId().hashCode();
        }
        if (getInvCustName() != null) {
            _hashCode += getInvCustName().hashCode();
        }
        if (getDepUnitName() != null) {
            _hashCode += getDepUnitName().hashCode();
        }
        if (getDepCityName() != null) {
            _hashCode += getDepCityName().hashCode();
        }
        if (getDepartureDate() != null) {
            _hashCode += getDepartureDate().hashCode();
        }
        if (getDepartureTime() != null) {
            _hashCode += getDepartureTime().hashCode();
        }
        if (getArrUnitName() != null) {
            _hashCode += getArrUnitName().hashCode();
        }
        if (getArrUnitId() != null) {
            _hashCode += getArrUnitId().hashCode();
        }
        if (getArrCityName() != null) {
            _hashCode += getArrCityName().hashCode();
        }
        if (getArrivalDate() != null) {
            _hashCode += getArrivalDate().hashCode();
        }
        if (getDocType() != null) {
            _hashCode += getDocType().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getPickUpType() != null) {
            _hashCode += getPickUpType().hashCode();
        }
        if (getDeliveryType() != null) {
            _hashCode += getDeliveryType().hashCode();
        }
        if (getProdName() != null) {
            _hashCode += getProdName().hashCode();
        }
        if (getProdGrpName() != null) {
            _hashCode += getProdGrpName().hashCode();
        }
        if (getCargoType() != null) {
            _hashCode += getCargoType().hashCode();
        }
        _hashCode += getTotalCargo();
        _hashCode += new Double(getTotalDesiKg()).hashCode();
        _hashCode += new Double(getProductPrice()).hashCode();
        _hashCode += new Double(getTotalPrice()).hashCode();
        _hashCode += new Double(getTotalVat()).hashCode();
        _hashCode += new Double(getTotalPriceWithVat()).hashCode();
        if (getDocCargoId() != null) {
            _hashCode += getDocCargoId().hashCode();
        }
        if (getCurrentUnitId() != null) {
            _hashCode += getCurrentUnitId().hashCode();
        }
        if (getCurrentUnitName() != null) {
            _hashCode += getCurrentUnitName().hashCode();
        }
        if (getCargoEventDate() != null) {
            _hashCode += getCargoEventDate().hashCode();
        }
        if (getCargoEventTime() != null) {
            _hashCode += getCargoEventTime().hashCode();
        }
        if (getCargoEventId() != null) {
            _hashCode += getCargoEventId().hashCode();
        }
        if (getCargoReasonId() != null) {
            _hashCode += getCargoReasonId().hashCode();
        }
        if (getCargoEventExplanation() != null) {
            _hashCode += getCargoEventExplanation().hashCode();
        }
        if (getCargoReasonExplanation() != null) {
            _hashCode += getCargoReasonExplanation().hashCode();
        }
        if (getDeliveredTo() != null) {
            _hashCode += getDeliveredTo().hashCode();
        }
        if (getDeliveryDate() != null) {
            _hashCode += getDeliveryDate().hashCode();
        }
        if (getDeliveryTime() != null) {
            _hashCode += getDeliveryTime().hashCode();
        }
        if (getPickupDocumentNo() != null) {
            _hashCode += getPickupDocumentNo().hashCode();
        }
        if (getWaybillNo() != null) {
            _hashCode += getWaybillNo().hashCode();
        }
        if (getExtraInfo() != null) {
            _hashCode += getExtraInfo().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getActiveFlag() != null) {
            _hashCode += getActiveFlag().hashCode();
        }
        if (getUserCreate() != null) {
            _hashCode += getUserCreate().hashCode();
        }
        if (getDateCreate() != null) {
            _hashCode += getDateCreate().hashCode();
        }
        if (getTimeCreate() != null) {
            _hashCode += getTimeCreate().hashCode();
        }
        if (getUserUpdate() != null) {
            _hashCode += getUserUpdate().hashCode();
        }
        if (getDelUnitName() != null) {
            _hashCode += getDelUnitName().hashCode();
        }
        if (getDelUnitId() != null) {
            _hashCode += getDelUnitId().hashCode();
        }
        if (getDelCityName() != null) {
            _hashCode += getDelCityName().hashCode();
        }
        if (getDepCityId() != null) {
            _hashCode += getDepCityId().hashCode();
        }
        if (getArrCityId() != null) {
            _hashCode += getArrCityId().hashCode();
        }
        if (getDelCityId() != null) {
            _hashCode += getDelCityId().hashCode();
        }
        if (getRecAddressTxt() != null) {
            _hashCode += getRecAddressTxt().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getArrUnitTelArea() != null) {
            _hashCode += getArrUnitTelArea().hashCode();
        }
        if (getArrUnitTelNo() != null) {
            _hashCode += getArrUnitTelNo().hashCode();
        }
        if (getArrMainUnitId() != null) {
            _hashCode += getArrMainUnitId().hashCode();
        }
        if (getDelMainUnitId() != null) {
            _hashCode += getDelMainUnitId().hashCode();
        }
        if (getCampaignName() != null) {
            _hashCode += getCampaignName().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCampaignKey() != null) {
            _hashCode += getCampaignKey().hashCode();
        }
        if (getInsurance() != null) {
            _hashCode += getInsurance().hashCode();
        }
        if (getArrivalTime() != null) {
            _hashCode += getArrivalTime().hashCode();
        }
        _hashCode += getDayDiff();
        if (getRecCustTelArea1() != null) {
            _hashCode += getRecCustTelArea1().hashCode();
        }
        if (getRecCustTelNo1() != null) {
            _hashCode += getRecCustTelNo1().hashCode();
        }
        if (getDepMainUnitId() != null) {
            _hashCode += getDepMainUnitId().hashCode();
        }
        if (getPerfCFlag() != null) {
            _hashCode += getPerfCFlag().hashCode();
        }
        _hashCode += getDelivDurationWorkDay();
        _hashCode += getDelivDuration();
        if (getPerfLateCEventId() != null) {
            _hashCode += getPerfLateCEventId().hashCode();
        }
        if (getPerfLateCReasonId() != null) {
            _hashCode += getPerfLateCReasonId().hashCode();
        }
        if (getContractId() != null) {
            _hashCode += getContractId().hashCode();
        }
        if (getDocFieldAllValue() != null) {
            _hashCode += getDocFieldAllValue().hashCode();
        }
        _hashCode += getShipmentDistance();
        if (getEstimatedDeliveryDate() != null) {
            _hashCode += getEstimatedDeliveryDate().hashCode();
        }
        if (getCampaignAreaType() != null) {
            _hashCode += getCampaignAreaType().hashCode();
        }
        if (getReroutingFlag() != null) {
            _hashCode += getReroutingFlag().hashCode();
        }
        if (getDeliveryUnitArrivalDate() != null) {
            _hashCode += getDeliveryUnitArrivalDate().hashCode();
        }
        if (getDeliveryUnitArrivalTime() != null) {
            _hashCode += getDeliveryUnitArrivalTime().hashCode();
        }
        _hashCode += getWaybillCount();
        if (getDocCarryBagNo() != null) {
            _hashCode += getDocCarryBagNo().hashCode();
        }
        if (getSenderAddress() != null) {
            _hashCode += getSenderAddress().hashCode();
        }
        if (getSenderTownName() != null) {
            _hashCode += getSenderTownName().hashCode();
        }
        if (getReceiverTownName() != null) {
            _hashCode += getReceiverTownName().hashCode();
        }
        if (getSenderPhone1() != null) {
            _hashCode += getSenderPhone1().hashCode();
        }
        if (getSenderGsm() != null) {
            _hashCode += getSenderGsm().hashCode();
        }
        if (getReceiverPhone1() != null) {
            _hashCode += getReceiverPhone1().hashCode();
        }
        if (getReceiverGsm() != null) {
            _hashCode += getReceiverGsm().hashCode();
        }
        if (getArrCountyId() != null) {
            _hashCode += getArrCountyId().hashCode();
        }
        if (getDepCountyId() != null) {
            _hashCode += getDepCountyId().hashCode();
        }
        if (getReceiverCountyName() != null) {
            _hashCode += getReceiverCountyName().hashCode();
        }
        if (getNextDayDeliveryFlag() != null) {
            _hashCode += getNextDayDeliveryFlag().hashCode();
        }
        if (getNextDayDeliveryEventId() != null) {
            _hashCode += getNextDayDeliveryEventId().hashCode();
        }
        if (getNextDayDeliveryReasonId() != null) {
            _hashCode += getNextDayDeliveryReasonId().hashCode();
        }
        if (getTxEventDate() != null) {
            _hashCode += getTxEventDate().hashCode();
        }
        if (getSenderCountyName() != null) {
            _hashCode += getSenderCountyName().hashCode();
        }
        if (getTransactionChannel() != null) {
            _hashCode += getTransactionChannel().hashCode();
        }
        if (getSenderCustTelArea1() != null) {
            _hashCode += getSenderCustTelArea1().hashCode();
        }
        if (getSenderCustTelNo1() != null) {
            _hashCode += getSenderCustTelNo1().hashCode();
        }
        if (getDelFlag() != null) {
            _hashCode += getDelFlag().hashCode();
        }
        if (getRejectFlag() != null) {
            _hashCode += getRejectFlag().hashCode();
        }
        if (getRejectReason() != null) {
            _hashCode += getRejectReason().hashCode();
        }
        if (getDelMainUnitName() != null) {
            _hashCode += getDelMainUnitName().hashCode();
        }
        if (getArrMainUnitName() != null) {
            _hashCode += getArrMainUnitName().hashCode();
        }
        if (getDepMainUnitName() != null) {
            _hashCode += getDepMainUnitName().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XShippingV2DetailVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "XShippingV2DetailVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docId"));
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
        elemField.setFieldName("docNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docNumber"));
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
        elemField.setFieldName("receiverCustId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverCustId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recCustName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recCustName"));
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
        elemField.setFieldName("depUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depCityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depCityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departureTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrCityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrCityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrivalDate"));
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
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickUpType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickUpType"));
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
        elemField.setFieldName("prodName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prodName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodGrpName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prodGrpName"));
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
        elemField.setFieldName("totalCargo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDesiKg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalDesiKg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalVat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalVat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPriceWithVat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPriceWithVat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("currentUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoEventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoEventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoEventTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoEventTime"));
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
        elemField.setFieldName("cargoReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoReasonId"));
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
        elemField.setFieldName("cargoReasonExplanation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoReasonExplanation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveredTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveredTo"));
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
        elemField.setFieldName("pickupDocumentNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickupDocumentNo"));
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
        elemField.setFieldName("extraInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extraInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delCityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delCityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depCityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depCityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrCityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrCityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delCityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delCityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recAddressTxt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recAddressTxt"));
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
        elemField.setFieldName("arrUnitTelArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrUnitTelArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrUnitTelNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrUnitTelNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrMainUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrMainUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delMainUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delMainUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insurance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insurance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recCustTelArea1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recCustTelArea1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recCustTelNo1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recCustTelNo1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depMainUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depMainUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfCFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfCFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivDurationWorkDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delivDurationWorkDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delivDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfLateCEventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfLateCEventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfLateCReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfLateCReasonId"));
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
        elemField.setFieldName("docFieldAllValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docFieldAllValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipmentDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("campaignAreaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignAreaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reroutingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reroutingFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryUnitArrivalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryUnitArrivalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryUnitArrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryUnitArrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waybillCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waybillCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docCarryBagNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docCarryBagNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderAddress"));
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
        elemField.setFieldName("senderPhone1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderPhone1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderGsm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderGsm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhone1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverPhone1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverGsm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverGsm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrCountyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrCountyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depCountyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depCountyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverCountyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverCountyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextDayDeliveryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextDayDeliveryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextDayDeliveryEventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextDayDeliveryEventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextDayDeliveryReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextDayDeliveryReasonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txEventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txEventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCountyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderCountyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCustTelArea1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderCustTelArea1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderCustTelNo1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderCustTelNo1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delFlag"));
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
        elemField.setFieldName("rejectReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rejectReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delMainUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delMainUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrMainUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arrMainUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depMainUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depMainUnitName"));
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
