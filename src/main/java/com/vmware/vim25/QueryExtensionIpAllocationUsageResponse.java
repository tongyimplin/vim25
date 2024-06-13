package com.vmware.vim25;

import com.vmware.vim25.ExtensionManagerIpAllocationUsage;
import com.vmware.vim25.QueryExtensionIpAllocationUsageResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryExtensionIpAllocationUsageResponse")
public class QueryExtensionIpAllocationUsageResponse {
  protected List<ExtensionManagerIpAllocationUsage> returnval;
  
  public List<ExtensionManagerIpAllocationUsage> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
