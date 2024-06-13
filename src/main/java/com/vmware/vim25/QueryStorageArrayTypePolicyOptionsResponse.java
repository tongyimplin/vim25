package com.vmware.vim25;

import com.vmware.vim25.HostStorageArrayTypePolicyOption;
import com.vmware.vim25.QueryStorageArrayTypePolicyOptionsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryStorageArrayTypePolicyOptionsResponse")
public class QueryStorageArrayTypePolicyOptionsResponse {
  protected List<HostStorageArrayTypePolicyOption> returnval;
  
  public List<HostStorageArrayTypePolicyOption> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
