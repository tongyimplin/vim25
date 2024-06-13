package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostMultipathInfoFixedLogicalUnitPolicy;
import com.vmware.vim25.HostMultipathInfoHppLogicalUnitPolicy;
import com.vmware.vim25.HostMultipathInfoLogicalUnitPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMultipathInfoLogicalUnitPolicy", propOrder = {"policy"})
@XmlSeeAlso({HostMultipathInfoFixedLogicalUnitPolicy.class, HostMultipathInfoHppLogicalUnitPolicy.class})
public class HostMultipathInfoLogicalUnitPolicy extends DynamicData {
  @XmlElement(required = true)
  protected String policy;
  
  public String getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(String paramString) {
    this.policy = paramString;
  }
}
