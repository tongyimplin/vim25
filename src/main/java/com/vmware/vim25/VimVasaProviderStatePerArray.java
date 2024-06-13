package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VimVasaProviderStatePerArray;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VimVasaProviderStatePerArray", propOrder = {"priority", "arrayId", "active"})
public class VimVasaProviderStatePerArray extends DynamicData {
  protected int priority;
  
  @XmlElement(required = true)
  protected String arrayId;
  
  protected boolean active;
  
  public int getPriority() {
    return this.priority;
  }
  
  public void setPriority(int paramInt) {
    this.priority = paramInt;
  }
  
  public String getArrayId() {
    return this.arrayId;
  }
  
  public void setArrayId(String paramString) {
    this.arrayId = paramString;
  }
  
  public boolean isActive() {
    return this.active;
  }
  
  public void setActive(boolean paramBoolean) {
    this.active = paramBoolean;
  }
}
