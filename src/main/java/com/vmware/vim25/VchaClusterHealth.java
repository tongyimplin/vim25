package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.VchaClusterHealth;
import com.vmware.vim25.VchaClusterRuntimeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VchaClusterHealth", propOrder = {"runtimeInfo", "healthMessages", "additionalInformation"})
public class VchaClusterHealth extends DynamicData {
  @XmlElement(required = true)
  protected VchaClusterRuntimeInfo runtimeInfo;
  
  protected List<LocalizableMessage> healthMessages;
  
  protected List<LocalizableMessage> additionalInformation;
  
  public VchaClusterRuntimeInfo getRuntimeInfo() {
    return this.runtimeInfo;
  }
  
  public void setRuntimeInfo(VchaClusterRuntimeInfo paramVchaClusterRuntimeInfo) {
    this.runtimeInfo = paramVchaClusterRuntimeInfo;
  }
  
  public List<LocalizableMessage> getHealthMessages() {
    if (this.healthMessages == null)
      this.healthMessages = new ArrayList<>(); 
    return this.healthMessages;
  }
  
  public List<LocalizableMessage> getAdditionalInformation() {
    if (this.additionalInformation == null)
      this.additionalInformation = new ArrayList<>(); 
    return this.additionalInformation;
  }
}
