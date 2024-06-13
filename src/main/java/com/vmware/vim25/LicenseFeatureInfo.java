package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LicenseFeatureInfo;
import com.vmware.vim25.LicenseFeatureInfoState;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseFeatureInfo", propOrder = {"key", "featureName", "featureDescription", "state", "costUnit", "sourceRestriction", "dependentKey", "edition", "expiresOn"})
public class LicenseFeatureInfo extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String featureName;
  
  protected String featureDescription;
  
  protected LicenseFeatureInfoState state;
  
  @XmlElement(required = true)
  protected String costUnit;
  
  protected String sourceRestriction;
  
  protected List<String> dependentKey;
  
  protected Boolean edition;
  
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar expiresOn;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getFeatureName() {
    return this.featureName;
  }
  
  public void setFeatureName(String paramString) {
    this.featureName = paramString;
  }
  
  public String getFeatureDescription() {
    return this.featureDescription;
  }
  
  public void setFeatureDescription(String paramString) {
    this.featureDescription = paramString;
  }
  
  public LicenseFeatureInfoState getState() {
    return this.state;
  }
  
  public void setState(LicenseFeatureInfoState paramLicenseFeatureInfoState) {
    this.state = paramLicenseFeatureInfoState;
  }
  
  public String getCostUnit() {
    return this.costUnit;
  }
  
  public void setCostUnit(String paramString) {
    this.costUnit = paramString;
  }
  
  public String getSourceRestriction() {
    return this.sourceRestriction;
  }
  
  public void setSourceRestriction(String paramString) {
    this.sourceRestriction = paramString;
  }
  
  public List<String> getDependentKey() {
    if (this.dependentKey == null)
      this.dependentKey = new ArrayList<>(); 
    return this.dependentKey;
  }
  
  public Boolean isEdition() {
    return this.edition;
  }
  
  public void setEdition(Boolean paramBoolean) {
    this.edition = paramBoolean;
  }
  
  public XMLGregorianCalendar getExpiresOn() {
    return this.expiresOn;
  }
  
  public void setExpiresOn(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.expiresOn = paramXMLGregorianCalendar;
  }
}
