package com.vmware.vim25;

import com.vmware.vim25.QueryResourceConfigOptionResponse;
import com.vmware.vim25.ResourceConfigOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryResourceConfigOptionResponse")
public class QueryResourceConfigOptionResponse {
  @XmlElement(required = true)
  protected ResourceConfigOption returnval;
  
  public ResourceConfigOption getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(ResourceConfigOption paramResourceConfigOption) {
    this.returnval = paramResourceConfigOption;
  }
}
