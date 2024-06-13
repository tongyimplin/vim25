package com.vmware.vim25;

import com.vmware.vim25.BoolOption;
import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.VirtualDeviceOption;
import com.vmware.vim25.VirtualE1000EOption;
import com.vmware.vim25.VirtualE1000Option;
import com.vmware.vim25.VirtualEthernetCardOption;
import com.vmware.vim25.VirtualPCNet32Option;
import com.vmware.vim25.VirtualSriovEthernetCardOption;
import com.vmware.vim25.VirtualVmxnetOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualEthernetCardOption", propOrder = {"supportedOUI", "macType", "wakeOnLanEnabled", "vmDirectPathGen2Supported", "uptCompatibilityEnabled"})
@XmlSeeAlso({VirtualPCNet32Option.class, VirtualE1000EOption.class, VirtualE1000Option.class, VirtualSriovEthernetCardOption.class, VirtualVmxnetOption.class})
public class VirtualEthernetCardOption extends VirtualDeviceOption {
  @XmlElement(required = true)
  protected ChoiceOption supportedOUI;
  
  @XmlElement(required = true)
  protected ChoiceOption macType;
  
  @XmlElement(required = true)
  protected BoolOption wakeOnLanEnabled;
  
  protected Boolean vmDirectPathGen2Supported;
  
  protected BoolOption uptCompatibilityEnabled;
  
  public ChoiceOption getSupportedOUI() {
    return this.supportedOUI;
  }
  
  public void setSupportedOUI(ChoiceOption paramChoiceOption) {
    this.supportedOUI = paramChoiceOption;
  }
  
  public ChoiceOption getMacType() {
    return this.macType;
  }
  
  public void setMacType(ChoiceOption paramChoiceOption) {
    this.macType = paramChoiceOption;
  }
  
  public BoolOption getWakeOnLanEnabled() {
    return this.wakeOnLanEnabled;
  }
  
  public void setWakeOnLanEnabled(BoolOption paramBoolOption) {
    this.wakeOnLanEnabled = paramBoolOption;
  }
  
  public Boolean isVmDirectPathGen2Supported() {
    return this.vmDirectPathGen2Supported;
  }
  
  public void setVmDirectPathGen2Supported(Boolean paramBoolean) {
    this.vmDirectPathGen2Supported = paramBoolean;
  }
  
  public BoolOption getUptCompatibilityEnabled() {
    return this.uptCompatibilityEnabled;
  }
  
  public void setUptCompatibilityEnabled(BoolOption paramBoolOption) {
    this.uptCompatibilityEnabled = paramBoolOption;
  }
}
