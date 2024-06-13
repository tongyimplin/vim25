package com.vmware.vim25;

import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.FindRulesForVmResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "FindRulesForVmResponse")
public class FindRulesForVmResponse {
  protected List<ClusterRuleInfo> returnval;
  
  public List<ClusterRuleInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
