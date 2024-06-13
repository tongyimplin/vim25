package com.vmware.vim25;

import com.vmware.vim25.CustomizationGuiUnattended;
import com.vmware.vim25.CustomizationPassword;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationGuiUnattended", propOrder = {"password", "timeZone", "autoLogon", "autoLogonCount"})
public class CustomizationGuiUnattended extends DynamicData {
  protected CustomizationPassword password;
  
  protected int timeZone;
  
  protected boolean autoLogon;
  
  protected int autoLogonCount;
  
  public CustomizationPassword getPassword() {
    return this.password;
  }
  
  public void setPassword(CustomizationPassword paramCustomizationPassword) {
    this.password = paramCustomizationPassword;
  }
  
  public int getTimeZone() {
    return this.timeZone;
  }
  
  public void setTimeZone(int paramInt) {
    this.timeZone = paramInt;
  }
  
  public boolean isAutoLogon() {
    return this.autoLogon;
  }
  
  public void setAutoLogon(boolean paramBoolean) {
    this.autoLogon = paramBoolean;
  }
  
  public int getAutoLogonCount() {
    return this.autoLogonCount;
  }
  
  public void setAutoLogonCount(int paramInt) {
    this.autoLogonCount = paramInt;
  }
}
