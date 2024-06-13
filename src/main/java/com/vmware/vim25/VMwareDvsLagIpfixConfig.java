package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareDvsLagIpfixConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDvsLagIpfixConfig", propOrder = {"ipfixEnabled"})
public class VMwareDvsLagIpfixConfig extends DynamicData {
  protected Boolean ipfixEnabled;
  
  public Boolean isIpfixEnabled() {
    return this.ipfixEnabled;
  }
  
  public void setIpfixEnabled(Boolean paramBoolean) {
    this.ipfixEnabled = paramBoolean;
  }
}
