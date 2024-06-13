package com.vmware.vim25;

import com.vmware.vim25.NamespaceLimitReached;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamespaceLimitReached", propOrder = {"limit"})
public class NamespaceLimitReached extends VimFault {
  protected Integer limit;
  
  public Integer getLimit() {
    return this.limit;
  }
  
  public void setLimit(Integer paramInteger) {
    this.limit = paramInteger;
  }
}
