package com.vmware.vim25;

import com.vmware.vim25.NamespaceFull;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamespaceFull", propOrder = {"name", "currentMaxSize", "requiredSize"})
public class NamespaceFull extends VimFault {
  @XmlElement(required = true)
  protected String name;
  
  protected long currentMaxSize;
  
  protected Long requiredSize;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public long getCurrentMaxSize() {
    return this.currentMaxSize;
  }
  
  public void setCurrentMaxSize(long paramLong) {
    this.currentMaxSize = paramLong;
  }
  
  public Long getRequiredSize() {
    return this.requiredSize;
  }
  
  public void setRequiredSize(Long paramLong) {
    this.requiredSize = paramLong;
  }
}
