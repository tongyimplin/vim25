package com.vmware.vim25;

import com.vmware.vim25.VimFault;
import com.vmware.vim25.VmValidateMaxDevice;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmValidateMaxDevice", propOrder = {"device", "max", "count"})
public class VmValidateMaxDevice extends VimFault {
  @XmlElement(required = true)
  protected String device;
  
  protected int max;
  
  protected int count;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public int getMax() {
    return this.max;
  }
  
  public void setMax(int paramInt) {
    this.max = paramInt;
  }
  
  public int getCount() {
    return this.count;
  }
  
  public void setCount(int paramInt) {
    this.count = paramInt;
  }
}
