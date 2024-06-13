package com.vmware.vim25;

import com.vmware.vim25.LimitExceeded;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitExceeded", propOrder = {"property", "limit"})
public class LimitExceeded extends VimFault {
  protected String property;
  
  protected Integer limit;
  
  public String getProperty() {
    return this.property;
  }
  
  public void setProperty(String paramString) {
    this.property = paramString;
  }
  
  public Integer getLimit() {
    return this.limit;
  }
  
  public void setLimit(Integer paramInteger) {
    this.limit = paramInteger;
  }
}
