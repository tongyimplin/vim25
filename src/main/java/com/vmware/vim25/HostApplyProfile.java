package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.AuthenticationProfile;
import com.vmware.vim25.DateTimeProfile;
import com.vmware.vim25.FirewallProfile;
import com.vmware.vim25.HostApplyProfile;
import com.vmware.vim25.HostMemoryProfile;
import com.vmware.vim25.NetworkProfile;
import com.vmware.vim25.OptionProfile;
import com.vmware.vim25.SecurityProfile;
import com.vmware.vim25.ServiceProfile;
import com.vmware.vim25.StorageProfile;
import com.vmware.vim25.UserGroupProfile;
import com.vmware.vim25.UserProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostApplyProfile", propOrder = {"memory", "storage", "network", "datetime", "firewall", "security", "service", "option", "userAccount", "usergroupAccount", "authentication"})
public class HostApplyProfile extends ApplyProfile {
  protected HostMemoryProfile memory;
  
  protected StorageProfile storage;
  
  protected NetworkProfile network;
  
  protected DateTimeProfile datetime;
  
  protected FirewallProfile firewall;
  
  protected SecurityProfile security;
  
  protected List<ServiceProfile> service;
  
  protected List<OptionProfile> option;
  
  protected List<UserProfile> userAccount;
  
  protected List<UserGroupProfile> usergroupAccount;
  
  protected AuthenticationProfile authentication;
  
  public HostMemoryProfile getMemory() {
    return this.memory;
  }
  
  public void setMemory(HostMemoryProfile paramHostMemoryProfile) {
    this.memory = paramHostMemoryProfile;
  }
  
  public StorageProfile getStorage() {
    return this.storage;
  }
  
  public void setStorage(StorageProfile paramStorageProfile) {
    this.storage = paramStorageProfile;
  }
  
  public NetworkProfile getNetwork() {
    return this.network;
  }
  
  public void setNetwork(NetworkProfile paramNetworkProfile) {
    this.network = paramNetworkProfile;
  }
  
  public DateTimeProfile getDatetime() {
    return this.datetime;
  }
  
  public void setDatetime(DateTimeProfile paramDateTimeProfile) {
    this.datetime = paramDateTimeProfile;
  }
  
  public FirewallProfile getFirewall() {
    return this.firewall;
  }
  
  public void setFirewall(FirewallProfile paramFirewallProfile) {
    this.firewall = paramFirewallProfile;
  }
  
  public SecurityProfile getSecurity() {
    return this.security;
  }
  
  public void setSecurity(SecurityProfile paramSecurityProfile) {
    this.security = paramSecurityProfile;
  }
  
  public List<ServiceProfile> getService() {
    if (this.service == null)
      this.service = new ArrayList<>(); 
    return this.service;
  }
  
  public List<OptionProfile> getOption() {
    if (this.option == null)
      this.option = new ArrayList<>(); 
    return this.option;
  }
  
  public List<UserProfile> getUserAccount() {
    if (this.userAccount == null)
      this.userAccount = new ArrayList<>(); 
    return this.userAccount;
  }
  
  public List<UserGroupProfile> getUsergroupAccount() {
    if (this.usergroupAccount == null)
      this.usergroupAccount = new ArrayList<>(); 
    return this.usergroupAccount;
  }
  
  public AuthenticationProfile getAuthentication() {
    return this.authentication;
  }
  
  public void setAuthentication(AuthenticationProfile paramAuthenticationProfile) {
    this.authentication = paramAuthenticationProfile;
  }
}
