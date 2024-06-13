package com.vmware.vim25;

import com.vmware.vim25.BaseConfigInfoDiskFileBackingInfo;
import com.vmware.vim25.BaseConfigInfoFileBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseConfigInfoDiskFileBackingInfo", propOrder = {"provisioningType"})
public class BaseConfigInfoDiskFileBackingInfo extends BaseConfigInfoFileBackingInfo {
  @XmlElement(required = true)
  protected String provisioningType;
  
  public String getProvisioningType() {
    return this.provisioningType;
  }
  
  public void setProvisioningType(String paramString) {
    this.provisioningType = paramString;
  }
}
