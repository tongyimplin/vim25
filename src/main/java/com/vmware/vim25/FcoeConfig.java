package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FcoeConfig;
import com.vmware.vim25.FcoeConfigFcoeCapabilities;
import com.vmware.vim25.FcoeConfigVlanRange;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FcoeConfig", propOrder = {"priorityClass", "sourceMac", "vlanRange", "capabilities", "fcoeActive"})
public class FcoeConfig extends DynamicData {
  protected int priorityClass;
  
  @XmlElement(required = true)
  protected String sourceMac;
  
  @XmlElement(required = true)
  protected List<FcoeConfigVlanRange> vlanRange;
  
  @XmlElement(required = true)
  protected FcoeConfigFcoeCapabilities capabilities;
  
  protected boolean fcoeActive;
  
  public int getPriorityClass() {
    return this.priorityClass;
  }
  
  public void setPriorityClass(int paramInt) {
    this.priorityClass = paramInt;
  }
  
  public String getSourceMac() {
    return this.sourceMac;
  }
  
  public void setSourceMac(String paramString) {
    this.sourceMac = paramString;
  }
  
  public List<FcoeConfigVlanRange> getVlanRange() {
    if (this.vlanRange == null)
      this.vlanRange = new ArrayList<>(); 
    return this.vlanRange;
  }
  
  public FcoeConfigFcoeCapabilities getCapabilities() {
    return this.capabilities;
  }
  
  public void setCapabilities(FcoeConfigFcoeCapabilities paramFcoeConfigFcoeCapabilities) {
    this.capabilities = paramFcoeConfigFcoeCapabilities;
  }
  
  public boolean isFcoeActive() {
    return this.fcoeActive;
  }
  
  public void setFcoeActive(boolean paramBoolean) {
    this.fcoeActive = paramBoolean;
  }
}
