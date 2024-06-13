package com.vmware.vim25;

import com.vmware.vim25.CustomizationLicenseDataMode;
import com.vmware.vim25.CustomizationLicenseFilePrintData;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationLicenseFilePrintData", propOrder = {"autoMode", "autoUsers"})
public class CustomizationLicenseFilePrintData extends DynamicData {
  @XmlElement(required = true)
  protected CustomizationLicenseDataMode autoMode;
  
  protected Integer autoUsers;
  
  public CustomizationLicenseDataMode getAutoMode() {
    return this.autoMode;
  }
  
  public void setAutoMode(CustomizationLicenseDataMode paramCustomizationLicenseDataMode) {
    this.autoMode = paramCustomizationLicenseDataMode;
  }
  
  public Integer getAutoUsers() {
    return this.autoUsers;
  }
  
  public void setAutoUsers(Integer paramInteger) {
    this.autoUsers = paramInteger;
  }
}
