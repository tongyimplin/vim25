package com.vmware.vim25;

import com.vmware.vim25.HostPathSelectionPolicyOption;
import com.vmware.vim25.QueryPathSelectionPolicyOptionsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryPathSelectionPolicyOptionsResponse")
public class QueryPathSelectionPolicyOptionsResponse {
  protected List<HostPathSelectionPolicyOption> returnval;
  
  public List<HostPathSelectionPolicyOption> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
