package com.vmware.vim25;

import com.vmware.vim25.ClusterProactiveDrsConfigInfo;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterProactiveDrsConfigInfo", propOrder = {"enabled"})
public class ClusterProactiveDrsConfigInfo extends DynamicData {
  protected Boolean enabled;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
}
