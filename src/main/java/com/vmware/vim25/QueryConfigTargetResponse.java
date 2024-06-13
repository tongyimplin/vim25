package com.vmware.vim25;

import com.vmware.vim25.ConfigTarget;
import com.vmware.vim25.QueryConfigTargetResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryConfigTargetResponse")
public class QueryConfigTargetResponse {
  protected ConfigTarget returnval;
  
  public ConfigTarget getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(ConfigTarget paramConfigTarget) {
    this.returnval = paramConfigTarget;
  }
}
