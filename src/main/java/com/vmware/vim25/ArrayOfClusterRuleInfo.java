package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterRuleInfo;
import com.vmware.vim25.ClusterRuleInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterRuleInfo", propOrder = {"clusterRuleInfo"})
public class ArrayOfClusterRuleInfo {
  @XmlElement(name = "ClusterRuleInfo")
  protected List<ClusterRuleInfo> clusterRuleInfo;
  
  public List<ClusterRuleInfo> getClusterRuleInfo() {
    if (this.clusterRuleInfo == null)
      this.clusterRuleInfo = new ArrayList<>(); 
    return this.clusterRuleInfo;
  }
}
