package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostMultipathInfoLogicalUnitStorageArrayTypePolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMultipathInfoLogicalUnitStorageArrayTypePolicy", propOrder = {"policy"})
public class HostMultipathInfoLogicalUnitStorageArrayTypePolicy extends DynamicData {
  @XmlElement(required = true)
  protected String policy;
  
  public String getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(String paramString) {
    this.policy = paramString;
  }
}
