package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareDVSPvlanMapEntry;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSPvlanMapEntry", propOrder = {"primaryVlanId", "secondaryVlanId", "pvlanType"})
public class VMwareDVSPvlanMapEntry extends DynamicData {
  protected int primaryVlanId;
  
  protected int secondaryVlanId;
  
  @XmlElement(required = true)
  protected String pvlanType;
  
  public int getPrimaryVlanId() {
    return this.primaryVlanId;
  }
  
  public void setPrimaryVlanId(int paramInt) {
    this.primaryVlanId = paramInt;
  }
  
  public int getSecondaryVlanId() {
    return this.secondaryVlanId;
  }
  
  public void setSecondaryVlanId(int paramInt) {
    this.secondaryVlanId = paramInt;
  }
  
  public String getPvlanType() {
    return this.pvlanType;
  }
  
  public void setPvlanType(String paramString) {
    this.pvlanType = paramString;
  }
}
