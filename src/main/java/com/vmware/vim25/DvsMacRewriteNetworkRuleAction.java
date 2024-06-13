package com.vmware.vim25;

import com.vmware.vim25.DvsMacRewriteNetworkRuleAction;
import com.vmware.vim25.DvsNetworkRuleAction;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsMacRewriteNetworkRuleAction", propOrder = {"rewriteMac"})
public class DvsMacRewriteNetworkRuleAction extends DvsNetworkRuleAction {
  @XmlElement(required = true)
  protected String rewriteMac;
  
  public String getRewriteMac() {
    return this.rewriteMac;
  }
  
  public void setRewriteMac(String paramString) {
    this.rewriteMac = paramString;
  }
}
