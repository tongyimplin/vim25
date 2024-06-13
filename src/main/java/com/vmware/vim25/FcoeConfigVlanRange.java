package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FcoeConfigVlanRange;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FcoeConfigVlanRange", propOrder = {"vlanLow", "vlanHigh"})
public class FcoeConfigVlanRange extends DynamicData {
  protected int vlanLow;
  
  protected int vlanHigh;
  
  public int getVlanLow() {
    return this.vlanLow;
  }
  
  public void setVlanLow(int paramInt) {
    this.vlanLow = paramInt;
  }
  
  public int getVlanHigh() {
    return this.vlanHigh;
  }
  
  public void setVlanHigh(int paramInt) {
    this.vlanHigh = paramInt;
  }
}
