package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostProtocolEndpoint;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProtocolEndpoint", propOrder = {"peType", "type", "uuid", "hostKey", "storageArray", "nfsServer", "nfsDir", "nfsServerScope", "nfsServerMajor", "nfsServerAuthType", "nfsServerUser", "deviceId"})
public class HostProtocolEndpoint extends DynamicData {
  @XmlElement(required = true)
  protected String peType;
  
  protected String type;
  
  @XmlElement(required = true)
  protected String uuid;
  
  protected List<ManagedObjectReference> hostKey;
  
  protected String storageArray;
  
  protected String nfsServer;
  
  protected String nfsDir;
  
  protected String nfsServerScope;
  
  protected String nfsServerMajor;
  
  protected String nfsServerAuthType;
  
  protected String nfsServerUser;
  
  protected String deviceId;
  
  public String getPeType() {
    return this.peType;
  }
  
  public void setPeType(String paramString) {
    this.peType = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public List<ManagedObjectReference> getHostKey() {
    if (this.hostKey == null)
      this.hostKey = new ArrayList<>(); 
    return this.hostKey;
  }
  
  public String getStorageArray() {
    return this.storageArray;
  }
  
  public void setStorageArray(String paramString) {
    this.storageArray = paramString;
  }
  
  public String getNfsServer() {
    return this.nfsServer;
  }
  
  public void setNfsServer(String paramString) {
    this.nfsServer = paramString;
  }
  
  public String getNfsDir() {
    return this.nfsDir;
  }
  
  public void setNfsDir(String paramString) {
    this.nfsDir = paramString;
  }
  
  public String getNfsServerScope() {
    return this.nfsServerScope;
  }
  
  public void setNfsServerScope(String paramString) {
    this.nfsServerScope = paramString;
  }
  
  public String getNfsServerMajor() {
    return this.nfsServerMajor;
  }
  
  public void setNfsServerMajor(String paramString) {
    this.nfsServerMajor = paramString;
  }
  
  public String getNfsServerAuthType() {
    return this.nfsServerAuthType;
  }
  
  public void setNfsServerAuthType(String paramString) {
    this.nfsServerAuthType = paramString;
  }
  
  public String getNfsServerUser() {
    return this.nfsServerUser;
  }
  
  public void setNfsServerUser(String paramString) {
    this.nfsServerUser = paramString;
  }
  
  public String getDeviceId() {
    return this.deviceId;
  }
  
  public void setDeviceId(String paramString) {
    this.deviceId = paramString;
  }
}
