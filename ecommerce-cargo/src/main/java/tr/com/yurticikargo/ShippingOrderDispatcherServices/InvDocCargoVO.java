/**
 * InvDocCargoVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class InvDocCargoVO  implements java.io.Serializable {
    private java.lang.String unitId;

    private java.lang.String unitName;

    private java.lang.String eventId;

    private java.lang.String eventName;

    private java.lang.String reasonId;

    private java.lang.String reasonName;

    private java.lang.String eventDate;

    private java.lang.String eventTime;

    private java.lang.String cityName;

    private java.lang.String townName;

    public InvDocCargoVO() {
    }

    public InvDocCargoVO(
           java.lang.String unitId,
           java.lang.String unitName,
           java.lang.String eventId,
           java.lang.String eventName,
           java.lang.String reasonId,
           java.lang.String reasonName,
           java.lang.String eventDate,
           java.lang.String eventTime,
           java.lang.String cityName,
           java.lang.String townName) {
           this.unitId = unitId;
           this.unitName = unitName;
           this.eventId = eventId;
           this.eventName = eventName;
           this.reasonId = reasonId;
           this.reasonName = reasonName;
           this.eventDate = eventDate;
           this.eventTime = eventTime;
           this.cityName = cityName;
           this.townName = townName;
    }


    /**
     * Gets the unitId value for this InvDocCargoVO.
     * 
     * @return unitId
     */
    public java.lang.String getUnitId() {
        return unitId;
    }


    /**
     * Sets the unitId value for this InvDocCargoVO.
     * 
     * @param unitId
     */
    public void setUnitId(java.lang.String unitId) {
        this.unitId = unitId;
    }


    /**
     * Gets the unitName value for this InvDocCargoVO.
     * 
     * @return unitName
     */
    public java.lang.String getUnitName() {
        return unitName;
    }


    /**
     * Sets the unitName value for this InvDocCargoVO.
     * 
     * @param unitName
     */
    public void setUnitName(java.lang.String unitName) {
        this.unitName = unitName;
    }


    /**
     * Gets the eventId value for this InvDocCargoVO.
     * 
     * @return eventId
     */
    public java.lang.String getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this InvDocCargoVO.
     * 
     * @param eventId
     */
    public void setEventId(java.lang.String eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the eventName value for this InvDocCargoVO.
     * 
     * @return eventName
     */
    public java.lang.String getEventName() {
        return eventName;
    }


    /**
     * Sets the eventName value for this InvDocCargoVO.
     * 
     * @param eventName
     */
    public void setEventName(java.lang.String eventName) {
        this.eventName = eventName;
    }


    /**
     * Gets the reasonId value for this InvDocCargoVO.
     * 
     * @return reasonId
     */
    public java.lang.String getReasonId() {
        return reasonId;
    }


    /**
     * Sets the reasonId value for this InvDocCargoVO.
     * 
     * @param reasonId
     */
    public void setReasonId(java.lang.String reasonId) {
        this.reasonId = reasonId;
    }


    /**
     * Gets the reasonName value for this InvDocCargoVO.
     * 
     * @return reasonName
     */
    public java.lang.String getReasonName() {
        return reasonName;
    }


    /**
     * Sets the reasonName value for this InvDocCargoVO.
     * 
     * @param reasonName
     */
    public void setReasonName(java.lang.String reasonName) {
        this.reasonName = reasonName;
    }


    /**
     * Gets the eventDate value for this InvDocCargoVO.
     * 
     * @return eventDate
     */
    public java.lang.String getEventDate() {
        return eventDate;
    }


    /**
     * Sets the eventDate value for this InvDocCargoVO.
     * 
     * @param eventDate
     */
    public void setEventDate(java.lang.String eventDate) {
        this.eventDate = eventDate;
    }


    /**
     * Gets the eventTime value for this InvDocCargoVO.
     * 
     * @return eventTime
     */
    public java.lang.String getEventTime() {
        return eventTime;
    }


    /**
     * Sets the eventTime value for this InvDocCargoVO.
     * 
     * @param eventTime
     */
    public void setEventTime(java.lang.String eventTime) {
        this.eventTime = eventTime;
    }


    /**
     * Gets the cityName value for this InvDocCargoVO.
     * 
     * @return cityName
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this InvDocCargoVO.
     * 
     * @param cityName
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the townName value for this InvDocCargoVO.
     * 
     * @return townName
     */
    public java.lang.String getTownName() {
        return townName;
    }


    /**
     * Sets the townName value for this InvDocCargoVO.
     * 
     * @param townName
     */
    public void setTownName(java.lang.String townName) {
        this.townName = townName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvDocCargoVO)) return false;
        InvDocCargoVO other = (InvDocCargoVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unitId==null && other.getUnitId()==null) || 
             (this.unitId!=null &&
              this.unitId.equals(other.getUnitId()))) &&
            ((this.unitName==null && other.getUnitName()==null) || 
             (this.unitName!=null &&
              this.unitName.equals(other.getUnitName()))) &&
            ((this.eventId==null && other.getEventId()==null) || 
             (this.eventId!=null &&
              this.eventId.equals(other.getEventId()))) &&
            ((this.eventName==null && other.getEventName()==null) || 
             (this.eventName!=null &&
              this.eventName.equals(other.getEventName()))) &&
            ((this.reasonId==null && other.getReasonId()==null) || 
             (this.reasonId!=null &&
              this.reasonId.equals(other.getReasonId()))) &&
            ((this.reasonName==null && other.getReasonName()==null) || 
             (this.reasonName!=null &&
              this.reasonName.equals(other.getReasonName()))) &&
            ((this.eventDate==null && other.getEventDate()==null) || 
             (this.eventDate!=null &&
              this.eventDate.equals(other.getEventDate()))) &&
            ((this.eventTime==null && other.getEventTime()==null) || 
             (this.eventTime!=null &&
              this.eventTime.equals(other.getEventTime()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.townName==null && other.getTownName()==null) || 
             (this.townName!=null &&
              this.townName.equals(other.getTownName())));
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
        if (getUnitId() != null) {
            _hashCode += getUnitId().hashCode();
        }
        if (getUnitName() != null) {
            _hashCode += getUnitName().hashCode();
        }
        if (getEventId() != null) {
            _hashCode += getEventId().hashCode();
        }
        if (getEventName() != null) {
            _hashCode += getEventName().hashCode();
        }
        if (getReasonId() != null) {
            _hashCode += getReasonId().hashCode();
        }
        if (getReasonName() != null) {
            _hashCode += getReasonName().hashCode();
        }
        if (getEventDate() != null) {
            _hashCode += getEventDate().hashCode();
        }
        if (getEventTime() != null) {
            _hashCode += getEventTime().hashCode();
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getTownName() != null) {
            _hashCode += getTownName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvDocCargoVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "InvDocCargoVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("townName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "townName"));
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
