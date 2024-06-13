package com.vmware.vim25;

import com.vmware.vim25.GenerateConfigTaskListResponse;
import com.vmware.vim25.HostProfileManagerConfigTaskList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "GenerateConfigTaskListResponse")
public class GenerateConfigTaskListResponse {
  @XmlElement(required = true)
  protected HostProfileManagerConfigTaskList returnval;
  
  public HostProfileManagerConfigTaskList getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostProfileManagerConfigTaskList paramHostProfileManagerConfigTaskList) {
    this.returnval = paramHostProfileManagerConfigTaskList;
  }
}
