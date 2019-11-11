/**
 * ShipmentDeliveryItemDetailVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class ShipmentDeliveryItemDetailVO  extends tr.com.yurticikargo.ShippingOrderDispatcherServices.ShippingDeliveryItemDetailVO  implements java.io.Serializable {
    private java.lang.String estimatedDeliveryDate;

    private java.lang.String estimatedDeliveryTime;

    private java.lang.String perfCFlag;

    private java.lang.String delivDurationWorkDay;

    private java.lang.String delivDuration;

    private java.lang.String perfLateCEvent;

    private java.lang.String perfLateCReason;

    private java.lang.String receiverPhone;

    private java.lang.String receiverGsm;

    private java.lang.String shipmentDistance;

    public ShipmentDeliveryItemDetailVO() {
    }

    public ShipmentDeliveryItemDetailVO(
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
           tr.com.yurticikargo.ShippingOrderDispatcherServices.InvDocCargoVO[] invDocCargoVOArray,
           java.lang.String estimatedDeliveryDate,
           java.lang.String estimatedDeliveryTime,
           java.lang.String perfCFlag,
           java.lang.String delivDurationWorkDay,
           java.lang.String delivDuration,
           java.lang.String perfLateCEvent,
           java.lang.String perfLateCReason,
           java.lang.String receiverPhone,
           java.lang.String receiverGsm,
           java.lang.String shipmentDistance) {
        super(
            cargoKey,
            docId,
            invoiceNumber,
            docNumber,
            waybillNo,
            documentDebitId,
            senderCustId,
            senderCustName,
            senderAddressTxt,
            receiverCustId,
            receiverCustName,
            receiverAddressTxt,
            documentDate,
            documentTime,
            documentDelFlag,
            receiverInfo,
            docType,
            docTypeExplanation,
            contractId,
            trackingUrl,
            cargoType,
            cargoTypeExplanation,
            pickupType,
            pickupTypeExplanation,
            deliveryType,
            deliveryTypeExplanation,
            deliveryDate,
            deliveryTime,
            totalPrice,
            totalVat,
            totalAmount,
            product,
            totalDesi,
            totalKg,
            totalDesiKg,
            totalCargo,
            arrivalUnitId,
            arrivalUnitName,
            departureUnitId,
            departureUnitName,
            arrivalTrCenterUnitId,
            arrivalTrCenterName,
            departureTrCenterUnitId,
            departureTrCenterName,
            deliveryUnitId,
            deliveryUnitName,
            deliveryUnitType,
            deliveryUnitTypeExplanation,
            cargoEventId,
            cargoEventExplanation,
            cargoReasonId,
            cargoReasonExplanation,
            documentEventId,
            documentReasonId,
            documentEventExplanation,
            documentReasonExplanation,
            delInfoDeliveryFlag,
            delInfoDelUnitId,
            delEmpName,
            delEmpId,
            rejectStatus,
            rejectStatusExplanation,
            rejectDescription,
            rejectReasonExplanation,
            returnDocId,
            returnDocumentDate,
            returnDeliveryDate,
            returnStatus,
            returnStatusExplanation,
            invDocFieldVOArray,
            invDocCargoVOArray);
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.perfCFlag = perfCFlag;
        this.delivDurationWorkDay = delivDurationWorkDay;
        this.delivDuration = delivDuration;
        this.perfLateCEvent = perfLateCEvent;
        this.perfLateCReason = perfLateCReason;
        this.receiverPhone = receiverPhone;
        this.receiverGsm = receiverGsm;
        this.shipmentDistance = shipmentDistance;
    }


    /**
     * Gets the estimatedDeliveryDate value for this ShipmentDeliveryItemDetailVO.
     * 
     * @return estimatedDeliveryDate
     */
    public java.lang.String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }


    /**
     * Sets the estimatedDeliveryDate value for this ShipmentDeliveryItemDetailVO.
     * 
     * @param estimatedDeliveryDate
     */
    public void setEstimatedDeliveryDate(java.lang.String estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }


    /**
     * Gets the estimatedDeliveryTime value for this ShipmentDeliveryItemDetailVO.
     * 
     * @return estimatedDeliveryTime
     */
    public java.lang.String getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }


    /**
     * Sets the estimatedDeliveryTime value for this ShipmentDeliveryItemDetailVO.
     * 
     * @param estimatedDeliveryTime
     */
    public void setEstimatedDeliveryTime(java.lang.String estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }


    /**
     * Gets the perfCFlag value for this ShipmentDeliveryItemDetailVO.
     * 
     * @return perfCFlag
     */
    public java.lang.String getPerfCFlag() {
        return perfCFlag;
    }


    /**
     * Sets the perfCFlag value for this ShipmentDeliveryItemDetailVO.
     * 
     * @param perfCFlag
     */
    public void setPerfCFlag(java.lang.String perfCFlag) {
        this.perfCFlag = perfCFlag;
    }


    /**
     * Gets the delivDurationWorkDay value for this ShipmentDeliveryItemDetailVO.
     * 
     * @return delivDurationWorkDay
     */
    public java.lang.String getDelivDurationWorkDay() {
        return delivDurationWorkDay;
    }


    /**
     * Sets the delivDurationWorkDay value for this ShipmentDeliveryItemDetailVO.
     * 
     * @param delivDurationWorkDay
     */
    public void setDelivDurationWorkDay(java.lang.String delivDurationWorkDay) {
        this.delivDurationWorkDay = delivDurationWorkDay;
    }


    /**
     * Gets the delivDuration value for this ShipmentDeliveryItemDetailVO.
     * 
     * @return delivDuration
     */
    public java.lang.String getDelivDuration() {
        return delivDuration;
    }


    /**
     * Sets the delivDuration value for this ShipmentDeliveryItemDetailVO.
     * 
     * @param delivDuration
     */
    public void setDelivDuration(java.lang.String delivDuration) {
        this.delivDuration = delivDuration;
    }


    /**
     * Gets the perfLateCEvent value for this ShipmentDeliveryItemDetailVO.
     * 
     * @return perfLateCEvent
     */
    public java.lang.String getPerfLateCEvent() {
        return perfLateCEvent;
    }


    /**
     * Sets the perfLateCEvent value for this ShipmentDeliveryItemDetailVO.
     * 
     * @param perfLateCEvent
     */
    public void setPerfLateCEvent(java.lang.String perfLateCEvent) {
        this.perfLateCEvent = perfLateCEvent;
    }


    /**
     * Gets the perfLateCReason value for this ShipmentDeliveryItemDetailVO.
     * 
     * @return perfLateCReason
     */
    public java.lang.String getPerfLateCReason() {
        return perfLateCReason;
    }


    /**
     * Sets the perfLateCReason value for this ShipmentDeliveryItemDetailVO.
     * 
     * @param perfLateCReason
     */
    public void setPerfLateCReason(java.lang.String perfLateCReason) {
        this.perfLateCReason = perfLateCReason;
    }


    /**
     * Gets the receiverPhone value for this ShipmentDeliveryItemDetailVO.
     * 
     * @return receiverPhone
     */
    public java.lang.String getReceiverPhone() {
        return receiverPhone;
    }


    /**
     * Sets the receiverPhone value for this ShipmentDeliveryItemDetailVO.
     * 
     * @param receiverPhone
     */
    public void setReceiverPhone(java.lang.String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }


    /**
     * Gets the receiverGsm value for this ShipmentDeliveryItemDetailVO.
     * 
     * @return receiverGsm
     */
    public java.lang.String getReceiverGsm() {
        return receiverGsm;
    }


    /**
     * Sets the receiverGsm value for this ShipmentDeliveryItemDetailVO.
     * 
     * @param receiverGsm
     */
    public void setReceiverGsm(java.lang.String receiverGsm) {
        this.receiverGsm = receiverGsm;
    }


    /**
     * Gets the shipmentDistance value for this ShipmentDeliveryItemDetailVO.
     * 
     * @return shipmentDistance
     */
    public java.lang.String getShipmentDistance() {
        return shipmentDistance;
    }


    /**
     * Sets the shipmentDistance value for this ShipmentDeliveryItemDetailVO.
     * 
     * @param shipmentDistance
     */
    public void setShipmentDistance(java.lang.String shipmentDistance) {
        this.shipmentDistance = shipmentDistance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentDeliveryItemDetailVO)) return false;
        ShipmentDeliveryItemDetailVO other = (ShipmentDeliveryItemDetailVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.estimatedDeliveryDate==null && other.getEstimatedDeliveryDate()==null) || 
             (this.estimatedDeliveryDate!=null &&
              this.estimatedDeliveryDate.equals(other.getEstimatedDeliveryDate()))) &&
            ((this.estimatedDeliveryTime==null && other.getEstimatedDeliveryTime()==null) || 
             (this.estimatedDeliveryTime!=null &&
              this.estimatedDeliveryTime.equals(other.getEstimatedDeliveryTime()))) &&
            ((this.perfCFlag==null && other.getPerfCFlag()==null) || 
             (this.perfCFlag!=null &&
              this.perfCFlag.equals(other.getPerfCFlag()))) &&
            ((this.delivDurationWorkDay==null && other.getDelivDurationWorkDay()==null) || 
             (this.delivDurationWorkDay!=null &&
              this.delivDurationWorkDay.equals(other.getDelivDurationWorkDay()))) &&
            ((this.delivDuration==null && other.getDelivDuration()==null) || 
             (this.delivDuration!=null &&
              this.delivDuration.equals(other.getDelivDuration()))) &&
            ((this.perfLateCEvent==null && other.getPerfLateCEvent()==null) || 
             (this.perfLateCEvent!=null &&
              this.perfLateCEvent.equals(other.getPerfLateCEvent()))) &&
            ((this.perfLateCReason==null && other.getPerfLateCReason()==null) || 
             (this.perfLateCReason!=null &&
              this.perfLateCReason.equals(other.getPerfLateCReason()))) &&
            ((this.receiverPhone==null && other.getReceiverPhone()==null) || 
             (this.receiverPhone!=null &&
              this.receiverPhone.equals(other.getReceiverPhone()))) &&
            ((this.receiverGsm==null && other.getReceiverGsm()==null) || 
             (this.receiverGsm!=null &&
              this.receiverGsm.equals(other.getReceiverGsm()))) &&
            ((this.shipmentDistance==null && other.getShipmentDistance()==null) || 
             (this.shipmentDistance!=null &&
              this.shipmentDistance.equals(other.getShipmentDistance())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEstimatedDeliveryDate() != null) {
            _hashCode += getEstimatedDeliveryDate().hashCode();
        }
        if (getEstimatedDeliveryTime() != null) {
            _hashCode += getEstimatedDeliveryTime().hashCode();
        }
        if (getPerfCFlag() != null) {
            _hashCode += getPerfCFlag().hashCode();
        }
        if (getDelivDurationWorkDay() != null) {
            _hashCode += getDelivDurationWorkDay().hashCode();
        }
        if (getDelivDuration() != null) {
            _hashCode += getDelivDuration().hashCode();
        }
        if (getPerfLateCEvent() != null) {
            _hashCode += getPerfLateCEvent().hashCode();
        }
        if (getPerfLateCReason() != null) {
            _hashCode += getPerfLateCReason().hashCode();
        }
        if (getReceiverPhone() != null) {
            _hashCode += getReceiverPhone().hashCode();
        }
        if (getReceiverGsm() != null) {
            _hashCode += getReceiverGsm().hashCode();
        }
        if (getShipmentDistance() != null) {
            _hashCode += getShipmentDistance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentDeliveryItemDetailVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "ShipmentDeliveryItemDetailVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedDeliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estimatedDeliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedDeliveryTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estimatedDeliveryTime"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delivDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfLateCEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfLateCEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfLateCReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfLateCReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverPhone"));
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
        elemField.setFieldName("shipmentDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipmentDistance"));
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
