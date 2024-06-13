package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateSpec;
import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.ClusterRuleSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterRuleSpec", propOrder = {"info"})
public class ClusterRuleSpec extends ArrayUpdateSpec {
  protected ClusterRuleInfo info;
  
  public ClusterRuleInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(ClusterRuleInfo paramClusterRuleInfo) {
    this.info = paramClusterRuleInfo;
  }
}
