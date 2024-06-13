package com.vmware.vim25;

import com.vmware.vim25.RetrieveVStorageObjectStateResponse;
import com.vmware.vim25.VStorageObjectStateInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveVStorageObjectStateResponse")
public class RetrieveVStorageObjectStateResponse {
  @XmlElement(required = true)
  protected VStorageObjectStateInfo returnval;
  
  public VStorageObjectStateInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VStorageObjectStateInfo paramVStorageObjectStateInfo) {
    this.returnval = paramVStorageObjectStateInfo;
  }
}
