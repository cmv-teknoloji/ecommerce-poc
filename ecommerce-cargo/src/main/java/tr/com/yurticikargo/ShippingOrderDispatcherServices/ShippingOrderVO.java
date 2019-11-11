/**
 * ShippingOrderVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.yurticikargo.ShippingOrderDispatcherServices;

public class ShippingOrderVO  implements java.io.Serializable {
    private java.lang.String cargoKey;

    private java.lang.String invoiceKey;

    private java.lang.String receiverCustName;

    private java.lang.String receiverAddress;

    private java.lang.String cityName;

    private java.lang.String townName;

    private java.lang.String receiverPhone1;

    private java.lang.String receiverPhone2;

    private java.lang.String receiverPhone3;

    private java.lang.String emailAddress;

    private long taxOfficeId;

    private java.lang.String taxNumber;

    private java.lang.String taxOfficeName;

    private java.lang.Double desi;

    private java.lang.Double kg;

    private int cargoCount;

    private java.lang.String waybillNo;

    private java.lang.String specialField1;

    private java.lang.String specialField2;

    private java.lang.String specialField3;

    private java.lang.Double ttInvoiceAmount;

    private long ttDocumentId;

    private java.lang.String ttCollectionType;

    private java.lang.String ttDocumentSaveType;

    private long dcSelectedCredit;

    private long dcCreditRule;

    private java.lang.String description;

    private java.lang.String orgGeoCode;

    private java.lang.String privilegeOrder;

    private java.lang.String custProdId;

    private java.lang.String orgReceiverCustId;

    public ShippingOrderVO() {
    }

    public ShippingOrderVO(
           java.lang.String cargoKey,
           java.lang.String invoiceKey,
           java.lang.String receiverCustName,
           java.lang.String receiverAddress,
           java.lang.String cityName,
           java.lang.String townName,
           java.lang.String receiverPhone1,
           java.lang.String receiverPhone2,
           java.lang.String receiverPhone3,
           java.lang.String emailAddress,
           long taxOfficeId,
           java.lang.String taxNumber,
           java.lang.String taxOfficeName,
           java.lang.Double desi,
           java.lang.Double kg,
           int cargoCount,
           java.lang.String waybillNo,
           java.lang.String specialField1,
           java.lang.String specialField2,
           java.lang.String specialField3,
           java.lang.Double ttInvoiceAmount,
           long ttDocumentId,
           java.lang.String ttCollectionType,
           java.lang.String ttDocumentSaveType,
           long dcSelectedCredit,
           long dcCreditRule,
           java.lang.String description,
           java.lang.String orgGeoCode,
           java.lang.String privilegeOrder,
           java.lang.String custProdId,
           java.lang.String orgReceiverCustId) {
           this.cargoKey = cargoKey;
           this.invoiceKey = invoiceKey;
           this.receiverCustName = receiverCustName;
           this.receiverAddress = receiverAddress;
           this.cityName = cityName;
           this.townName = townName;
           this.receiverPhone1 = receiverPhone1;
           this.receiverPhone2 = receiverPhone2;
           this.receiverPhone3 = receiverPhone3;
           this.emailAddress = emailAddress;
           this.taxOfficeId = taxOfficeId;
           this.taxNumber = taxNumber;
           this.taxOfficeName = taxOfficeName;
           this.desi = desi;
           this.kg = kg;
           this.cargoCount = cargoCount;
           this.waybillNo = waybillNo;
           this.specialField1 = specialField1;
           this.specialField2 = specialField2;
           this.specialField3 = specialField3;
           this.ttInvoiceAmount = ttInvoiceAmount;
           this.ttDocumentId = ttDocumentId;
           this.ttCollectionType = ttCollectionType;
           this.ttDocumentSaveType = ttDocumentSaveType;
           this.dcSelectedCredit = dcSelectedCredit;
           this.dcCreditRule = dcCreditRule;
           this.description = description;
           this.orgGeoCode = orgGeoCode;
           this.privilegeOrder = privilegeOrder;
           this.custProdId = custProdId;
           this.orgReceiverCustId = orgReceiverCustId;
    }


    /**
     * Gets the cargoKey value for this ShippingOrderVO.
     * 
     * @return cargoKey
     */
    public java.lang.String getCargoKey() {
        return cargoKey;
    }


    /**
     * Sets the cargoKey value for this ShippingOrderVO.
     * 
     * @param cargoKey
     */
    public void setCargoKey(java.lang.String cargoKey) {
        this.cargoKey = cargoKey;
    }


    /**
     * Gets the invoiceKey value for this ShippingOrderVO.
     * 
     * @return invoiceKey
     */
    public java.lang.String getInvoiceKey() {
        return invoiceKey;
    }


    /**
     * Sets the invoiceKey value for this ShippingOrderVO.
     * 
     * @param invoiceKey
     */
    public void setInvoiceKey(java.lang.String invoiceKey) {
        this.invoiceKey = invoiceKey;
    }


    /**
     * Gets the receiverCustName value for this ShippingOrderVO.
     * 
     * @return receiverCustName
     */
    public java.lang.String getReceiverCustName() {
        return receiverCustName;
    }


    /**
     * Sets the receiverCustName value for this ShippingOrderVO.
     * 
     * @param receiverCustName
     */
    public void setReceiverCustName(java.lang.String receiverCustName) {
        this.receiverCustName = receiverCustName;
    }


    /**
     * Gets the receiverAddress value for this ShippingOrderVO.
     * 
     * @return receiverAddress
     */
    public java.lang.String getReceiverAddress() {
        return receiverAddress;
    }


    /**
     * Sets the receiverAddress value for this ShippingOrderVO.
     * 
     * @param receiverAddress
     */
    public void setReceiverAddress(java.lang.String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }


    /**
     * Gets the cityName value for this ShippingOrderVO.
     * 
     * @return cityName
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this ShippingOrderVO.
     * 
     * @param cityName
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the townName value for this ShippingOrderVO.
     * 
     * @return townName
     */
    public java.lang.String getTownName() {
        return townName;
    }


    /**
     * Sets the townName value for this ShippingOrderVO.
     * 
     * @param townName
     */
    public void setTownName(java.lang.String townName) {
        this.townName = townName;
    }


    /**
     * Gets the receiverPhone1 value for this ShippingOrderVO.
     * 
     * @return receiverPhone1
     */
    public java.lang.String getReceiverPhone1() {
        return receiverPhone1;
    }


    /**
     * Sets the receiverPhone1 value for this ShippingOrderVO.
     * 
     * @param receiverPhone1
     */
    public void setReceiverPhone1(java.lang.String receiverPhone1) {
        this.receiverPhone1 = receiverPhone1;
    }


    /**
     * Gets the receiverPhone2 value for this ShippingOrderVO.
     * 
     * @return receiverPhone2
     */
    public java.lang.String getReceiverPhone2() {
        return receiverPhone2;
    }


    /**
     * Sets the receiverPhone2 value for this ShippingOrderVO.
     * 
     * @param receiverPhone2
     */
    public void setReceiverPhone2(java.lang.String receiverPhone2) {
        this.receiverPhone2 = receiverPhone2;
    }


    /**
     * Gets the receiverPhone3 value for this ShippingOrderVO.
     * 
     * @return receiverPhone3
     */
    public java.lang.String getReceiverPhone3() {
        return receiverPhone3;
    }


    /**
     * Sets the receiverPhone3 value for this ShippingOrderVO.
     * 
     * @param receiverPhone3
     */
    public void setReceiverPhone3(java.lang.String receiverPhone3) {
        this.receiverPhone3 = receiverPhone3;
    }


    /**
     * Gets the emailAddress value for this ShippingOrderVO.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this ShippingOrderVO.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the taxOfficeId value for this ShippingOrderVO.
     * 
     * @return taxOfficeId
     */
    public long getTaxOfficeId() {
        return taxOfficeId;
    }


    /**
     * Sets the taxOfficeId value for this ShippingOrderVO.
     * 
     * @param taxOfficeId
     */
    public void setTaxOfficeId(long taxOfficeId) {
        this.taxOfficeId = taxOfficeId;
    }


    /**
     * Gets the taxNumber value for this ShippingOrderVO.
     * 
     * @return taxNumber
     */
    public java.lang.String getTaxNumber() {
        return taxNumber;
    }


    /**
     * Sets the taxNumber value for this ShippingOrderVO.
     * 
     * @param taxNumber
     */
    public void setTaxNumber(java.lang.String taxNumber) {
        this.taxNumber = taxNumber;
    }


    /**
     * Gets the taxOfficeName value for this ShippingOrderVO.
     * 
     * @return taxOfficeName
     */
    public java.lang.String getTaxOfficeName() {
        return taxOfficeName;
    }


    /**
     * Sets the taxOfficeName value for this ShippingOrderVO.
     * 
     * @param taxOfficeName
     */
    public void setTaxOfficeName(java.lang.String taxOfficeName) {
        this.taxOfficeName = taxOfficeName;
    }


    /**
     * Gets the desi value for this ShippingOrderVO.
     * 
     * @return desi
     */
    public java.lang.Double getDesi() {
        return desi;
    }


    /**
     * Sets the desi value for this ShippingOrderVO.
     * 
     * @param desi
     */
    public void setDesi(java.lang.Double desi) {
        this.desi = desi;
    }


    /**
     * Gets the kg value for this ShippingOrderVO.
     * 
     * @return kg
     */
    public java.lang.Double getKg() {
        return kg;
    }


    /**
     * Sets the kg value for this ShippingOrderVO.
     * 
     * @param kg
     */
    public void setKg(java.lang.Double kg) {
        this.kg = kg;
    }


    /**
     * Gets the cargoCount value for this ShippingOrderVO.
     * 
     * @return cargoCount
     */
    public int getCargoCount() {
        return cargoCount;
    }


    /**
     * Sets the cargoCount value for this ShippingOrderVO.
     * 
     * @param cargoCount
     */
    public void setCargoCount(int cargoCount) {
        this.cargoCount = cargoCount;
    }


    /**
     * Gets the waybillNo value for this ShippingOrderVO.
     * 
     * @return waybillNo
     */
    public java.lang.String getWaybillNo() {
        return waybillNo;
    }


    /**
     * Sets the waybillNo value for this ShippingOrderVO.
     * 
     * @param waybillNo
     */
    public void setWaybillNo(java.lang.String waybillNo) {
        this.waybillNo = waybillNo;
    }


    /**
     * Gets the specialField1 value for this ShippingOrderVO.
     * 
     * @return specialField1
     */
    public java.lang.String getSpecialField1() {
        return specialField1;
    }


    /**
     * Sets the specialField1 value for this ShippingOrderVO.
     * 
     * @param specialField1
     */
    public void setSpecialField1(java.lang.String specialField1) {
        this.specialField1 = specialField1;
    }


    /**
     * Gets the specialField2 value for this ShippingOrderVO.
     * 
     * @return specialField2
     */
    public java.lang.String getSpecialField2() {
        return specialField2;
    }


    /**
     * Sets the specialField2 value for this ShippingOrderVO.
     * 
     * @param specialField2
     */
    public void setSpecialField2(java.lang.String specialField2) {
        this.specialField2 = specialField2;
    }


    /**
     * Gets the specialField3 value for this ShippingOrderVO.
     * 
     * @return specialField3
     */
    public java.lang.String getSpecialField3() {
        return specialField3;
    }


    /**
     * Sets the specialField3 value for this ShippingOrderVO.
     * 
     * @param specialField3
     */
    public void setSpecialField3(java.lang.String specialField3) {
        this.specialField3 = specialField3;
    }


    /**
     * Gets the ttInvoiceAmount value for this ShippingOrderVO.
     * 
     * @return ttInvoiceAmount
     */
    public java.lang.Double getTtInvoiceAmount() {
        return ttInvoiceAmount;
    }


    /**
     * Sets the ttInvoiceAmount value for this ShippingOrderVO.
     * 
     * @param ttInvoiceAmount
     */
    public void setTtInvoiceAmount(java.lang.Double ttInvoiceAmount) {
        this.ttInvoiceAmount = ttInvoiceAmount;
    }


    /**
     * Gets the ttDocumentId value for this ShippingOrderVO.
     * 
     * @return ttDocumentId
     */
    public long getTtDocumentId() {
        return ttDocumentId;
    }


    /**
     * Sets the ttDocumentId value for this ShippingOrderVO.
     * 
     * @param ttDocumentId
     */
    public void setTtDocumentId(long ttDocumentId) {
        this.ttDocumentId = ttDocumentId;
    }


    /**
     * Gets the ttCollectionType value for this ShippingOrderVO.
     * 
     * @return ttCollectionType
     */
    public java.lang.String getTtCollectionType() {
        return ttCollectionType;
    }


    /**
     * Sets the ttCollectionType value for this ShippingOrderVO.
     * 
     * @param ttCollectionType
     */
    public void setTtCollectionType(java.lang.String ttCollectionType) {
        this.ttCollectionType = ttCollectionType;
    }


    /**
     * Gets the ttDocumentSaveType value for this ShippingOrderVO.
     * 
     * @return ttDocumentSaveType
     */
    public java.lang.String getTtDocumentSaveType() {
        return ttDocumentSaveType;
    }


    /**
     * Sets the ttDocumentSaveType value for this ShippingOrderVO.
     * 
     * @param ttDocumentSaveType
     */
    public void setTtDocumentSaveType(java.lang.String ttDocumentSaveType) {
        this.ttDocumentSaveType = ttDocumentSaveType;
    }


    /**
     * Gets the dcSelectedCredit value for this ShippingOrderVO.
     * 
     * @return dcSelectedCredit
     */
    public long getDcSelectedCredit() {
        return dcSelectedCredit;
    }


    /**
     * Sets the dcSelectedCredit value for this ShippingOrderVO.
     * 
     * @param dcSelectedCredit
     */
    public void setDcSelectedCredit(long dcSelectedCredit) {
        this.dcSelectedCredit = dcSelectedCredit;
    }


    /**
     * Gets the dcCreditRule value for this ShippingOrderVO.
     * 
     * @return dcCreditRule
     */
    public long getDcCreditRule() {
        return dcCreditRule;
    }


    /**
     * Sets the dcCreditRule value for this ShippingOrderVO.
     * 
     * @param dcCreditRule
     */
    public void setDcCreditRule(long dcCreditRule) {
        this.dcCreditRule = dcCreditRule;
    }


    /**
     * Gets the description value for this ShippingOrderVO.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ShippingOrderVO.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the orgGeoCode value for this ShippingOrderVO.
     * 
     * @return orgGeoCode
     */
    public java.lang.String getOrgGeoCode() {
        return orgGeoCode;
    }


    /**
     * Sets the orgGeoCode value for this ShippingOrderVO.
     * 
     * @param orgGeoCode
     */
    public void setOrgGeoCode(java.lang.String orgGeoCode) {
        this.orgGeoCode = orgGeoCode;
    }


    /**
     * Gets the privilegeOrder value for this ShippingOrderVO.
     * 
     * @return privilegeOrder
     */
    public java.lang.String getPrivilegeOrder() {
        return privilegeOrder;
    }


    /**
     * Sets the privilegeOrder value for this ShippingOrderVO.
     * 
     * @param privilegeOrder
     */
    public void setPrivilegeOrder(java.lang.String privilegeOrder) {
        this.privilegeOrder = privilegeOrder;
    }


    /**
     * Gets the custProdId value for this ShippingOrderVO.
     * 
     * @return custProdId
     */
    public java.lang.String getCustProdId() {
        return custProdId;
    }


    /**
     * Sets the custProdId value for this ShippingOrderVO.
     * 
     * @param custProdId
     */
    public void setCustProdId(java.lang.String custProdId) {
        this.custProdId = custProdId;
    }


    /**
     * Gets the orgReceiverCustId value for this ShippingOrderVO.
     * 
     * @return orgReceiverCustId
     */
    public java.lang.String getOrgReceiverCustId() {
        return orgReceiverCustId;
    }


    /**
     * Sets the orgReceiverCustId value for this ShippingOrderVO.
     * 
     * @param orgReceiverCustId
     */
    public void setOrgReceiverCustId(java.lang.String orgReceiverCustId) {
        this.orgReceiverCustId = orgReceiverCustId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingOrderVO)) return false;
        ShippingOrderVO other = (ShippingOrderVO) obj;
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
            ((this.invoiceKey==null && other.getInvoiceKey()==null) || 
             (this.invoiceKey!=null &&
              this.invoiceKey.equals(other.getInvoiceKey()))) &&
            ((this.receiverCustName==null && other.getReceiverCustName()==null) || 
             (this.receiverCustName!=null &&
              this.receiverCustName.equals(other.getReceiverCustName()))) &&
            ((this.receiverAddress==null && other.getReceiverAddress()==null) || 
             (this.receiverAddress!=null &&
              this.receiverAddress.equals(other.getReceiverAddress()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.townName==null && other.getTownName()==null) || 
             (this.townName!=null &&
              this.townName.equals(other.getTownName()))) &&
            ((this.receiverPhone1==null && other.getReceiverPhone1()==null) || 
             (this.receiverPhone1!=null &&
              this.receiverPhone1.equals(other.getReceiverPhone1()))) &&
            ((this.receiverPhone2==null && other.getReceiverPhone2()==null) || 
             (this.receiverPhone2!=null &&
              this.receiverPhone2.equals(other.getReceiverPhone2()))) &&
            ((this.receiverPhone3==null && other.getReceiverPhone3()==null) || 
             (this.receiverPhone3!=null &&
              this.receiverPhone3.equals(other.getReceiverPhone3()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            this.taxOfficeId == other.getTaxOfficeId() &&
            ((this.taxNumber==null && other.getTaxNumber()==null) || 
             (this.taxNumber!=null &&
              this.taxNumber.equals(other.getTaxNumber()))) &&
            ((this.taxOfficeName==null && other.getTaxOfficeName()==null) || 
             (this.taxOfficeName!=null &&
              this.taxOfficeName.equals(other.getTaxOfficeName()))) &&
            ((this.desi==null && other.getDesi()==null) || 
             (this.desi!=null &&
              this.desi.equals(other.getDesi()))) &&
            ((this.kg==null && other.getKg()==null) || 
             (this.kg!=null &&
              this.kg.equals(other.getKg()))) &&
            this.cargoCount == other.getCargoCount() &&
            ((this.waybillNo==null && other.getWaybillNo()==null) || 
             (this.waybillNo!=null &&
              this.waybillNo.equals(other.getWaybillNo()))) &&
            ((this.specialField1==null && other.getSpecialField1()==null) || 
             (this.specialField1!=null &&
              this.specialField1.equals(other.getSpecialField1()))) &&
            ((this.specialField2==null && other.getSpecialField2()==null) || 
             (this.specialField2!=null &&
              this.specialField2.equals(other.getSpecialField2()))) &&
            ((this.specialField3==null && other.getSpecialField3()==null) || 
             (this.specialField3!=null &&
              this.specialField3.equals(other.getSpecialField3()))) &&
            ((this.ttInvoiceAmount==null && other.getTtInvoiceAmount()==null) || 
             (this.ttInvoiceAmount!=null &&
              this.ttInvoiceAmount.equals(other.getTtInvoiceAmount()))) &&
            this.ttDocumentId == other.getTtDocumentId() &&
            ((this.ttCollectionType==null && other.getTtCollectionType()==null) || 
             (this.ttCollectionType!=null &&
              this.ttCollectionType.equals(other.getTtCollectionType()))) &&
            ((this.ttDocumentSaveType==null && other.getTtDocumentSaveType()==null) || 
             (this.ttDocumentSaveType!=null &&
              this.ttDocumentSaveType.equals(other.getTtDocumentSaveType()))) &&
            this.dcSelectedCredit == other.getDcSelectedCredit() &&
            this.dcCreditRule == other.getDcCreditRule() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.orgGeoCode==null && other.getOrgGeoCode()==null) || 
             (this.orgGeoCode!=null &&
              this.orgGeoCode.equals(other.getOrgGeoCode()))) &&
            ((this.privilegeOrder==null && other.getPrivilegeOrder()==null) || 
             (this.privilegeOrder!=null &&
              this.privilegeOrder.equals(other.getPrivilegeOrder()))) &&
            ((this.custProdId==null && other.getCustProdId()==null) || 
             (this.custProdId!=null &&
              this.custProdId.equals(other.getCustProdId()))) &&
            ((this.orgReceiverCustId==null && other.getOrgReceiverCustId()==null) || 
             (this.orgReceiverCustId!=null &&
              this.orgReceiverCustId.equals(other.getOrgReceiverCustId())));
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
        if (getInvoiceKey() != null) {
            _hashCode += getInvoiceKey().hashCode();
        }
        if (getReceiverCustName() != null) {
            _hashCode += getReceiverCustName().hashCode();
        }
        if (getReceiverAddress() != null) {
            _hashCode += getReceiverAddress().hashCode();
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getTownName() != null) {
            _hashCode += getTownName().hashCode();
        }
        if (getReceiverPhone1() != null) {
            _hashCode += getReceiverPhone1().hashCode();
        }
        if (getReceiverPhone2() != null) {
            _hashCode += getReceiverPhone2().hashCode();
        }
        if (getReceiverPhone3() != null) {
            _hashCode += getReceiverPhone3().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        _hashCode += new Long(getTaxOfficeId()).hashCode();
        if (getTaxNumber() != null) {
            _hashCode += getTaxNumber().hashCode();
        }
        if (getTaxOfficeName() != null) {
            _hashCode += getTaxOfficeName().hashCode();
        }
        if (getDesi() != null) {
            _hashCode += getDesi().hashCode();
        }
        if (getKg() != null) {
            _hashCode += getKg().hashCode();
        }
        _hashCode += getCargoCount();
        if (getWaybillNo() != null) {
            _hashCode += getWaybillNo().hashCode();
        }
        if (getSpecialField1() != null) {
            _hashCode += getSpecialField1().hashCode();
        }
        if (getSpecialField2() != null) {
            _hashCode += getSpecialField2().hashCode();
        }
        if (getSpecialField3() != null) {
            _hashCode += getSpecialField3().hashCode();
        }
        if (getTtInvoiceAmount() != null) {
            _hashCode += getTtInvoiceAmount().hashCode();
        }
        _hashCode += new Long(getTtDocumentId()).hashCode();
        if (getTtCollectionType() != null) {
            _hashCode += getTtCollectionType().hashCode();
        }
        if (getTtDocumentSaveType() != null) {
            _hashCode += getTtDocumentSaveType().hashCode();
        }
        _hashCode += new Long(getDcSelectedCredit()).hashCode();
        _hashCode += new Long(getDcCreditRule()).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getOrgGeoCode() != null) {
            _hashCode += getOrgGeoCode().hashCode();
        }
        if (getPrivilegeOrder() != null) {
            _hashCode += getPrivilegeOrder().hashCode();
        }
        if (getCustProdId() != null) {
            _hashCode += getCustProdId().hashCode();
        }
        if (getOrgReceiverCustId() != null) {
            _hashCode += getOrgReceiverCustId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingOrderVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://yurticikargo.com.tr/ShippingOrderDispatcherServices", "ShippingOrderVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceKey"));
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
        elemField.setFieldName("receiverAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverAddress"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhone1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverPhone1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhone2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverPhone2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPhone3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverPhone3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxOfficeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxOfficeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxOfficeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxOfficeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargoCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("specialField1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specialField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialField2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specialField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialField3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specialField3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttInvoiceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttInvoiceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttDocumentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttDocumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttCollectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttCollectionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttDocumentSaveType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttDocumentSaveType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dcSelectedCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dcSelectedCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dcCreditRule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dcCreditRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("orgGeoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgGeoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privilegeOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privilegeOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custProdId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custProdId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgReceiverCustId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgReceiverCustId"));
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
