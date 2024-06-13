package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostForceMountedInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostForceMountedInfo", propOrder = {"persist", "mounted"})
public class HostForceMountedInfo extends DynamicData {
  protected boolean persist;
  
  protected boolean mounted;
  
  public boolean isPersist() {
    return this.persist;
  }
  
  public void setPersist(boolean paramBoolean) {
    this.persist = paramBoolean;
  }
  
  public boolean isMounted() {
    return this.mounted;
  }
  
  public void setMounted(boolean paramBoolean) {
    this.mounted = paramBoolean;
  }
}
