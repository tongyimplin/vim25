package com.vmware.vim25;

import com.vmware.vim25.HostRetrieveVStorageInfrastructureObjectPolicyResponse;
import com.vmware.vim25.VslmInfrastructureObjectPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "HostRetrieveVStorageInfrastructureObjectPolicyResponse")
public class HostRetrieveVStorageInfrastructureObjectPolicyResponse {
  protected List<VslmInfrastructureObjectPolicy> returnval;
  
  public List<VslmInfrastructureObjectPolicy> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
