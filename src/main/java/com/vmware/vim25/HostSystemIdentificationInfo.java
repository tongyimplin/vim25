package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.HostSystemIdentificationInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSystemIdentificationInfo", propOrder = {"identifierValue", "identifierType"})
public class HostSystemIdentificationInfo extends DynamicData {
  @XmlElement(required = true)
  protected String identifierValue;
  
  @XmlElement(required = true)
  protected ElementDescription identifierType;
  
  public String getIdentifierValue() {
    return this.identifierValue;
  }
  
  public void setIdentifierValue(String paramString) {
    this.identifierValue = paramString;
  }
  
  public ElementDescription getIdentifierType() {
    return this.identifierType;
  }
  
  public void setIdentifierType(ElementDescription paramElementDescription) {
    this.identifierType = paramElementDescription;
  }
}
