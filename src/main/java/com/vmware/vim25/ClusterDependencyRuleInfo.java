package com.vmware.vim25;

import com.vmware.vim25.ClusterDependencyRuleInfo;
import com.vmware.vim25.ClusterRuleInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDependencyRuleInfo", propOrder = {"vmGroup", "dependsOnVmGroup"})
public class ClusterDependencyRuleInfo extends ClusterRuleInfo {
  @XmlElement(required = true)
  protected String vmGroup;
  
  @XmlElement(required = true)
  protected String dependsOnVmGroup;
  
  public String getVmGroup() {
    return this.vmGroup;
  }
  
  public void setVmGroup(String paramString) {
    this.vmGroup = paramString;
  }
  
  public String getDependsOnVmGroup() {
    return this.dependsOnVmGroup;
  }
  
  public void setDependsOnVmGroup(String paramString) {
    this.dependsOnVmGroup = paramString;
  }
}
