package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FailoverNodeInfo;
import com.vmware.vim25.VchaClusterConfigInfo;
import com.vmware.vim25.WitnessNodeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VchaClusterConfigInfo", propOrder = {"failoverNodeInfo1", "failoverNodeInfo2", "witnessNodeInfo", "state"})
public class VchaClusterConfigInfo extends DynamicData {
  protected FailoverNodeInfo failoverNodeInfo1;
  
  protected FailoverNodeInfo failoverNodeInfo2;
  
  protected WitnessNodeInfo witnessNodeInfo;
  
  @XmlElement(required = true)
  protected String state;
  
  public FailoverNodeInfo getFailoverNodeInfo1() {
    return this.failoverNodeInfo1;
  }
  
  public void setFailoverNodeInfo1(FailoverNodeInfo paramFailoverNodeInfo) {
    this.failoverNodeInfo1 = paramFailoverNodeInfo;
  }
  
  public FailoverNodeInfo getFailoverNodeInfo2() {
    return this.failoverNodeInfo2;
  }
  
  public void setFailoverNodeInfo2(FailoverNodeInfo paramFailoverNodeInfo) {
    this.failoverNodeInfo2 = paramFailoverNodeInfo;
  }
  
  public WitnessNodeInfo getWitnessNodeInfo() {
    return this.witnessNodeInfo;
  }
  
  public void setWitnessNodeInfo(WitnessNodeInfo paramWitnessNodeInfo) {
    this.witnessNodeInfo = paramWitnessNodeInfo;
  }
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
}
