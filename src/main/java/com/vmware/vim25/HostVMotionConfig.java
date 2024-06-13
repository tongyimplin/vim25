package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVMotionConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVMotionConfig", propOrder = {"vmotionNicKey", "enabled"})
public class HostVMotionConfig extends DynamicData {
  protected String vmotionNicKey;
  
  protected boolean enabled;
  
  public String getVmotionNicKey() {
    return this.vmotionNicKey;
  }
  
  public void setVmotionNicKey(String paramString) {
    this.vmotionNicKey = paramString;
  }
  
  public boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
}
