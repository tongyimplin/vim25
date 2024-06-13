package com.vmware.vim25;

import com.vmware.vim25.DvsGreEncapNetworkRuleAction;
import com.vmware.vim25.DvsNetworkRuleAction;
import com.vmware.vim25.SingleIp;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsGreEncapNetworkRuleAction", propOrder = {"encapsulationIp"})
public class DvsGreEncapNetworkRuleAction extends DvsNetworkRuleAction {
  @XmlElement(required = true)
  protected SingleIp encapsulationIp;
  
  public SingleIp getEncapsulationIp() {
    return this.encapsulationIp;
  }
  
  public void setEncapsulationIp(SingleIp paramSingleIp) {
    this.encapsulationIp = paramSingleIp;
  }
}
