package com.vmware.vim25;

import com.vmware.vim25.RetrieveDynamicPassthroughInfoResponse;
import com.vmware.vim25.VirtualMachineDynamicPassthroughInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveDynamicPassthroughInfoResponse")
public class RetrieveDynamicPassthroughInfoResponse {
  protected List<VirtualMachineDynamicPassthroughInfo> returnval;
  
  public List<VirtualMachineDynamicPassthroughInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
