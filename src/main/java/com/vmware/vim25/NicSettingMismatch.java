package com.vmware.vim25;

import com.vmware.vim25.CustomizationFault;
import com.vmware.vim25.NicSettingMismatch;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NicSettingMismatch", propOrder = {"numberOfNicsInSpec", "numberOfNicsInVM"})
public class NicSettingMismatch extends CustomizationFault {
  protected int numberOfNicsInSpec;
  
  protected int numberOfNicsInVM;
  
  public int getNumberOfNicsInSpec() {
    return this.numberOfNicsInSpec;
  }
  
  public void setNumberOfNicsInSpec(int paramInt) {
    this.numberOfNicsInSpec = paramInt;
  }
  
  public int getNumberOfNicsInVM() {
    return this.numberOfNicsInVM;
  }
  
  public void setNumberOfNicsInVM(int paramInt) {
    this.numberOfNicsInVM = paramInt;
  }
}
