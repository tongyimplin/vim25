package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineSgxInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSgxInfo", propOrder = {"epcSize", "flcMode", "lePubKeyHash"})
public class VirtualMachineSgxInfo extends DynamicData {
  protected long epcSize;
  
  protected String flcMode;
  
  protected String lePubKeyHash;
  
  public long getEpcSize() {
    return this.epcSize;
  }
  
  public void setEpcSize(long paramLong) {
    this.epcSize = paramLong;
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
