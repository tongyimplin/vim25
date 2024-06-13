package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PhysicalNicLinkInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicLinkInfo", propOrder = {"speedMb", "duplex"})
public class PhysicalNicLinkInfo extends DynamicData {
  protected int speedMb;
  
  protected boolean duplex;
  
  public int getSpeedMb() {
    return this.speedMb;
  }
  
  public void setSpeedMb(int paramInt) {
    this.speedMb = paramInt;
  }
  
  public boolean isDuplex() {
    return this.duplex;
  }
  
  public void setDuplex(boolean paramBoolean) {
    this.duplex = paramBoolean;
  }
}
