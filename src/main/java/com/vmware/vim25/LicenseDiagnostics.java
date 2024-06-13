package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LicenseDiagnostics;
import com.vmware.vim25.LicenseManagerState;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseDiagnostics", propOrder = {"sourceLastChanged", "sourceLost", "sourceLatency", "licenseRequests", "licenseRequestFailures", "licenseFeatureUnknowns", "opState", "lastStatusUpdate", "opFailureMessage"})
public class LicenseDiagnostics extends DynamicData {
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar sourceLastChanged;
  
  @XmlElement(required = true)
  protected String sourceLost;
  
  protected float sourceLatency;
  
  @XmlElement(required = true)
  protected String licenseRequests;
  
  @XmlElement(required = true)
  protected String licenseRequestFailures;
  
  @XmlElement(required = true)
  protected String licenseFeatureUnknowns;
  
  @XmlElement(required = true)
  protected LicenseManagerState opState;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar lastStatusUpdate;
  
  @XmlElement(required = true)
  protected String opFailureMessage;
  
  public XMLGregorianCalendar getSourceLastChanged() {
    return this.sourceLastChanged;
  }
  
  public void setSourceLastChanged(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.sourceLastChanged = paramXMLGregorianCalendar;
  }
  
  public String getSourceLost() {
    return this.sourceLost;
  }
  
  public void setSourceLost(String paramString) {
    this.sourceLost = paramString;
  }
  
  public float getSourceLatency() {
    return this.sourceLatency;
  }
  
  public void setSourceLatency(float paramFloat) {
    this.sourceLatency = paramFloat;
  }
  
  public String getLicenseRequests() {
    return this.licenseRequests;
  }
  
  public void setLicenseRequests(String paramString) {
    this.licenseRequests = paramString;
  }
  
  public String getLicenseRequestFailures() {
    return this.licenseRequestFailures;
  }
  
  public void setLicenseRequestFailures(String paramString) {
    this.licenseRequestFailures = paramString;
  }
  
  public String getLicenseFeatureUnknowns() {
    return this.licenseFeatureUnknowns;
  }
  
  public void setLicenseFeatureUnknowns(String paramString) {
    this.licenseFeatureUnknowns = paramString;
  }
  
  public LicenseManagerState getOpState() {
    return this.opState;
  }
  
  public void setOpState(LicenseManagerState paramLicenseManagerState) {
    this.opState = paramLicenseManagerState;
  }
  
  public XMLGregorianCalendar getLastStatusUpdate() {
    return this.lastStatusUpdate;
  }
  
  public void setLastStatusUpdate(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.lastStatusUpdate = paramXMLGregorianCalendar;
  }
  
  public String getOpFailureMessage() {
    return this.opFailureMessage;
  }
  
  public void setOpFailureMessage(String paramString) {
    this.opFailureMessage = paramString;
  }
}
