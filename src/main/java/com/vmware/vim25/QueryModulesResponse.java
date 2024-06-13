package com.vmware.vim25;

import com.vmware.vim25.KernelModuleInfo;
import com.vmware.vim25.QueryModulesResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryModulesResponse")
public class QueryModulesResponse {
  protected List<KernelModuleInfo> returnval;
  
  public List<KernelModuleInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
