/**
 * DocCargoVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.sswIntegrationServices;

public class DocCargoVO  implements java.io.Serializable {
    private java.lang.String docCargoId;

    private java.lang.String docId;

    private long cargoNumber;

    private java.lang.String cargoType;

    private double desi;

    private double kg;

    private java.lang.String barcodeStringValue;

    public DocCargoVO() {
    }

    public DocCargoVO(
           java.lang.String docCargoId,
           java.lang.String docId,
           long cargoNumber,
           java.lang.String cargoType,
           double desi,
           double kg,
           java.lang.String barcodeStringValue) {
           this.docCargoId = docCargoId;
           this.docId = docId;
           this.cargoNumber = cargoNumber;
           this.cargoType = cargoType;
           this.desi = desi;
           this.kg = kg;
           this.barcodeStringValue = barcodeStringValue;
    }


    /**
     * Gets the docCargoId value for this DocCargoVO.
     * 
     * @return docCargoId
     */
    public java.lang.String getDocCargoId() {
        return docCargoId;
    }


    /**
     * Sets the docCargoId value for this DocCargoVO.
     * 
     * @param docCargoId
     */
    public void setDocCargoId(java.lang.String docCargoId) {
        this.docCargoId = docCargoId;
    }


    /**
     * Gets the docId value for this DocCargoVO.
     * 
     * @return docId
     */
    public java.lang.String getDocId() {
        return docId;
    }


    /**
     * Sets the docId value for this DocCargoVO.
     * 
     * @param docId
     */
    public void setDocId(java.lang.String docId) {
        this.docId = docId;
    }


    /**
     * Gets the cargoNumber value for this DocCargoVO.
     * 
     * @return cargoNumber
     */
    public long getCargoNumber() {
        return cargoNumber;
    }


    /**
     * Sets the cargoNumber value for this DocCargoVO.
     * 
     * @param cargoNumber
     */
    public void setCargoNumber(long cargoNumber) {
        this.cargoNumber = cargoNumber;
    }


    /**
     * Gets the cargoType value for this DocCargoVO.
     * 
     * @return cargoType
     */
    public java.lang.String getCargoType() {
        return cargoType;
    }


    /**
     * Sets the cargoType value for this DocCargoVO.
     * 
     * @param cargoType
     */
    public void setCargoType(java.lang.String cargoType) {
        this.cargoType = cargoType;
    }


    /**
     * Gets the desi value for this DocCargoVO.
     * 
     * @return desi
     */
    public double getDesi() {
        return desi;
    }


    /**
     * Sets the desi value for this DocCargoVO.
     * 
     * @param desi
     */
    public void setDesi(double desi) {
        this.desi = desi;
    }


    /**
     * Gets the kg value for this DocCargoVO.
     * 
     * @return kg
     */
    public double getKg() {
        return kg;
    }


    /**
     * Sets the kg value for this DocCargoVO.
     * 
     * @param kg
     */
    public void setKg(double kg) {
        this.kg = kg;
    }


    /**
     * Gets the barcodeStringValue value for this DocCargoVO.
     * 
     * @return barcodeStringValue
     */
    public java.lang.String getBarcodeStringValue() {
        return barcodeStringValue;
    }


    /**
     * Sets the barcodeStringValue value for this DocCargoVO.
     * 
     * @param barcodeStringValue
     */
    public void setBarcodeStringValue(java.lang.String barcodeStringValue) {
        this.barcodeStringValue = barcodeStringValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocCargoVO)) return false;
        DocCargoVO other = (DocCargoVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docCargoId==null && other.getDocCargoId()==null) || 
             (this.docCargoId!=null &&
              this.docCargoId.equals(other.getDocCargoId()))) &&
            ((this.docId==null && other.getDocId()==null) || 
             (this.docId!=null &&
              this.docId.equals(other.getDocId()))) &&
            this.cargoNumber == other.getCargoNumber() &&
            ((this.cargoType==null && other.getCargoType()==null) || 
             (this.cargoType!=null &&
              this.cargoType.equals(other.getCargoType()))) &&
            this.desi == other.getDesi() &&
            this.kg == other.getKg() &&
            ((this.barcodeStringValue==null && other.getBarcodeStringValue()==null) || 
             (this.barcodeStringValue!=null &&
              this.barcodeStringValue.equals(other.getBarcodeStringValue())));
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
        if (getDocCargoId() != null) {
            _hashCode += getDocCargoId().hashCode();
        }
        if (getDocId() != null) {
            _hashCode += getDocId().hashCode();
        }
        _hashCode += new Long(getCargoNumber()).hashCode();
        if (getCargoType() != null) {
            _hashCode += getCargoType().hashCode();
        }
        _hashCode += new Double(getDesi()).hashCode();
        _hashCode += new Double(getKg()).hashCode();
        if (getBarcodeStringValue() != null) {
            _hashCode += getBarcodeStringValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocCargoVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/sswIntegrationServices", "DocCargoVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docCargoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docCargoId"));
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
        elemField.setFieldName("cargoNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("desi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcodeStringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "barcodeStringValue"));
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
