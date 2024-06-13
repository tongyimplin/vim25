package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareDVSVspanCapability;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDVSVspanCapability", propOrder = {"mixedDestSupported", "dvportSupported", "remoteSourceSupported", "remoteDestSupported", "encapRemoteSourceSupported", "erspanProtocolSupported", "mirrorNetstackSupported"})
public class VMwareDVSVspanCapability extends DynamicData {
  protected boolean mixedDestSupported;
  
  protected boolean dvportSupported;
  
  protected boolean remoteSourceSupported;
  
  protected boolean remoteDestSupported;
  
  protected boolean encapRemoteSourceSupported;
  
  protected Boolean erspanProtocolSupported;
  
  protected Boolean mirrorNetstackSupported;
  
  public boolean isMixedDestSupported() {
    return this.mixedDestSupported;
  }
  
  public void setMixedDestSupported(boolean paramBoolean) {
    this.mixedDestSupported = paramBoolean;
  }
  
  public boolean isDvportSupported() {
    return this.dvportSupported;
  }
  
  public void setDvportSupported(boolean paramBoolean) {
    this.dvportSupported = paramBoolean;
  }
  
  public boolean isRemoteSourceSupported() {
    return this.remoteSourceSupported;
  }
  
  public void setRemoteSourceSupported(boolean paramBoolean) {
    this.remoteSourceSupported = paramBoolean;
  }
  
  public boolean isRemoteDestSupported() {
    return this.remoteDestSupported;
  }
  
  public void setRemoteDestSupported(boolean paramBoolean) {
    this.remoteDestSupported = paramBoolean;
  }
  
  public boolean isEncapRemoteSourceSupported() {
    return this.encapRemoteSourceSupported;
  }
  
  public void setEncapRemoteSourceSupported(boolean paramBoolean) {
    this.encapRemoteSourceSupported = paramBoolean;
  }
  
  public Boolean isErspanProtocolSupported() {
    return this.erspanProtocolSupported;
  }
  
  public void setErspanProtocolSupported(Boolean paramBoolean) {
    this.erspanProtocolSupported = paramBoolean;
  }
  
  public Boolean isMirrorNetstackSupported() {
    return this.mirrorNetstackSupported;
  }
  
  public void setMirrorNetstackSupported(Boolean paramBoolean) {
    this.mirrorNetstackSupported = paramBoolean;
  }
}
