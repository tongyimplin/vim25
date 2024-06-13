package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostConnectSpec;
import com.vmware.vim25.HostGatewaySpec;
import com.vmware.vim25.HostLockdownMode;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConnectSpec", propOrder = {"hostName", "port", "sslThumbprint", "userName", "password", "vmFolder", "force", "vimAccountName", "vimAccountPassword", "managementIp", "lockdownMode", "hostGateway"})
public class HostConnectSpec extends DynamicData {
  protected String hostName;
  
  protected Integer port;
  
  protected String sslThumbprint;
  
  protected String userName;
  
  protected String password;
  
  protected ManagedObjectReference vmFolder;
  
  protected boolean force;
  
  protected String vimAccountName;
  
  protected String vimAccountPassword;
  
  protected String managementIp;
  
  protected HostLockdownMode lockdownMode;
  
  protected HostGatewaySpec hostGateway;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public Integer getPort() {
    return this.port;
  }
  
  public void setPort(Integer paramInteger) {
    this.port = paramInteger;
  }
  
  public String getSslThumbprint() {
    return this.sslThumbprint;
  }
  
  public void setSslThumbprint(String paramString) {
    this.sslThumbprint = paramString;
  }
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setUserName(String paramString) {
    this.userName = paramString;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(String paramString) {
    this.password = paramString;
  }
  
  public ManagedObjectReference getVmFolder() {
    return this.vmFolder;
  }
  
  public void setVmFolder(ManagedObjectReference paramManagedObjectReference) {
    this.vmFolder = paramManagedObjectReference;
  }
  
  public boolean isForce() {
    return this.force;
  }
  
  public void setForce(boolean paramBoolean) {
    this.force = paramBoolean;
  }
  
  public String getVimAccountName() {
    return this.vimAccountName;
  }
  
  public void setVimAccountName(String paramString) {
    this.vimAccountName = paramString;
  }
  
  public String getVimAccountPassword() {
    return this.vimAccountPassword;
  }
  
  public void setVimAccountPassword(String paramString) {
    this.vimAccountPassword = paramString;
  }
  
  public String getManagementIp() {
    return this.managementIp;
  }
  
  public void setManagementIp(String paramString) {
    this.managementIp = paramString;
  }
  
  public HostLockdownMode getLockdownMode() {
    return this.lockdownMode;
  }
  
  public void setLockdownMode(HostLockdownMode paramHostLockdownMode) {
    this.lockdownMode = paramHostLockdownMode;
  }
  
  public HostGatewaySpec getHostGateway() {
    return this.hostGateway;
  }
  
  public void setHostGateway(HostGatewaySpec paramHostGatewaySpec) {
    this.hostGateway = paramHostGatewaySpec;
  }
}
