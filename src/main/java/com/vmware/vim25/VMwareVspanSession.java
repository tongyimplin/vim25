package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareVspanPort;
import com.vmware.vim25.VMwareVspanSession;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareVspanSession", propOrder = {"key", "name", "description", "enabled", "sourcePortTransmitted", "sourcePortReceived", "destinationPort", "encapsulationVlanId", "stripOriginalVlan", "mirroredPacketLength", "normalTrafficAllowed", "sessionType", "samplingRate", "encapType", "erspanId", "erspanCOS", "erspanGraNanosec", "netstack"})
public class VMwareVspanSession extends DynamicData {
  protected String key;
  
  protected String name;
  
  protected String description;
  
  protected boolean enabled;
  
  protected VMwareVspanPort sourcePortTransmitted;
  
  protected VMwareVspanPort sourcePortReceived;
  
  protected VMwareVspanPort destinationPort;
  
  protected Integer encapsulationVlanId;
  
  protected boolean stripOriginalVlan;
  
  protected Integer mirroredPacketLength;
  
  protected boolean normalTrafficAllowed;
  
  protected String sessionType;
  
  protected Integer samplingRate;
  
  protected String encapType;
  
  protected Integer erspanId;
  
  protected Integer erspanCOS;
  
  protected Boolean erspanGraNanosec;
  
  protected String netstack;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public VMwareVspanPort getSourcePortTransmitted() {
    return this.sourcePortTransmitted;
  }
  
  public void setSourcePortTransmitted(VMwareVspanPort paramVMwareVspanPort) {
    this.sourcePortTransmitted = paramVMwareVspanPort;
  }
  
  public VMwareVspanPort getSourcePortReceived() {
    return this.sourcePortReceived;
  }
  
  public void setSourcePortReceived(VMwareVspanPort paramVMwareVspanPort) {
    this.sourcePortReceived = paramVMwareVspanPort;
  }
  
  public VMwareVspanPort getDestinationPort() {
    return this.destinationPort;
  }
  
  public void setDestinationPort(VMwareVspanPort paramVMwareVspanPort) {
    this.destinationPort = paramVMwareVspanPort;
  }
  
  public Integer getEncapsulationVlanId() {
    return this.encapsulationVlanId;
  }
  
  public void setEncapsulationVlanId(Integer paramInteger) {
    this.encapsulationVlanId = paramInteger;
  }
  
  public boolean isStripOriginalVlan() {
    return this.stripOriginalVlan;
  }
  
  public void setStripOriginalVlan(boolean paramBoolean) {
    this.stripOriginalVlan = paramBoolean;
  }
  
  public Integer getMirroredPacketLength() {
    return this.mirroredPacketLength;
  }
  
  public void setMirroredPacketLength(Integer paramInteger) {
    this.mirroredPacketLength = paramInteger;
  }
  
  public boolean isNormalTrafficAllowed() {
    return this.normalTrafficAllowed;
  }
  
  public void setNormalTrafficAllowed(boolean paramBoolean) {
    this.normalTrafficAllowed = paramBoolean;
  }
  
  public String getSessionType() {
    return this.sessionType;
  }
  
  public void setSessionType(String paramString) {
    this.sessionType = paramString;
  }
  
  public Integer getSamplingRate() {
    return this.samplingRate;
  }
  
  public void setSamplingRate(Integer paramInteger) {
    this.samplingRate = paramInteger;
  }
  
  public String getEncapType() {
    return this.encapType;
  }
  
  public void setEncapType(String paramString) {
    this.encapType = paramString;
  }
  
  public Integer getErspanId() {
    return this.erspanId;
  }
  
  public void setErspanId(Integer paramInteger) {
    this.erspanId = paramInteger;
  }
  
  public Integer getErspanCOS() {
    return this.erspanCOS;
  }
  
  public void setErspanCOS(Integer paramInteger) {
    this.erspanCOS = paramInteger;
  }
  
  public Boolean isErspanGraNanosec() {
    return this.erspanGraNanosec;
  }
  
  public void setErspanGraNanosec(Boolean paramBoolean) {
    this.erspanGraNanosec = paramBoolean;
  }
  
  public String getNetstack() {
    return this.netstack;
  }
  
  public void setNetstack(String paramString) {
    this.netstack = paramString;
  }
}
