package com.vmware.vim25;

import com.vmware.vim25.DvsIpNetworkRuleQualifier;
import com.vmware.vim25.DvsMacNetworkRuleQualifier;
import com.vmware.vim25.DvsNetworkRuleQualifier;
import com.vmware.vim25.DvsSystemTrafficNetworkRuleQualifier;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsNetworkRuleQualifier", propOrder = {"key"})
@XmlSeeAlso({DvsMacNetworkRuleQualifier.class, DvsSystemTrafficNetworkRuleQualifier.class, DvsIpNetworkRuleQualifier.class})
public class DvsNetworkRuleQualifier extends DynamicData {
  protected String key;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
}
