package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostAuthenticationStoreInfo;
import com.vmware.vim25.HostDirectoryStoreInfo;
import com.vmware.vim25.HostLocalAuthenticationInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAuthenticationStoreInfo", propOrder = {"enabled"})
@XmlSeeAlso({HostLocalAuthenticationInfo.class, HostDirectoryStoreInfo.class})
public class HostAuthenticationStoreInfo extends DynamicData {
  protected boolean enabled;
  
  public boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
}
