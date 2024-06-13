package com.vmware.vim25;

import com.vmware.vim25.IscsiStatus;
import com.vmware.vim25.QueryPnicStatusResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryPnicStatusResponse")
public class QueryPnicStatusResponse {
  @XmlElement(required = true)
  protected IscsiStatus returnval;
  
  public IscsiStatus getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(IscsiStatus paramIscsiStatus) {
    this.returnval = paramIscsiStatus;
  }
}
