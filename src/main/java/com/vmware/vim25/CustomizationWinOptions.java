package com.vmware.vim25;

import com.vmware.vim25.CustomizationOptions;
import com.vmware.vim25.CustomizationSysprepRebootOption;
import com.vmware.vim25.CustomizationWinOptions;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationWinOptions", propOrder = {"changeSID", "deleteAccounts", "reboot"})
public class CustomizationWinOptions extends CustomizationOptions {
  protected boolean changeSID;
  
  protected boolean deleteAccounts;
  
  protected CustomizationSysprepRebootOption reboot;
  
  public boolean isChangeSID() {
    return this.changeSID;
  }
  
  public void setChangeSID(boolean paramBoolean) {
    this.changeSID = paramBoolean;
  }
  
  public boolean isDeleteAccounts() {
    return this.deleteAccounts;
  }
  
  public void setDeleteAccounts(boolean paramBoolean) {
    this.deleteAccounts = paramBoolean;
  }
  
  public CustomizationSysprepRebootOption getReboot() {
    return this.reboot;
  }
  
  public void setReboot(CustomizationSysprepRebootOption paramCustomizationSysprepRebootOption) {
    this.reboot = paramCustomizationSysprepRebootOption;
  }
}
