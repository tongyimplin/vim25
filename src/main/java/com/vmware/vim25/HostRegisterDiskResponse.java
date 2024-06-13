package com.vmware.vim25;

import com.vmware.vim25.HostRegisterDiskResponse;
import com.vmware.vim25.VStorageObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "HostRegisterDiskResponse")
public class HostRegisterDiskResponse {
  @XmlElement(required = true)
  protected VStorageObject returnval;
  
  public VStorageObject getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VStorageObject paramVStorageObject) {
    this.returnval = paramVStorageObject;
  }
}
