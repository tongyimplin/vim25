package com.vmware.vim25;

import com.vmware.vim25.RetrieveVStorageObjectResponse;
import com.vmware.vim25.VStorageObject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveVStorageObjectResponse")
public class RetrieveVStorageObjectResponse {
  @XmlElement(required = true)
  protected VStorageObject returnval;
  
  public VStorageObject getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VStorageObject paramVStorageObject) {
    this.returnval = paramVStorageObject;
  }
}
