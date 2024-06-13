package com.vmware.vim25;

import com.vmware.vim25.ArrayOfClusterRuleSpec;
import com.vmware.vim25.ClusterRuleSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClusterRuleSpec", propOrder = {"clusterRuleSpec"})
public class ArrayOfClusterRuleSpec {
  @XmlElement(name = "ClusterRuleSpec")
  protected List<ClusterRuleSpec> clusterRuleSpec;
  
  public List<ClusterRuleSpec> getClusterRuleSpec() {
    if (this.clusterRuleSpec == null)
      this.clusterRuleSpec = new ArrayList<>(); 
    return this.clusterRuleSpec;
  }
}
