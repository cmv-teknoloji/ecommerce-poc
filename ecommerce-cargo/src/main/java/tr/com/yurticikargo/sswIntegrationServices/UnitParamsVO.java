/**
 * UnitParamsVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.sswIntegrationServices;

public class UnitParamsVO  implements java.io.Serializable {
    private java.lang.String departureUnitId;

    private java.lang.String deliveryUnitId;

    public UnitParamsVO() {
    }

    public UnitParamsVO(
           java.lang.String departureUnitId,
           java.lang.String deliveryUnitId) {
           this.departureUnitId = departureUnitId;
           this.deliveryUnitId = deliveryUnitId;
    }


    /**
     * Gets the departureUnitId value for this UnitParamsVO.
     * 
     * @return departureUnitId
     */
    public java.lang.String getDepartureUnitId() {
        return departureUnitId;
    }


    /**
     * Sets the departureUnitId value for this UnitParamsVO.
     * 
     * @param departureUnitId
     */
    public void setDepartureUnitId(java.lang.String departureUnitId) {
        this.departureUnitId = departureUnitId;
    }


    /**
     * Gets the deliveryUnitId value for this UnitParamsVO.
     * 
     * @return deliveryUnitId
     */
    public java.lang.String getDeliveryUnitId() {
        return deliveryUnitId;
    }


    /**
     * Sets the deliveryUnitId value for this UnitParamsVO.
     * 
     * @param deliveryUnitId
     */
    public void setDeliveryUnitId(java.lang.String deliveryUnitId) {
        this.deliveryUnitId = deliveryUnitId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnitParamsVO)) return false;
        UnitParamsVO other = (UnitParamsVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departureUnitId==null && other.getDepartureUnitId()==null) || 
             (this.departureUnitId!=null &&
              this.departureUnitId.equals(other.getDepartureUnitId()))) &&
            ((this.deliveryUnitId==null && other.getDeliveryUnitId()==null) || 
             (this.deliveryUnitId!=null &&
              this.deliveryUnitId.equals(other.getDeliveryUnitId())));
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
        if (getDepartureUnitId() != null) {
            _hashCode += getDepartureUnitId().hashCode();
        }
        if (getDeliveryUnitId() != null) {
            _hashCode += getDeliveryUnitId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnitParamsVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "UnitParamsVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departureUnitId"));
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
