package com.vmware.vim25;

import com.vmware.vim25.PhysicalNicHintInfo;
import com.vmware.vim25.QueryNetworkHintResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryNetworkHintResponse")
public class QueryNetworkHintResponse {
  protected List<PhysicalNicHintInfo> returnval;
  
  public List<PhysicalNicHintInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
