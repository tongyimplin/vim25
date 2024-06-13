package com.vmware.vim25;

import com.vmware.vim25.QueryMemoryOverheadResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryMemoryOverheadResponse")
public class QueryMemoryOverheadResponse {
  protected long returnval;
  
  public long getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(long paramLong) {
    this.returnval = paramLong;
  }
}
