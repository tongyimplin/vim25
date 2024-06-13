package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNatServiceNameServiceSpec;
import com.vmware.vim25.HostNatServicePortForwardSpec;
import com.vmware.vim25.HostNatServiceSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNatServiceSpec", propOrder = {"virtualSwitch", "activeFtp", "allowAnyOui", "configPort", "ipGatewayAddress", "udpTimeout", "portForward", "nameService"})
public class HostNatServiceSpec extends DynamicData {
  @XmlElement(required = true)
  protected String virtualSwitch;
  
  protected boolean activeFtp;
  
  protected boolean allowAnyOui;
  
  protected boolean configPort;
  
  @XmlElement(required = true)
  protected String ipGatewayAddress;
  
  protected int udpTimeout;
  
  protected List<HostNatServicePortForwardSpec> portForward;
  
  protected HostNatServiceNameServiceSpec nameService;
  
  public String getVirtualSwitch() {
    return this.virtualSwitch;
  }
  
  public void setVirtualSwitch(String paramString) {
    this.virtualSwitch = paramString;
  }
  
  public boolean isActiveFtp() {
    return this.activeFtp;
  }
  
  public void setActiveFtp(boolean paramBoolean) {
    this.activeFtp = paramBoolean;
  }
  
  public boolean isAllowAnyOui() {
    return this.allowAnyOui;
  }
  
  public void setAllowAnyOui(boolean paramBoolean) {
    this.allowAnyOui = paramBoolean;
  }
  
  public boolean isConfigPort() {
    return this.configPort;
  }
  
  public void setConfigPort(boolean paramBoolean) {
    this.configPort = paramBoolean;
  }
  
  public String getIpGatewayAddress() {
    return this.ipGatewayAddress;
  }
  
  public void setIpGatewayAddress(String paramString) {
    this.ipGatewayAddress = paramString;
  }
  
  public int getUdpTimeout() {
    return this.udpTimeout;
  }
  
  public void setUdpTimeout(int paramInt) {
    this.udpTimeout = paramInt;
  }
  
  public List<HostNatServicePortForwardSpec> getPortForward() {
    if (this.portForward == null)
      this.portForward = new ArrayList<>(); 
    return this.portForward;
  }
  
  public HostNatServiceNameServiceSpec getNameService() {
    return this.nameService;
  }
  
  public void setNameService(HostNatServiceNameServiceSpec paramHostNatServiceNameServiceSpec) {
    this.nameService = paramHostNatServiceNameServiceSpec;
  }
}
