package com.vmware.vim25;

import com.vmware.vim25.ExpiredAddonLicense;
import com.vmware.vim25.ExpiredEditionLicense;
import com.vmware.vim25.ExpiredFeatureLicense;
import com.vmware.vim25.NotEnoughLicenses;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpiredFeatureLicense", propOrder = {"feature", "count", "expirationDate"})
@XmlSeeAlso({ExpiredEditionLicense.class, ExpiredAddonLicense.class})
public class ExpiredFeatureLicense extends NotEnoughLicenses {
  @XmlElement(required = true)
  protected String feature;
  
  protected int count;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar expirationDate;
  
  public String getFeature() {
    return this.feature;
  }
  
  public void setFeature(String paramString) {
    this.feature = paramString;
  }
  
  public int getCount() {
    return this.count;
  }
  
  public void setCount(int paramInt) {
    this.count = paramInt;
  }
  
  public XMLGregorianCalendar getExpirationDate() {
    return this.expirationDate;
  }
  
  public void setExpirationDate(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.expirationDate = paramXMLGregorianCalendar;
  }
}
