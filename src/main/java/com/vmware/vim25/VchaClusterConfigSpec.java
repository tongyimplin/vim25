package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VchaClusterConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VchaClusterConfigSpec", propOrder = {"passiveIp", "witnessIp"})
public class VchaClusterConfigSpec extends DynamicData {
  @XmlElement(required = true)
  protected String passiveIp;
  
  @XmlElement(required = true)
  protected String witnessIp;
  
  public String getPassiveIp() {
    return this.passiveIp;
  }
  
  public void setPassiveIp(String paramString) {
    this.passiveIp = paramString;
  }
  
  public String getWitnessIp() {
    return this.witnessIp;
  }
  
  public void setWitnessIp(String paramString) {
    this.witnessIp = paramString;
  }
}
