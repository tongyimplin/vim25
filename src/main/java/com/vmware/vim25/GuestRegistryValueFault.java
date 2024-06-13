package com.vmware.vim25;

import com.vmware.vim25.GuestRegistryFault;
import com.vmware.vim25.GuestRegistryValueFault;
import com.vmware.vim25.GuestRegistryValueNotFound;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegistryValueFault", propOrder = {"keyName", "valueName"})
@XmlSeeAlso({GuestRegistryValueNotFound.class})
public class GuestRegistryValueFault extends GuestRegistryFault {
  @XmlElement(required = true)
  protected String keyName;
  
  @XmlElement(required = true)
  protected String valueName;
  
  public String getKeyName() {
    return this.keyName;
  }
  
  public void setKeyName(String paramString) {
    this.keyName = paramString;
  }
  
  public String getValueName() {
    return this.valueName;
  }
  
  public void setValueName(String paramString) {
    this.valueName = paramString;
  }
}
