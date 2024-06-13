package com.vmware.vim25;

import com.vmware.vim25.VslmCreateSpecBackingSpec;
import com.vmware.vim25.VslmCreateSpecDiskFileBackingSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VslmCreateSpecDiskFileBackingSpec", propOrder = {"provisioningType"})
public class VslmCreateSpecDiskFileBackingSpec extends VslmCreateSpecBackingSpec {
  protected String provisioningType;
  
  public String getProvisioningType() {
    return this.provisioningType;
  }
  
  public void setProvisioningType(String paramString) {
    this.provisioningType = paramString;
  }
}
