package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDeploymentInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDeploymentInfo", propOrder = {"bootedFromStatelessCache"})
public class HostDeploymentInfo extends DynamicData {
  protected Boolean bootedFromStatelessCache;
  
  public Boolean isBootedFromStatelessCache() {
    return this.bootedFromStatelessCache;
  }
  
  public void setBootedFromStatelessCache(Boolean paramBoolean) {
    this.bootedFromStatelessCache = paramBoolean;
  }
}
