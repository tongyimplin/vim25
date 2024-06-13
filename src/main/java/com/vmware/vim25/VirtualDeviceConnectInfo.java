package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualDeviceConnectInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceConnectInfo", propOrder = {"migrateConnect", "startConnected", "allowGuestControl", "connected", "status"})
public class VirtualDeviceConnectInfo extends DynamicData {
  protected String migrateConnect;
  
  protected boolean startConnected;
  
  protected boolean allowGuestControl;
  
  protected boolean connected;
  
  protected String status;
  
  public String getMigrateConnect() {
    return this.migrateConnect;
  }
  
  public void setMigrateConnect(String paramString) {
    this.migrateConnect = paramString;
  }
  
  public boolean isStartConnected() {
    return this.startConnected;
  }
  
  public void setStartConnected(boolean paramBoolean) {
    this.startConnected = paramBoolean;
  }
  
  public boolean isAllowGuestControl() {
    return this.allowGuestControl;
  }
  
  public void setAllowGuestControl(boolean paramBoolean) {
    this.allowGuestControl = paramBoolean;
  }
  
  public boolean isConnected() {
    return this.connected;
  }
  
  public void setConnected(boolean paramBoolean) {
    this.connected = paramBoolean;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String paramString) {
    this.status = paramString;
  }
}
