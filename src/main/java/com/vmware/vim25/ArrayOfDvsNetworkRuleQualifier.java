package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDvsNetworkRuleQualifier;
import com.vmware.vim25.DvsNetworkRuleQualifier;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDvsNetworkRuleQualifier", propOrder = {"dvsNetworkRuleQualifier"})
public class ArrayOfDvsNetworkRuleQualifier {
  @XmlElement(name = "DvsNetworkRuleQualifier")
  protected List<DvsNetworkRuleQualifier> dvsNetworkRuleQualifier;
  
  public List<DvsNetworkRuleQualifier> getDvsNetworkRuleQualifier() {
    if (this.dvsNetworkRuleQualifier == null)
      this.dvsNetworkRuleQualifier = new ArrayList<>(); 
    return this.dvsNetworkRuleQualifier;
  }
}
