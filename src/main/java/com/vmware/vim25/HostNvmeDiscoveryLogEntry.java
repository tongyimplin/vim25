package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNvmeDiscoveryLogEntry;
import com.vmware.vim25.HostNvmeTransportParameters;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeDiscoveryLogEntry", propOrder = {"subnqn", "subsystemType", "subsystemPortId", "controllerId", "adminQueueMaxSize", "transportParameters", "transportRequirements", "connected"})
public class HostNvmeDiscoveryLogEntry extends DynamicData {
  @XmlElement(required = true)
  protected String subnqn;
  
  @XmlElement(required = true)
  protected String subsystemType;
  
  protected int subsystemPortId;
  
  protected int controllerId;
  
  protected int adminQueueMaxSize;
  
  @XmlElement(required = true)
  protected HostNvmeTransportParameters transportParameters;
  
  @XmlElement(required = true)
  protected String transportRequirements;
  
  protected boolean connected;
  
  public String getSubnqn() {
    return this.subnqn;
  }
  
  public void setSubnqn(String paramString) {
    this.subnqn = paramString;
  }
  
  public String getSubsystemType() {
    return this.subsystemType;
  }
  
  public void setSubsystemType(String paramString) {
    this.subsystemType = paramString;
  }
  
  public int getSubsystemPortId() {
    return this.subsystemPortId;
  }
  
  public void setSubsystemPortId(int paramInt) {
    this.subsystemPortId = paramInt;
  }
  
  public int getControllerId() {
    return this.controllerId;
  }
  
  public void setControllerId(int paramInt) {
    this.controllerId = paramInt;
  }
  
  public int getAdminQueueMaxSize() {
    return this.adminQueueMaxSize;
  }
  
  public void setAdminQueueMaxSize(int paramInt) {
    this.adminQueueMaxSize = paramInt;
  }
  
  public HostNvmeTransportParameters getTransportParameters() {
    return this.transportParameters;
  }
  
  public void setTransportParameters(HostNvmeTransportParameters paramHostNvmeTransportParameters) {
    this.transportParameters = paramHostNvmeTransportParameters;
  }
  
  public String getTransportRequirements() {
    return this.transportRequirements;
  }
  
  public void setTransportRequirements(String paramString) {
    this.transportRequirements = paramString;
  }
  
  public boolean isConnected() {
    return this.connected;
  }
  
  public void setConnected(boolean paramBoolean) {
    this.connected = paramBoolean;
  }
}
