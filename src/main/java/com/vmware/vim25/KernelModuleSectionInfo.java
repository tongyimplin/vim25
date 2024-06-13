package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KernelModuleSectionInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KernelModuleSectionInfo", propOrder = {"address", "length"})
public class KernelModuleSectionInfo extends DynamicData {
  protected long address;
  
  protected Integer length;
  
  public long getAddress() {
    return this.address;
  }
  
  public void setAddress(long paramLong) {
    this.address = paramLong;
  }
  
  public Integer getLength() {
    return this.length;
  }
  
  public void setLength(Integer paramInteger) {
    this.length = paramInteger;
  }
}
