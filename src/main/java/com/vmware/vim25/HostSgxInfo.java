package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSgxInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSgxInfo", propOrder = {"sgxState", "totalEpcMemory", "flcMode", "lePubKeyHash"})
public class HostSgxInfo extends DynamicData {
  @XmlElement(required = true)
  protected String sgxState;
  
  protected long totalEpcMemory;
  
  @XmlElement(required = true)
  protected String flcMode;
  
  protected String lePubKeyHash;
  
  public String getSgxState() {
    return this.sgxState;
  }
  
  public void setSgxState(String paramString) {
    this.sgxState = paramString;
  }
  
  public long getTotalEpcMemory() {
    return this.totalEpcMemory;
  }
  
  public void setTotalEpcMemory(long paramLong) {
    this.totalEpcMemory = paramLong;
  }
  
  public String getFlcMode() {
    return this.flcMode;
  }
  
  public void setFlcMode(String paramString) {
    this.flcMode = paramString;
  }
  
  public String getLePubKeyHash() {
    return this.lePubKeyHash;
  }
  
  public void setLePubKeyHash(String paramString) {
    this.lePubKeyHash = paramString;
  }
}
